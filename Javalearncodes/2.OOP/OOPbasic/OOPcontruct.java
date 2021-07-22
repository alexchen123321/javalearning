// exercise
public class OOPcontruct {
    public static void main(String[] args) {
        // TODO: 给Person增加构造方法:
        Person1 ming = new Person1("小明", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
}

class Person1 {
    private String name;
    private int age;

    public  Person1(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

/*
public class OOPcontruct {
    public static void main(String[] args) {
        Person1 p = new Person1("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person1 {
    private String name; // 默认初始化为null
    private int age; // 默认初始化为0

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
*/