import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class L_2642_Design_Graph {
    public static void main(String[] args) {
        int[][] arr = { { 0, 2, 5 }, { 0, 1, 2 }, { 1, 2, 1 }, { 3, 0, 3 } };
        Graph ob = new Graph(4, arr);
        ob.shortestPath(3, 2);
    }
}

class Edge {
    Node from;
    Node to;
    int cost;

    public Edge(Node from, Node to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}

class Node {
    int val;

    public Node(int val) {
        this.val = val;
    }
}

class Graph {

    ArrayList<Edge> eds = new ArrayList<>();
    HashMap<Integer, Node> nodeMap = new HashMap<>();

    public Graph(int n, int[][] edges) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int[] is : edges) {
            map.put(is[0], is[0]);
            map.put(is[1], is[1]);
        }
        System.out.println(map);
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            nodeMap.put(entry.getValue(), new Node(entry.getValue()));
        }

        for (Entry<Integer, Node> node : nodeMap.entrySet()) {
            System.out.println(node.getValue().val);
        }

        for (int[] an : edges) {
            Node f = nodeMap.get(an[0]);
            Node t = nodeMap.get(an[1]);
            System.out.println(f.val + "," + t.val);
            eds.add(new Edge(f, t, n));
        }

        for (Edge e : eds) {
            System.out.println(e.from.val + "," + e.to.val + "," + e.cost);
        }
    }

    public void addEdge(int[] edge) {

    }

    public int shortestPath(int node1, int node2) {
        System.out.println(nodeMap);
        Node n1 = nodeMap.get(node1);
        Node n2 = nodeMap.get(node2);
        System.out.println(n1.val + "," + n2.val);

        return 0;
    }
}