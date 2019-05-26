package crawler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Crawler{
	URL url;
	URLConnection urlConnection;
	InputStream inputStream;
	File file;
	public void setFile(File file) {
		this.file = file;
	}
	public Crawler(String url) {
		this.file = new File("default.html");
		// TODO Auto-generated constructor stub
		try {
			this.url = new URL(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.urlConnection = this.url.openConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.inputStream = this.urlConnection.getInputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void writeToFile() {
		OutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(this.file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int lenght;
		byte[] content = new byte[1024*8*512];
		try {
			while ((lenght = inputStream.read(content)) != -1) {
				outputStream.write(content, 0, lenght);
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	String getStringValue() {
		StringBuffer buffer = new StringBuffer();
		int lenght;
		byte[] content = new byte[1024*8*512];
		try {
			while ((lenght = inputStream.read(content)) != -1) {
				buffer.append(new String(content, 0, lenght));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String html = new String(buffer);
		System.out.println(html);
		return html;
	}
	static String getHrefValue(String href) {
		/*
		 * 左侧能够匹配href="
		 * 右侧能够匹配"
		*/		
		String regex = "(?<=(href=\")).*(?=\")";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(href);
		String group = null;
		while(matcher.find()) {
			group = matcher.group();
			System.out.println(group);
		}
		return group;
	}
}
