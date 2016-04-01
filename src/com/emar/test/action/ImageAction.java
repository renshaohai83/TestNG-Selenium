package com.emar.test.action;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;


//图片操作类
public class ImageAction {
	/** 
	 * 
	 * @Description: 通过使用 ImageIO 类来保存 Image 对象为本地图片
	 * @param image ： 需要保存的 Image 对象
	 * @param filename ： 文件名
	 */ 
	 public static void saveImage(Image image, String fileName) throws Exception { 
		 // 获取 Image 对象的高度和宽度
		 int width = image.getWidth(null); 
		 int height = image.getHeight(null); 
		 BufferedImage bi = new BufferedImage(width, height, 
				 BufferedImage.TYPE_INT_RGB); 
		 Graphics g = bi.getGraphics(); 
	     //通过 BufferedImage 绘制图像并保存在其对象中
		 g.drawImage(image, 0, 0, width, height, null); 
		 g.dispose(); 
		 File f = new File(fileName); 
		 // 通过 ImageIO 将图像写入到文件
		 ImageIO.write(bi, "jpg", f); 
		 }
}
