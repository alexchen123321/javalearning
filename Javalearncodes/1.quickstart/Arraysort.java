import java.lang.reflect.Array;
import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        for (int i = 0; i < ns.length-1; i ++) {
            for (int j = 0; j < ns.length -i -1 ; j++) {
                if (ns[j] > ns[j + 1]) {
                    int temp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = temp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns));

        // standard sort library
        int[] ns1 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns1);
        System.out.println(Arrays.toString(ns1));

        // descending sort

        int[] ns2 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        //System.out.println(Arrays.toString(ns2));
        for (int i = 0;i<ns2.length-1;i++){
            //System.out.println(i);
            for (int j = 0 ; j <ns2.length - 1 ; j++ ){
                //System.out.println(j);
                 if( ns2[j]  < ns2[j+1]) {
                     int temp = ns2[j];
                     ns2[j] = ns2[j + 1];
                     ns2[j + 1] = temp;
                     System.out.println(Arrays.toString(ns2));
                 }

            }

        }
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns2).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
        System.out.println(Arrays.toString(ns2));
    }

}
