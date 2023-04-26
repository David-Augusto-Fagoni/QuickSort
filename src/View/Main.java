package View;
import Controller.Ordenacoes;

public class Main {

	public static void main(String[] args) {
		int[] VT = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		Ordenacoes O = new Ordenacoes();
		
		VT = O.quickSort(VT, 0, VT.length-1);
		for (int J = 0;J< VT.length;J++) {
			System.out.println(VT[J]);
		}
	}

}
