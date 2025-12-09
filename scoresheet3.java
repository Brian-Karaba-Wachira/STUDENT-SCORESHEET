import java.util.Scanner;
public class scoresheet3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter School Name:");
      String SchoolName = input.nextLine();
      System.out.println("Enter name of the teacher:");
      String Teacher = input.nextLine();
      System.out.println("Enter your current grade:");
      int Grade = input.nextInt();
      System.out.println("Enter the year:");
      int Year = input.nextInt();
      String[] StudentName = new String[12];
      double[] English = new double[12];
      double[] math = new double[12];
      double[] history = new double[12];
      double[] geography = new double[12];
      double[] science = new double[12];
      double[] Programming = new double[12];
      double[] totals = new double[12];
      double total ;
      double[] averages = new double[12];
      char[] grades = new char[12];
      char grade;
      double[] SubjectTotal = {0,0,0,0,0,0,0};
      float[] SubjectAverage = new float [7];



for(int i=0; i<12; i++) {
    System.out.print("Enter student name:");
    StudentName[i] = input.next();
    System.out.print("Enter English marks:");
    English[i] = input.nextDouble();
    System.out.print("Enter marks for math:");
    math[i] = input.nextDouble();
    System.out.print("Enter marks for history:");
    history[i] = input.nextDouble();
    System.out.print("Enter marks for geography:");
    geography[i] = input.nextDouble();
    System.out.print("Enter marks for science:");
    science[i] = input.nextDouble();
    System.out.print("Enter marks for Programming:");
    Programming[i] = input.nextDouble();
    totals[i] = English[i] + math[i] + history[i] + geography[i] + science[i] + Programming[i];
    total = English[i] + math[i] + history[i] + geography[i] + science[i] + Programming[i];



    if (total >= 540.0) {
        grade = 'A';
    } else if (total >= 480) {
        grade = 'B';
    } else if (total >= 420) {
        grade = 'C';

    } else if (total >= 360) {
        grade = 'D';
    } else {
        grade = 'F';
    }
    grades[i]=grade;
}

  for (int j=0;j<12;j++){
      SubjectTotal[0] += English[j];
      SubjectAverage[0]=(float)SubjectTotal[0]/12f;
      SubjectTotal[1] += math[j];
      SubjectAverage[1]=(float)SubjectTotal[1]/12f;
      SubjectTotal[2] += history[j];
      SubjectAverage[2]=(float)SubjectTotal[2]/12;
      SubjectTotal[3] += geography[j];
      SubjectAverage[3]=(float)SubjectTotal[3]/12;
      SubjectTotal[4] += science[j];
      SubjectAverage[4]=(float)SubjectTotal[4]/12;
      SubjectTotal[5] += Programming[j];
      SubjectAverage[5]=(float)SubjectTotal[5]/12;
      SubjectTotal[6] += totals[j];
      SubjectAverage[6]=(float)SubjectTotal[6]/12;
  }

System.out.println("----------------------------------------------------------------------------------------------------");
System.out.println("\t\t\tSchool Name:"+SchoolName);
System.out.println("\t\t\tTeacher:"+Teacher);
System.out.println("\t\t\tGrade:"+Grade);
System.out.println("\t\t\tYear:"+Year);
System.out.println("====================================================================================================");
System.out.println("Student Name English Math History Geography Science Programming Total Rank");
System.out.println("====================================================================================================");

for(int i=0; i<12; i++) {
   System.out.println(StudentName[i] +"\t\t" + English[i] +"\t" + math[i] +"\t" + history[i] +"\t" + geography[i] +"\t"+ science[i] +"\t" + Programming[i]+"\t"+totals[i]+"\t"+grades[i]) ;
}
System.out.println("----------------------------------------------------------------------------------------------------");
System.out.print("\t\t");
for(int i=0; i<7; i++) {
    System.out.print( SubjectTotal[i]+"\t");
}
System.out.println("\n----------------------------------------------------------------------------------------------------");
System.out.print("\t\t");
        for(int i=0; i<7; i++) {
            System.out.print(SubjectAverage[i]+"\t");
        }
System.out.println("\n====================================================================================================");
}


    }



