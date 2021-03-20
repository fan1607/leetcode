package alg.dfs;

public class _剑指Offer_12_矩阵中的路径 {
    public boolean exist(char[][] board, String word) {
        char[] targets = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, targets, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] targets, int i, int j, int k) {
        // TODO 剪枝
        if (i >= board.length || i < 0
                || j >= board[0].length || j < 0
                || board[i][j] != targets[k])
            return false;
        if (k == targets.length - 1)
            return true;
        // TODO 标记搜索记录
        board[i][j] = '\0';
        // TODO 上下左右前进搜索，去匹配下一个字符，任意方向能满足即可，用“或”运算
        boolean res = dfs(board, targets, i + 1, j, k + 1)
                || dfs(board, targets, i - 1, j, k + 1)
                || dfs(board, targets, i, j + 1, k + 1)
                || dfs(board, targets, i, j - 1, k + 1);
        // TODO 还原搜索记录
        board[i][j] = targets[k];
        return res;
    }
}
