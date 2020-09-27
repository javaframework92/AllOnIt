package com.ajt.util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

import javax.imageio.ImageIO;

import cn.apiclub.captcha.Captcha;

public class CaptchaUtil {

	private CaptchaUtil() {
		System.out.println("Hellos");
	}

	public static Captcha createCaptcha(int width, int height) {
		return new Captcha.Builder(width, height).addBackground().addText().addNoise().build();
	}

	public static ByteArrayOutputStream createImage(Captcha captcha, String formatName, String file)
			throws IOException {
		ByteArrayOutputStream baos = null;
		if (Objects.nonNull(captcha)) {
			baos = new ByteArrayOutputStream();
			ImageIO.write(captcha.getImage(), formatName, baos);
		}
		return baos;
	}

	public static void writeFile(ByteArrayOutputStream baos, String file) throws IOException {
		if (Objects.nonNull(baos)) {
			FileOutputStream fos = new FileOutputStream(new File(file));
			fos.write(baos.toByteArray());
			fos.flush();
			fos.close();
		}
	}

}
