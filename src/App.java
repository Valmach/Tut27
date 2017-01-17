/**
 * Created by valmach on 17/01/2017.
 */
//encapsulation
class Plant {
    public static final int ID = 7;
    private String name;

    public String getData(){
        String data = "some stuff " + calculateGrowthForecast();
        return data;
        // don't want classes tightly-coupled.
    }

    public int calculateGrowthForecast(){
        return 9;

    }

    //keep everything private, hidden reduce cross linkages, no class pollination
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class App {
    public static void main(String[] args) {

    }
}
