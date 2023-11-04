import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class APP {
	
	private static void createAndShowGUI() {
		//创建窗口和大小
		JFrame jf = new JFrame("HELLO ");
		jf.setSize(200, 100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//点击关闭窗口则关闭进程
		jf.setLayout(new GridLayout(3,3));                 
		
		
		GridLayout grid = new GridLayout(2,2);
		grid.setHgap(5);
		grid.setVgap(5);
		
		//创建窗口容器并加入窗口
		JPanel jp = new JPanel(grid);
		jf.add(jp);
		
		
		
		
		//创建组件加入容器
		JLabel jl = new JLabel("你好啊");
		JLabel jlEND = new JLabel("ss");
		jp.add(jl);
		jp.add(jlEND);
		
		
		//创建文件加入容器
		JTextField jt = new JTextField(20);
		jp.add(jt);
		jlEND.add(jt);
		//创建按钮加入容器，并添加监听器
		JButton jb = new JButton("确认");
		jp.add(jb);
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				double celisius = Double.parseDouble(jt.getText());
//				double result = CT(celisius);
//				jlEND.setText(result+"1111111111111");
				System.out.println("接受点击响应");
				
			}
		});
		
		jf.setMinimumSize(new Dimension(100,200));
		jf.setVisible(true);
		jf.add(new Label());
		jf.add(new Label());
		jf.add(new Label());
		jf.add(new Label());
		
	}
	private static double CT(double celsius) {
		double farhenheit = celsius*1.8+32;
		return farhenheit;
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				createAndShowGUI();
				
			}
		});

	}

}
