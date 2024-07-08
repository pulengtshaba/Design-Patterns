package Structural.Flyweight.fw;

public class Usage {
    private static final int BOOK_TYPES=2;
    private static final int BOOKS_TO_INSERT=10_000_000;
    public static void main(String[] args){
        Store store = new Store();
        for(int i=0; i<BOOKS_TO_INSERT/BOOK_TYPES;i++){
            store.storeBook(null, i, null, null, null);
            store.storeBook(null, i, null, null, null);
        }
        store.displayBooks();
        System.out.println(BOOKS_TO_INSERT+" Books inserted");
        System.out.println("--------------------------------");
        System.out.println("Memory Usage:");
        System.out.println("Book size (20 bytes)*"+ BOOKS_TO_INSERT+" + Book size(30 bytes)* "+BOOK_TYPES);
        System.out.println("----------------------------------");
        System.out.println("Total: "+((BOOKS_TO_INSERT*20+BOOK_TYPES*30)/1024/1024)+"Mb (instead of)"+((BOOKS_TO_INSERT*50)/1024/1024)+"Mb");
    }
}
