class Graph {

    private int[][] incidentMatrix;
    private int vertices;
    private int edges;

    public Graph(int vertices, int edges){

        this.vertices = vertices; // връх
        this.edges = edges; // ребро

        incidentMatrix = new int[vertices][edges];

    }

    public void addEdge(int edgeIndex, int vertex1, int vertex2){

        incidentMatrix[vertex1][edgeIndex] = 1;
        incidentMatrix[vertex2][edgeIndex] = 1;

    }

    public void printMatrix(){

        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < edges; j++){

                System.out.print(incidentMatrix[i][j] + " ");

            }

            System.out.println();
        }

    }
}


