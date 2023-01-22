package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int sum = 0;
        while(sum <= printTillInclusive) {
            System.out.println(sum);
            sum += 2;
        }
    }
}
