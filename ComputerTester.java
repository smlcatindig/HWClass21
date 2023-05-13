package class21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer computer[]={new Apple(), new Lenovo(), new HP(), new Dell()};

        for(Computer c: computer){
            if(c instanceof Apple){
                ((Apple)c).softwareDev();
            }else if(c instanceof Lenovo){
                ((Lenovo)c).cyberSecurity();
            }else if(c instanceof HP){
                ((HP)c).webDev();
            }else if(c instanceof Dell){
                ((Dell)c).systemsAnalyst();
            }
        }
    }
}
