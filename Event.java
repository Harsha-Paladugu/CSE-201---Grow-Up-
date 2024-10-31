public class Event {

    /**
     * This method selects and returns a room appropriate random event
     * @param room The current room the player is in
     * @return An array containing the event and its effects on the player
     */
    protected String[] randomEvent(int room, int karma){
        String[] results = new String[5];
        int eventNum = getEventNum(room, karma);

        //For clarity Each room is represented by an if statement
        //While within each room events are chosen in a switch statement

        if(room == 0){
            switch (eventNum){
                case 0:
                    results[0] = "";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;

                case 1:
                    results[0] = "You were adopted";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;

                case 2:
                    results[0] = "Your parents chose not to vaccinate you";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 1){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 2){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 3){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 4){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 5){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }
        if(room == 6){
            switch (eventNum){
                case 0:
                    results[0] = "event";
                    results[1] = "+KAR0";
                    results[2] = "+MON0";
                    results[3] = "+EDU0";
                    results[4] = "+ATH0";
                    break;
            }
        }

        return results;
    }

    /**
     * This method returns an int within the range of events for a given room
     * @param room The current room the player is in
     * @return an int to use for a random event
     */
    private int getEventNum(int room, int karma){
        int eventNum = -1;

        //If player Karma is low, the worst outcome is guaranteed
        if (karma<-10){
            return 1;
        }

        //chooses the int for an event that can happen in a room
        switch (room){
            case 0:
                 eventNum = (int) (Math.random() * (2));
                 break;
            case 1:
                eventNum = (int) (Math.random() * (6));
                break;
            case 2:
                eventNum = (int) (Math.random() * (6));
                break;
            case 3:
                eventNum = (int) (Math.random() * (1));
                break;
            case 4:
                eventNum = (int) (Math.random() * (1));
                break;

        }
        return eventNum;
    }

}
