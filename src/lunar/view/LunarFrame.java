package lunar.view;

import lunar.controller.LunarController;
import javax.swing.JFrame;

public class LunarFrame extends JFrame
{
	private LunarController app;
	private LunarPanel appPanel;
	
	public LunarFrame(LunarController app)
	{
		super();
		this.app = app;
		this.appPanel = new LunarPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 600);
		this.setTitle("Lunar Landfahrzeug");
		this.setResizable(false);
		this.setVisible(true);
	}
}
