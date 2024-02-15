public class Client{
    public static void main(String[] args) throws IOException {
        String hostName = "localhost";
        int port = 12345;

        try(Socket socket = new Socket(hostName, port);
            BufferReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()))) {
            String fromServer;
            while ((fromServer = in.readline()) != null) {
                System.out.prntln("Server:" + fromServer);
             break;
             }
            }
           }
          }