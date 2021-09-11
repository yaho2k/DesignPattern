package AbstractFactory.listfactory;

import java.util.Iterator;

import AbstractFactory.factory.Item;
import AbstractFactory.factory.Tray;

public class ListTray extends Tray{

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n>");
        buffer.append(caption + "\n");
        buffer.append("<ul>" + "\n");
        Iterator<Item> it = tray.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ui>\n>");
        buffer.append("</ll>\n");
        return buffer.toString();
    }
    
}
