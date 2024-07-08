package Structural.Composite;

import java.util.Arrays;
import java.util.Collections;

public class Usage {
    public static void main(String[] args){
        Box box = new Box(
            Arrays.asList(
                new Box(
                    Collections.emptyList(),
                    Arrays.asList(
                        new Product("1",100),
                        new Product("2",100),
                        new Product("3",100)
                        )
                ),
                new Box(
                    Collections.emptyList(),
                    Arrays.asList(
                        new Product("4",200),
                        new Product("5",200),
                        new Product("6",200)
                    )
                )
                ),
                Arrays.asList(
                    new Product("7",300),
                    new Product("8",300)
                )
        ); 
        System.out.println(box.calculatePrice());   
    }
}
