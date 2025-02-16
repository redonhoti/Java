package projekt2;
import java.util.Arrays;
public class MergeSort {
public int[] ndaj(int vargu[]) {
	int gjatesiaVargut=vargu.length;
	if(gjatesiaVargut <=1) {
		return vargu;
	}
	int mesi=Math.floorDiv(gjatesiaVargut, 2);
	int[] varguMajte=Arrays.copyOfRange(vargu, 0, mesi);
	int[] varguDjathte=Arrays.copyOfRange(vargu, mesi,gjatesiaVargut);
	return bashko(ndaj(varguMajte), ndaj(varguDjathte));
}
public int[] bashko(int[] majtas, int[]djathtas) {
	int[] bashkuar=new int[majtas.length +djathtas.length];
	int pozitaMajtas=0;
	int pozitaDjathtas=0;
	int indeksiAktual=0;
	while(pozitaMajtas <majtas.length && pozitaDjathtas < djathtas.length) {
		if(majtas[pozitaMajtas] < djathtas[pozitaDjathtas]) {
			bashkuar[indeksiAktual] =majtas[pozitaMajtas];
			pozitaMajtas++;
		}else {
			bashkuar[indeksiAktual]=djathtas[pozitaDjathtas];
			pozitaDjathtas++;
		}
		indeksiAktual++;
	}
	System.arraycopy(majtas,pozitaMajtas,bashkuar,indeksiAktual,majtas.length - pozitaMajtas);
	System.arraycopy(djathtas,pozitaDjathtas,bashkuar,indeksiAktual,djathtas.length - pozitaDjathtas);
	return bashkuar;
}
public static void main(String[] args) {
	int[] varguHyres= {19, -5,32,25,49,3};
	MergeSort radhitja=new MergeSort();
	System.out.println(Arrays.toString(radhitja.ndaj(varguHyres)));
}
}
