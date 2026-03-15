class Employee{
    String name = "Divya";
    String department = "CE";

    void displayDetails(){
        System.out.println("name :" +name);
         System.out.println("department : " +department);
    }
}
class Manager extends Employee{
  int  tsize=10; 
   void  displayDetails(){
         System.out.println("team size is :" +tsize);
          System.out.println("DIVYA RAVAL :");
           System.out.println("240390107038 :");
    }
}

public class p24{
    public static void main(String[] args){
        Employee obj1 = new Employee();
        Manager obj2 = new Manager();
        obj1.displayDetails();
        obj2.displayDetails();
    }
}