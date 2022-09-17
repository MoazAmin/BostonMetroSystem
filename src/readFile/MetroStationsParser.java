package readFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MetroStationsParser implements FileParser{

    public metroStation.Stations stations = new metroStation.Stations();

    @Override
    public void parseFile() throws FileNotFoundException{

        File inputFile = new File("bostonmetro.txt");
        Scanner scanner = new Scanner(inputFile);
        StringTokenizer st;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            st = new StringTokenizer(line);

            if (!st.hasMoreTokens()) {
                line = scanner.nextLine();
                continue;
            }

            String stationIDStr = st.nextToken();
            int stationID=Integer.parseInt(stationIDStr);


            if (!st.hasMoreTokens()) {
                System.out.println("Error. No station name.");
                return;
            }

            String stationName = st.nextToken();

            if (!st.hasMoreTokens()) {
                System.out.println("Error. This station has no lines.");
                return;
            }

            while (st.hasMoreTokens()) {
                String lineColor = st.nextToken();

                if (!st.hasMoreTokens()) {
                    System.out.println("Error. Missing outbound station line information.");
                }

                String outboundIDStr = st.nextToken();
                int outboundID=Integer.parseInt(outboundIDStr);


                if (!st.hasMoreTokens()) {
                    System.out.println("Error. Missing inbound station line information.");
                }

                String inboundIDStr = st.nextToken();
                int inboundID=Integer.parseInt(inboundIDStr);

                metroStation.Station station = new metroStation.Station(stationID,stationName,inboundID, outboundID, lineColor);
                stations.addStation(station);
            }
        }
        //prints out all data after parsing
        System.out.println(stations);
    }
}
