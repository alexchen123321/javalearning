import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
    String choice = """
            Input your choice 
            1: Rock
            2: Scissors
            3: Paper  
            """;
    System.out.println(choice);
    // input options from 1 to 3
    Scanner inputchoice = new Scanner(System.in);
    System.out.println("Please enter your chioce:");
    int options = inputchoice.nextInt();

    // generate randomly range from 1 to
    // (数据类型)(最小值+Math.random()*(最大值-最小值+1))
    int random = 1 + (int) (Math.random() * 3);
    System.out.println("random number=" + random);
    // Java还提供一个三元运算符b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果。
    //此处为多元运算， ？ 后面2个选项也可以作为判断
    switch (options) {
        case 1 -> System.out.println(random==1?"平局！":random==2?"你赢了！":"你输了！");
        case 2 -> System.out.println(random==2?"平局！":random==3?"你赢了！":"你输了！");
        case 3 -> System.out.println(random==3?"平局！":random==1?"你赢了！":"你输了！");
        default -> System.out.println("选择错误！");
        }


    }
}