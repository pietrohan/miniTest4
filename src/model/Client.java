package model;

public class Client {
    private String name;
    private int age;
    private String idCard;

    public Client() {
    }

    public Client(String name, int age, String idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cMND='" + idCard + '\'' +
                '}';
    }
}
