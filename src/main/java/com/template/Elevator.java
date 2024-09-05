package com.template;

public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;
    private int currentPassengers;
    private int maxPassengers;

    // Constructor
    public Elevator(int minFloor, int maxFloor, int maxPassengers) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.maxPassengers = maxPassengers;
        this.currentFloor = minFloor; // Comienza en el piso mínimo.
        this.currentPassengers = 0;   // Comienza sin pasajeros.
    }

    // Mueve el ascensor a un piso si está dentro del rango permitido.
    public void moveToFloor(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            currentFloor = floor;
        }
    }

    // Devuelve el piso actual.
    public int getCurrentFloor() {
        return currentFloor;
    }

    // Añade un pasajero si no se ha alcanzado el máximo.
    public void addPassenger() {
        if (currentPassengers < maxPassengers) {
            currentPassengers++;
        }
    }

    // Remueve un pasajero si hay pasajeros presentes.
    public void removePassenger() {
        if (currentPassengers > 0) {
            currentPassengers--;
        }
    }

    // Devuelve el número actual de pasajeros.
    public int getPassengerCount() {
        return currentPassengers;
    }
}
