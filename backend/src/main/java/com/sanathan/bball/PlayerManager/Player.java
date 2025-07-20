package backend.src.main.java.com.sanathan.bball.PlayerManager;


public class Player {
    private String name;
    private int power;
    private String team;
    private String tier;
    private int star;
    private int level;
    private String position;
    private String theme;

    //Fields like mentor and gear to be added later


    public Player(String name, int power, String team, String tier, int star, int level, String position, String theme) {
        this.name = name;
        this.power = power;
        this.team = team;
        this.tier = tier;
        this.star = star;
        this.level = level;
        this.position = position;
        this.theme = theme;
    }

    // Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }
    public String getTier() {
        return tier;
    }
    public void setTier(String tier) {
        this.tier = tier;
    }
    public int getStar() {
        return star;
    }
    public void setStar(int star) {
        this.star = star;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getTheme() {
        return theme;
    }
    public void setTheme(String theme) {
        this.theme = theme;
    }
    

    
}