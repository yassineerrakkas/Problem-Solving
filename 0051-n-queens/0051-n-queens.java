class Solution {
    List<List<String>> ans = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        backtrack(new ArrayList<>(), new HashSet<>(), new HashSet<>(), new HashSet<>(), n);
        return ans;
    }
    
    private void backtrack(List<Integer> queens, Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2, int n) {
        int row = queens.size();
        
        if (row == n) {
            List<String> board = constructBoard(queens, n);
            ans.add(board);
            return;
        }
        
        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue;
            }
            
            queens.add(col);
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            
            backtrack(queens, cols, diag1, diag2, n);
            
            queens.remove(queens.size() - 1);
            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
        }
    }
    
    private List<String> constructBoard(List<Integer> queens, int n) {
        List<String> board = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder(".".repeat(n));
            row.setCharAt(queens.get(i), 'Q');
            board.add(row.toString());
        }
        
        return board;
    }
}
