public class AfterlifeStage {
    public static void playAfterlifeStage(Player player){
        Control.Print("You passed away at "+player.age.getStatValue()+" years old." +
                "\nWhen you died you had "+player.athletics.getStatValue()+" athletics." +
                "\nYou had "+player.education.getStatValue()+" education." +
                "\nYou had "+player.karma.getStatValue()+" karma." +
                "+\nAnd you had "+player.money.getStatValue()+" money");

        //temp karma values to be balanced. good=high neutral = <0<high bad=<0
        if (player.karma.getStatValue()>=50){
            Control.Print("You feel at peace and a sense of calm washed over you." +
                    "\nYou lived a good life and have passed to a good afterlife.");
        }else if (player.karma.getStatValue()>=0){
            Control.Print("You feel nothing." +
                    "\nYour life was neither good nor bad.");
        }else {
            Control.Print("You nauseous and your body aches. Your life was neither good nor bad." +
                    "\nYou lived a bad life and have been punished with a bad afterlife.");
        }
    }
}
