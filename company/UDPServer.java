package com.company;

import java.io.*;
import java.net.*;


class UDPServer {

    public static void main(String[] args) throws Exception
    {
        int var1 = 2000;
        String var2 = "exit";

        while(true) {
            InetAddress var3 = InetAddress.getLocalHost();
            byte[] var5 = new byte[1024];
            DatagramSocket var6 = new DatagramSocket();
            BufferedReader var7 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Server is running....");
            String var8 = var7.readLine();
            if (var8.equals(var2)) {
                var6.close();
                break;
            }
            DatagramPacket var9 = new DatagramPacket(var8.getBytes(), var8.length(), var3, var1);
            var6.send(var9);
            ++var1;
        }
    }
}
