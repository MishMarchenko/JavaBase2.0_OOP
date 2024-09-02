package Nested;

public enum Time {
    BREAKFAST("Time to breakfast"),
    DINNER("Time to dinner"),
    SUPPER("Time to supper"),
    SLEEP("Time to sleep");
    final String time;
    Time (String time){
        this.time = time;
    }
    public String getValue(){
        return time;
    }
}
