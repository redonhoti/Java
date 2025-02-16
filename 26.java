package projekt2;

public class BubbleSort {
static void  bubbleSort(int[] vargu) {
	int n=vargu.length;
	int temp=0;
	for(int i=0; i<n; i++) {
		for(int j=1; j<(n-1); j++) {
			if(vargu[j-1] > vargu[j]) {
				temp=vargu[j-1];
				vargu[j-1]=vargu[j];
				vargu[j]=temp;
			}
		}
	}
}
}
