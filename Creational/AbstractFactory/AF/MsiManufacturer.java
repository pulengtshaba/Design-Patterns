package AbstractFactory.AF;

public class MsiManufacturer extends Company {
    @Override
    public Component createComponent(String typeOfComponent){
        Component component = null;
        if("GPU".equals(typeOfComponent)){
            component = new MsiGpu();
        }else{
            component = new MsiMonitor();
        }
        return component;
    }
}
