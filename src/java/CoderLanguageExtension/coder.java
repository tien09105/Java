package CoderLanguageExtension;

import java.util.ArrayList;
import java.util.Scanner;

class person {
    private String name;
    private int age;
    private String phone;

    public person() {
    }

    public person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    // Getters and Setters
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class coder extends person {
    private String Programming_Language;
    private ArrayList<person> liststudent;
    private person student;

    public coder() {
    }

    public coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }

    public void chooseProgrammingLanguage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn ngôn ngữ lập trình:");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. C#");
        System.out.println("4. Python");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                setProgramming_Language("Java");
                break;
            case 2:
                setProgramming_Language("C");
                break;
            case 3:
                setProgramming_Language("C#");
                break;
            case 4:
                setProgramming_Language("Python");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                break;
        }
    }

    public static void main(String[] args) {
        coder newCoder = new coder();
        newCoder.chooseProgrammingLanguage();
        System.out.println("Ngôn ngữ lập trình đã chọn: " + newCoder.getProgramming_Language());
    }
}
