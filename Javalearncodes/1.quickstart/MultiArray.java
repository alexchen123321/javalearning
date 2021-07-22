import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] ns = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int[] arr0 = ns[0];
        System.out.println(arr0.length);
        System.out.println(Arrays.toString(arr0));
        System.out.println(ns[1][2]); // 7

        // print by nested function
        for (int[] arr : ns) {
            for (int n : arr) {
                System.out.print(n);
                System.out.print('，');
            }
            System.out.println();
        }
        // print by deeptostring
        System.out.println(Arrays.deepToString(ns));

        // three-dimensional array
        int[][][] ns3 = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                },
                {
                        {10, 11},
                        {12, 13}
                },
                {
                        {14, 15, 16},
                        {17, 18}
                }
        };
        System.out.println(ns3[2][0][1]); // 15

        // exercise:

        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        double sum = 0;
        int count = 0;
        for (int[] arr : scores) {
            for (int n : arr) {
                sum = n + sum;
                count ++ ;
            }
        }
        double average = sum/count;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }

    }
}
