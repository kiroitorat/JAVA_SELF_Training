package 网络编程;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.stream.events.EndDocument;

public class Echo程序 {



	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(6379);
		Socket client = server.accept();
		
		//创建打印流和扫描流
		PrintStream out = new PrintStream(client.getOutputStream());
		Scanner scan = new Scanner(client.getInputStream());
		
		boolean flag = true;
		while(flag) {
			if(scan.hasNext()) {
				String str = scan.next().trim();
				if(str.equals("bye")) {
					out.println("再见！");
					flag = false;
					
				}
			}else {
				out.println("ECHO:"+scan.next().trim());
			}
		}
		scan.close();
		out.close();
		server.close();
		client.close();
		
		
		
		

	}

}
