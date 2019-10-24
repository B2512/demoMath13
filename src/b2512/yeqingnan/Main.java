package b2512.yeqingnan;

public class Main {
    public static void main(String[] args) {
        int[] number = new int[]{1, 7, 4, 9, 2, 5};
        int[] newnumber = new int[number.length - 1];
        boolean status;
        for (int i = 0; i < number.length - 1; i++) {
            newnumber[i] = number[i + 1] - number[i];  //把差数存在新的数组
            System.out.println(newnumber[i]);
        }

        status = newnumber[0] > 0;  //第一个数是否是正数  正数为true
        for (int j = 1; j < newnumber.length; j++) {
            boolean thisstatus = newnumber[j] > 0; //第j数是否是正数  正数为true
            if (thisstatus == status) { //如果第一第二个数为正数 直接输出false
                System.out.println("不是摆动");
                break;
            } else {
                status = newnumber[j] > 0;  //重新判断是否正数
                if (j == (newnumber.length - 1)) {
                    System.out.println("是摆动");
                }
            }
        }
    }
}
