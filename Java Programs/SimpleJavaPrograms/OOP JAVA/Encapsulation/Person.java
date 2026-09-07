
public class Person {

    private int age;

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person p = new Person();

        p.setAge(33);

        System.out.println("age: " + p.getAge());
    }
}
