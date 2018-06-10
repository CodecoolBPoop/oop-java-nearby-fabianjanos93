import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class twoDimensional{
	int[][] array;
	
	public void setArray(int[][] setValue){
		array = setValue;
	}
	public int[][] getArray(){
		return array;
	}
	
	public String nearby(int x, int y, int nerby){
		int firstHalf = Math.min(nerby,y);
		int lastHalf = Math.min(nerby,array[x].length-1-y);
		int[] ans = new int[firstHalf+lastHalf];
		System.arraycopy(array[x],y-firstHalf,ans,0,firstHalf);
		if (y+1<array[x].length){
			System.arraycopy(array[x],y+1,ans,firstHalf,lastHalf);
		}
		return Arrays.toString(ans);
		}
}



