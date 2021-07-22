public class Forloop {
    public static void main(String[] args) {
        //1. 给定一个数组，请用for循环倒序输出每一个元素：
        int[] ns = { 1, 4, 9, 16, 25 };
        for (int i=(ns.length-1) ; i >= 0 ; i--) {
            System.out.println(ns[i]);
        }

        //2.利用for each循环对数组每个元素求和：
        int sum = 0;
        for (int i : ns) {
            sum += i;
        }
        System.out.println(sum);//15

        //3.圆周率π可以使用公式计算：
        double π = 0;
        int count = 0;
        for (double i = 1; i <= Integer.MAX_VALUE; i += 2) {
            if (count % 2 == 0) {
                π = π + 1 / i;
            } else {
                π = π - 1 / i;
            }
            count++;
        }
        System.out.println(π * 4); //3.1415926526567945
    }
}
