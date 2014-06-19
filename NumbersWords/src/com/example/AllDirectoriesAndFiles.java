/**
 * 
 */
package com.example;

import java.io.File;

/**
 * @author venkateshp
 *
 */
public class AllDirectoriesAndFiles {
	
	public static void main(String[] args) {
		File file=new File("C:/");
		String[] strings=file.list();
		int dircount=0;
		for(String s1:strings)
		{
			//System.out.println(file,s1);
			File f=new File(file,s1);
			if(f.isDirectory())
			{
				dircount++;
			}
		}
		System.out.println(dircount);
	}

}
