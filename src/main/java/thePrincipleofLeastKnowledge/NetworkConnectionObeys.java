package thePrincipleofLeastKnowledge;

import java.io.IOException;
import java.net.Socket;

public class NetworkConnectionObeys {
    public final class NetworkConnection {
        private Socket socket;

        public void close() throws IOException {
            socket.close();
        }
    }


}
