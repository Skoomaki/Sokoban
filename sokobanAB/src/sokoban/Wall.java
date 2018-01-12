
package sokoban;

/**
 *
 * @author Adam
 */
// class extends MapElement as it does not move (association)
public class Wall extends MapElement {
    
    public Wall() {
//      name of object
        objectName = "Wall";
//      symbol that represents object in text file  
        objectAsSymbol = "X";
    }
    
}
