package AbstractFactory;

import AbstractFactory.factory.AbstractFactory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        if(args.length != 1){

            System.exit(0);
        }

        AbstractFactory factory = AbstractFactory.getFactory(args[0]);

        Link joins = factory.createLink("JungAng", "http://joins.com");
        Link chosun = factory.createLink("chosun", "http://josun.com");

        Tray traynews = factory.createTray("News");
        traynews.add(joins);
        traynews.add(chosun);

        Page page = factory.createPage("Link Page", ".com");
        page.add(traynews);
        page.output();        
    }
}
