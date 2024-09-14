public class Main {
    public static void main(String[] args) {
        HotelRoom room = new HotelRoom();

        // Примерни операции
        room.makeReservation(1, 5);
        room.makeReservation(10, 15);
        room.outputReservations(); // [1, 5], [10, 15]

        System.out.println(room.isFree(5, 10)); // true
        System.out.println(room.isFree(4, 12)); // false

        room.removeReservation(1, 5);
        room.outputReservations(); // [10, 15]
    }
}