package metroStation;
import java.util.ArrayList;

public class Stations {
    ArrayList<Station> stations;

    public Stations(){
        stations = new ArrayList<>();
    }

    public void addStation(Station st){
        stations.add(st);
    }

    public Station getStation(int index){
        Station get = null;
        for (int i = 0; i < stations.size(); i++) {
            if (i == index) {
                get = stations.get(i);
            }
        }
        return get;
    }

    @Override
    public String toString() {
        String print = "";
        for (int i = 0; i < stations.size(); i++) {
            print += i + " => " + stations.get(i).toString() + '\n';
        }
        return print;
    }

}
