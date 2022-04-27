package javaLesson.Ex6;

abstract class MotorVehicles {
    abstract void brake();
}

interface MoneyFare {
    void charge();
}

interface ControlTemperature {
    void controlAirTemperature();
}

class Bus extends MotorVehicles implements MoneyFare {
    void brake() {
        System.out.println("公共汽车使用毂式刹车技术");
    }

    public void charge() {
        System.out.println("公共汽车：1/张，不计公里数");
    }
}

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
    void brake() {
        System.out.println("出租车使用盘式刹车技术");
    }

    public void charge() {
        System.out.println("出租车：2/公里，起价三公里");
    }

    public void controlAirTemperature() {
        System.out.println("出租车有hair空调");
    }
}

class Cinema implements MoneyFare, ControlTemperature {
    public void charge() {
        System.out.println("电影院门票10/张");
    }

    public void controlAirTemperature() {
        System.out.println("电影院有中央空调");
    }
}

public class Exa6_4 {
    public static void main(String[] args) {
        Bus bus101 = new Bus();
        Taxi blueTaxi = new Taxi();
        Cinema redStarCinema = new Cinema();
        MoneyFare fare;
        ControlTemperature temperature;
        fare = bus101;
        bus101.brake();
        fare.charge();
        fare = blueTaxi;
        temperature = blueTaxi;
        blueTaxi.brake();
        fare.charge();
        temperature.controlAirTemperature();
        fare = redStarCinema;
        temperature = redStarCinema;
        fare.charge();
        temperature.controlAirTemperature();
    }
}
