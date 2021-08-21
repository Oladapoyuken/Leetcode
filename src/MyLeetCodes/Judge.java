package MyLeetCodes;

public class Judge {
    public static int selectJudge(int n, int[][] member) {
        if (n < 2) return member[0][1];
        int temp = 0;
        for (int i = 0; i < member.length; i++) {

        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Judge().selectJudge(1, new int[][]{{1, 3}, {2, 3}, {4, 3}}));
    }
}
