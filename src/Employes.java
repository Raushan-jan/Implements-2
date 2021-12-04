public class Employes {
    private String name;

    public Employes(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void voice(){
        System.out.println(name);
    }
}
