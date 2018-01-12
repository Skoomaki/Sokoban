
package sokoban;

/**
 *
 * @author Adam
 */
public class Coordinate {
//  fields of class  
    private int x;
    private int y;
    
//  constructor
    Coordinate(int newX, int newY){
        
        x = newX;
        y = newY;
          
    }
//  encapsulation  
//  Getters  
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
//  setters  
    public void setX(int newX) {
        x = newX;
    }
    public void setY(int newY) {
        y = newY;
    }
    
}
