public class Driver extends Employes implements DriveAble {
    public Driver(String name){
        super(name);
    }

    @Override
    public void Drive() {
        System.out.println(getName()+" Водитель");
    }
}
