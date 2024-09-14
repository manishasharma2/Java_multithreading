import java.util.*;
// New class world is created to extend the thread
// public class world  extends Thread{
//     @Override
//     // Run method is being override
//     public void run(){
//         while(true)
//                 System.out.println(Thread.currentThread().getName());

//             // System.out.println("THread");
//     }
// }
public class world implements Runnable{
    @Override
    public void run()
    {
        while(true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}