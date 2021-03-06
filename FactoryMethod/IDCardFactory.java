package FactoryMethod;

import java.util.ArrayList;


public class IDCardFactory extends Factory{

    private ArrayList<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }
    
}
