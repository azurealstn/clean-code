package chapter_2;

import java.util.ArrayList;
import java.util.List;

public class Sample1 {
    List<Cell> gameBoard = new ArrayList<>();
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }
}
