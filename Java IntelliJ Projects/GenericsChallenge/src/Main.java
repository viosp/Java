public class Main {
    public static void main(String[] args) {

    League<Team<FootballPlayer>> footballleague = new League<>("AFL");
    Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
    Team<FootballPlayer> melbourne = new Team<>("Melbourne");
    Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
    Team<FootballPlayer> fremantle = new Team<>("Fremantle");
    Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

    hawthorn.matchResult(fremantle, 1, 0);
    hawthorn.matchResult(adelaideCrows, 3, 8);

    footballleague.add(adelaideCrows);
    footballleague.add(melbourne);
    footballleague.add(hawthorn);
    footballleague.add(fremantle);

    footballleague.showLeagueTable();





    }
}
