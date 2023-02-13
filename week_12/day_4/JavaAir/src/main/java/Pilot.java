public class Pilot {

    private String name;
    private String rank;
    private String licence;

    public Pilot(String name, String rank, String licence){
        this.name = name;
        this.rank = rank;
        this.licence = licence;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getLicence() {
        return licence;
    }

    public String canFly(){
        return "Yay I can fly!";
    }




}
