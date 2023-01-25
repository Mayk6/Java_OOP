package HomeWork;

public interface Animals { // Из абстрактного класса следал интерфейс

    String getName();
}

class Cat implements Animals, PetsDo {

    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Тихие хрум хрум");
    }

    @Override
    public String getName() {
        return name;
    }
}

class Dog implements Animals, PetsDo{

    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat() {
        System.out.println("Громкие хрум хрум");
    }

    @Override
    public String getName() {
        return name;
    }
}
