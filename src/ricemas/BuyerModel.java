/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricemas;

import java.util.Scanner;

/**
 *
 * @author A C E R
 */
public class BuyerModel {
    private float price ;
    private String item;
    private String location;
    private int quantity;
    private String name;
    

    public BuyerModel() {
    }

    
    public BuyerModel(float price, String item, String location, int quantity) {
        this.price = price;
        this.item = item;
        this.location = location;
        this.quantity = quantity;
       
    }

    @Override
    public String toString() {
        return this.name +"{"+this.item+" "+this.item+" "+this.quantity+""+this.price+" }";
                }

    
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter buyer name");
        this.name = in.nextLine();
        System.out.println("Enter buyer item");
        this.item = in.nextLine();
        System.out.println("Enter buyer price");
        this.price = in.nextFloat();
        System.out.println("Enter buyer quantity");
        this.quantity = in.nextInt();
        
    
    }
}
