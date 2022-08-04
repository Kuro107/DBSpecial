public class Main {
    public static void main(String[] args) {
        Connec connection = new Connec();
        Stuff stuff = new Stuff("A.Khalilov","trainer", 1 , 25000);
        FootballTeam team = new FootballTeam(Name.CELTIC,1);
        FootballTeam team1 = new FootballTeam(Name.MANCHESTER_UTD,2);
        FootballTeam team2 = new FootballTeam(Name.CHELSEA,3);
        FootballTeam team3 = new FootballTeam(Name.REAL_MADRID,4);
        FootballTeam team4 = new FootballTeam(Name.BARCELONA,5);
        FootballTeam team5 = new FootballTeam(Name.SPARTAK_MOSCOW,6);
        FootballTeam team6 = new FootballTeam(Name.MANCHESTER_CITY,7);
        FootballTeam team7 = new FootballTeam(Name.ROMA,8);
        FootballTeam team8 = new FootballTeam(Name.AC_MILAN,9);
        FootballTeam team9 = new FootballTeam(Name.ALGA,10);

      connection.insertTeam(team);
      connection.insertTeam(team1);
      connection.insertTeam(team2);
      connection.insertTeam(team3);
      connection.insertTeam(team4);
      connection.insertTeam(team5);
      connection.insertTeam(team6);
      connection.insertTeam(team7);
      connection.insertTeam(team8);
      connection.insertTeam(team9);
    }
}
//    Вывести на экран кол футболистов в каждой команде
//    Вывести на экран всех тренеров
//        - Сделать возможность поменять команду игрокам и тренарам
//        - посчитать сколько сотрудников кроме футболистов и тренеров
//        - Удалить футбольную команду если нет сотрудников
//        - Удалить игрока если ЗП выше средней ЗП команды