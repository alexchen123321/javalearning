import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String model = "Hello, ${name}! You are learning ${lang}!";
        Map<String, String> map = new HashMap<>();
        map.put("name", "Bob");
        map.put("lang", "Java");
        Pattern p = Pattern.compile("\\$\\{([a-z]+)}");
        Matcher m = p.matcher(model);
        StringBuilder sb = new StringBuilder();
        //
        while (m.find()) // 因为使用的是while，所以只要可以find，都会匹配到，不需要for循环
        {
            System.out.println(m.group(0));  // ${name} ,${lang}
            System.out.println(m.group(1));  // name , lang
            m.appendReplacement(sb,map.get(m.group(1)).toString()); // 0 代表整个匹配的字段  1代表匹配字段中的第一个分组
        }
        m.appendTail(sb);
        System.out.println(sb);

        Main.test("aaa");
    }

    public static void test(String args){
        Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
        pattern.matcher("010-12345678").matches(); // true
        pattern.matcher("021-123456").matches(); // true
        pattern.matcher("022#1234567").matches(); // false
        // 获得Matcher对象:
        Matcher matcher = pattern.matcher("010-12345678");
        if (matcher.matches()) {
            String whole = matcher.group(0); // "010-12345678", 0表示匹配的整个字符串
            String area = matcher.group(1); // "010", 1表示匹配的第1个子串
            String tel = matcher.group(2); // "12345678", 2表示匹配的第2个子串
            System.out.println(whole);
            System.out.println(area);
            System.out.println(tel);
        }

    }

}
