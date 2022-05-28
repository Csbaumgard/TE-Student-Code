package com.techelevator;

public class Airplane {
    private final String planeNumber;
    private final int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private final int totalCoachSeats;
    private int bookedCoachSeats;
    public int availableFirstClassSeats;
    public int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableFirstClassSeats() {
        availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getAvailableCoachSeats() {
        availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass) {
            bookedFirstClassSeats += totalNumberOfSeats;
            if (bookedFirstClassSeats <= availableFirstClassSeats) {
                availableFirstClassSeats -= bookedFirstClassSeats;
                return true;
            } else {
                bookedCoachSeats += totalNumberOfSeats;
                if (bookedCoachSeats <= availableCoachSeats) {
                    availableCoachSeats -= bookedCoachSeats;
                    return true;
                }
            }

        }
        return false;
    }
}
