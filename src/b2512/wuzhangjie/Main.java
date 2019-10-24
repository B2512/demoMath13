package b2512.wuzhangjie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] str = new int[]{1,7,8,9,2,5};//数组
        int[] pic = new int[str.length-1];//创建新的数组
        boolean status;//布尔值
        for (int i=0;i<str.length-1;i++) {
            //把str相减的数据传入pic数组
            pic[i] = str[i+1] - str[i];
        }
        System.out.println(Arrays.toString(pic));//打印数组
        status = pic[0]>0;//判断第一个是否正数
        for (int i=1;i<pic.length;i++){
            boolean thisstatus = pic[i]>0;//判断第i个是否正数
            if (thisstatus==status){//如果相等
                System.out.println("不是摆动");
                break;
            }else {
                status = pic[i]>0;//重新判断是否正数
                if (i==pic.length-1){
                    System.out.println("是摆动");
                }
            }
        }

    }
}
