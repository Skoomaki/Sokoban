
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
    
}
