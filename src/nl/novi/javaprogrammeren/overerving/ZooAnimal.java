package nl.novi.javaprogrammeren.overerving;

import java.time.DayOfWeek;

public abstract class ZooAnimal extends Animal {

    private String cageName;
    private DayOfWeek lastDayFed;
    private String countryOfOrigin;

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public DayOfWeek getLastDayFed() {
        return lastDayFed;
    }

    public void setLastDayFed(DayOfWeek lastDayFed) {
        this.lastDayFed = lastDayFed;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void move() {
        System.out.println("Moved 0.50 meters.");
    }

    @Override
    public void sound() {
        super.sound();
    }
}
