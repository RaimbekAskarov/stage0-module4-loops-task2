package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int count = 0;
        while (counter<=printToInclusive){
            while (count<=counter){
                System.out.print(count+" ");
                count++;
            }
            counter++;
        }

    }
}
