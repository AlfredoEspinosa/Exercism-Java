

/*
9 -> "left wing"
10 -> "striker"
11 -> "right wing"
 */

public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String player_description = "";
        switch (shirtNum) {
            case 1:
                player_description = "goalie";
                break;
            case 2:
                player_description = "left back";
                break;
            case 3:
            case 4:
                player_description = "center back";
                break;
            case 5:
                player_description = "right back";
                break;
            case 6:
            case 7:
            case 8:
                player_description = "midfielder";
                break;
            case 9:
                player_description = "left wing";
                break;
            case 10:
                player_description = "striker";
                break;
            case 11:
                player_description = "right wing";
                break;
            default:
                throw new IllegalArgumentException();
        }

        return player_description;

    }
}
