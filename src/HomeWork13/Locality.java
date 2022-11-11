package HomeWork13;

public abstract class  Locality {
    protected String name;
    protected String supervisor;
    protected Double square;
    public Locality(String name,String supervisor,Double square){
        this.name = name;
        this.supervisor = supervisor;
        this.square = square;
    }
    public  Locality(){}

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }
    public  void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void search(Locality[] localities ,String name){
    Locality[] localities1 = localities;
        for (int i = 0; i <= localities1.length-1; i++) {
            if (localities1[i].getSupervisor().equals(name)) {
                System.out.println(localities1[i].toString());
                 break;
            }
        }
    }


    @Override
    public String toString() {
        return "Locality{" +"name='"+name+','+
                ", supervisor='" + supervisor + '\'' +
                ", square=" + square +
                '}';
    }
}
