package magic.square;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int cells = size * size;
        int row = 0;
        int column = size / 2;
        int lastRow = 0;
        int lastColumn = size / 2;
        for (int i = 1; i <= cells; i++) {
            lastRow = row;
            lastColumn = column;
            if (i == 1) {
                square.placeValue(column, row, i);
                continue;
            }

            column++;
            row--;

            if (column > size - 1) {
                column = 0;
            }

            if (row < 0) {
                row = size - 1;
            }

            if (square.readValue(column, row) > 0) {
                row = lastRow + 1;
                column = lastColumn;
                square.placeValue(column, row, i);
                continue;
            }
            square.placeValue(column, row, i);
        }
        return square;
    }

}
