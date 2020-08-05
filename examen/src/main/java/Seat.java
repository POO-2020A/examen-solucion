
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author chalosalvador
 */
public class Seat {

    private int row;
    private String col;
    private Passenger passenger;

    public Seat(int row, String col) {
        this.row = row;
        this.col = col;
    }

    public boolean isFree() {
        return passenger == null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seat other = (Seat) obj;
        if (this.row != other.row) {
            return false;
        }
        if (!Objects.equals(this.col, other.col)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        String string = "Asiento: " + row + col;

        if (this.isFree()) {
            string += ", libre.";
        } else {
            string += ", ocupado. Pasajero: " + this.passenger.getName() + " " + this.passenger.getLastname();
        }

        return string;

    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

}
