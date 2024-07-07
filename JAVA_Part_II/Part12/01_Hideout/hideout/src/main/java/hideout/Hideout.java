package hideout;

public class Hideout <T> {
    private T hideout;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        hideout = toHide;
    }

    public T takeFromHideout() {
        T toReturn = hideout;
        hideout = null;
        return toReturn;
    }

    public boolean isInHideout() {
        if (hideout != null) {
            return true;
        }
        return false;
    }

}
