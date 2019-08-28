package graph;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        HashSet<Integer> set = new HashSet<Integer>();
        int testCases = Integer.parseInt(sc.nextLine());
        for(int i=0;i<testCases;i++){ //loop for no. of test cases
           int noOfStars = Integer.parseInt(sc.nextLine()); //get the no. of stars
           for(int j=0;j< (noOfStars-1);j++){ //loop to get the position of no. of stars
               int a = Integer.parseInt(sc.nextLine());
               int b = Integer.parseInt(sc.nextLine());
               
               if(set.add(a)) {
            	   graph.addVertex(a);
            	   System.out.println("added graph");
               }
               if(set.add(b)) {
            	   graph.addVertex(b);
            	   System.out.println("added graph");
               }
               graph.addEdge(a, b);
           }//inner for loop
        }//outer for loop
        int brightestStar = Integer.parseInt(sc.nextLine());
        Set<Integer> res = graph.depthFirstTraversal(graph,brightestStar );
        for(Integer i:res) {
        	System.out.println(i);
        }
        sc.close();
    }
    
    
}