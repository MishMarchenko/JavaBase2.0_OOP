package Nested;

public enum Season {
    Winter("This is winter"),
    Summer("This is summer"),
    Spring("This is Spring"),
    Fall("This is Fall");
    final String season;

    Season(String season){
        this.season = season;
    }
    public String getValue(){
        return season;
    }
}
