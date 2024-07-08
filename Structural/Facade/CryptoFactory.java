package Structural.Facade;

public class CryptoFactory {
    public static CryptoService getCryptoService(String currency){
        if(currency.equals("BTC")){
            return new BitcoinService();
        }else{
            return new EthereumService();
        }
    }
}
