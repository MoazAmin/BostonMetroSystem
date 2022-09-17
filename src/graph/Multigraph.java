package graph;


import util.Pair;

import java.util.*;

// HashMap graph model inspired by https://www.youtube.com/watch?v=dQdM86yRDCs

/**
 * A multigraph class.
 * @param <V> The type of the nodes
 * @param <ED> The type of the edge descriptions
 */
public class Multigraph<V,ED> implements Graph<V,ED>{
    /**
     * The adjacency list as a map.
     */
    private Map<V, List<Pair<V,ED>>> G = new HashMap<>();

    /**
     * This method adds a new edge from vertex V1 to vertex V2 with edge description edgeLabel.
     * @param v1 The starting vertex.
     * @param v2 The target vertex.
     * @param edgeLabel The edge's label.
     */
    public void addEdge(V v1, V v2, ED edgeLabel)
    {
       var targets = G.get(v1);
       targets.add(new Pair<>(v2,edgeLabel));
       G.put(v1,targets);

    }

    @Override
    public void addVertex(V v) {

    }

    @Override
    public List<Pair<V, ED>> neighbours(V x) {
        return null;
    }

    @Override
    public Set<V> vertices() {
        return null;
    }

    // This allows us to print the graph using System.out.println()
    @Override
    public String toString() {
        String print = "";
        for (V key : G.keySet()) {
            print += key + " => " + G.get(key) + "\n";
        }

        return print;
    }
}
