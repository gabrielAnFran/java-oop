public class Movie {

    String name;
    int year;
    boolean planIncluded;
    private double score;
    private int numberVotes;
    int durationMinutes;

    void showTechnicalInfo(){
        System.out.println("Movie: "+ name);
        System.out.println("Year: "+ year);
        System.out.println("Plan: "+ planIncluded);
        System.out.println("Duration: "+ durationMinutes);
        System.out.println("Score: "+ score);
        System.out.println("Number votes: "+ numberVotes);
    }

    void scoreSum (double newScore){
        score += newScore;
        numberVotes++;
    }

    double averageScore(){
        return score/numberVotes;
    }

    int getNumberVotes(){
        return numberVotes;
    }

}
