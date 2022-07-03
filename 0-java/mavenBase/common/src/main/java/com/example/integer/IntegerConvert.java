package com.example.integer;

/**
 * @author WawaGuess
 * @project codeExample
 * @Date 2022/7/3
 * 【到下一行】shift + enter
 * 【定位到某一行】command + L
 * 【定位到行首/行尾】command + 方向键
 * 【在下一行插入一个空行】command + enter
 * 【构造方法/toString/override提示】control + enter
 */
public class IntegerConvert {
    /**
     * 两个进制之间相互转换，可以考虑先转换成十进制，在用十进制转换成第二个进制
     */
    public static void main(String[] args) {
        //测试其他进制转换成十进制
        System.out.println(toTenConvert("A", 16));
        //测试十进制转换成其他进制
        System.out.println(toOtherConvert(5, 2));
        // 测试将二进制转换成8进制
        System.out.println(toOtherConvert(toTenConvert("11", 2), 8));
    }

    /**
     * 用于将其他进制转换成十进制
     *
     * @param origin 原始字符串
     * @param radix  原本的进制
     * @return 十进制数字
     */
    private static int toTenConvert(String origin, int radix) {
        return Integer.parseInt(origin, radix);
    }

    /**
     * 用于将十进制转换成其他进制
     *
     * @param origin 十进制数字
     * @param radix  要转换成的进制数字
     * @return 原始字符串
     */
    private static String toOtherConvert(int origin, int radix) {
        StringBuilder re = new StringBuilder();

        while (origin / radix != 0) {
            re.append(origin % radix);
            origin = origin / radix;
        }
        re.append(origin % radix);
        return re.reverse().toString();
    }

}
