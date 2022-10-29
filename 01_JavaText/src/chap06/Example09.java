package chap06;

public class Example09 {

    public static void main(String[] args) {
        int score[] = {80, 75, 100, 90, 80};
        String label[] = {"Tom", "John", "Mary", "Ken", "Jimmy"};
        for (int i = 0; i < score.length; i++) {
            System.out.println(label[i] + "'s score is " + score[i]);
        }
    }
}
