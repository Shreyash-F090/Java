package practical3_3;

class CricketException extends Exception {
    public CricketException(String message) {
        super(message);
    }
}

class Cricket {

    public void checkRuns(int runs) throws CricketException {
        if (runs < 0) {
            throw new CricketException("Runs cannot be negative.");
        } else {
            System.out.println("Runs: " + runs);
        }
    }

    public void checkWickets(int wickets) throws CricketException {
        if (wickets < 0) {
            throw new CricketException("Wickets cannot be negative.");
        } else {
            System.out.println("Wickets: " + wickets);
        }
    }

    public void checkJersey(int jersey) throws CricketException {
        if (jersey < 0) {
            throw new CricketException("Jersey number cannot be negative.");
        } else {
            System.out.println("Jersey Number: " + jersey);
        }
    }
}

public class Practical3_3 {

    public static void main(String[] args) {

        System.out.println("Shreyash Kadam");

        Cricket player = new Cricket();

        try {
            player.checkRuns(-10);
        } catch (CricketException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        try {
            player.checkWickets(2);
        } catch (CricketException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }

        try {
            player.checkJersey(-18);
        } catch (CricketException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}