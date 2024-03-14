package Patterns;
//Protoripe
public class SillyLittleMariam {
    public static void main(String[] args) {
Girl mariam = new Girl("Mariam");
        System.out.println(mariam.toString());

        Girl noMariam = (Girl) mariam.clone();
        noMariam.setName("No Mariam");
        noMariam.setLazy(false);
        noMariam.setSilly(false);

        System.out.println(noMariam.toString());
    }
}
class Girl implements Cloneable{
    private String name;
    private boolean silly= true;
    private boolean little=true;
    private boolean lazy = true;

    public Girl(String name) {
        this.name = name;
    }

    @Override
    public Girl clone() {
        try {
            Girl clone = (Girl) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", silly=" + silly +
                ", littl=" + little +
                ", laz=" + lazy +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSilly() {
        return silly;
    }

    public void setSilly(boolean silly) {
        this.silly = silly;
    }

    public boolean isLittl() {
        return little;
    }

    public void setLittl(boolean littl) {
        this.little = littl;
    }

    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }
}

