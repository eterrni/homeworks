package lesson9;

public final class PairUtil {
    public static <K, V> Pair<V, K> swap(Pair<K, V> obj) {
        return new Pair<>(obj.getPairV(), obj.getPairK());
    }
}
