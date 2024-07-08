package Structural.Flyweight;

public class Usage {
    private static final int BOOK_TYPES=2;
    private static final int BOOKS_TO_INSERT=10_000_000;
    public static void main(String[] args){
        Store store = new Store();
        for(int i=0; i<BOOKS_TO_INSERT/BOOK_TYPES;i++){
            store.storeBook(null, i, null, null, null);
        }
        store.displayBooks();
    }
}
