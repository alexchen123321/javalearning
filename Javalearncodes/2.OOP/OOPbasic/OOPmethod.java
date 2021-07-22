// exercise

public class OOPmethod {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        if (age < 0 || age > 100){
            throw new IllegalArgumentException(" invalid age");
        }
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
/*
public class OOPmethod {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName ("Xiao Ming");  // 对字段name赋值
        ming.setAge(12); // 对字段age赋值
        ming.setBirth(2008);
        System.out.println(ming.getName() + "," + ming.getAge());
    }


}

class Person {
    private String name;
    private int age;
    private int birth;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }
/*
    public int getAge(){
        return this.age;
    }
*/
/*
    public void setAge(int age){
        if (age < 0 || age > 100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

    public void setBirth(int birth){
        this.birth = birth;
    }

    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    public int calcAge(int currentYear){
        return currentYear - this.birth;
    }
}
*/

