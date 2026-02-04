public class Student {
    class student {
    int id;
    String name;

    student(int i, String n) {
        id=i;
        name=n;
    }

    void display() {
        System.out.println("ID:" + id);
        System.out.println("Name:" + name);
    }
}

public class ConMainClass {
    public static void main(String[] args) {
        student s1=new Student(101, "riya");
        s1.display();
    }
}
    
}
