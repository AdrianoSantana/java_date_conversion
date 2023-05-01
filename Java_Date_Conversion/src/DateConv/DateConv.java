package DateConv;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class DateConv {
    private ArrayList<String> zones = new ArrayList<>();

    public DateConv() {
        var zonesSet = ZoneId.getAvailableZoneIds();
        for (String z : zonesSet) {
            zones.add(z);
        }
    }

    public ArrayList<String> getZones() {
        return zones;
    }

    public ArrayList<String> getDateTimes(int[] chooses) {
        ArrayList<String> result = new ArrayList<>();
        Instant local = Instant.now();

        for (int c : chooses) {
            String locationName = zones.get(c);
            ZoneId zoneChoosed = ZoneId.of(locationName);
            String dateTime = LocalDateTime.ofInstant(local, zoneChoosed).toString();
            result.add(String.format("Date now in %s is %s", locationName, dateTime));
        }
        return result;
    }
}
