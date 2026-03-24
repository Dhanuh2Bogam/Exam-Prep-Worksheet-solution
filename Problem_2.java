import java.util.*;

public class Problem_2{
public static void main(String[] args){
int[] a = {3,1,4};
int[] b = {2,7,1};
int[] c = appendArrays(a,b);
System.out.println(Arrays.toString(c));
}

public static int[] appendArrays(int[] a, int[] b){
int[] arr = new int[(a.length + b.length)];
for(int x = 0; x <= a.length-1; x++){
arr[x] = a[x];
}

for( int r = a.length ; r <= arr.length-1; r++){
arr[r] = b[(r-(a.length))];
}
  return arr; 
}



}
