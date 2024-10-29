class Solution {
    List<List<String>> ans = new ArrayList<>();
    int N;
    public List<List<String>> solveNQueens(int n) {
        N = n;
        backtrack(new ArrayList<>(), new HashSet<>());
        return ans;
    }
    
    private void backtrack(List<Integer> queens, Set<Integer> cols) {
        int row = queens.size();
        
        if (row == N) {
            List<String> board = constructBoard(queens);
            ans.add(board);
            return;
        }
        
        for (int col = 0; col < N; col++) {
            if (cols.contains(col) || !queens.isEmpty() && (queens.get(queens.size()-1) - 1 == col || queens.get(queens.size()-1) +1 == col) ) {
                continue;
            }
            queens.add(col);
            cols.add(col);

            backtrack(queens, cols);
            
            queens.remove(queens.size() - 1);
            cols.remove(col);
        }
    }
    
    private List<String> constructBoard(List<Integer> queens) {
        List<String> board = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            StringBuilder row = new StringBuilder(".".repeat(N));
            row.setCharAt(queens.get(i), 'Q');
            board.add(row.toString());
        }
        
        return board;
    }
}
