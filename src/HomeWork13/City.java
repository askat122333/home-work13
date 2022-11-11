package HomeWork13;

public class City extends Locality{
    private String sight;

    public City(String name,String supervisor, Double square,String sight) {
        super(name,supervisor, square);
        this.sight = sight;
    }

    public String getSight() {
        return sight;
    }

    public void setSight(String sight) {
        this.sight = sight;
    }

    @Override
    public String toString() {
        return "City{" +"name='"+name+','+
                "sight='" + sight + '\'' +
                ", supervisor='" + supervisor + '\'' +
                ", square=" + square +
                '}';
    }
}
