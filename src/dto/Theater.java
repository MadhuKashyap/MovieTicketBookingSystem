package dto;

import enm.Available;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theater {
    int id;
    String name;
    Address address;
    Movie movie;
    int time;
    int row;
    int col;
    Seat a[][] ;

    public Theater(int id, String name, Address address, Movie movie, int time, int row, int col) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.movie = movie;
        this.time = time;
        this.row = row;
        this.col = col;
        this.a = new Seat[row][col];
        for(int i =0 ; i<row ; i++)
        {
            for(int j = 0 ; j < col ; j++)
            {
                a[i][j] = new Seat();
            }
        }
        //System.out.println(a.length);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j].row = i;
                a[i][j].col = j;
                a[i][j].available = true;
                if(i == 0)
                    a[i][j].price = 100.0;
                else if(i == row - 1)
                    a[i][j].price = 300.0;
                else
                    a[i][j].price = 200.0;
            }
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Seat[][] getA() {
        return a;
    }

    public void setA(Seat[][] a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override public String toString() {
        return "Theater{" + "id=" + id + ", name='" + name + '\'' + ", address=" + address
            + ", movie=" + movie + ", time=" + time + ", row=" + row + ", col=" + col + ", a="
            + Arrays.toString(a) + '}';
    }
}
