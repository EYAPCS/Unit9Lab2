/**
 * Created by emma on 7/8/17.
 */

public class Counter {

    private int counter;

    public Counter() {
        reset();
    }

    public int getCount() {
        return counter;
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

}
