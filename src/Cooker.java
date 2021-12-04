public class Cooker  extends Employes implements CookAble{
    public Cooker(String name){
        super(name);
    }

    @Override
    public void Cooke() {
        System.out.println(getName()+" Повар");
    }
}
