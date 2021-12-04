public class Programmer extends Employes implements ProgramAble {
    public Programmer(String name){
        super(name);
    }

    @Override
    public void writeCod() {
        System.out.println(getName()+" Программист");
    }
}
