package client_server;

import java.io.*; //can import all packages

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
		BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		
		String str = in.readLine();
		System.out.println("Client says : "+str);

		
		BufferedReader  userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string ");
		
		String reply = userInput.readLine();
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
		out.println("server says : "+ reply);
	}

}
