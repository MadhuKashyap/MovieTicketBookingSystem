import booking.Booking;
import dto.Address;
import dto.Movie;
import dto.Theater;
import dto.User;
import impl.BookSeat;
import impl.BookingApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Address add1 = new Address(1234, "Bangalore", "Karnataka", "India");
        Address add2 = new Address(1235, "Bangalore", "Karnataka", "India");
        Address add3 = new Address(1235, "Bangalore", "Karnataka", "India");

        User usr1 = new User(1, "rina", "rina@123", "123456", add1);
        User usr2 = new User(2, "mina", "mina@123", "123356", add2);
        User usr3 = new User(3, "bina", "bina@123", "523456", add3);

        Movie movie1 = new Movie(1, "Star-wars", 120.0, "adventure", "producer-abc");
        Movie movie2 = new Movie(2, "Thor", 120.0, "adventure", "producer-marvel");
        Movie movie3 = new Movie(3, "Ishq", 220.0, "Romance", "producer-dharma");

        Theater th1 = new Theater(1, "PVR Bellandur", add1, movie1, 11, 2, 2);
        Theater th2 = new Theater(2, "PVR Koramangla", add2, movie3, 13, 1, 2);
        Theater th3 = new Theater(3, "Ulsoor UB", add1, movie1, 11, 2, 2);
        Theater th4 = new Theater(4, "Forum", add3, movie2, 9, 2, 6);

        List<Theater> list = new ArrayList<>(Arrays.asList(th1,th2, th3, th4));
        BookingApp b = new BookingApp(usr1, list);
        List<Theater> listT = b.displayTheatre(movie1.getName());
        for(Theater t : listT)
        {
            System.out.println(t.getName());
            b.displaySeatArrangement(t);
        }

        BookSeat bs = new BookSeat(th1, 0, 1, usr1);
        Booking booking1 = bs.bookSeatTh();
        b.displaySeatArrangement(th1);
        System.out.println(booking1);
    }
}
