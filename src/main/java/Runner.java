import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        System.out.println("******* SCOTTISH ISLANDS *******");
        System.out.println("-------INITIAL ARRAYLIST-------");
        System.out.println(scottishIslands);

        System.out.println("-------ADD TO END OF LIST-------");
        scottishIslands.add("Coll");
        System.out.println(scottishIslands);

//        2. Add "Tiree" to the start of the list
        System.out.println("-------ADD TO BEGINNING OF LIST-------");
        scottishIslands.add(0, "Tiree");
        System.out.println(scottishIslands);

//        3. Add "Islay" after "Jura" and before "Mull"
        System.out.println("-------ADD TO CENTRE OF LIST-------");
        scottishIslands.add(2, "Islay");
        System.out.println(scottishIslands);

//        4. Print out the index position of "Skye"
        System.out.println("-------PRINT INDEX OF AN ELEMENT-------");
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        System.out.println("-------REMOVE ELEMENT BY NAME-------");
        scottishIslands.remove("Tresco");
        System.out.println(scottishIslands);

//        6. Remove "Arran" from the list by index
        System.out.println("-------REMOVE ELEMENT BY INDEX-------");
        scottishIslands.remove(5);
        System.out.println(scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println("-------PRINT ARRAYLIST SIZE-------");
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        System.out.println("-------SORT ALPHABETICALLY-------");
        Collections.sort(scottishIslands);
        System.out.println(scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("-------PRINT ELEMENTS USING FOR LOOP-------");
        for(int i=0; i < scottishIslands.size(); i++){
            System.out.println(scottishIslands.get(i));
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("\n******* NUMBERS *******");
        System.out.println("-------LIST OF EVEN INTEGERS-------");

        for(int number : numbers){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }

//        2. Print the difference between the largest and smallest value
        System.out.println("-------DIFFERENCE BETWEEN LARGEST AND SMALLEST ENTRY-------");
        System.out.println(Collections.max(numbers) - Collections.min(numbers));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        System.out.println("-------DOES A 1 EXIST NEXT TO A 1?-------");

        for(int i=0; i < numbers.size() - 1 ; i++){
            if(numbers.get(i) == 1 && numbers.get(i + 1) == 1){
                System.out.println("True");
                break;
            }
        }

//        4. Print the sum of the numbers,
        System.out.println("-------PRINT SUM-------");

        int numbersSum = 0;

        for(int number : numbers){
            numbersSum += number;
        }

        System.out.println(numbersSum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.

//          So [2, 7, 13, 2] would have sum of 9.

        System.out.println("-------PRINT SUM WHERE 13 IS UNLUCKY-------");
        int unluckyNumbersSum = 0;
        boolean thirteenEncountered = false;

        for(int i = 0; i < numbers.size(); i++){

            if(numbers.get(i) != 13 && !thirteenEncountered){
                unluckyNumbersSum += numbers.get(i);

            }else if(numbers.get(i) != 13 && thirteenEncountered){
                thirteenEncountered = false;

            }else{
                thirteenEncountered = true;
            }
        }

        System.out.println(unluckyNumbersSum);




    }

}
