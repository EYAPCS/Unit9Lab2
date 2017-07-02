/**
 * Created by emma on 6/29/17.
 */

/**
 * CounterConsoleMenu creates an interface for incrementing, decrementing and resetting
 * a counter.
 * @author Emma Yang
 */

import java.util.Scanner;

public class CounterConsoleMenu {

    private Scanner input = new Scanner(System.in);
    private int counter;
    private boolean running;

    public CounterConsoleMenu() {
        setCount(0);
    }

    public int getCount() {
        return counter;
    }

    public void setCount(int newCount) {
        counter = newCount;
    }

    public void increment() {
        counter++;
    }

    public void decrement() {
        counter--;
    }

    public void reset() {
        counter = 0;
    }

    public void displayCounter() {
        System.out.println(counter);
    }

    public void quit() {
        running = false;
    }

    public void getInput() {

        while(running == true){

            int addOrSub = input.nextInt();

            switch(addOrSub) {

                case 0:
                    decrement();
                case 1:
                    increment();

            }

        }

    }

}
