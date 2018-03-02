import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultipleWorks {
    //declaring some major variables to be used in the program
    private List<Double> quizMarks =  new ArrayList<Double>();
    private int emplID;
    private short age;
    private double tempCelcius;
    private double tempFaren;
    private double average;
    private short ageYears;

    //a method to convert the temperature
    private void celciusToFarenheit(){
        //Multiply by 9, then divide by 5, then add 32
        this.tempFaren = (this.tempCelcius*9/5)+32;
    }

    //a method to calculate the average
    private void calculateAverage(){
        double sum= 0.0;
        for(int i=0;i < this.quizMarks.size(); i++){
            sum+=this.quizMarks.get(i);
        }
        this.average = sum/this.quizMarks.size();
    }

    //a method to convert months to years
    private void monthsToYears(){
        this.ageYears = (short) (this.age/12);
    }

    //the method used to display the output
    private void displayOutput(){
        System.out.println("*** Thank you ***");
        System.out.println("Student EMPLID: "+this.emplID);
        System.out.println("Quiz 1 Score: "+this.quizMarks.get(0));
        System.out.println("Quiz 2 Score: "+this.quizMarks.get(1));
        System.out.println("Quiz 3 Score: "+this.quizMarks.get(2));
        System.out.println("Average quiz score: "+this.average);
        System.out.println("Age in months: "+this.age);
        System.out.println("Age in years: "+this.ageYears);
        System.out.println("Temperature in Celsius: "+this.tempCelcius);
        System.out.println("Temperature in Fahrenheit:  "+this.tempFaren);

    }

    //a method to request for information and process it
    private void processRequest(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Student EMPLID (0 - 999999): ");
        this.emplID = scanner.nextInt();
        System.out.println("Enter your quiz 1 percentage score (0.0 – 100.0): ");
        this.quizMarks.add(scanner.nextDouble());
        System.out.println("Enter your quiz 2 percentage score (0.0 – 100.0): ");
        this.quizMarks.add(scanner.nextDouble());
        System.out.println("Enter your quiz 3 percentage score (0.0 – 100.0): ");
        this.quizMarks.add(scanner.nextDouble());
        System.out.println("Enter your age in months (0-1440): ");
        this.age = scanner.nextShort();
        System.out.println("Enter the current Temperature in degrees Celsius: ");
        this.tempCelcius = scanner.nextDouble();
        scanner.close();
        //do some major operations
        this.calculateAverage();
        this.monthsToYears();
        this.celciusToFarenheit();
        //call method to output the  results
        this.displayOutput();
    }

    //the main method. program entry point
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MultipleWorks mW = new MultipleWorks();
        mW.processRequest();
    }

}