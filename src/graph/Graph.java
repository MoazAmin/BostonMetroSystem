package graph;
import util.Pair;

import java.util.List;
import java.util.Set;

public interface Graph<V,ED> {
    void addEdge(V v1, V v2, ED edgeLabel);
    void addVertex(V v);
    List<Pair<V, ED>> neighbours(V x);
    Set<V> vertices() ;
}
