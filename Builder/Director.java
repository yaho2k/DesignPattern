package Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("Greeting");
        builder.makeString("Morning");
        builder.makeItems(new String[]{
            "Good moring",
            "Hello",
        });
        builder.makeString("Night");
        builder.makeItems(new String[]{
            "Good Night"
        });
        builder.close();
    }
    
}
