package HomeWork;

public abstract class Animals implements PetsDo{

    private String name;

    String getName() {
        return this.name;
    }
}

class Cat extends Animals{

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Тихие хрум хрум");
    }
}

class Dog extends Animals{

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat() {
        System.out.println("Громкие хрум хрум");
    }
}
