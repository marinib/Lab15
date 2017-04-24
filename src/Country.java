/**
 * Created by uComp1337me on 4/24/2017.
 */
public class Country {
    private String name;


    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}