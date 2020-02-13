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
public class FarmerAgent extends masmt3.agent.MaSMTAgent{

    
    public FarmerModel farmer;

    public FarmerAgent(FarmerModel farmer, String group, String role, int id) {
        super(group, role, id);
        this.farmer = farmer;
    }
    
    
    @Override
    public void active() {
        farmer = new FarmerModel();
        
     //   this.farmer.getONtologyFromDb();
     this.farmer.input();
            }

    @Override
    public void live() {
        
        System.out.println (""+farmer);
        
        wait(1000);
        }

    @Override
    public void end() {
        
    }
    
    
    
}
