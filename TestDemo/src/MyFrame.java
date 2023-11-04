import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	JLabel jl = new JLabel("00:00:00");
	public MyFrame(String title) {
		super(title);
		
		
		JPanel root = new JPanel();
		this.setContentPane(root);
		
		
		JButton button = new JButton("Button");
		button.addActionListener(new MyActionListener());
		root.add(button);
		button.setSize(100, 100);
		
		
		root.add(jl);
		jl.setSize(100,100);
	}
	public class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.print("TIME:");
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			String Time = sdf.format(new Date());
			System.out.print(Time);
			jl.setText(Time);
			
		}
		
	}
	
}
