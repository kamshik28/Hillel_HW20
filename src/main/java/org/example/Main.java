package org.example;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);

        System.out.println("Граф після додавання вершин та ребер:");
        graph.printGraph();

        System.out.println("Чи існує вершина 2? " + graph.hasVertex(2));
        System.out.println("Чи існує ребро між 1 і 3? " + graph.hasEdge(1, 3));

        graph.removeEdge(1, 3);
        System.out.println("Граф після видалення ребра 1-3:");
        graph.printGraph();

        graph.removeVertex(2);
        System.out.println("Граф після видалення вершини 2:");
        graph.printGraph();
    }
}
