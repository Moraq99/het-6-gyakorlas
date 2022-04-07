package hu.progmatic;

public class Practice_20220407_06 {
    public static void main(String[] args) {
        // FLAG
        // 11111b = 31
        // 01111b = 15
        // 01011b = 11
        // piros fények (ki/be) +1
        // zöld fények (ki/be) +2
        // kék fények (ki/be) +4
        // füst (ki/be) +8
        // hab (ki/be) +16
        System.out.println(isFoamOn(15));
        System.out.println(isFoamOn(19));
        System.out.println(isFoamOn(20));
        int flags = 20;
        System.out.println(setBlueOn(flags));
        System.out.println(setBlueOff(flags));
    }

    public static boolean isFoamOn(int flags) {
        return (flags & 16) != 0;
    }

    public static int setBlueOn(int flags) {
        return flags | 4;
    }

    public static int setBlueOff(int flags) {
        return flags & 27;
    }
}
