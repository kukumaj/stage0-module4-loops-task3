package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = String.valueOf(t).length();
        int sum=0;
        if (t < 0) {
            t=-t;
        }
        for (int i = 0; i < length; i++) {
            int lastDigit = t % 10;
            sum += lastDigit;
            t /= 10;
        }
        System.out.println(sum);
    }
}
