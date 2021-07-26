import ch.qos.logback.core.net.server.ServerRunner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String hex = toHex(12500);
        System.out.println("hex:"+ hex);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        int quotient = n;
        Deque<String> deque = new LinkedList<>();
        do {
            int remainder = quotient % 16;
            quotient = quotient / 16;
            if (remainder > 9) {
                deque.push("" + (char) ('A' + (remainder - 10)));
            } else {
                deque.push(remainder + "");
            }

        } while (quotient > 0);
        // queue 转string
        StringBuffer sb = new StringBuffer();
        for(String s2:deque) {

            sb.append(s2);

        }
        return sb.toString();
    }

}
