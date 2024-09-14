import java.util.List;
import java.util.ArrayList;
class Reservation{

    int startDay;
    int endDay;

    public Reservation(int startDay, int endDay){

        this.startDay = startDay;
        this.endDay = endDay;

    }

    @Override
    public String toString() {
        return "[" + startDay + ", " + endDay + "]";
    }
}

class HotelRoom {

    private List<Reservation> reservations;

    public HotelRoom() {

        this.reservations = new ArrayList<>();

    }

    public boolean isFree(int P, int Q) {

        for (Reservation res : reservations) {

            if (!(P >= res.endDay || Q <= res.startDay)) {

                return false;
            }
        }
        return true;
    }

    public boolean makeReservation(int P, int Q) {

        if (isFree(P, Q)) {

            reservations.add(new Reservation(P, Q));
            return true;
        }
        return false;
    }

    public boolean removeReservation(int P, int Q) {

        for (Reservation res : reservations) {

            if (res.startDay == P && res.endDay == Q) {

                reservations.remove(res);
                return true;
            }
        }
        return false;
    }

    public void outputReservations(){

        if(reservations.isEmpty()){

            System.out.println("Няма резервации.");

        } else{

            for(Reservation res : reservations){

                System.out.println(res);

            }
        }

    }
}