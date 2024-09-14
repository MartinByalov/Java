// Пример за използване на класа Graph
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5); // Създаване на граф с 5 върха

        // Задаване на тегла на върховете
        graph.setVertexWeight(0, 10);  // Например, разход за престой на връх 0
        graph.setVertexWeight(1, 20);  // Например, ресурсна стойност на връх 1
        graph.setVertexWeight(2, 30);  // Например, важност на връх 2
        graph.setVertexWeight(3, 40);  // Например, разстояние до връх 3
        graph.setVertexWeight(4, 50);  // Например, стойност на връх 4

        // Добавяне на ръбове
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Принтиране на графа
        System.out.println("Граф:");
        graph.printGraph();
    }
}