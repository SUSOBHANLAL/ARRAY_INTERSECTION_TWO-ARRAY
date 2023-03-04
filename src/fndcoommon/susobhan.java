package fndcoommon;

public class susobhan {
	public static void main(String args[]) {
		int arr1[]= {80,10,15,2,35,60};int n = arr1.length;
		int arr2[] = {35,80,60,20,75};int m = arr2.length;
		
		
		int arr11[] = new int[23];int x=0;
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<m;j++) {
				if(arr1[i]==arr2[j])
				{
					arr11[x]=arr1[i];
					x++;
				}
			}
		}
		
		for(int i=0;i<x;i++) {
			System.out.print(arr11[i]+" ");
		}
	}

}
