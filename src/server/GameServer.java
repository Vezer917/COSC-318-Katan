package server;

import java.io.IOException;

/**
 * Created by steve on 2016-11-09.
 */
public class GameServer {
    public static void main(String[] args) throws IOException {
        new GameServerThread().start();
    }
}