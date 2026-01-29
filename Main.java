 class car {
    int n;

    car(int price) {
        this.n = price;
    }
}

class BMW extends car {
    int m;

    BMW(int price, int mValue) {
        super(price);
        this.m = mValue;
    }

    void f1() {
        System.out.println("f1 active");
    }

    void execute() {
        this.f1();
        System.out.println(this.m);
    }
}

public class Main {
    public static void main(String[] args) {
        BMW c1 = new BMW(500, 10);
        c1.execute();
    }
}


    

