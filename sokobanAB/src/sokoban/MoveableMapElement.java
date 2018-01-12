
package sokoban;

/**
 *
 * @author Adam
 */
public class MoveableMapElement extends MapElement {
    
//  coordinates for objects  
    private final Coordinate positionInMap;
    
    MoveableMapElement(int newX, int newY) {
        positionInMap = new Coordinate(newX,newY);
    }
//  getters for x and y coord from Coordinate class
    public int getXCoord() {
        return positionInMap.getX();
    }
    public int getYCoord() {
        return positionInMap.getY();
    }
    
}
