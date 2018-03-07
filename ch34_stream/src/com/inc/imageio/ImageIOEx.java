package com.inc.imageio;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageIOEx {
	
	public static void main(String[] args) {
		//URL의 이미지를 저장
		try {
			URL url = new URL("https://blog.fotolia.com/kr/files/2017/02/Fotolia_110632460_S_copyright-1.jpg");
			BufferedImage img = ImageIO.read(url);
			File file = new File("test.jpg");
			ImageIO.write(img, "jpg", file);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
