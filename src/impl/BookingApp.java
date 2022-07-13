package impl;

import dto.Seat;
import dto.Theater;
import dto.User;

import java.util.ArrayList;
import java.util.List;

public class BookingApp {
    User user;
    List<Theater> theater;
    public BookingApp(User user, List<Theater> th)
    {
        this.user = user;
        theater = th;
    }
    public List<Theater> displayTheatre(String movie) // displays all theatres running a particular movie in a pincode
    {
        List<Theater> l = new ArrayList<>();
        for(Theater t : theater)
        {
            if(t.getAddress().getPin() == user.getAdd().getPin() )
                l.add(t);
        }
        return l;
    }
    public void displaySeatArrangement(Theater th)
    {
        for(int i=0;i<th.getRow();i++)
        {
            for(int j=0;j<th.getCol();j++)
            {
                System.out.print(th.getA()[i][j] +" ");
            }
            System.out.println();
        }
    }

}
