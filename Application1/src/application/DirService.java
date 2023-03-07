package application;

import java.io.File;

public class DirService {
	public static Directory dir=new Directory();
	public static void printFiles() {
		dir.fillFiles();
		for(File f:DirService.getDir().getFiles()) {
			System.out.println(f.getName());
		}
	}
public static Directory getDir() {
	return dir;
}
public static void setDir(Directory dir) {
	DirService.dir=dir;
}
}
