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
    private int zombieRow;
    private int zombieColumn;

    public Hilo() {
        this.logic = new Logic();
        zombieRow = 0;
        zombieColumn = 0;
    }
    
    @Override
    public void run() {
        this.logic.cell[0][0].setIdAndImageView(3);
        int random;
        while(true){
            random = (int) (Math.random() * 3);
            if(random == 0){
                zombieUp();
            } else if(random == 1){
                zombieDown();
            } else if(random == 2){
                zombieLeft();
            } else if(random == 3){
                zombieRight();
            }
            try {
                this.wait(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
    
    public void zombieUp() {
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(1);
        if (this.zombieRow > 0 && this.logic.cell[this.zombieRow-1][this.zombieColumn].getID() == 1) {
            this.zombieRow--;
        }
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(3);
    }

    public void zombieDown() {
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(1);
        if (zombieRow < this.logic.cell.length-1 && this.logic.cell[this.zombieRow+1][this.zombieColumn].getID() == 1) {
            this.zombieRow++;
        }
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(3);
    }

    public void zombieLeft() {
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(1);
        if (this.zombieColumn > 0 && this.logic.cell[this.zombieRow][this.zombieColumn-1].getID() == 1) {
            this.zombieColumn--;
        }
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(3);
    }

    public void zombieRight() {
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(1);
        if (zombieColumn < this.logic.cell[0].length-1 && this.logic.cell[this.zombieRow][this.zombieColumn+1].getID() == 1) {
            this.zombieColumn++;
        }
        this.logic.cell[this.zombieRow][this.zombieColumn].setIdAndImageView(3);
    }
    
}
