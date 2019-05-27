package scan.directory;

import java.io.File;

public class GetDirectory {
	static void getDirectory(File file, String space) {
		if (file!=null) {
			File[] listFiles = file.listFiles();
			if (listFiles!=null) {
				for(int i = 0; i < listFiles.length;i++) {
					System.out.println(space+listFiles[i].getName());
					if (listFiles[i].isDirectory()) {
						space +="|";
						getDirectory(listFiles[i],space+"--");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File(".");
		/*String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		File[] listFiles = file.listFiles();
		System.out.println(listFiles);
		if (listFiles!=null) {
			for(int i = 0; i < listFiles.length;i++) {
				if (listFiles[i].isDirectory()) {
					
				}
				System.out.println(listFiles[i].getName());
			}
		}*/
		getDirectory(file,"-");
		
	}

}
