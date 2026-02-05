public class chaining_super {
    
    void display() {
        System.out.println("Class chaining_super: display()");
    }



class B extends chaining_super{
    void display() {
        System.out.println("Class B: display()");
    }
}

// Child class
class C extends B {
    void show() {
        
       super.super.display();

        
    }
}


public class SuperChainingDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}



