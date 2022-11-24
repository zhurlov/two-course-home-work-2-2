package transport;

public class Car {

    public static class Key {
        private String remoteEngineStart;
        private String keylessAccess;

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public String getKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class insurance {

    }
    private String brand, model, country, bodyType, numberOfSeats; /// Get

    private int year; // Get is Set
    private double engineVolume; // Get is Set
    private String color, transmission, registrationNumber, summerOrWinterTires, tires;  // Get is Set

    public Car(String brand, String model, String color, String country, int year, double engineVolume, String summerOrWinterTires) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.country = country;
        this.year = year;
        this.engineVolume = engineVolume;
        this.summerOrWinterTires = summerOrWinterTires;
    }

    public void carModels() {
        System.out.println(getBrand() + " " + getModel() + ", " + getYear() + " года выпуска," + " сборка " + getCountry() + ", " + color + " цвет," + " объем двигателя " + engineVolume + " л.");
    }

    public String getSummerOrWinterTires() {
        if (summerOrWinterTires == "лето"){
            summerOrWinterTires = "летние шины";
        }else if (summerOrWinterTires == "зима"){
            summerOrWinterTires = "зимние шины";
        } else {
            return "всесезонная резина";
        }
        return summerOrWinterTires;
    }
    public void setSummerOrWinterTires(String summerOrWinterTires) {
        this.summerOrWinterTires = summerOrWinterTires;
    }


    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = engineVolume + 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        if (color == null) {
            this.color = "белый";
        }
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        }
        this.color = color;
    }

    public String getTransmission() {

        return transmission;
    }

    public void setTransmission(String transmission) {

        this.transmission = transmission;
    }

    public String getRegistrationNumber() {


        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {

        this.registrationNumber = registrationNumber;
    }


    /////////////////////////////////////////////////////////////////////////////////////

    public String getBrand() {
        if (brand == null){
            brand = "default";
        }
        return brand;

    }


    public String getModel() {
        if (model == null) {
            this.model = "default";
        }
        return model;
    }

    public String getCountry() {
        if (country == null) {
            this.country = "default";
        }
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }





}
