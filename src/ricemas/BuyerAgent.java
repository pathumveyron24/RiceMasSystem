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
public class BuyerAgent extends masmt3.agent.MaSMTAgent{

    
    public BuyerModel buyer;

    public BuyerAgent(BuyerModel buyer, String group, String role, int id) {
        super(group, role, id);
        this.buyer = buyer;
    }
    
    
    @Override
    public void active() {
        
            }

    @Override
    public void live() {
        
        System.out.println (""+buyer);
        
        wait(1000);
        }

    @Override
    public void end() {
        
    }
    
    
    
}
