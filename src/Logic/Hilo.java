/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabian
 */
public class Hilo implements Runnable{

    private Logic logic; 

    public Hilo() {
        this.logic = new Logic();
        
    }
    
    @Override
    public void run() {
      
        System.out.println("Logic.Hilo.run()");
           this.logic.cell[0][0].setIdAndImageView(3);
           
       
    }
    
}
