package src;

public class Train {
    private String TrainNumber;
    private String TrainName;
    private String TrainType;

    public Train(String trainNumber, String trainName, String trainType) {
        TrainNumber = trainNumber;
        TrainName = trainName;
        TrainType = trainType;
    }

    public String getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        TrainNumber = trainNumber;
    }

    public String getTrainName() {
        return TrainName;
    }

    public void setTrainName(String trainName) {
        TrainName = trainName;
    }

    public String getTrainType() {
        return TrainType;
    }

    public void setTrainType(String trainType) {
        TrainType = trainType;
    }

    @Override
    public String toString() {
        return
                "TrainNumber='" + TrainNumber + '\'' +
                ", TrainName='" + TrainName + '\'' +
                ", TrainType='" + TrainType + '\'';
    }
}
