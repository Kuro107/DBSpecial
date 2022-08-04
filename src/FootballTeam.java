public class FootballTeam {
    private Integer id;
    private Name name;
    private Integer place;

    public FootballTeam( Name name, Integer place) {
        this.name = name;
        this.place = place;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        String name1 = String.valueOf(name);
        return name1;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

}
