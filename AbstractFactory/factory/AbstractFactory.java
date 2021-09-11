package AbstractFactory.factory;

public abstract class AbstractFactory {
    public static AbstractFactory getFactory(String classname) {
        AbstractFactory factory = null;
        try {
            factory = (AbstractFactory) Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.out.println("class" + classname + " not found");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);

    public abstract Tray createTray(String caption);

    public abstract Page createPage(String title, String author);
}
