public class Dowhile {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        do {
            sum = sum + m;
            m ++;
        } while (n > m);
        System.out.println(sum);
    }
}
