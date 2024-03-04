package Pratical;

class student {
    int rollno;
    String name;

    public student() {
        rollno = 10225077;
        name = "balvant ";
    }

    void display() {
        System.out.println(rollno);
        System.out.println(name);
    }
}

public class constructer {
    public static void main(String[] args) {
        student obj = new student();
        obj.display();
    }
}
