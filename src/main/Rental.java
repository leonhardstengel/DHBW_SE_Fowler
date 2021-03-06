package main;

public class Rental {
    Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    double getCharge() {
        return movie.price.getCharge(daysRented);
    }

    int getFrequentRenterPoints() {
        return movie.price.getFrequentRenterPoints(daysRented);
    }
}