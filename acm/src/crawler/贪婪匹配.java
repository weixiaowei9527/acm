package crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 贪婪匹配 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "<H1>Chapter 1 - 介绍正则表达式</H1>";
		//String regex = "<.*>";//贪婪匹配
		//String regex = "<.*?>";//非贪婪匹配
		String regex = "<\\w+?>";
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(string);
		while(matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
		}
	}

}
