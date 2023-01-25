package HomeWork;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Research {
    ArrayList<Node> tree;

    public Research(Tree Tree) {
        tree = Tree.getTree();
    }
}

/**
 * Class for finding relationships between Person objects
 */
class FindInfo extends Research {

    public FindInfo(Tree tree) {
        super(tree);
    }

    /**
     * Method for finding children/parents of an object of the Person class
     * @param p The investigated object of the Person class
     * @param re Relationship type CHILD or PARENT
     * @return List of objects participating in relations "re" with the object "p"
     */
    public ArrayList<Person> findRel(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (Objects.equals(t.getP1(), p) && t.getRe() == re) {
                result.add(t.getP2());
            }
        }
        return result;
    }
}

class FindGrands extends FindInfo {
    public FindGrands(Tree tree) {
        super(tree);
    }

    /**
     * Method for finding grandchildren/grandparents of an object of the Person class
     * @param p The investigated object of the Person class
     * @param re Relationship type GRANDCHILD or GRANDPARENT
     * @return List of objects participating in relations "re" with the object "p"
     */
    public ArrayList<Person> findGrands(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        ArrayList<Person> temp;
        Relationship r;
        if (re == Relationship.GRANDPARENT) {
            r = Relationship.PARENT;
        } else if (re == Relationship.GRANDCHILD) {
            r = Relationship.CHILD;
        } else return null;
        temp = findRel(p, r);
        for (Person p1 : temp) {
            result.addAll(findRel(p1, r));
        }
        return result;
    }
}