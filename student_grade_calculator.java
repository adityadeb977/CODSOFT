import java.io.*;
public class student_grade_calculator {
    public static void main(String[] args) throws IOException
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      PrintWriter pw=new PrintWriter(System.out,true);
      String grade="";
      System.out.println("Enter the marks obtained out of 100 in 5 subjects:Mathematics,Science,English,Social Science,Computer Science");
      int math=Integer.parseInt(br.readLine());
      int sci=Integer.parseInt(br.readLine());
      int eng=Integer.parseInt(br.readLine());
      int ss=Integer.parseInt(br.readLine());
      int cs=Integer.parseInt(br.readLine());
      int total_marks=math+sci+eng+ss+cs;
      int avg_percentage=total_marks/5;
      if(avg_percentage>=90 && avg_percentage<=100)
      {
        grade="A+";
      }
      else if(avg_percentage>=80 && avg_percentage<=89){
        grade="A";
      }
      else if(avg_percentage>=70 && avg_percentage<=79)
      {
        grade="B+";
      }
      else if(avg_percentage>=60 && avg_percentage<=69){
        grade="B";
      }
      else if(avg_percentage>=50 && avg_percentage<=59){
        grade="C";
      }
      else{
        grade="F";
      }
      pw.println("Total marks: "+total_marks);
      pw.println("Average Percentage: "+avg_percentage);
      pw.println("Grade: "+grade);
    }
}
