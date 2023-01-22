package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int sum = 1;
        int count = 1;
        int count2 = 0;
        while (count2 <= printToInclusive){
            System.out.println(sum);
            sum = sum * count;
            count++;
            count2++;
        }
    }
}
