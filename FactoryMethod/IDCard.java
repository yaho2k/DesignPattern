package FactoryMethod;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println(owner + " makes card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + " uses card");
    }

    public String getOwner() {
        return owner;
    }
}
