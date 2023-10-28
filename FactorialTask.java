import java.math.BigInteger;

public class FactorialTask implements Runnable{
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    public BigInteger factorialCalculate(int n){
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public void run() {
        long ThreadId = Thread.currentThread().getId();
            BigInteger fact = factorialCalculate(number);
            System.out.println(Thread.currentThread().getName()+ " -> " + number + "!" + " = " + fact);
    }
}
