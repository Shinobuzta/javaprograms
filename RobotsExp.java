import java.awt.*;
import javax.imageio.*;

public class RobotsExp {
	
	public static void main(String[] args) {
		
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("screenshot.png"));
	}
}