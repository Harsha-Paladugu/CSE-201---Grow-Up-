public class Main {
    
    public static void main(String[] args) {
        
        // initialize new player when game starts
        Player player = new Player();
        
        // introduce game / instructions
        Introduction.playIntroduction();

        // Starting Infancy
        InfancyStage.playInfancyStage(player);
        
        // Starting Kindergarten
        KindergartenStage.playKindergartenStage(player);
        
        // Starting Highschool
        HighschoolStage.playHighschoolStage(player);
        
        // Starting Young Adult Stage
        YoungAdultStage.playYoungAdultStage(player);
        
        // Starting Adult Stage
        AdultStage.playAdultStage(player);
        
        // Starting Retirement Stage
        RetirementStage.playRetirementStage(player);
        
        // Starting Afterlife
        AfterlifeStage.playAfterlifeStage(player);
    }    
}
