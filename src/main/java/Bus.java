import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public int passengersCount(){
        return passengers.size();
    }

    public void addPassengerToBus(Person person){
        if(this.capacity > passengers.size()) {
            this.passengers.add(person);
        }
    }

    public Person removePassenger(){
        return this.passengers.remove(0);
    }
}
