package client_server;

import java.io.*; //can import all packages
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("This is Client");
		//create socket ,in here we use out ip address
		Socket soc =new Socket("localhost",9806);
		
		//read the user input from keybord
		BufferedReader  userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the string ");
		
		String str = userInput.readLine();//get the user input and 
		
		PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
		out.println(str);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		System.out.println(in.readLine());
	}

}
