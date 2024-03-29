package client_server;

import java.io.IOException;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("This is Client");
		//create socket ,in here we use out ip address
		Socket soc =new Socket("localhost",9806);

	}

}
