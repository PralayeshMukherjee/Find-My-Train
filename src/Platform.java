package src;

public class Platform {
    private int PlatformNumber;
    private Train train;

    public Platform(int platformNumber) {
        this.PlatformNumber = platformNumber;
    }

    public int getPlatformNumber() {
        return PlatformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        PlatformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "PlatformNumber=" + PlatformNumber +
                ", train=" + train +
                '}';
    }
}
