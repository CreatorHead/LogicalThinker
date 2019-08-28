package test.questions.musicQuest;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicQuest {
	public static void main(String[] args) {
		String nodes;
		int nodesNumber=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Nodes: ");
		nodes = in.nextLine();
		System.out.println("Enter Song Number: ");
		nodesNumber = in.nextInt();
		String[] nodesArr = nodes.split(" ");
		ArrayList<Node> nodesList = new ArrayList<>();
		System.out.println();
		for(String s: nodesArr){
			Node node = new Node(s);
			nodesList.add(node);
		}
		play(nodesList,nodesNumber);
	}
	
	public static void play(ArrayList<Node> nodes,int nodeNumber){
		int head= 0;
		for(int i=0;i<nodeNumber;i++){
			System.out.print(nodes.get(head)+" ");
				head++;
				if(head == nodes.size()){
					head = 0;
				}
		}
		System.out.println();
	}
}
