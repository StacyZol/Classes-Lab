package com.company;

/**
 * Created by stacyzolnikov on 6/27/16.
 */
public class Car {
    String mcolor;
    String mbrand;
    int mtopSpeed;

    public Car (String color, String brand, int speed) {
        mcolor = color;
        mbrand = brand;
        mtopSpeed=speed;
    }
    public void goCar () {System.out.println("Drive");}
    public void slowCar() {System.out.println("Slow Down");}
    public void stopCar () {System.out.println("STOP");}
    public String getColor() {return mcolor;}
    public String getBrand() {return mbrand;}
    public int getSpeed() {return mtopSpeed;}
    public void setColor( String color){
        mcolor = color;
    }
    public void setBrand (String brand) {
        mbrand = brand;
    }
    public void setSpeed(int speed) {
        mtopSpeed=speed;
    }
}
