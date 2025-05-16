public class Race {
    String vinner = "";
    int vinnerDistance = 0;

    void race(String model, int speed){
        int distance = speed * 24;
        if(distance >= vinnerDistance){
            vinnerDistance = distance;
            vinner = model;
        }
    }
}