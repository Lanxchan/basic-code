public class Demo01Array {
    public static void main(String[] args) {
        int[] arrayA=new int[3];
        arrayA[1]=10;
        arrayA[2]=20;
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        int[] arrayB=arrayA;
        arrayB[0]=100;
        arrayB[1]=200;
        System.out.println("arrayB");
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println("arrayA");
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        //arrayA和arrayB的内存地址相同,更改的是内存地址中的内容,所以更改后输出相同
    }
}
