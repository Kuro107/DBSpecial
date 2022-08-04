public enum Name {
    CELTIC ("CELTIC"),
    MANCHESTER_UTD("MANCHESTER_UTD"),
    CHELSEA("CHELSEA"),
    REAL_MADRID("REAL_MADRID"),
    BARCELONA("BARCELONA"),
    SPARTAK_MOSCOW("SPARTAK_MOSCOW"),
    MANCHESTER_CITY("MANCHESTER_CITY"),
    ROMA("ROMA"),
    AC_MILAN("AC_MILAN"),
    ALGA("ALGA");
    String name;

    public String getName() {
        return name;
    }

    Name(String name) {
        this.name = name;
    }

}