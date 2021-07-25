import java.io.*;
import java.nio.charset.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.*;

public class Sorting {

	public static String[] readFile(String filename) throws IOException {
	    File file = new File(filename);
	    String a = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	    String[] list = a.split(" ");
	    return list;
	}
	
	
	public static void print(String[] list) throws IOException {
        System.out.println(Arrays.toString(list));
	}
	
	public static void sort(String[] a) throws IOException {
		String[] arr = a;
		String temp; int i;
        for(int j=0; j<arr.length-1;j++)
        {
            for(i=j+1; i<arr.length; i++)
            {
                //comparing adjacent string
                if(arr[i].compareTo(arr[j]) > 0)
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.print("Pass "+j+" ");
            print(arr);
        }
}
	
	public static void main(String[] args) throws IOException {
		
	String path = "src/unsorted.txt";
	System.out.print("Original : ");
	print(readFile(path));
	sort(readFile(path));
}
}