package dto;

public class Seat {
    int id;
    int row;
    int col;
    boolean available;
    Double price;

//    public Seat(int id, int row, int col, boolean available, Double price) {
//        this.id = id;
//        this.row = row;
//        this.col = col;
//        this.available = available;
//        this.price = price;
//    }

    @Override public String toString() {
        return "Seat{" + "id=" + id + ", row=" + row + ", col=" + col + ", available=" + available
            + ", price=" + price + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean val) {
        this.available = val;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
