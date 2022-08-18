package school.mjc.stage0.loops.task3;

import static java.lang.Integer.parseInt;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else if (lengthOfLastNumber == 1) {
            System.out.println(9);

        } else {
            int sum = 0;
            for (int i = 1; i <= lengthOfLastNumber; i++) {
                sum += parseInt("9".repeat(i));
            }
            System.out.println(sum);
        }
    }
}

