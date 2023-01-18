package HomeWork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public abstract class Research {
    ArrayList<Node> tree;
    public Research(Tree Tree) {
        tree = Tree.getTree();
    }
}

class FindInfo extends Research {

    public FindInfo(Tree tree) {
        super(tree);
    }

    public ArrayList<Person> findRel(Person p, Relationship re) {
        ArrayList<Person> result = new ArrayList<>();
        for (Node t : tree) {
            if (Objects.equals(t.getP1().getName(), p.getName()) && t.getRe() == re) {
                result.add(t.getP2());
            }
        }
        return result;
    }
}

class FindGrands extends FindInfo {
    public FindGrands(Tree tree){
        super (tree);
    }

    public ArrayList <Person>findGrands (Person p, Relationship re){
        ArrayList <Person> result = new ArrayList<>();
        ArrayList <Person> temp;
        Relationship r;
        if (re == Relationship.GRANDPARENT) {r = Relationship.PARENT;}
        else if (re == Relationship.GRANDCHILD){r = Relationship.CHILD;}
        else return null;
        temp = findRel(p,r);
        for (Person p1 : temp){result.addAll(findRel(p1,r)); }
        return result;
    }
}