import java.util.*;
public class first{
    public static void main(String args[]){
        world obj = new world();
        // Start method to initiate new thread
        // obj.start();
        Thread t1 = new Thread(obj);
        t1.start();
        while(true)
        // System.out.println("HEllo");
        System.out.println(Thread.currentThread().getName());
    }
}