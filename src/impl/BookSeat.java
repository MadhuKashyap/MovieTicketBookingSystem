package impl;

import booking.Booking;
import dto.Seat;
import dto.Theater;
import dto.User;
import enm.Available;

public class BookSeat {
    Theater th;
    int row,col;
    Booking booking ;
    User user;
    public BookSeat(Theater th, int row, int col, User user)
    {
        this.th = th;
        this.row = row;
        this.col = col;
        this.user = user;
    }
    public Booking bookSeatTh()
    {
          Seat a[][] = th.getA();
          a[row][col].setAvailable(false);
          booking = new Booking(1, user, th, th.getA()[row][col], th.getA()[row][col].getPrice());
          return booking;
    }
}
