package reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    List<Ticket> ticketList;

    public ReservationManager(){
        ticketList= new ArrayList<>();
    }

    public void addTicket(Ticket ticket){
        ticketList.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        ticketList.remove(ticket);
    }
}
