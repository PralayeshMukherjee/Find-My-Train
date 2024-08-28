package src;

import java.util.List;
import java.util.Scanner;

public class FindMyTrain {
    public static void main(String[] args) {
        TrainSystem trainSystem = new TrainSystem();

        Station station1 = new Station("St101","howrah");
        Station station2 = new Station("St102","delhi");
        Train train1 = new Train("12303","Poorva Express","superfast express train");
        Train train2 = new Train("12381","Duronto Express","superfast express train");
        Train train3 = new Train("12301","New Delhi Rajdhani Express","superfast express train");
        Platform platform1 = new Platform(9);
        Platform platform2 = new Platform(12);
        Platform platform3 = new Platform(9);
        Schedule schedule1 = new Schedule(train1,station1,platform1,"08:00 AM","06:00 AM");
        Schedule schedule2 = new Schedule(train2,station2,platform2,"08:35 AM","06:40 AM");
        Schedule schedule3 = new Schedule(train3,station1,platform3,"04:50 AM","10:05");

        trainSystem.addTrain(train1);
        trainSystem.addTrain(train2);
        trainSystem.addTrain(train3);
        trainSystem.addStation(station1);
        trainSystem.addStation(station2);
        trainSystem.addSchedule(schedule1);
        trainSystem.addSchedule(schedule2);
        trainSystem.addSchedule(schedule3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your source Station :- ");
        String source = sc.next();
        System.out.println("Enter your destination Station :- ");
        String destination = sc.next();

        List<Schedule> result = trainSystem.findMyTrain(source.toLowerCase(),destination.toLowerCase());
        System.out.println("your train from "+source+" to "+destination+" => ");
        for(Schedule schedule:result){
            System.out.println(schedule.getTrain()+" "+schedule.getPlatform()+" Arrival Time is => "+schedule.getArrivalTime()+", Destination Time is => "+schedule.getDestinationTime());
        }
    }
}
