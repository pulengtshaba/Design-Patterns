package AbstractFactory.AF;

public class AsusManufacturer extends Company {
    @Override
    public Component createComponent(String typeOfComponent){
        Component component = null;
        if("GPU".equals(typeOfComponent)){
            component = new AsusGpu();
        }else{
            component = new AsusMonitor();
        }
        return component;
    }
}
