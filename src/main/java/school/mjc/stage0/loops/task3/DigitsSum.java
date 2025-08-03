package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {

        t = Math.abs(t);
        String s = t + "";
        int sum = 0;
        int divisior = 1;

        for (int i = 0; i < s.length(); i++) {
            int digit = (t / divisior) % 10;

            sum += digit;
            divisior *= 10;
        }
        System.out.println(sum);

    }
}
