import java.util.*;

public class EducationalEquality {
  
  //initializes a map to store student details
  Map<String, Integer> studentData = new HashMap<String, Integer>();
  
  //initiates a list to contain all the student IDs
  List<String> studentIDs = new ArrayList<String>();
  
  //initiates a list to hold individual scores of each student
  List<Integer> studentScores = new ArrayList<Integer>();
  
  public void student_data_input(){
    //Gets input from user
    Scanner scanner = new Scanner(System.in);
    
    //asks for student ID and marks the student's score
    System.out.print("Please enter student id: ");
    String studentID = scanner.nextLine();
    System.out.print("Please enter student score: ");
    int studentScore = scanner.nextInt();
    scanner.close();
    
    //stores student's data in map and adds the student ID to the list
    studentData.put(studentID, studentScore);
    studentIDs.add(studentID);
    //stores student's score in list
    studentScores.add(studentScore);
  }
  
  public void grade_students(){
    //traverses through the student scores list
    for (int index = 0; index < studentScores.size(); index++){
      //calculates grade of the student
      String grade;
      int score = studentScores.get(index);
      if (score >= 90) {
        grade = "A";
      } else if (score >= 80) {
        grade = "B";
      } else if (score >= 70) {
        grade = "C";
      } else if (score >= 60) {
        grade = "D";
      } else {
        grade = "F";
      }
      //prints grade according to the student score
      System.out.println("Student id " + studentIDs.get(index) + " has got grade " + grade);
    }
  }
  
  public void calculate_average_score(){
    // initializes sum to 0
    int sum = 0;
    
    //traverses list of student scores and add them
    for (int index = 0; index < studentScores.size(); index++){
      sum += studentScores.get(index);
    }
    //calculates average
    int average = sum / studentScores.size();
    
    //prints average score
    System.out.println("Average score of all the students: " + average);
  }
  
  public static void main(String[] args) {
    EducationalEquality educationalEquality = new EducationalEquality();
    
    //Ask user for the student data and stores it
    educationalEquality.student_data_input();
    
    //Calculates Grade of each student
    educationalEquality.grade_students();
    
    //Calculates Average Score
    educationalEquality.calculate_average_score();
  }
}