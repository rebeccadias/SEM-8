import java.io.*;
import java.net.*;

public class client {
    public static void main(String args[]) throws Exception {
        client clt = new client();
        clt.run();
    }

    public void run() throws Exception {
        Socket sock = new Socket("localhost", 9999);
        String clside = new String();
        String srside = new String();

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        PrintStream ps = new PrintStream(sock.getOutputStream());
        while (true) {
            srside = br.readLine();
            System.out.print("Server: " + srside);
            System.out.println();
            System.out.print("Client: ");
            clside = br1.readLine();
            ps.println(clside);

        }

    }
}