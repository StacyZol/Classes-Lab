package com.company;

public class Main {


    public static void main(String[] args) {
        StopLight redStoplight = new StopLight("red");
        Car aPrius = new Car ("Blue", "Toyota", 120);
        redStoplight.isRed();
        System.out.println(redStoplight.isRed());
        redStoplight.isYellow();
        System.out.println(redStoplight.isYellow());
        redStoplight.isGreen();
        System.out.println(redStoplight.isGreen());
        StopLight stopLight = new StopLight();

       for (int i=0; i < 30; i++) {
           stopLight.isRed();
           aPrius.stopCar();
           stopLight.isYellow();
           aPrius.slowCar();
           stopLight.isGreen();
            aPrius.goCar();
        }

}
}
