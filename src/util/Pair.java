package util;

public class Pair<V,ED> {
    private V first;
    private ED second;

    public Pair(V first, ED second) {
        this.first = first;
        this.second = second;
    }

    public V getFirst(){
        return first;
    }
    public ED getSecond(){
        return second;
    }

    @Override
    public String toString() {
        return "(" + first +
                ", " + second +
                ')';
    }
}
