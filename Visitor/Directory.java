package Visitor;

import java.util.Iterator;
import java.util.ArrayList;

public class Directory extends Entry {
    private String name;                    
    private ArrayList<Entry> dir = new ArrayList<>();   
    public Directory(String name) {         
        this.name = name;
    }
    public String getName() {               
        return name;
    }
    public int getSize() {                  
        int size = 0;
        Iterator<Entry> it = dir.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;
    }
    public Entry add(Entry entry) {        
        dir.add(entry);
        return this;
    }
    public Iterator<Entry> iterator() {             
        return dir.iterator();
    }
    public void accept(Visitor v) {
        v.visit(this);
    }                           
}
