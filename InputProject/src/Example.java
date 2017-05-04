/**
 * Created by Gosiek on 03.05.2017.
 */

import com.sun.deploy.util.SyncAccess;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.rmi.MarshalledObject;
import java.util.*;


public class Example {
    static int anInt;
    static Integer anInteger;

    public static void main(String args[]) {
        //System.out.println(example);
        //System.out.println(anInteger);
        //System.out.println(Example.anInt);
        Example example = new Example();
        //example.primeNumber();
        //example.searchNumber();
        //example.randomNumbers();
        example.countRepeatedValue("ile tu jest a a ile i");
    }

    public void primeNumber() {
        int temp;
        boolean isPrime=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter anInt number of check: ");
        int number = scan.nextInt();

        temp = number % 2;
        for (int i = 2; i <= number / 2; i++) {
            if (temp == 0) {
                isPrime=true;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(number+ " it is Prime number");
        }
        else
            System.out.println(number + " in not prime number");
    }
    public void searchNumber() {
        int counter,num,item,array[],first,last,middle;
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter number of table's elements:");
        num=input1.nextInt();

        //new table
        array=new int[num];
        System.out.println("Enter values of table's elements: ");
        for (counter=0; counter<num; counter++)
            array[counter]=input1.nextInt();

        System.out.println("Write the number which you are looking for: ");
        item=input1.nextInt();
        //position of elements in array
        first=0;
        last=num-1;
        middle=(first+last)/2;

        while (first<= last)
        {
            if (array[middle]<item)
                first=middle+1;
            else if (array[middle]==item)
            {
                System.out.println(item + " found at location "+ (middle +1));
                break;
            }
            else
            {last=middle-1;
            }
            middle=(first+last)/2;
        }
        if (first >last)
            System.out.println(item + "is not found");

    }
    public void randomNumbers() {
        int counter,randomCounter2;
        Random randomNumber=new Random();
        System.out.println("How many random numbers do you need? ");
        Scanner randomCounter=new Scanner(System.in);
        randomCounter2 = randomCounter.nextInt();
        for (counter=0; counter< randomCounter2;counter++)
            System.out.println(randomNumber.nextInt(200));
    }
    public void countRepeatedValue(String myString){
        char[] charTable=myString.toCharArray();
        //create hashmap
        Map<Character,Integer> charMap=new HashMap<Character,Integer>();

        for (char charInTable:charTable)
        {
            if(charMap.containsKey(charInTable))
            {
                charMap.replace(charInTable,charMap.get(charInTable),charMap.get(charInTable)+1);
            }
            else{
                charMap.put(charInTable,1);
            }
        }
        //to find unique value and then search duplicates I prepared keys
        Set<Character> keys=charMap.keySet();
        for (Character keyChar: keys)
        {
            if(charMap.get(keyChar)>1) {
                System.out.println("the " + keyChar + " appears in string " + charMap.get(keyChar) + " times");
            }
        }

    }
}