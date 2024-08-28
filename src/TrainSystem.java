package src;

import java.util.*;

public class TrainSystem {
    private Map<String,Station> stationMap = new HashMap<>();
    private Map<String,Train> trainMap = new HashMap<>();
    private List<Schedule> scheduleList = new ArrayList<>();

    public void addStation(Station station){
        stationMap.put(station.getStationName(),station);
    }
    public void addTrain(Train train){
        trainMap.put(train.getTrainName(),train);
    }
    public void addSchedule(Schedule schedule){
        scheduleList.add(schedule);
    }
    public List<Schedule> findMyTrain(String source,String destination){
        List<Schedule> result = new ArrayList<>();
        for(Schedule schedule:scheduleList){
            if(schedule.getStation().getStationName().equals(source)
                    ||
                    schedule.getStation().getStationName().equals(destination)
            ){
                result.add(schedule);
            }
        }
        return result;
    }
}
