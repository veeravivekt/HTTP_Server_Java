import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
  public static void main(String[] args) {
    System.out.println("Logs from your program will appear here!");
    try {
      ServerSocket serverSocket = new ServerSocket(4221);
    
      serverSocket.setReuseAddress(true);
    
      Socket socket = serverSocket.accept();
      socket.getOutputStream().write("HTTP/1.1 200 OK\r\n\r\n".getBytes());
      
      System.out.println("accepted new connection");
    } catch (IOException e) {
      System.out.println("IOException: " + e.getMessage());
    }
  }
}
