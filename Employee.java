import java.util.Scanner;

class Employee{

private String employeename;
private double employeesalary;



void reademployeedata(){

Scanner sc =new Scanner(System.in);
System.out.println("enter name");
 employeename = sc.nextLine();

System.out.println("enter salary");
 employeesalary = sc.nextDouble();
}

void displaydata(){

System.out.println(" employeename : " + employeename);
System.out.println(" employeesalary : "  + employeesalary);


}

public static void main(String[] args){

Employee emp1 = new Employee();
emp1.reademployeedata();
emp1.displaydata();


}
}