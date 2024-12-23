import java.net.ServerSocket;
import java.net.Socket;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;

import java.util.Scanner;
import static java.lang.System.out;

import javax.swing.JOptionPane;

public class Client{//Use MultiThreading
	static public void main(String...ar)throws Exception{
		out.println("Enter IP Address to Chat : ");
		
		Scanner sc = new Scanner(System.in);
		String IPAddress = sc.next();
		
		Socket socket = new Socket(IPAddress,2024);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		PrintStream ps = new PrintStream(socket.getOutputStream());

		while(true){
			String data = br.readLine();
			if(data==null)
				break;
			ps.println(data);
		}
	}
}