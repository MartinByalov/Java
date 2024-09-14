class Graph{

    private int[][] adjacencyMatrix;
    private int numVertices; // върхове

    public Graph(int numVertices){

        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];

    }

    public void addEdge(int i, int j){

        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;

    }

    public void printGraph(){

        for(int i = 0; i < numVertices; i++){
            for(int j = 0; j < numVertices; j++){

                System.out.print(adjacencyMatrix[i][j] + " ");

            }
            System.out.println();
        }

    }
}