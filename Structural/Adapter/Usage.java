package Structural.Adapter;

public class Usage {
    public static void main(String[] args){
        //old ui
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(new XmlData());
        //new ui
        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        adapter.displayMenus(new XmlData());
    }
}
