/*
Author: Fatima Parada-Taboada
Net id: fnp170130
Program overview: This program will determine whether a second rectangle overlaps or is inside of the first rectangle. */ 


import java.util.Scanner;

public class Hw03_28 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double r1x, r1y, r1w, r1h, r2x, r2y, r2w, r2h;
    
      System.out.printLn("Enter r1's center x-, y-coordinates, width and height: ");
      r1x = input.nextDouble();
      r1y = input.nextDouble();
      r1w = input.nextDouble();
      r1h = input.nextDouble();
      System.out.printLn("Enter r2's center x-, y-coordinates, width and height: ");
      r2x = input.nextDouble();
      r2y = input.nextDouble();
      r2w = input.nextDouble();
      r2h = input.nextDouble();

      if (r2x < (r1x + r1w / 2) && r2x > (r1x - r1w / 2))
      {
          if (r2y < (r1y + r1h / 2) && r2y < (r1y - r1h / 2))
          {
            System.out.println("r2 is inside r1");
          }

      }
      else if ((r1x + r1w / 2 > r2x - r2w) || (r1y + r1h / 2 > r2y - r2h))
      {
        System.out.println("r2 overlaps r1");
      }
      else
      {
        System.out.println("r2 does not overlap r1");
      }

  }
}