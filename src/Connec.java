import java.sql.*;

public class Connec {
    private final String url = "jdbc:postgresql://localhost:5432/Academy";
    private final String user = "postgres";
    private final String password = "1007";

    public Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertTeam(FootballTeam team){
        String SQL = "INSERT INTO \"Football\".football_team" +
                "(name,place)"+
                "values(?,?)";
        try { Connection con =  connection();
            PreparedStatement statement = con.prepareStatement(SQL);
            statement.setString(1,team.getName());
            statement.setInt(2,team.getPlace());
            statement.execute();
            ResultSet rs = statement.getResultSet();
            rs.next();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertStuff(Stuff stuff) {
        String SQL = "INSERT INTO \"Football\".stuff" +
                " ( full_name, job, team, salary)" +
                " VALUES ( ?, ?, ?, ?); ";
        try (Connection conn = connection();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, stuff.getFull_name());
            stmt.setString(2, stuff.getJob());
            stmt.setInt(3, stuff.getTeam());
            stmt.setInt(4, stuff.getSalary());
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CallFootballers (Stuff stuff){

        try {
            String sql = " Select * FROM stuff.job where job = 'footballer'";
            PreparedStatement statement = connection().prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println("footballers : " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CallTrainers (Stuff stuff){

        try {
            String sql = " Select * FROM stuff.job where job = 'trainer'";
            PreparedStatement statement = connection().prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println("trainers : " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void CallStuff (Stuff stuff){

        try {
            String sql = " Select count() job FROM stuff.job " +
                    "where job not in ('trainer' , 'footballer')";
            PreparedStatement statement = connection().prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                System.out.println("trainers : " + rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeleteTeam (FootballTeam footballTeam){
        try {
            String sql = "DELETE football_team USING stuff " +
                    "FROM \"Football\".football_team"+
                    "where stuff.team is null";
            PreparedStatement statement = connection().prepareStatement(sql);

            ResultSet rs = statement.executeQuery();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void DeletePlayer(Stuff stuff){
        try {
            String sql = "DELETE FROM \"Football\".stuff" +
                    "where salary > (select sum(stuff.id * stuff.salary)" +
                    "              from \"Football\".stuff ";
            PreparedStatement statement = connection().prepareStatement(sql);

            ResultSet rs = statement.executeQuery();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
