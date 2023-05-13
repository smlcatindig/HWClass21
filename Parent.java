package class21;

public class Parent {
    final int years=12;
    final void getMarry(){
        int years=12;
        System.out.println("Marry Ryan");
    }
    void study(){
        System.out.println("Study Java");
    }
}
class Suzy extends Parent{
    final int years=24;
    @Override
    void study(){
        System.out.println("No I want SDET");
        System.out.println(years);
    }
    }
class ParentTester{
    public static void main(String[] args) {
        Parent parent=new Suzy();
        parent.getMarry();
        parent.study();
    }
}