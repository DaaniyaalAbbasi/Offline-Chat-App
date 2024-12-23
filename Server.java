import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import static java.lang.System.out;

public class Server{
	public static void main(String...ar)throws Exception{
		ServerSocket ss = new ServerSocket(2024);
		out.println("Server is Ready");

		Socket socket = ss.accept();
		InputStreamReader isr = new InputStreamReader(socket.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		while(true){
			String data = br.readLine();
			if(data.length()==0){
				break;
			}
			out.println(data);
		} 
	}
}