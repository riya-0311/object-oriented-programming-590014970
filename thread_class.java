class t1 extends Thread{
    public void run(){
        for(int i = 0 ; i <= 5 ; i++){
            System.out.println(i);
        }
    }
}
    class t2 extends Thread{
    public void run(){
        for(int i = 6 ; i <= 10 ; i++){
            System.out.println(i);
        }
    }

}
public class thread_class {

    public static void main(String[] args) {
        t1 a = new t1();
        t2 b = new t2();
        a.start();
       try{
         a.join();
     }catch (InterruptedException e) {
             e.printStackTrace();

     }
        b.start();
        
    }
    
}
