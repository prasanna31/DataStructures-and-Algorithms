class example{
    public static void main (String args[]){
        System.out.println("Example for arrays");
        int[] array = new int[10];
        for (int i=0;i<9;i++){
            array[i] = i;
        }
        for (int i=0;i<9;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}