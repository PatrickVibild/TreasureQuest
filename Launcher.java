import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class Launcher
{
    public static void main (String[] args)
    {
        Game myGame = new TreasureQuestGame();
        LwjglApplication launcher = new LwjglApplication( myGame, "Treasure Quest", 800, 600 );
    }
}