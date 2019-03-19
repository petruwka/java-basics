package generics;
// T,E,V,K,L,M
public class Storage<T> {

    private T value;
    private String stringValue;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "value=" + value +
                '}';
    }
}
