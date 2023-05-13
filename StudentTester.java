package class21;

public class StudentTester {
    public static void main(String[] args) {
       Student student[]={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

       for(Student s: student){

           if(s instanceof SyntaxStudent){
               ((SyntaxStudent)s).exercise();
           }else if(s instanceof CollegeStudent){
               ((CollegeStudent)s).call();
           }else if(s instanceof SchoolStudent){
               ((SchoolStudent)s).rest();
           }
       }

    }
}
