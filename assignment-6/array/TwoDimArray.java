public class TwoDimArray {

        int matrix[][] = {
                        { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 1, 2, 3 },
                        { 4, 7, 9, 2 }
        };

        int addRow(int matrix[][], int rowIndex) {
                int sumOfRows = 0;

                int row[] = matrix[rowIndex];
                for (int i = 0; i < row.length; i++) {
                        sumOfRows = sumOfRows + row[i];

                }
                return sumOfRows;
        }

        public static void main(String[] args) {

                TwoDimArray td = new TwoDimArray();
                for (int i = 0; i < td.matrix.length; i++) {

                        int row = td.addRow(td.matrix, i);
                        System.out.println(row);

                }

                int rowsLength = td.matrix.length;
                int colLength = td.matrix[0].length;
                for (int colIndex = 0; colIndex < colLength; colIndex++) {
                        int sumOfColm = 0;
                        for (int rowIndex = 0; rowIndex < rowsLength; rowIndex++) {
                                sumOfColm = sumOfColm + td.matrix[rowIndex][colIndex];

                        }
                        System.out.println(" " + sumOfColm);
                }

                for (int rowIndex = 0; rowIndex < rowsLength; rowIndex++) {
                        int sumOfColm = 0;
                        for (int colIndex = 0; colIndex < colLength; colIndex++) {
                                sumOfColm = sumOfColm + td.matrix[rowIndex][colIndex];

                        }
                        System.out.print(" " + sumOfColm);
                }

        }
}
