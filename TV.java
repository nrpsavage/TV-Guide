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
public class TV extends Programmes{

    private double TPrice;

    public TV(String name, String time, String type, double price) {
        super(name, time, type, price);
    }
    
    public TV(){
        TPrice = 0;
    }

    public double getTPrice() {
        return TPrice;
    }

    public void setTPrice(double TPrice) {
        this.TPrice = TPrice;
    }
    
    public void compute(){
        TPrice = 4.99+price;
    }
}
