
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chalosalvador
 */
public class Plane {

    private ArrayList<Seat> seats = new ArrayList<>();
    private int rows;
    private int cols;
    final String[] colLetters = {"A", "B", "C", "D", "E", "F", "G", "H"};

    public Plane(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Seat seat = new Seat(i + 1, this.colLetters[j]);

                this.seats.add(seat);
            }
        }
    }

    @Override
    public String toString() {

        String planeMap = "";
        for (int i = 0; i < this.rows; i++) {
            planeMap += (i + 1) + " ";
            for (int j = 0; j < this.cols; j++) {
                String colLetter = this.colLetters[j];
                Seat currentSeat = new Seat(i + 1, colLetter);
                int currentSeatIndex = this.seats.indexOf(currentSeat);
                
                if(this.seats.get(currentSeatIndex).isFree()) {
                    planeMap += colLetter + " ";
                } else {
                    planeMap += "X ";
                }
            }
            planeMap += "\n";
        }

        return planeMap;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
    
    

}
