package AbstractFactory.factory;

public abstract class Link extends Item {

    protected String url;
    public Link(String caption) {
        super(caption);
    } 
    
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
