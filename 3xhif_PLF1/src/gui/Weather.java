/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author marcs
 */
public class Weather {
    
    private String place;
    private float temp;
    private int hum, sealvl;

    public Weather(String place,int sealvl, float temp, int hum) {
        this.place = place;
        this.temp = temp;
        this.hum = hum;
        this.sealvl = sealvl;
    }

    public String getPlace() {
        return place;
    }

    public float getTemp() {
        return temp;
    }

    public int getHum() {
        return hum;
    }

    public int getSealvl() {
        return sealvl;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setHum(int hum) {
        this.hum = hum;
    }

    public void setSealvl(int sealvl) {
        this.sealvl = sealvl;
    }
    
    
    
    
}
