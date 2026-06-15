package fst;

//Human class
class Human {
 static int humanCount = 0;

 Human() {
     humanCount++;
 }

 void walking() {
     System.out.println("Human is walking");
 }

 void talking() {
     System.out.println("Human is talking");
 }

 static int getHumanCount() {
     return humanCount;
 }
}

//Boy class
class Boy extends Human {

 Boy() {
     super();
 }

 @Override
 void talking() {
     System.out.println("Boy is talking");
 }
}

//Girl class
class Girl extends Human {

 Girl() {
     super();
 }

 @Override
 void talking() {
     System.out.println("Girl is talking");
 }
}

//Robot class
class Robot {
 static int robotCount = 0;

 Robot() {
     robotCount++;
 }

 void walking() {
     System.out.println("Robot is walking");
 }

 void talking() {
     System.out.println("Robot is talking");
 }

 static int getRobotCount() {
     return robotCount;
 }
}

//Main class to instantiate objects
public class population {
 public static void main(String[] args) {

     // Creating 3 boys
     Boy b1 = new Boy();
     Boy b2 = new Boy();
     Boy b3 = new Boy();

     // Creating 3 girls
     Girl g1 = new Girl();
     Girl g2 = new Girl();
     Girl g3 = new Girl();

     // Creating 3 robots
     Robot r1 = new Robot();
     Robot r2 = new Robot();
     Robot r3 = new Robot();

     // Printing populations
     System.out.println("Total Humans: " + Human.getHumanCount());
     System.out.println("Total Robots: " + Robot.getRobotCount());
 }
}
