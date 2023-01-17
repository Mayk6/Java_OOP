import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Person {
    private String name;
    private Integer age;
    private String sex;
    HashMap<String, List<Person>> connections = new HashMap<>();

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Person(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    void setChild(Person who) {
        if (who != null) newConnection("Дети", who);
    }

    List<Person> getChild() {
        return this.connections.get("Дети");
    }

    void setBrother(Person who) {
        if (who != null) newConnection("Брат/Сестра", who);
    }

    List<Person> getBrother() {
        return this.connections.get("Брат/Сестра");
    }

    void setGrandpa(Person who) {
        if (who != null) newConnection("Бабушка/Дедушка", who);
    }

    List<Person> getGrandpa() {
        return this.connections.get("Бабушка/Дедушка");
    }

    void setParents(Person who) {
        if (who != null) newConnection("Родители", who);
    }

    List<Person> getParents() {
        return this.connections.get("Родители");
    }

    void setGrandChild(Person who) {
        if (who != null) newConnection("Внук/Внучка", who);
    }

    List<Person> getGrandChild() {
        return this.connections.get("Внук/Внучка");
    }

    String printAllFamily() {
        StringBuilder sb = new StringBuilder();
        if (this.getChild() != null) sb.append("Дети: ").append(getChild()).append("\n");
        if (this.getParents() != null) sb.append("Родители: ").append(getParents()).append("\n");
        if (this.getBrother() != null) sb.append("Брат/Сестра: ").append(getBrother()).append("\n");
        if (this.getGrandpa() != null) sb.append("Бабушка/Дедушка: ").append(getGrandpa()).append("\n");
        return sb.toString();
    }
    void writFamilyInFile(){
        try(FileWriter writer = new FileWriter("/media/sf_GeekBrains_Learning/OOP_Java/Lesson1/HomeWork/src/file.txt", false)){
            writer.write(this.printAllFamily());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private void newConnection(String type, Person who) {
        if (!this.connections.containsKey(type)) {
            this.connections.put(type, new ArrayList<>(Arrays.asList(who)));
            switch (type) {
                case "Дети" -> who.setParents(Person.this);
                case "Брат/Сестра" -> who.setBrother(Person.this);
                case "Бабушка/Дедушка" -> who.setGrandChild(Person.this);
                case "Внук/Внучка" -> who.setGrandpa(Person.this);
            }
        } else if (!this.connections.get(type).contains(who)) {
            this.connections.get(type).add(who);
        }
    }

    @Override
    public String toString() {
        return "Имя: " + name +
                ", Возраст: " + age +
                ", Пол: " + sex;
    }

    void openCloset(Closet closet) {
        if (closet.getAccess()) {
            System.out.println(this.getName() + " открывает шкаф");
        } else {
            System.out.println("Шкаф закрыт");
        }
    }

    public void openClosetLock(Closet closet) {
        if (Objects.equals(Person.this.getSex(), "Ж")) {
            closet.setAccess(true);
        } else {
            System.out.println("Нет ключа");
        }
    }

    void sayKsks(Cat cat){
        System.out.println(Person.this.getName() + " говорит Кис-кис");
        System.out.print("Котик " + cat.getName() + " отвечает ");
        cat.voice();
    }
}



