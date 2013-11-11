package com.cds.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * тестовые клиенты (блок)
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException
    {
        Socket s = null;
        for (Integer j = 0; j <= 100; j++){
            s = new Socket(InetAddress.getByName("192.168.137.3"),8080);
         
                OutputStream os = s.getOutputStream();
                String str = j.toString();
                os.write(str.getBytes());
                os.flush();    
            Thread.sleep(100);
        }
        Thread.sleep(1000);
    }
}
