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

    private Scanner input;
    private Counter counter;
    private boolean running;

    public CounterConsoleMenu() {
        counter = new Counter();
        input = new Scanner(System.in);
        running = true;
    }

    public void displayCounter() {
        System.out.println(counter.getCount());
    }

    public void quit() {
        running = false;
    }

    public void start() {

        while(running){

            System.out.println("0 - decrement, 1 - increment, 2 - reset, 3 - quit");

            int decision = input.nextInt();

            switch(decision) {

                case 0:
                    counter.decrement();
                    break;
                case 1:
                    counter.increment();
                    break;
                case 2:
                    counter.reset();
                    break;
                case 3:
                    quit();

            }

            if(running) {
                displayCounter();
            }

        }

    }

}
