
package sokoban;

/**
 *
 * @author Adam
 */
public class Crate extends MoveableMapElement {
    
    public Crate(int newX, int newY){
//      calls methods/properties of MoveableMapElements
        super(newX, newY);
//      name of object
        objectName = "Crate";
//      symbol that represents object in text file         
        objectAsSymbol = "*";
    }
    
}
