import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amountInArray;

        Scanner sc = new Scanner(System.in);

        //Amount of INT's in array
        System.out.println("Enter the amount in array: ");
        amountInArray = Integer.parseInt(sc.nextLine());



        //Creating tasks
        FactorialTask[] tasks = new FactorialTask[amountInArray];

        for (int i = 0; i < tasks.length ; i++) {
            tasks[i] = new FactorialTask(i);
        }

        //Creating threads
        Thread[] threads = new Thread[amountInArray];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(tasks[i]);
        }

        //Starting the threads
        for (int i = 0; i < amountInArray ; i++) {
            threads[i].start();
        }


    }
}
