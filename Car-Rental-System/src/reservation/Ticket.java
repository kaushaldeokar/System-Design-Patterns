package reservation;

import products.Vehicle;

public class Ticket {
    public Integer ticketId;
    public User user;
    public Vehicle vehicle;
    public Integer duration;

    public Ticket(Integer ticketId,User user,Vehicle vehicle,Integer duration){
        this.ticketId=ticketId;
        this.user=user;
        this.vehicle=vehicle;
        this.duration=duration;
    }
}
