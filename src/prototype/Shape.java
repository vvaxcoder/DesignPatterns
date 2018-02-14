package prototype;

/**
 * Created by xcoder on 2/12/2018.
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone;
    }
}
