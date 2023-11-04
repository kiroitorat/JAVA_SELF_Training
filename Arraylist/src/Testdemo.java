import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Testdemo {

	public static void main(String[] args) {
		/**
		 *  以下情况使用 ArrayList :
	
    频繁访问列表中的某一个元素。
    只需要在列表末尾进行添加和删除元素操作。

			以下情况使用 LinkedList链表 :

    你需要通过循环迭代来访问列表中的某些元素。
    需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
		 */
		
		
		
		//LinkList
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("一眼丁真");
		ll.add("鉴定为");
		ll.add("妈妈生的");
		ll.addFirst("First");
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		//Arraylist
		ArrayList<String> al = new ArrayList<String>();
		al.add("一眼丁真");//增加
		al.set(0, "yydz");//替换
		al.addAll(al);//复制al的所有元素
		al.remove(0);//删除
		System.out.println(al.get(0).toString());
	}

}
