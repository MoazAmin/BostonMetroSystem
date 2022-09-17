package metroStation;

public class Station{
    int id;
    String name;
    int inbound;
    int outbound;
    String lineColor;

    public Station(int stationId, String stationName,int inboundStation, int outboundStation, String color){
        id = stationId;
        name = stationName;
        inbound = inboundStation;
        outbound = outboundStation;
        lineColor = color;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getInbound(){
        return inbound;
    }
    public int getOutbound(){
        return outbound;
    }
    public String getLineColor(){
        return lineColor;
    }

    @Override
    public String toString() {
        String print = "";
        print = "Station ID: " + id +"\t Station Name: "+ name + "\n Line Info: " + inbound + " - " + outbound + " - " + lineColor;
        return print;
    }
}
