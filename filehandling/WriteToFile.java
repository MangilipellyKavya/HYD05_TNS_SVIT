package com.svit.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	  public static void main(String[] args)
	  {
			try {
				
			      FileWriter myWriter = new FileWriter("task.txt");
			      myWriter.write("This is our First Task");
			      myWriter.close();
			      System.out.println("Successfully wrote to the file.");

				
			} catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();

			}
		}

}
