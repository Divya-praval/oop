class Point {
    int x, y;

    // default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // parameterized constructor
    Point(int X, int Y) {
        this.x = X;
        this.y = Y;
    }

    // copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: " + x + " " + y);
    }
}

public class p12 {
    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        Point p2 = new Point(10, 20);
        System.out.println("Parameterized Constructor:");
        p2.display();

        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();
    }
}
