package Spiski_1;
import java.util.Scanner;
public class Student {
    protected String name;
    protected String surname;
    protected int age;
    protected Student next;
    public Student() {
        this.name = "None";
        this.surname = "None";
        this.age = -1;
    }
    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void readStudent(){
        Scanner inName = new Scanner(System.in);
        System.out.print("Name: ");
        this.name = inName.next();
        Scanner inSurname = new  Scanner(System.in);
        System.out.print("Surname: ");
        this.surname = inSurname.next();
        Scanner inAge = new  Scanner(System.in);
        System.out.print("Age: ");
        this.age = inAge.nextInt();
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}