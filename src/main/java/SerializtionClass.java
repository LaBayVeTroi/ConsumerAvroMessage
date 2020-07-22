import java.io.Serializable;

public class SerializtionClass implements Serializable {
    @Override
    public String toString() {
        return super.toString();
    }

    public SerializtionClass() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
