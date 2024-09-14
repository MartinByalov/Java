public class Main {

    public static void main(String[] args){

        int vertices = 4;
        int edges = 3;

        Graph graph = new Graph(vertices, edges);

        graph.addEdge(0, 0, 1);
        graph.addEdge(1, 1, 2);
        graph.addEdge(2,2,3);

        graph.printMatrix();

    }
}
