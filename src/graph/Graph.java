package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
	private Map<Vertex, List<Vertex>> adjVertices = new HashMap<Vertex, List<Vertex>>();;

	public Map<Vertex, List<Vertex>> getAdjVertices() {
		return adjVertices;
	}

	public void setAdjVertices(Map<Vertex, List<Vertex>> adjVertices) {
		this.adjVertices = adjVertices;
	}

	void addVertex(int label) {
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	}

	void removeVertex(int label) {
		Vertex v = new Vertex(label);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(label));
	}

	void addEdge(int label1, int label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}

	void removeEdge(int label1, int label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	List<Vertex> getAdjVertices(int label) {
		return adjVertices.get(new Vertex(label));
	}

	Set<Integer> depthFirstTraversal(Graph graph, int root) {
		Set<Integer> visited = new LinkedHashSet<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(root);
		while (!stack.isEmpty()) {
			int vertex = stack.pop();
			if (!visited.contains(vertex)) {
				visited.add(vertex);
				for (Vertex v : graph.getAdjVertices(vertex)) {              
					stack.push(v.label);
				}
			} 
		}
		return visited;
	}

	Set<Integer> breadthFirstTraversal(Graph graph, int root) {
		Set<Integer> visited = new LinkedHashSet<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(root);
		visited.add(root);
		while (!queue.isEmpty()) {
			Integer vertex = queue.poll();
			for (Vertex v : graph.getAdjVertices(vertex)) {
				if (!visited.contains(v.label)) {
					visited.add(v.label);
					queue.add(v.label);
				}
			}
		}
		return visited;
	}
}