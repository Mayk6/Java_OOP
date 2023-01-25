package HomeWork;

import java.util.ArrayList;

/**
 * Class for storing relationships/Nodes between Persons objects
 */
public class Tree implements GenTree{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    /**
     * Creates a parent/child relationship between Persons objects
     * @param parent
     * @param children
     */
    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILD, parent));
    }
}
