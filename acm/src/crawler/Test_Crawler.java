package crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_Crawler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://docs.oracle.com/javase/8/docs/api/overview-summary.html";
		Crawler crawler = new Crawler(url);
		String stringValue = crawler.getStringValue();
		/*[]表示匹配其中的任意字符
		^表示不匹配其后的字符
		*表示0个或任意多个其前的字符
		?表示0个或1个其前的字符
		[^>]*表示0个或多个不为>的字符*/
		String reg = "<a[^>]*>([^<]*)</a>";
		Pattern compile = Pattern.compile(reg);
		Matcher matcher = compile.matcher(stringValue);
		while(matcher.find()) {
			String group = matcher.group();
			String rr = "href=\".*\"";
			Pattern compile2 = Pattern.compile(rr);
			Matcher matcher2 = compile2.matcher(group);
			while(matcher2.find()){
				String group2 = matcher2.group();
				System.out.println(Crawler.getHrefValue(group2));
			}
		}
	}

}
