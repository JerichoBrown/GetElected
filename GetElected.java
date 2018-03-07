import java.util.Random;
import java.util.Scanner;

public class GetElected {

    public static void main(String[] args)
    {

        // System objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        // Game variables
        double voters = 1;
        double voterPercentage = 100;
        double votingVoters;
        String officeTitle = "Alderperson";
        int electionCycle = 0;
        boolean longOrShort = true;


        System.out.println("Welcome to Get Elected!");
        System.out.println("-----------------------");
        System.out.println("*Congratulations!*");
        System.out.println("In your local town council election, you wrote in your own name on your ballot.");
        System.out.println("The other two candidates fell in love and eloped.");
        System.out.println("You ran unopposed. You won the seat with a total of one vote ...");
        System.out.println("YOURS!!!");

        //Label
        CYCLECHOOSE:

        while (electionCycle < 1) {

        System.out.println("Would you like a Long or Short time between elections?");
        System.out.print("'L'ong or 'S'hort ... ? ");

        String cycle = in.nextLine();

        if (cycle.equalsIgnoreCase("L")) {
            electionCycle = 300;
            longOrShort = true;
        } else if (cycle.equalsIgnoreCase("S")) {
            electionCycle = 100;
            longOrShort = false;
        } else {
            System.out.println("\nSilly government forms!");
            System.out.println("Try reading the instructions this time ...");
            continue CYCLECHOOSE;
        }
    }

        // Label
        GAME:


        while (electionCycle > 0) {

            electionCycle--;

            if (voters < 1) {
                voters = 1;
            }

            if (voterPercentage > 100) {
                voterPercentage = 100;
            }

            votingVoters = (voterPercentage/100) * voters;

            System.out.println("\nGood Morning, " + officeTitle + "!");
            System.out.println(voters + " voters like you.");
            System.out.println(votingVoters + " voters would vote for you if the election was today.");
            System.out.println(electionCycle + " days until the next election.");
            System.out.println("Would you like to conduct today's agenda?");
            System.out.print("'Y'es or 'N'o ... ? ");

            String input = in.nextLine();

            if (input.equalsIgnoreCase("Y")) {

                int card = rand.nextInt(22);

                if (card == 0) {

                    voters = voters + 10;
                    voterPercentage = voterPercentage + 5;

                    System.out.println("\nYou forgot to tie your shoe.");
                    System.out.println("People think you are a rebel!");

                    continue GAME;

                } else if (card == 1) {

                    voters++;
                    voterPercentage++;

                    System.out.println("\nYou kissed a baby!");
                    System.out.println("The Mom has decided to vote for you!");

                    continue GAME;


                } else if (card == 2) {

                    voters++;

                    System.out.println("\nYou helped an old lady cross the street!");
                    System.out.println("You won over a voter!");

                    continue GAME;

                } else if (card == 3) {

                    voters = voters + 20;
                    voterPercentage = voterPercentage + 10;

                    System.out.println("\nYou gave a good speech!");
                    System.out.println("More voters like you.");

                    continue GAME;

                } else if (card == 4) {

                    voters = voters + 100;
                    voterPercentage = voterPercentage + 15;

                    System.out.println("\nYou gave a great speech!");
                    System.out.println("More voters like you.");

                    continue GAME;

                } else if (card == 5) {

                    voters--;

                    System.out.println("\nYou picked your nose in public!");
                    System.out.println("You grossed out a voter!");

                    continue GAME;

                } else if (card == 6) {

                    voters = voters - 20;
                    voterPercentage = voterPercentage - 5;

                    System.out.println("\nYou picked your nose in public!");
                    System.out.println("The video went viral - whoops!");

                    continue GAME;


                } else if (card == 7) {

                    voters = voters - 20;
                    voterPercentage = voterPercentage - 15;

                    System.out.println("\nYou called someone THAT name!");
                    System.out.println("Less voters like you.");

                    continue GAME;

                } else if (card == 8) {

                    voters = voters - 50;
                    voterPercentage = voterPercentage + 15;

                    System.out.println("\nThe rally booed you, so you mooned a crowd!");
                    System.out.println("You lost some voters, but others thought it was funny!");

                    continue GAME;

                } else if (card == 9) {

                    voters = voters - 25;
                    voterPercentage = voterPercentage - 5;

                    System.out.println("\nYou didn't reveal your taxes!");
                    System.out.println("Less voters like you.");

                    continue GAME;



                } else if (card == 10) {

                    voters = voters - 25;
                    voterPercentage = voterPercentage - 15;

                    System.out.println("\nYou had a secret affair!");
                    System.out.println("Not secret anymore! People think you are disgusting!");

                    continue GAME;


                } else if (card == 11) {

                    voters = voters + 25;
                    voterPercentage++;

                    System.out.println("\nYou had a secret affair!");
                    System.out.println("Not secret anymore! People think your lover is HOT!!!");

                    continue GAME;


                } else if (card == 12) {

                    voters--;
                    voterPercentage = voterPercentage - 2;

                    System.out.println("\nYou fell on your face in public, you klutz!");
                    System.out.println("The video didn't go viral - whew!");

                    continue GAME;


                } else if (card == 13) {

                    voters = voters - 20;
                    voterPercentage = voterPercentage - 10;

                    System.out.println("\nYou fell on your face in public, you klutz!");
                    System.out.println("The video went viral - whoops!");

                    continue GAME;


                } else if (card == 14) {

                    voters = voters + 10;
                    voterPercentage = voterPercentage + 2;

                    System.out.println("\nYou tweeted something funny!");
                    System.out.println("People liked your tweet!");

                    continue GAME;


                } else if (card == 15) {

                    voters = voters + 20;
                    voterPercentage = voterPercentage + 5;

                    System.out.println("\nYou tweeted something funny!");
                    System.out.println("People loved your tweet!");

                    continue GAME;


                } else if (card == 16) {

                    voters = voters - 10;
                    voterPercentage = voterPercentage - 2;

                    System.out.println("\nYou tweeted something you thought was funny!");
                    System.out.println("People hated your tweet!");

                    continue GAME;


                } else if (card == 17) {

                    voters = voters - 20;
                    voterPercentage = voterPercentage - 5;

                    System.out.println("\nYou tweeted something you thought was funny!");
                    System.out.println("People think you are a jerk!");

                    continue GAME;


                } else if (card == 18) {

                    voters = voters + 10;
                    voterPercentage = voterPercentage + 5;

                    System.out.println("\nYou called into a pod cast.");
                    System.out.println("You told an old joke, but the host thought it was funny!");

                    continue GAME;


                } else if (card == 19) {

                    voters = voters + 1;
                    voterPercentage = voterPercentage + 2;

                    System.out.println("\nYou called into a pod cast.");
                    System.out.println("You told an old joke, the host called you an old codger!");

                    continue GAME;


                } else if (card == 20) {

                    voters = voters + 10;
                    voterPercentage = voterPercentage - 5;

                    System.out.println("\nYou called into a pod cast.");
                    System.out.println("You told a bad joke, but the host thought it was funny!");

                    continue GAME;


                } else if (card == 21) {

                    voters = voters - 10;
                    voterPercentage = voterPercentage - 5;

                    System.out.println("\nYou called into a pod cast.");
                    System.out.println("You told a bad joke, the host called you a jerk!");

                    continue GAME;






                } else {

                    break;

                }


            } else if (input.equalsIgnoreCase("N")) {

                System.out.println("\n'Loser! Low energy!' - Donald Trump");
                break;

            } else if (input.equalsIgnoreCase("Q")) {

                System.out.println("\nFUCK YOU!!!");
                break;

            } else {

                System.out.println("\nSilly government forms!");
                System.out.println("Try reading the instructions this time ...");
                continue GAME;
            }
        }

        while (electionCycle < 1) {

            // TODO Figure out how to run an election.

            if (longOrShort == true) {
                electionCycle = 300;
            } else {
                electionCycle = 100;
            }



            System.out.println("\nI need to figure out how to re-elect myself");
            System.out.println(electionCycle);

        }


        System.out.println("\nThank you for playing!");

    }
}
