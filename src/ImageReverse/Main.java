package ImageReverse;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		// input path
		String targetPath = "C:\\Users\\dsm_024\\Desktop\\test.jpg";
		// output path
		String outputPath = "C:\\Users\\dsm_024\\Desktop\\testR.jpg";
		BufferedImage targetBuffer = null;
		try {
			targetBuffer = ImageIO.read(new File(targetPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flipImage(targetBuffer, true);
		OutputStream out = null;
		try {
			 // output path
			 out = new FileOutputStream(outputPath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ImageIO.write(targetBuffer, "png", out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static BufferedImage copyImage(BufferedImage source) {
		BufferedImage image = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
		Graphics g = image.getGraphics();
		g.drawImage(source, 0, 0, null);
		g.dispose();
		return image;
	}
	
	public static void flipImage(BufferedImage target, boolean horizen) {
		BufferedImage copy = copyImage(target);

		for (int i = copy.getWidth() - 1; i > 0; i--) {
			for (int j = copy.getHeight() - 1; j > 0; j--) {
				if (horizen) {
					target.setRGB(i, j, copy.getRGB(copy.getWidth() - i, j));
				} else {
					target.setRGB(i, j, copy.getRGB(i, copy.getHeight() - j));
				}
			}
		}
	}

}
