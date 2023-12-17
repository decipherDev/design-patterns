package dev.designpattern.composite;

public class BridgeDemo {
	public static void main(String[] args) {
		FileSystem file = new File("file");
		FileSystem fileA = new File("fileA");
		FileSystem fileB = new File("fileB");
		Directory directoryAA = new Directory("directoryAA");
		FileSystem fileAA = new File("fileAA");
		directoryAA.addToDirectory(fileAA);
		Directory dir = new Directory("directoryA");
		dir.addToDirectory(fileA);
		dir.addToDirectory(fileB);
		Directory dr = new Directory("xyz");
		dr.addToDirectory(file);
		dr.addToDirectory(directoryAA);
		
		dr.ls();
	}
}
