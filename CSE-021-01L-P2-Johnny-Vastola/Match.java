import java.util.Scanner;
import java.io.*;
public class Match {

	public static void main(String[] args) throws FileNotFoundException {
		Student[] students= new Student[100];
		String filename = "FullRoster.txt"; 
		 Scanner input =new Scanner(new FileReader(filename));
		 input.useDelimiter("[\t\r-]");	
		 int studentNumber=0;
		 while (input.hasNext()){
				 String name=input.next();
				 char gender=input.next().charAt(0);
				 Date birthday= new Date(Integer.valueOf(input.next()),Integer.valueOf(input.next()),Integer.valueOf(input.next()));
				 Preference pref= new Preference(Integer.valueOf(input.next()),Integer.valueOf(input.next()),Integer.valueOf(input.next()),Integer.valueOf(input.next())); 
				 students[studentNumber]=new Student(name,gender,birthday,pref);
				 studentNumber++;
		 }
		 input.close();
		 
		 for(int i =0;i<studentNumber;i++)
		 {
			 int maxScore=0;	
			 int currentScore=0;
			 int bestMatchStudent=0;
			 int bestMatchScore=0;
			 if(!students[i].getMatched()) {
				 
			 for(int j=0;j<studentNumber;j++) {
				 if(!students[j].getMatched()) {
					 if(i!=j) {
					 currentScore = students[i].compare(students[j]);
					 }
				 }
					 if(currentScore>maxScore) {
					 maxScore=currentScore;
					 bestMatchStudent=j;
					 bestMatchScore=maxScore;
				 }
			}
			 	if(bestMatchScore==0) {
			 	System.out.println(students[i].getName()+ " has no matches. ");
			 	}
			 	else {
			 		students[i].setMatch(students[bestMatchStudent]);
			 		System.out.println(students[i].getName()+" matches with "+ students[bestMatchStudent].getName()+" with the score " +maxScore);
			 	}
			 }
		}
	}
}

