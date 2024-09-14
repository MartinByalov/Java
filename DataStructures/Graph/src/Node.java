import java.util.*;

class Node{

    int vertex;
    Node next;

    Node(int vertex){

        this.vertex = vertex;
        this.next = null;

    }
}

class GraphExample{

    private int numVertices; // брой възли
    private LinkedList<Node>[] adjList; // масив от свързани списъци. Всеки списък се състои
    // от съседните възли на даден възли

    private int[] vertexWeights; // тегла на възлите

    // конструктир на граф

    public GraphExample(int numVertices){

        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        vertexWeights = new int[numVertices];

        for(int i = 0; i < numVertices; i++){

            adjList[i] = new LinkedList<>();
            vertexWeights[i] = 0; // начални тегла
        }
    }

    // Добавяне на ребро между два възела

    public void addEdge(int src, int dest){

        adjList[src].add(new Node(dest));

        // Ако графът е неориентиран
        adjList[dest].add(new Node(src));

    }

    // Обхождане в дълбочина

    public void depthFirstSearch(int startVertex){

        boolean[] visited = new boolean[numVertices];
        dfsUtil(startVertex, visited);

    }

    private void dfsUtil(int vertex, boolean[] visited){

        // Маркираме възел като посетен
        visited[vertex] = true;

        // Отпечатваме възела
        System.out.print(vertex + " ");

        // Ако възела има непосетени съседни възли

        for(Node current : adjList[vertex]){

            if(!visited[current.vertex]){
                dfsUtil(current.vertex, visited);
            }
        }
    }

    // задаване на тегло на възел

    public void setVertexWeights(int vertex, int weight){

        if(vertex >= 0 && vertex < numVertices){
            vertexWeights[vertex] = weight;
        } else{
            throw new IllegalArgumentException("Невалиден индекс на възел.");
        }
    }

    public int getVertexWeight(int vertex){

        if(vertex >= 0 && vertex < numVertices){
            return vertexWeights[vertex];
        } else{
            throw new IllegalArgumentException("Невалиден индекс на възел.");
        }
    }

    public void printGraph(){

        for(int i = 0; i < numVertices; i++){

            System.out.print("Възел: " + i + " с тегло: " + vertexWeights[i] + " е свързан с: ");

            for(Node current : adjList[i]){

                System.out.print(current + ", ");
            }
            System.out.println();
        }

    }
}