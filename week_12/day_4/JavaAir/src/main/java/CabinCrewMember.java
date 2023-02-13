public class CabinCrewMember {

    private String name;
    private String ranktype;


    public CabinCrewMember(String name, String ranktype){
       this.name = name;
       this.ranktype = ranktype;

    }


    public String getRankType(){
        return this.ranktype;
    }

    public String getName() {
    return this.name;
    }

    public String canRelayMessage(){
        return "Brace Brace";
    }

}
