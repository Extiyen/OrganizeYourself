/**
 * Current: 5 levels of priority
 * 1) Urgent
 * 2) High
 * 3) Increasing
 * 4) Moderate
 * 5) Default (low)
 * By default it is set to 5.
 *
 * Future: level will be on an axis of Urgency to Importance
 * and will be calculated and the level will adjust accordingly
 */
public class Priority {
    private int level = 5;

    public Priority() {
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Unimplemented
     */
    public void getIcon() {
        //future version get filed in accordance with priority level and return the image
    }
}
