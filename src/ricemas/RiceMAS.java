/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricemas;

/**
 *
 * @author A C E R
 */
public class RiceMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BuyerModel bm1  = new BuyerModel(100,"rice4","colombo",2500);
        BuyerModel bm2  = new BuyerModel(100,"rice4","colombo",2500);
        BuyerModel bm3  = new BuyerModel(100,"rice4","colombo",2500);
        
        
        FarmerModel fa  = new FarmerModel(100,"rice4","colombo",2500);
   
        
        BuyerAgent ba = new BuyerAgent(bm, "bm", "buy", 1);
        ba.start();
        
        FarmerAgent fm = new FarmerAgent(fa,"fa","sell",2);
        fm.start();
        
    }
    
}
