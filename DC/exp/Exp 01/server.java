import java.io.*;
import java.net.*;

public class server {
    public static void main(String args[]) throws Exception {
        server serv = new server();
        serv.run();
    }

    public void run() throws Exception {
        ServerSocket servsock = new ServerSocket(9999);
        Socket sock = servsock.accept();
        String clside = new String();
        String srside = new String();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintStream ps = new PrintStream(sock.getOutputStream());
        while (true) {
            System.out.println();
            System.out.print("Server: ");
            srside = br1.readLine();
            ps.println(srside);
            clside = br.readLine();

            System.out.print("Client: " + clside);
        }

    }
}