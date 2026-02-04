class parent {
    int x = 10;
}

class Child extends parent {
    int x = 20;

    void display() {
        System.out.println("Value using this = " + this.x);
        System.out.println("Value using super = " + super.x);
    }

    public static void main(String[] args) {
        Child a = new Child();
        a.display();
    }
}

