package HomeWork13;

public class Village extends Locality{
    public Village(String name,String supervisor, Double square) {
        super(name,supervisor, square);
    }


    @Override
    public String toString(){
        return "Village {" + "name ="+name+','+
                "supervisor ='" + supervisor + '\''+
                ", square ="+square + '}';
    }
}
