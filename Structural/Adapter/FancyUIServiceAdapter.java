package Structural.Adapter;

public class FancyUIServiceAdapter implements IMultiRestoApp {
    private final FancyUIService fancyUIService;
    public FancyUIServiceAdapter(){
        fancyUIService = new FancyUIService();
    }
    @Override
    public void displayMenus(XmlData xmlData){
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }
    @Override
    public void displayRecommendations(XmlData xmlData){
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }
    private JsonData convertXmlToJson(XmlData xmlData){
        //convert xmlData to JsonData and return it!!
        return new JsonData();//just to clear an error
    }
}
