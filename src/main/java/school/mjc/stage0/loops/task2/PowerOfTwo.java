package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        while (power<0){
            System.out.println("too much power");
            power=0;
        }
        while (count<=power){
            System.out.println(2<<count);
            count++;
        }
    }
}
