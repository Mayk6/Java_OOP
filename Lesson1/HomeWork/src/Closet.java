import java.util.Objects;

public class Closet {
    private int width;
    private int height;
    private String colour;
    private Boolean access = false;

    public Closet(int width, int height, String colour) {
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColour() {
        return colour;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }
}
