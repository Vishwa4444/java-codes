package com.company;
import java.io.*;
import java.net.*;

class UDPClient {

    public static void main(String[] args) throws Exception {
        int var1 = 2000;

        while(true) {
            byte[] var2 = new byte[1024];
            DatagramSocket var3 = new DatagramSocket(var1);
            DatagramPacket var4 = new DatagramPacket(var2, var2.length);
            var3.receive(var4);
            String var5 = new String(var4.getData(), 0, var4.getLength());
            System.out.println("Server:" + var5);
            System.out.println("*******************");
            ++var1;
        }
    }
}
