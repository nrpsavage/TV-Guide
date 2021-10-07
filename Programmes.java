/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvmovieguide;

/**
 *
 * @author natha
 */
public abstract class Programmes {
    protected String name;
    protected String time;
    protected String type;
    protected double price;
    
    public Programmes(){
        name = " ";
        time = " ";
        type = " ";
        price = 0;
    }

    public Programmes(String name, String time, String type, double price) {
        this.name = name;
        this.time = time;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public abstract void compute();
    
}
