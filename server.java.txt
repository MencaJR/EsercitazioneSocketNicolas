import java.net.*;
import java.io.*;

public class Server {
                public static void main(String[]args) throws IOException {
                    int port = 12345;
                    ServerSocket serverSocket = new ServerSocket(port);
                    System.out.printl("Server in ascolto sulla porta" +port);
                    


                    try{
                        while(true){
                                socket clientSocket = serverSocket.accept();

                                printWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                                out.printl("Ciao client");
                                clientSocket.close();
                                }
                                }finally{
                                serverSocket.close();
                                }
                                }
                                
}