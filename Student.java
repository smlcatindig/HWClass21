package class21;

public class Student {
    void study(){
        System.out.println("study");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void read(){
        System.out.println("read");
    }
}
class SyntaxStudent extends Student{
    @Override
    void study() {
        System.out.println("study for 2 hrs");
    }
    void exercise(){
        System.out.println("exercise");
    }
}
class CollegeStudent extends Student{
    @Override
    void read() {
        System.out.println("read for 3 hrs");
    }
    void call(){
        System.out.println("call");
    }
}
class SchoolStudent extends Student{
    @Override
    void sleep() {
        System.out.println("sleep for 4 hrs");
    }
    void rest(){
        System.out.println("rest");
    }
}