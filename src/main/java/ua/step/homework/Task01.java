package ua.step.homework;

/**
 * Написать и методы работы с квадратными матрицами (матрицы
 * представить в виде двухмерных массивов). 
 * Должны присутствовать методы:
 * • создания единичной (диагональной) матрицы (метод createOne)+
 * • создания нулевой матрицы (метод createNull)+
 * • сложение матриц (метод sumMatrix)
 * • умножения матриц (метод productMatrix)
 * • умножение матрицы на скаляр (метод productMatrix)
 * • определение детерминанта матрицы (метод determinant)
 * • вывод матрицы на консоль (метод printMatrix)
 */
public class Task01 {

	public static void main(String[] args) {
		// TODO: Проверяйте методы здесь
		int[][]arr = createOne(5,5);
		printMatrix(arr);

		arr = createNull(5, 5);
		printMatrix(arr);

		arr = sumMatrix(arr, arr);
		printMatrix(arr);


	}

	/**
	 * Создает единичную матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return единичную (диагональную) матрицу
	 */

	public static int[][] createOne (int n, int m) {
		int [][]mas = new int[n][m];

		for(int i=0; i<mas.length; i++)
		{
			for(int j=0; j<mas[i].length; j++)
			{
				if(i==j)
				{
					mas[i][j] = 1;
				}
			}
		}

		return mas;
	}

	/**
	 * Создает нулевую матрицу
	 * @param n - количество строк
	 * @param m - количество колонок
	 * @return нулевую матрицу
	 */
	public static int[][] createNull (int n, int m) {
		return new int[n][m];
	}

	/**
	 * Вычисляет сумму двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return сумму двух матриц
	 */
	public static int[][] sumMatrix(int[][] one, int[][] two) {
		for(int i=0; i<one.length; i++)
		{
			for(int j=0; j<one[i].length; j++)
			{
				one[i][j] = one[i][j]+two[i][j];
			}
		}
		return one;
	}

	/**
	 * Вычисляет произведение двух матриц
	 * @param one - первая матрица
	 * @param two - вторая матрица
	 * @return произведение матриц
	 */
	public static int[][] productMatrix(int[][] one, int[][] two) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Вычисляет произведение матрицы на скаляр
	 * @param matrix - матрица
	 * @param num - скаляр
	 * @return произведение матрицы на скаляр
	 */
	public static int[][] productMatrix(int[][] matrix, int num) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Вычисляет детерминант матрицы
	 * @param matrix - матрица
	 * @return детерминант матрицы
	 */
	public static int determinant(int[][] matrix) {
		// TODO: удалите исключение и пишите здесь код
		throw new RuntimeException("Not implemented yet");
	}

	/**
	 * Печатает матрицу в стандартный поток вывода
	 * @param matrix - матрица
	 */
	public static void printMatrix(int[][] matrix) {
		for(int[]row:matrix)
		{
			for(int cell:row)
			{
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}
