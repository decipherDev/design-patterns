package dev.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	private String directoryName;
	private List<FileSystem> directories;
	public Directory(String name) {
		this.directoryName = name;
		this.directories = new ArrayList<FileSystem>();
	}
	
	public void addToDirectory(FileSystem fs) {
		directories.add(fs);
	}

	@Override
	public void ls() {
		System.out.println(directoryName+"/");
		directories.forEach(dir -> dir.ls());
	}
}
