

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Virtualkey {
	public static void main(String[] args) throws IOException {
		String path="D:\\virtual key repo\\";
		File directoryPath = new File("D:\\virtual key repo\\");
		
	    Scanner s = new Scanner(System.in);
	    while(true) {
	    	System.out.println("Welcome to LockedMe.com \n" + "application developed by Pranay Teja \n");
	        System.out.println(" © All rights reserved \n");
	        System.out.println("------------------------------------------------------------------------ \n");
	        System.out.println(" \n HOME :- *******   \n ");
	        System.out.println("  1. display the files in ascending order");
	        System.out.println("  2. execute User Enabled Operations");
	        System.out.println("  3. Terminate Program");
	        
	        int menu1 = s.nextInt();
	        switch(menu1) {
	        //first menu
	        case 1:
	        	
	        	File arr[] = directoryPath.listFiles();
	        	Arrays.sort(arr);
	        	
	        	for(int i=0;i<arr.length;i++) {
	        		System.out.println(arr[i]+"\n");
	        	}
	        	break;
	        	
	        //second menu
	        case 2:
	        	boolean pop = true;
	        	while(pop) {
	        		 System.out.println(" 1. To Add a file ");
                     System.out.println(" 2. To Search a specified file ");
                     System.out.println(" 3. To delete file ");
                     System.out.println(" 4. Previous Menu");
                     System.out.println(" 5. Terminate Program");
                     
                     int menu2 = s.nextInt();
                     //menu 2
                     switch(menu2) {
                     //create a new file
                     case 1:
                 		System.out.println("enter the filename");
                 		String filename=s.next();
                 		String finalpath=path+filename;
                 		File f=new File(finalpath);
                 		//create a new file
                 		boolean b=f.createNewFile();
                 		if(b!=true) {
                 			System.out.println("file not created");
                 		}
                 		else {
                 			System.out.println("file created");
                 		}
                 		break;
                 		//search for a file
                     case 2:
                 		System.out.println("enter the filename to search");
                 		String file=s.next();
                 		File f2=new File(path);
                 		//display operation
                 		File filenames[]=f2.listFiles();
                 		int flag = 0;
                 		for(File ff:filenames) {
                			if(ff.getName().equals(file)) {
                				flag=1;
                				break;
                			}
                			else {
                				flag=0;
                			}
                		
                		}
                		
                		
                		if(flag==1) {
                			System.out.println("file is found");
                		}
                		else {
                			System.out.println("file is not found");
                		}
                 		break;
                 		
                 		//delete  a file
                     case 3:
                 		
                 		System.out.println("enter the filename");
                 		String filename1=s.next();
                 		String finalpath1=path+filename1;
                 		File file1=new File(finalpath1);
                 		//delete operation
                 		file1.delete();
                 		System.out.println("file is deleted");
                 		break;
                 		//to navigate to the previous menu
                     case 4:  
                    	 pop = false;
                    	 break;
                    	 //terminate the program
                     case 5:
                    	 System.out.println("***see you!!*** \n-------------------");
                         System.exit(0);
                     default:
                         System.out.println("Input correct value, try again......");
                         
                 		}
                     }
	        	break;
	        case 3:
	        	 System.out.println("***see you!!*** \n-------------------");
                 System.exit(0);
             default:
                 System.out.println("Input correct value, try again......");
	        	break;
	        	}
	        	
	        }
	    }
	}


