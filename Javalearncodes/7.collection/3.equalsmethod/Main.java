import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

// https://www.liaoxuefeng.com/wiki/1252599548343744/1265116446975264#0

public class Main {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Xiao", "Ming", 18),
                new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20)
        );
        boolean exist = list.contains(new Person("Bob", "Smith", 20));

        System.out.println(exist);
        System.out.println(exist ? "测试成功!" : "测试失败!");

        // way 2 , judge by indexof
        int indexof =  list.indexOf(new Person("Bob", "Smith", 20));
        System.out.println("way 2 , judge by indexof" );
        System.out.println(indexof > 0 ?  "测试成功!" : "测试失败!" );


/*
        for(Person n : list) {
            System.out.println(n.getName());
        }
    }
*/
    }
}

class Person {
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public boolean equals(Object o) {
            if (o instanceof Person) {
                Person p = (Person) o;
                System.out.println("this firstnanme :" + this.firstName);
                System.out.println("p firstnanme :" + p.firstName);
                /* outcome
                this firstnanme :Bob
                p firstnanme :Xiao
                this firstnanme :Bob
                p firstnanme :Xiao
                this firstnanme :Bob
                p firstnanme :Bob
                 */
                return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.age == p.age;
            }
            return false;
        }
    }



