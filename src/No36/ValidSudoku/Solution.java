package No36.ValidSudoku;

public class Solution {
	public boolean isValidSudoku(char[][] board) {
	    int count = 9;
	    int blockWidth = 3;
	    for (int i=0; i<count; i++) {
	        boolean[] rowExist = new boolean[count+1];
	        boolean[] colExist = new boolean[count+1];
	        boolean[] matrixExist = new boolean[count+1];
	        for (int j=0; j<count; j++) {
	            int rowNum = board[i][j] == '.' ? -1 : board[i][j] - '0';
	            int colNum = board[j][i] == '.' ? -1 : board[j][i] - '0';
	            int mtxRowIdx = 3*(i/3);
	            int mtxColIdx = 3*(i%3);
	            int matrixNum = board[mtxRowIdx + j/3][mtxColIdx + j%3] == '.' ? 
	                                -1 : board[mtxRowIdx + j/3][mtxColIdx + j%3] - '0';
	            if (rowNum > 0 && rowExist[rowNum] ||
	                colNum > 0 && colExist[colNum] || 
	                matrixNum > 0 && matrixExist[matrixNum]) {
	                return false;        
	            }
	            if (rowNum > 0)
	                rowExist[rowNum] = true;
	            if (colNum > 0)
	                colExist[colNum] = true;
	            if (matrixNum > 0)
	                matrixExist[matrixNum] = true;
	        }
	    }
	    return true;
	}
    public static void main(String[] args){
    	  
    	   
    }
    
}