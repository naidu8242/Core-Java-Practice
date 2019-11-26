package parties;
/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
 public class CandidateCode {
	 public static void main(String args[]) {
		    Set<Chocolate> set = new HashSet<>();
		    Chocolate chocolate = new Chocolate(4, 8);
		    set.add(chocolate);
		    System.out.println(set.contains(chocolate)); // --> true
		    chocolate.numberOfBlocksOfTheLargestSquareThatCanbeFormedFromTheChocolate();
		    System.out.println(set.contains(chocolate)); // --> false
		    
			System.out.println("Total No of Students Count:"+distributeChocolate(5,6,3,4));
		}

    public static int distributeChocolate(int input1,int input2,int input3,int input4){
        int[] chocolatelengthLimits = {input1,input2};
        int[] chocolatewidthLimits = {input3,input4};
        Set<Chocolate> chocolateCarton = makeSetOfChocolatesOutOfTheLimits(chocolatelengthLimits, chocolatewidthLimits);
        return getTotalNumberofChildrenThatCanBeFed(chocolateCarton);
    }

    private static int getTotalNumberofChildrenThatCanBeFed(Set<Chocolate> chocolateCarton){
        int totalNumberOfChildrenThatCanBeFed = 0;
        for (Chocolate chocolate : chocolateCarton) {
            int childrenFedFromTheChocolate = numberOfChildrenThatCanBeFedFromTheChocolate(chocolate);
            totalNumberOfChildrenThatCanBeFed+=childrenFedFromTheChocolate;
        }
        return totalNumberOfChildrenThatCanBeFed;
    }

    private static Set<Chocolate> makeSetOfChocolatesOutOfTheLimits(int[] lengthLimits,int[] widthLimits){
        Set<Chocolate> chocolates = new HashSet<Chocolate>();
        for(int i=0;i<lengthLimits.length;i++){
            for(int j=0;j<widthLimits.length;j++){
                Chocolate rectangle = new Chocolate(lengthLimits[i], widthLimits[j]);
                chocolates.add(rectangle);
            }
        }
        return chocolates;
    }

    private static int numberOfChildrenThatCanBeFedFromTheChocolate(Chocolate chocolate){
        int numberOfChildren = 0;
        int chocolateBlocksToExhaust = chocolate.getNumberOfChocolateBlocks();
        while (chocolateBlocksToExhaust!=0){
            int chocolateBlocksThatCanBeExhausted = chocolate.numberOfBlocksOfTheLargestSquareThatCanbeFormedFromTheChocolate();
            chocolateBlocksToExhaust=chocolateBlocksToExhaust-chocolateBlocksThatCanBeExhausted;
            numberOfChildren++;
        }
        return numberOfChildren;
    }
}

class Chocolate {

    int length;
    int width;

    public Chocolate(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int numberOfBlocksOfTheLargestSquareThatCanbeFormedFromTheChocolate(){
        return decreaseDimensionsMaximumMinusMinimum();
    }

    private int decreaseDimensionsMaximumMinusMinimum(){
        if(this.length>this.width) {
            this.length=this.length-this.width;
            return this.width*this.width;
        }
        if(this.width>this.length) {
            this.width=this.width-this.length;
            return this.length*this.length;
        }
        if(this.length==this.width){
            return this.length*this.width;
        }
        return 0;
    }

    public int getNumberOfChocolateBlocks(){
        return this.length*this.width;
    }

    //HashCode and Equals Methods here      
}
