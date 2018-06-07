/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author fabian
 */
public class PlayerConfiguration {
   
    private int visionRange;
    private int defense;
    private int shortAttack;
    private int LongAttack;
    private float delay;
    private int range;

    public PlayerConfiguration() {
    }

    public PlayerConfiguration(int visionRange, int defense, int shortAttack, int LongAttack, float delay, int range) {
        this.visionRange = visionRange;
        this.defense = defense;
        this.shortAttack = shortAttack;
        this.LongAttack = LongAttack;
        this.delay = delay;
        this.range = range;
    }

    public int getVisionRange() {
        return visionRange;
    }

    public void setVisionRange(int visionRange) {
        this.visionRange = visionRange;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getShortAttack() {
        return shortAttack;
    }

    public void setShortAttack(int shortAttack) {
        this.shortAttack = shortAttack;
    }

    public int getLongAttack() {
        return LongAttack;
    }

    public void setLongAttack(int LongAttack) {
        this.LongAttack = LongAttack;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Player{" + "visionRange=" + visionRange + ", defense=" + defense + ", shortAttack=" + shortAttack + ", LongAttack=" + LongAttack + ", delay=" + delay + ", range=" + range + '}';
    }
    
    
}