import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WhenWorkingWithMaps {

    @Test

    public void creatingAMap(){
        Map<String, Integer> numberOfBalls = new HashMap<>();

        numberOfBalls.put("Red",3);
        numberOfBalls.put("Blue",5);
        numberOfBalls.put("Green",2);

        Integer redBall = numberOfBalls.get("Red");
        System.out.println("Number of red ball is "+ redBall);
    }

    @Test
public void creatingAMapmoreConcisely(){

        Map<String,Integer> numberofballs = Map.of("red",3, "Blue", 5,"Green",9);
        Map<String, Integer> MoreColorofBalls = new HashMap<>();

        MoreColorofBalls.put("Purple",5);
        MoreColorofBalls.putAll(numberofballs);
        System.out.println("Are there any purple coloer " + MoreColorofBalls.containsKey("Purple"));
        MoreColorofBalls.put("pink",9);
        System.out.println("Number of pink balls " + MoreColorofBalls.getOrDefault("pink",0));

}

 @Test
    public void iteratingOverMap(){
        Map<String, Integer> NumberOfBalls = Map.of("Red",5,"Blue",8,"Purple",9);

     System.out.println("Keys =  " +  NumberOfBalls.keySet());

     for(String key:NumberOfBalls.keySet()) {
         Integer numberOfTennisBalls = NumberOfBalls.get(key);
         System.out.println(key + ">>" + numberOfTennisBalls);

     }

     for(Map.Entry<String,Integer> entry : NumberOfBalls.entrySet()){
         System.out.println(entry.getKey() +" =>"+entry.getValue());
     }
    }
}
