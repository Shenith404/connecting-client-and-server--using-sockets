package client_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("This is Server");
		//create a new server socket
		ServerSocket ss =new ServerSocket(9806);
		//waiting for incoming client connection
		Socket soc =ss.accept();
		System.out.println("Connection estabilshed");

	}

}
