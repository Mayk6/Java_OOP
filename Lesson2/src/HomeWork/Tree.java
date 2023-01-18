package HomeWork;

import java.util.ArrayList;

public class Tree implements GenTree{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.PARENT, children));
        tree.add(new Node(children, Relationship.CHILD, parent));
    }
}
