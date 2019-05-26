package crawler;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test_URL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		URL url = new URL("https://docs.oracle.com/javase/8/docs/api/overview-summary.html");
		String host = url.getHost();
		System.out.println(host);
		URLConnection openConnection = url.openConnection();
		Map<String, List<String>> headerFields = openConnection.getHeaderFields();
		/*Set<Entry<String, List<String>>> entrySet = headerFields.entrySet();
		for(Map.Entry<String, List<String>>entry:entrySet) {
			List<String> value = entry.getValue();
			System.out.println(entry.getKey()+"-----");
			for(String x:value) {
				System.out.println(x);
			}
		}*/
		Set<String> keySet = headerFields.keySet();
		for(String key:keySet) {
			System.out.println("key:"+key);
			List<String> list = headerFields.get(key);
			System.out.println("value:");
			for(String value:list) {
				System.out.println(value);
			}
		}
	}

}
