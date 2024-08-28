package src;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String StationId;
    private String StationName;
    private List<Platform> platformList;

    public Station(String stationId, String stationName) {
        this.StationId = stationId;
        this.StationName = stationName;
        this.platformList = new ArrayList<>();
    }

    public String getStationId() {
        return StationId;
    }

    public void setStationId(String stationId) {
        StationId = stationId;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        StationName = stationName;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "StationId='" + StationId + '\'' +
                ", StationName='" + StationName + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
