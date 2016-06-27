package com.company;

/**
 * Created by stacyzolnikov on 6/27/16.
 */
public class StopLight {
    String mlightColor = "";

    public StopLight() {
    }

    public StopLight (String lightColor) {
        mlightColor = lightColor;
    }

    public boolean isRed() {
        mlightColor= "";
            return mlightColor.equals("red");

    }
    public boolean isYellow() {
        return mlightColor.equals("yellow");
    }
    public boolean isGreen() {
        return mlightColor.equals("green");

    }
    public void setLightColor (String lightColor) {
        mlightColor = lightColor;
    }

}
