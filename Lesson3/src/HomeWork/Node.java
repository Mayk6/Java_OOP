package HomeWork;

/**
 * Class for creating family relationships between 2 Persons
 */
public class Node {
    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    private Person p1;
    private Relationship re;
    private Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }

    /**
     * Get the first object of the Person class participating in our relationship
     * @return
     */
    public Person getP1() {
        return p1;
    }

    /**
     * Get relationship type between Person objects
     * @return
     */
    public Relationship getRe() {
        return re;
    }

    /**
     * Get the second object of the Person class participating in our relationship
     * @return
     */
    public Person getP2() {
        return p2;
    }
}
