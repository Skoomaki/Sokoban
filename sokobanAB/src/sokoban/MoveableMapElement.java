
package sokoban;

/**
 *
 * @author Adam
 */
public class MoveableMapElement extends MapElement {
    
//  coordinates for objects  
    Coordinate positionInMap;
    
    MoveableMapElement(int newX, int newY) {
        positionInMap = new Coordinate(newX,newY);
    }
    
}
