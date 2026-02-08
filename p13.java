class Rectangle {
    double width;
    double height;


void setData(double w, double h) {
        width = w;
        height = h;
    }


 double area() {
        return width * height;
    }


double perimeters() {
        return 2 * (width + height);
    }


 void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeters());
    }
}

public class p13 {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setData(4, 40);
        System.out.println("Rectangle 1 Details:");
        r1.display();

        Rectangle r2 = new Rectangle();
        r2.setData(3.5, 35.9);
        System.out.println("\nRectangle 2 Details:");
        r2.display();

        if (r1.area() > r2.area()) {
            System.out.println("\nRectangle 1 has larger area.");
        } else if (r2.area() > r1.area()) {
            System.out.println("\nRectangle 2 has larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
}
