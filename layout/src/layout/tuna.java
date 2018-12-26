package layout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class tuna extends JFrame{
	
	private JLabel item1;
	
	public tuna(){
		super("TITLE");
		setLayout(new FlowLayout());
		item1 = new JLabel("what up?");
		item1.setToolTipText("don't hover douche");
		add(item1);
	}

}
