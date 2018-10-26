import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Class that create rectangles at the "Solid" object of our TileMap
 * Input get from the attributes of our Tiles Attributes.
 */
public class Solid extends BaseActor{
    public Solid(float x, float y, float width, float height, Stage s){
        super(x,y,s);
        setSize(width, height);
        setBoundaryRectangle();
    }
}
