public class Main {

    public static void main(String[] args){

        Graph graph = new Graph(3);

        graph.addEdge(0, 1); // ребро между върхове 0 и 1
        graph.addEdge(0, 2); // ребро между върхове 0 и 2
        graph.addEdge(1, 2); // ребро между върхове 1 и 2

        graph.printGraph();
    }

}
