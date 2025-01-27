/*
 * @Descripttion: 
 * @version: 
 * @Author: Kzh
 * @Date: 2025-01-22 11:57:46
 * @LastEditors: 2ofus
 * @LastEditTime: 2025-01-22 12:00:16
 */
public class Message{
    public static void main(String[] args){
        if(args[0].equals("-h"))
            System.out.print("Hello,");
        else if (args[0].equals("-g"))
            System.out.print("Goodbye,");
        for(int i=1;i<args.length;i++)
            System.out.print(" "+args[i]);
        System.out.println("!");
    }
}