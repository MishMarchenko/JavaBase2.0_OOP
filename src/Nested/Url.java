package Nested;

public enum Url {
    Google("google.com"),
    Hillel("hillel.ua"),
    Opera("opera.com"),
    Selenium("selenium.org");
    final String url;
    Url(String url){
        this.url = url;
    }
    public String getValue(){
        return url;
    }
}
