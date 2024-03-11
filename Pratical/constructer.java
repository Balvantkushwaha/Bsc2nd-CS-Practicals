package Pratical;

class student {
    int rollno;
    String name;

    student() {
        System.out.println("welcome to default constructer"); // detault constroucter
    }

    public student(int rollno, String name) {
        // rollno = 10225077;
        // name = "balvant ";
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno);
        System.out.println(name);
    }
}

public class constructer {
    public static void main(String[] args) {
        student obj = new student();
        student st = new student(0, null);
        st.display();
    }
}
