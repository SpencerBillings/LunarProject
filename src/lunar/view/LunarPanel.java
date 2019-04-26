package lunar.view;

import lunar.controller.LunarController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.sun.glass.events.KeyEvent;

public class LunarPanel extends JPanel
{
	private LunarController app;
	private InputMap iM;
	private ActionMap aM;
	
	public LunarPanel(LunarController app)
	{
		super();
		this.app = app;
		
		this.iM = getInputMap(WHEN_IN_FOCUSED_WINDOW);
		this.aM = getActionMap();
		
		setupListeners();
	}
	
	private void setupListeners()
	{
		iM.put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,  0), "SPACE");
		aM.put("SPACE", new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}
}
