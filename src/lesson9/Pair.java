package lesson9;

public class Pair<K, V> {
    protected K pairK;
    protected V pairV;

    public Pair(K k, V v) {
        this.pairK=k;
        this.pairV=v;
    }

    public K getPairK() {
        return pairK;
    }

    public void setPairK(K pairK) {
        this.pairK = pairK;
    }

    public V getPairV() {
        return pairV;
    }

    public void setPairV(V pairV) {
        this.pairV = pairV;
    }
}
