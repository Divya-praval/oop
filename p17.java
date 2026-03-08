class University{
    static int totalStudents;
    static  String universityName;


    static void getTotalStudents(){
        System.out.println("total student is :" +totalStudents);
    }

   static{
    universityName = "GTU";
    totalStudents= 0;

   }

    {
        System.out.println("university name "+ universityName);
        System.out.println("divya raval : 240390107038 ");

    }
}


public class p17{
    public static void main(String[] args){
    University u1 = new University();
    University u2 = new University();
   
    University.getTotalStudents();
}
}