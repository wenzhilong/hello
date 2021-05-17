package oop;

public class Extends {
    public static void main(String[] args) {
        Student Hermione = new Student("Hermione Jane Granger", "female", 12, 98);
        System.out.println("congratulations " + Hermione.getGender() + " " + Hermione.getName() + " your score is " + Hermione.getScore());

        // Person Harry = new Student("Harry James Potter", "male", 11, 60); 向上转型，此时实例Harry无法访问getScore()方法
        Student Harry = new Student("Harry James Potter", "male", 11, 60);
        System.out.println("congratulations " + Harry.getGender() + " " + Harry.getName() + " your score is " + Harry.getScore());

    }

}

// 子类自动获得了父类的所有字段，严禁定义与父类重名的字段。
// 子类不能获取父类的private字段或者private方法。这使得继承的作用被削弱了，为了让子类能够访问父类的字段，需要把private改为protected。
class Student extends Person {
    private int score;

    public Student(String name, String gender, int age, int score) {
        // 在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。
        // 子类不会继承父类的构造方法，子类默认的工作方法是编译器自动生成的，不是继承的。
        super(name, gender, age);
        this.score = score;
    }
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}