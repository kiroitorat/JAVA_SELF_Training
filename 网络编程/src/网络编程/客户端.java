package 网络编程;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

public class 客户端 {

	public static void main(String[] args) throws Exception {
		//定义服务器端
		/**服务器端为serversocket类，首先实例化一个对象，并且定义其端口
		 * 客户端为socket类，实例化对象后用accept使得服务器端和客户端连接
		 * 
		 * 实例化打印流对象out，接受客户端的输出流
		 * 
		 * 然后定义客户端的地址和端口
		 * 用scanner类对象接受服务器端的数据
		 * 关闭客户端，服务器端，输入输出流
		 */
				ServerSocket ss = new ServerSocket(9999);
				System.out.println("now loading");
				//接下来是客户端等待连接
				Socket client = ss.accept();
				//接受客户端的输入
				PrintStream out = new PrintStream(client.getOutputStream());
				out.print("你好");
		//连接服务器端
		client = new Socket("127.0.0.1",7777);
		//接受服务器端数据
		Scanner in = new Scanner(client.getInputStream());
		in.useDelimiter("\n");
		if(in.hasNext()) {
			System.out.println("[回应数据]"+in.next());
		}

		
	}

}
