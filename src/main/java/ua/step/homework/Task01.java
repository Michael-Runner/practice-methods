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

		arr = productMatrix(arr, arr);
		printMatrix(arr);

		arr = productMatrix(arr, 5);
		printMatrix(arr);

		int det = determinant(arr);
		System.out.println(det);
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
		int[][] mas = new int[one.length][one.length];

		for(int i =0; i< one.length; i++)
		{
			for(int j=0; j<one[i].length; j++)
			{
				int sum =0;
				int counter = 0;
				for (int n = 0; n < one[0].length; n++)
				{
					sum = sum + one[i][n] * two[counter][j];
					counter++;
				}
				mas[i][j] = sum;
			}
		}

		return mas;
	}

	/**
	 * Вычисляет произведение матрицы на скаляр
	 * @param matrix - матрица
	 * @param num - скаляр
	 * @return произведение матрицы на скаляр
	 */
	public static int[][] productMatrix(int[][] matrix, int num) {
		for(int i = 0; i < matrix.length; i++)
		{
			for(int j = 0; j< matrix.length; j++)
			{
				matrix[i][j] = matrix[i][j]*num;
			}
		}
		return matrix;
	}

	/**
	 * Вычисляет детерминант матрицы
	 * @param matrix - матрица
	 * @return детерминант матрицы
	 */
	public static int determinant(int[][] matrix) {
		int det = 0;

		if(matrix.length==2 && matrix[0].length == 2)
		{
			det = matrix[0][0]*matrix[1][1]-matrix[1][0]*matrix[0][1];
			return det;
		}
		else
		{
			for(int i = 0; i<matrix[0].length; i++)
			{
				if(i%2==0)
				{
					det = det + matrix[0][i]*det(matrix, i);
				}
				else
				{
					det = det - matrix[0][i]*det(matrix, i);
				}
			}
		}

		return det;
	}

	public static int det(int[][] matrix, int n)
	{
		int [][] mas = new int [2][2];
		int counter_i = 0;
		int counter_j = 0;
		for(int i = 1; i<matrix.length; i++)
		{
			for(int j = 0; j<matrix[i].length; j++)
			{
				if(j!=n)
				{
					mas[counter_i][counter_j] = matrix[i][j];
					counter_j++;
				}
			}
			counter_i++;
		}

		int num = determinant(mas);
		return num;
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
