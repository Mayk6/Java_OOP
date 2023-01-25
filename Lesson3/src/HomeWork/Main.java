package HomeWork;

public class Main {

    public static void main(String[] args) {
        Person maria = new Person("Maria", 56, Sex.FEMALE);
        Person ilia = new Person("Ilia", 25, Sex.MALE);
        Person janna = new Person("Janna", 27, Sex.FEMALE);
        Person natalia = new Person("Natalia", 3, Sex.FEMALE);
        Person evgeniy = new Person("Evgeniy", 5, Sex.MALE);

        Tree gt = new Tree();
        gt.append(maria, ilia);
        gt.append(maria, janna);
        gt.append(ilia, natalia);
        gt.append(ilia, evgeniy);

        System.out.println(new FindInfo(gt).findRel(maria, Relationship.PARENT));//выборка детей
        System.out.println(new FindInfo(gt).findRel(evgeniy, Relationship.CHILD));//выборка родителей
        System.out.println(new FindGrands(gt).findGrands(maria, Relationship.GRANDPARENT));//выборка внуков
        System.out.println(new FindGrands(gt).findGrands(natalia, Relationship.GRANDCHILD));//выборка дедушек и бабушек

        Cat cat = new Cat("Мурзик");
        maria.sayWithPet(cat);

    }
}
