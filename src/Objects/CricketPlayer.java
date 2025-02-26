package Objects;

public class CricketPlayer {
    public static void main(String[] args) {
        CricketPlayer cp = new CricketPlayer();
        PlayerNumber p = cp.playerNumberCheck(18); // calling the method and storing in p

        System.out.println("Player Name : " + p.playerName);
    }
    PlayerNumber playerNumberCheck(int number){
        PlayerNumber pn = new PlayerNumber();

        if(number == 07){
            pn.playerNumber = 07;
            pn.playerName = "Ms Dhoni";
        }
        if(number == 18){
            pn.playerNumber = 18;
            pn.playerName = "virat Kholi";
        }
        return pn;
    }
}
class PlayerNumber{
    int playerNumber;
    String playerName;
}
