import java.util.Iterator;
import java.net.InetAddress;
import java.util.LinkedList;
public class Test {
	/**
	 *  通常情况下，你会希望遍历一个集合中的元素。例如，显示集合中的每个元素。
	
		一般遍历数组都是采用for循环或者增强for，这两个方法也可以用在集合框架，
		但是还有一种方法是采用迭代器遍历集合框架，它是一个对象，
		实现了Iterator 接口或 ListIterator接口。
	
		迭代器，使你能够通过循环来得到或删除集合的元素。
		ListIterator 继承了 Iterator，以允许双向遍历列表和修改元素。
		 Java Iterator（迭代器）不是一个集合，它是一种用于访问集合的方法，可用于迭代 ArrayList 和 HashSet 等集合。

		Iterator 是 Java 迭代器最简单的实现
		ListIterator 是 Collection API 中的接口， 它扩展了 Iterator 接口。
	 */

	public static void main(String[] args) throws Exception {
//		LinkedList<String> ll = new LinkedList<String>();
//		ll.add("一眼丁真");
//		ll.add("鉴定为");
//		ll.add("妈妈生的");
//		ll.addFirst("First");
//		//调用迭代器进行set或者list或者map循环
//		Iterator<String> it = ll.iterator();
//		while(it.hasNext()) {
//			if(it.hasNext()) {
//				System.out.println(it.next());
//			}
//		}
        //1.获取本机地址ip对象
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());//获取主机名字
        System.out.println(ip1.getHostAddress());//获取ip地址
        //2.获取域名ip对象
        InetAddress ip2 = InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());//获取域名
        System.out.println(ip2.getHostAddress());//获取域名的ip地址
        //3.获取公网对象
        InetAddress ip3 = InetAddress.getByName("112.80.248.76");
        System.out.println(ip3.getHostName());//获取公网名字
        System.out.println(ip3.getHostAddress());//获取公网ip地址
        //判断网络是否能连接通信 ping 5s之前测试是否能通过
        System.out.println(ip3.isReachable(5000));//通过会返回true
	
}

}
