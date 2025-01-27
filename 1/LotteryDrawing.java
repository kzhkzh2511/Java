import java.util.Arrays;

public class LotteryDrawing {
    public static void main(String[] args){
        int n=50,k=5;
        //设置范围
        int[] numbers=new int[n];
        for(int i=0;i<numbers.length;i++)
            numbers[i]=i+1;
        //抽取k个值
        int[] result= new int[k];
        for (int i = 0; i < k; i++) {
            int r=(int)(Math.random()*n);
            result[i]=numbers[r];
            numbers[r]=numbers[n-1];
            n--;
        }
        //抽取完后排序，看起来更合理
        Arrays.sort(result);
        for(int r:result)
            System.out.println(r);

    }
}
