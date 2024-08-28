package src;

public class Schedule {
    private Train train;
    private Station station;
    private Platform platform;
    private String arrivalTime;
    private String destinationTime;

    public Schedule(Train train, Station station, Platform platform, String arrivalTime, String destinationTime) {
        this.train = train;
        this.station = station;
        this.platform = platform;
        this.arrivalTime = arrivalTime;
        this.destinationTime = destinationTime;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDestinationTime() {
        return destinationTime;
    }

    public void setDestinationTime(String destinationTime) {
        this.destinationTime = destinationTime;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", platform=" + platform +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", departureTime='" + destinationTime + '\'' +
                '}';
    }
}
