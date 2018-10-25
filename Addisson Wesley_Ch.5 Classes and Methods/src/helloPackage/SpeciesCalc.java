package helloPackage;
import java.util.Scanner;

public class SpeciesCalc {
    public String name;
    public int population;
    public double growthRate;

    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the name of the species:");
        name = keyboard.nextLine();
        System.out.println("What's the population?");
        population = keyboard.nextInt();
        System.out.println("Enter a growth rate %");
        growthRate = keyboard.nextDouble();

    }
    public void writeOutput(){
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth Rate = " + growthRate + "%");
    }
    public int getPopInTenYrs(){
        int result = 0;
        double popAmount = population;
        int count = 10;
        while((count > 0) && (popAmount > 0)){
            popAmount = popAmount + (growthRate/100)* popAmount;
            count--;
        }
        if(popAmount >0)
            result = (int)popAmount;
        return result;

    }
    public void getFinalNum(){
       double finNum = population * growthRate;
      // return finNum;
        System.out.println(finNum);

    }
}
