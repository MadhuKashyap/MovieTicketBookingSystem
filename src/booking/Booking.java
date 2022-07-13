package booking;

import dto.Seat;
import dto.Theater;
import dto.User;

import java.util.ArrayList;
import java.util.List;

public class Booking {
    int id;
    User user;
    Theater th;
    Seat seat;
    Double price;
    List<Booking> bookings;

    public Booking(int id, User user, Theater th, Seat seat, Double price) {
        this.id = id;
        this.user = user;
        this.th = th;
        this.seat = seat;
        this.price = price;
        this.bookings = new ArrayList<>();
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    @Override public String toString() {
        return "Booking{" + "id=" + id + ", user=" + user + ", th=" + th + ", seat=" + seat
            + ", price=" + price + ", bookings=" + bookings + '}';
    }
}
