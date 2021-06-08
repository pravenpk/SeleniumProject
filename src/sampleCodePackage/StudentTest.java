package sampleCodePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

public class StudentTest {
	public static void main(String[] args) {
	
/*
			Student myStudent1 = new Student("Praven");
			Student myStudent2 = new Student("Vicky");
			
			myStudent1.setRollNumber(1);
			myStudent1.setCGPA(7.0f);
			myStudent2.setRollNumber(2);
			myStudent2.setCGPA(7.5f);
			
			System.out.println("Student 1's RollNumber is:"+myStudent1.rollNo);
			System.out.println("Student 1's CGPA is:"+myStudent1.CGPA);
			System.out.println("Student 2's RollNumber is:"+myStudent2.rollNo);
			System.out.println("Student 2's CGPA is:"+myStudent2.CGPA);	*/
     
//Character Tutorials
	/*		System.out.println("Character Tutorial");
			char gender = 'M';
			char[] charArray = {'a','b','c','d'};
			System.out.println("The gender is "+gender);
			for(int c=0;c<charArray.length;c++)
			{
				System.out.println("The option is "+charArray[c]);
				if(charArray[c] == 'd')
				{
					System.out.println("Option D is found");
				}
			}
			
			Character wrapperChar = new Character('p');
			if(Character.isLetter(wrapperChar)) {
				System.out.println("Wrapper Char is a letter");
				System.out.println("UpperCase char:"+Character.toUpperCase(wrapperChar));
			}
			else
			{
				System.out.println("Wrapper Char is not a letter");
			}*/

//String Tutorials
			
			/*String myString = "Facebook";
			String s1 = "Believe";
			String s2 = "Yourself";
			String s3 = "I was busy";
			String s4 = "believe";
			
			System.out.println("Length of the string is:"+myString.length());
			char[] s= myString.toCharArray();
		
			
			for (int i=0;i<myString.length();i++)
			{
				
				char myChar = myString.charAt(i);
				System.out.print(myChar+",");
				
				//s[i]=myString.charAt(i);
			}
			for (char c:s) 
			{
					System.out.println(c);
			}
			
			
			System.out.println();
		
			char[] charArray= {'p','r','a','v','e','n'};
			String chartoString = new String(charArray);
			System.out.println(chartoString);
			
			String stringMerged = s1.concat(s2);
			System.out.println("Concatinated String:"+stringMerged);
			
			int compareString = s1.compareTo(s2);
			System.out.println("String Compared Value:"+compareString);
			
			int compareString2 = s1.compareToIgnoreCase(s4);
			System.out.println("String Compared Value:"+compareString2);
			
			System.out.println("String Compared Boolean Value:"+s1.contentEquals(s4));
			
			String copiedString = "";
			copiedString= copiedString.copyValueOf(charArray);
			
			System.out.println("Copied Array:"+copiedString);
			
			if(s1.equalsIgnoreCase(s4)) {
				System.out.println("Strings are same");
			}
			
			int Stringhash = s1.hashCode();
			
			System.out.println("Hash code of the string:"+Stringhash);
			
			
			System.out.println("Substring:"+s3.substring(2,4));
			
			  String helloString = new String("hey i m john");  
		      System.out.println( helloString );*/

//Array Tutorials 
			
			/*int[] myNumbers = {23,45,12,56,2,7};
			int[] myMarks = new int[5];
			int[] addArray = new int[myNumbers.length];
			
			for(int i=0;i<myNumbers.length;i++) 
			{
				System.out.println("Displaying Array:"+myNumbers[i]);	
			}
			
			for(int j=0;j<myNumbers.length;j++)
			{
				addArray[j]=myNumbers[j];
			}
			
			for(int element: addArray) {
				System.out.println(element);
			}
			
			//Arrays.fill(addArray,10);
			Arrays.sort(addArray);
			System.out.println(Arrays.toString(addArray)); 
			
			int[] resultArray = new int[addArray.length];
			
			for(int i=0, j=addArray.length-1; i<addArray.length; i++,j-- )
			{
				resultArray[j]=addArray[i];
			}
			
			System.out.println(Arrays.toString(resultArray));
			
			int a = Arrays.binarySearch(addArray, 12);
			System.out.println(a);
			boolean arrayEqualCheck = Arrays.equals(myNumbers, myMarks);
			if(arrayEqualCheck==true) {
				System.out.println("Equal arrays");
			}*/
	
//Date and Time Tutorials
			
		
		 // Creating a priority queue
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Using the add() method
        numbers.add(4);
        numbers.add(2);
        
        System.out.println("PriorityQueue: " + numbers);

        // Using the offer() method
        numbers.offer(1);
     // Using the remove() method
        boolean result = numbers.remove(2);
        System.out.println("Is the element 2 removed? " + result);

        // Using the poll() method
        int number = numbers.poll();
        System.out.println("Removed Element Using poll(): " + number);
        System.out.println("Updated PriorityQueue: " + numbers);
        
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);
        ArrayList<String> al = new ArrayList<>();
        
        al.add("Praven");
        al.add("PK");
        
        for(String s: al) {
        	System.out.print(s+" ");
        	
        }
        System.out.println();
        for(int i=0;i<al.size();i++) {
        	System.out.println(al.get(i));
        }
        System.out.println(al);
        Stack<Integer> myStack = new Stack<>();
        
        myStack.add(5);
        myStack.add(10);
        
        
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        System.out.println("ArrayBlockingQueue: " + animals);
        animals.remove("Cat");
        
        // Using peek()
        String element = animals.peek();
        System.out.println("Accessed Element: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("ArrayBlockingQueue Elements: ");

        while(iterate.hasNext()) {
            System.out.println(iterate.next());
            
        }
        SortedSet<Integer> num = new TreeSet<>( );

        // Insert elements to the set
        num.add(5);
        num.add(2);
        num.add(3);
        num.add(1);
        System.out.println("SortedSet: " + num);
        System.out.println("SortedSet Order: " + num.comparator());
        
        for(int i =1;i<=2;i++) {
        	System.out.printf("Formated String %d:"+num.comparator()+"\n",i);
        }
        
	}

}
