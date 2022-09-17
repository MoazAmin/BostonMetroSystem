package metroStation;

import graph.Graph;
import util.Pair;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.function.Function;


public class FindRoute {

    public static <V,E> Pair<Map<V,Double>, Map<V,V>>  Dijkstra(Graph<V, E> g, V source, Function<E,Double> weight) {
        var dist = new HashMap<V,Double>();
        var prev = new HashMap<V,V>();
        g.vertices().forEach(v -> dist.put(v, Double.POSITIVE_INFINITY));
        dist.put(source,0d); // Source Node start from distance 0

        var q = new PriorityQueue<V>(g.vertices().size(), Comparator.comparingDouble(dist::get));
        q.addAll(g.vertices());

        while(!q.isEmpty()){
            var u = q.poll();
            for (Pair<V, E> vp : g.neighbours(u)){
                var v = vp.getFirst();
                var w = weight.apply(vp.getSecond());
                var alt = dist.get(u) + w ;
                if (alt < dist.get(v)) {
                    dist.put(v, alt);
                    prev.put(v,u);
                }
            }
        }
        return new Pair<>(dist,prev);
    }






}
