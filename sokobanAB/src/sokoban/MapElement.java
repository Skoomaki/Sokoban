
package sokoban;

import javax.swing.JLabel;

/**
 *
 * @author Adam
 */

// Class responsible for handling non-moving objects (association)
public class MapElement extends JLabel {
//  private fields should be used when possible  
    private String objectName;
    private String objectAsSymbol;
    public String objectImgName;
    
//  enscapsulation  
//  getters  
    public String getObjectName() {
        return objectName;
    }
    public String getObjectAsSymbol() {
        return objectAsSymbol;
    }
//  setters
    public void setObjectName(String newObjectName){
        objectName = newObjectName;
    }
    public void setObjectAsSymbol(String newObjectAsSymbol){
        objectAsSymbol = newObjectAsSymbol;
    }
//  using set bounds to decide a width and height using "limit" - used by warehouseKeeper and Crate  
    public void setBounds(int x, int y){
        int limit = 32;
        setBounds(x,y,limit,limit);
      }
}
