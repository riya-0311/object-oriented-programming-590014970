abstract class sample{
    int a = 10;
    void f(){
        System.out.println(a);   
     }
     abstract void f2();
}
class child extends sample{
    void show(){
        super.f();
    }
    void f2(){
        System.out.println("done");
    }
}
public class abstraction {
    public static void main(String[] args) {
        child s = new child();
        s.show();
        s.f2();
    }
    
}
