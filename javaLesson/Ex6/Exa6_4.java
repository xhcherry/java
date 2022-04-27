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
        System.out.println("��������ʹ���ʽɲ������");
    }

    public void charge() {
        System.out.println("����������1/�ţ����ƹ�����");
    }
}

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
    void brake() {
        System.out.println("���⳵ʹ����ʽɲ������");
    }

    public void charge() {
        System.out.println("���⳵��2/������������");
    }

    public void controlAirTemperature() {
        System.out.println("���⳵��hair�յ�");
    }
}

class Cinema implements MoneyFare, ControlTemperature {
    public void charge() {
        System.out.println("��ӰԺ��Ʊ10/��");
    }

    public void controlAirTemperature() {
        System.out.println("��ӰԺ������յ�");
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
