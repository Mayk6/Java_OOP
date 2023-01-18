package HomeWork;

import java.util.HashMap;
import java.util.List;

public class Person {

    private String name;
    private Integer age;
    Sex sex;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Person() {
    }

    public Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void sayWithPet(Animals who){
        System.out.format("Человек %s зовет питомца %s питомец отвечает ", this.getName(), who.getName());
        who.voice();
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", this.name, this.sex, this.age);
    }
}


