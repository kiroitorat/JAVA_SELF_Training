package 网络编程;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class 服务器 {

	public static void main(String[] args) throws Exception {
		//定义服务器端
		ServerSocket ss = new ServerSocket(80);
		System.out.println("now loading");
		//接下来是客户端等待连接
		Socket client = ss.accept();
		//接受客户端的输入
		PrintStream out = new PrintStream(client.getOutputStream());
		out.print("你好");
		out.close();
		client.close();
		ss.close();

	}

}
