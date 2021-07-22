import java.util.Arrays;
// https://www.liaoxuefeng.com/wiki/1252599548343744/1260469698963456
// 观察两次输出，由于Score内部直接引用了外部传入的int[]数组，这会造成外部代码对int[]数组的修改，
// 影响到Score类的字段。如果外部代码不可信，这就会造成安全隐患。
public class Main {
    public static void main(String[] args) {
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private String scores;
    public Score(int[] scores) {
        this.scores = Arrays.toString(scores);
    }

    public void printScores() {
        System.out.println(scores);
    }
}