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
public class Movie extends Programmes{
    private double TPrice;

    public Movie(double TPrice, String name, String time, String type, double price) {
        super(name, time, type, price);
        this.TPrice = TPrice;
    }
    
    public Movie(){
        TPrice = 0;
    }
    
    public double getTPrice() {
        return TPrice;
    }

    public void setTPrice(double TPrice) {
        this.TPrice = TPrice;
    }
    
    public void compute(){
        TPrice = 9.99+price;
    }
}
