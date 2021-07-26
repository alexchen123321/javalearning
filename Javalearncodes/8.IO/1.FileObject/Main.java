import java.io.File;
import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		File currentDir = new File(".");
		listDir(currentDir.getCanonicalFile(),0);
	}


	static void listDir(File dir, int depth) throws IOException{	//添加了一个深度参数，初始化为0
		File[] fs = dir.listFiles();
		if (fs != null) {
			for (File f: fs) {								//遍历File两遍，从而让同一目录打印文件总是先于文件夹
				if (f.isFile()) {
					for (int i=0; i<depth;i++) {			//先根据深度打印缩进
						System.out.print("-");
					}
					System.out.println(f.getName());
				}
			}
			for (File f: fs) {
				if (f.isDirectory()) {
					for (int i=0; i<depth;i++) {			//先根据深度打印缩进
						System.out.print("-");
					}
					System.out.println(f.getName() + "\\");
					listDir(f.getCanonicalFile(),depth+1);
				}

			}
		}
	}

}