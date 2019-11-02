import engine.GameEngine;
import engine.GameLogic;
import game.DummyGame;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class Main {

    public static void main(String[] args) {
        try {
            boolean vSync = true;
            GameLogic gameLogic = new DummyGame();
            GameEngine gameEng = new GameEngine("GAME",
                    600, 480, vSync, gameLogic);
            gameEng.run();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}