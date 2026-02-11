 class A{
    final int var = 10 ;
 }
    final class B{
         static int x ;
    }
    public class final1{
         public static void main(String[] args) {
            A a = new A();
            B b = new B();
            a.var = 10;
            b.x = 30;
            System.out.println(b.x);
            System.out.println(a.var);
        
    }
    
}
