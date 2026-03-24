public static int[][] ratioize(int ratio , int[][] array){
int[][] arr = new int[array.length][array[0].length];
for(int x = 0; x < array.length; x++){
for(int y = 0; y < array[0].length; y++){
arr[x][y]=(array[x][y] * ratio);
}
}
return arr;
}
