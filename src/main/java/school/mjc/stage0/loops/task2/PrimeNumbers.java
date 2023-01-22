package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        boolean a;
        while (i <= printToInclusive) {
            a = true;
            int j = 2;
            while (j<i){
                if (i%j == 0){
                    a = false;
                }
                j++;
            }
            if(a) System.out.println(i);
            i++;
        }
    }
}
