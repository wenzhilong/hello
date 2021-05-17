package oop;

class Person {
    // 没有在构造方法中初始化字段时，引用数据类型的字段默认值是null，基本数据类型的字段默认值int是0，布尔类型是false：
    private String name;
    private final String gender;
    private int age;
    public static int number; // 定义静态字段

    // 一个构造方法可以调用另一个构造方法：
    // 调用new Person("Xiao Ming", 20);  匹配：
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        Person.number++;
    }

    // 调用new Person("Xiao Ming");  匹配：
    public Person(String name) {
        this(name, "male", 18); // 调用另一个构造方法Person(String, int)
    }

    // 调用new Person("Xiao Ming");  匹配：
    public Person() {
        this("unnamed"); // 调用另一个构造方法Person(String)

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("invalid name!");
        }
        this.name = name;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + " " + lastName;
    }

    public String getGender() {
        return gender.equals("male") ? "Mr" : "Mrs";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age!");
        }
        this.age = age;
    }

    public void run() {
        System.out.println("Person.run()");
    }
}
