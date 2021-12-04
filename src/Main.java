import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Raushan");
        Programmer programmer1 = new Programmer("Raushan1");
        Cooker cooker = new Cooker("Ershon");
        Cooker cooker1 = new Cooker("Ershon1");
        Driver driver = new Driver("Kuanysh");
        Driver driver1 = new Driver("Kuanysh1");
    
        ArrayList<ProgramAble> programAbles= new ArrayList<>();
        programAbles.add(programmer);
        programAbles.add(programmer1);
        for(ProgramAble programName: programAbles){
            programName.writeCod();
        }

        ArrayList<CookAble> cookName= new ArrayList<>();
        cookName.add(cooker);
        cookName.add(cooker1);
        for(CookAble cookerName: cookName){
            cookerName.Cooke();
        }

        ArrayList<DriveAble> driveAbles=new ArrayList<>();
        driveAbles.add(driver);
        driveAbles.add(driver1);
        for(DriveAble driveName: driveAbles){
            driveName.Drive();
        }

    }
}
