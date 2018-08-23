/**
 * This program sings the song Old MacDonald Had a Farm.
 *
 * Version 2 - singIt() method eliminates duplicate code and make it easier to add more animals.
 * 
 * @author Jon Cooper
 * @version August 18, 2016 (v0)
 */


public class OldMacDonald2 
{
    
    public static void eieio() 
    /**
     * Plays the first line of Old MacDonald.
     */
    { 
        System.out.println("Old MacDonald had a farm, E I E I O.");
    }


    public static void hadA(String animal) 
    /**
     * Plays the second line of Old MacDonald.
     * @param animal What animal is on the farm
     */
    { 
        System.out.println("And on that farm he had a " + animal + ", E I E I O.");
    }


    public static void withA(String sound) 
    /**
     * Plays the third and fourth lines of Old MacDonald.
     * @param sound What sound the animal makes
     */
    { 
        System.out.println("With a " + sound + " " + sound +  " here and a " + sound + " " + sound +  " there.");
        System.out.println("Here a " + sound + ", there a " + sound + ", everywhere a " + sound + ", " + sound + ".");  
    }

    
    public static void singIt(String animal, String sound) 
    /**
     * Sings a verse of Old MacDonald.
     * @param animal What animal is on the farm
     * @param sound What sound the animal makes
     */
    {
        eieio();
        hadA(animal);
        withA(sound);
        eieio();
        System.out.println();
    }

    
    public static void main(String[] args) 
     /**
     * Sings the entirety of Old MacDonald.
     */
    {
        System.out.println("Old MacDonald Had A Farm\n"); // Give our        song a title

        singIt("duck", "quack");
        singIt("cow", "moo");
        singIt("horse", "neigh");
        singIt("platypus","gdggdggddgdg");
        
        // now see how easy it is to add some more animals  
        
        
        // modify the methods above to get quotation marks around the animal sounds
    }
    
}
