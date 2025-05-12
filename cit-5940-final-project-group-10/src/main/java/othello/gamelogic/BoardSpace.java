package othello.gamelogic;

import javafx.scene.paint.Color;

import java.util.Objects;

/**
 * Represents a logical space on the Othello Board.
 * Keeps track of coordinates and the type of the current space.
 */
public class BoardSpace {

    private final int x;
    private final int y;
    private SpaceType type;

    public BoardSpace(int x, int y, SpaceType type) {
        this.x = x;
        this.y = y;
        setType(type);
    }

    public BoardSpace(BoardSpace other) {
        this.x = other.x;
        this.y = other.y;
        this.type = other.type;
    }

    // auto generated equals and hash
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardSpace that = (BoardSpace) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /**
     * @return the x coordinate of this space
     */
    public int getX() {
        return x;
    }

    /**
     * @return the x coordinate of this space
     */
    public int getY() {
        return y;
    }

    /**
     * @return the Space of the current tile
     */
    public SpaceType getType() {
        return type;
    }

    /**
     * Sets the type of the tile, then adds an othello chip (circle) to the tile.
     * @param type Space to set this space to.
     */
    public void setType(SpaceType type) {
        this.type = type;
    }

    /**
     * Represents the type of the board space, used for filling in the color of the space in the GUI
     */
    public enum SpaceType {
        EMPTY(Color.GRAY),
        BLACK(Color.BLACK),
        WHITE(Color.WHITE);

        private final Color fill;

        SpaceType(Color fill) {
            this.fill = fill;
        }

        public Color fill() {
            return fill;
        }
    }
}
