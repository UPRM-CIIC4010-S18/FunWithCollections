import java.util.Stack;

public class Maze {

	public static int maze[][] = {
			{ 1, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 },
			{ 2, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }
	};

	public static boolean solveMaze(int[][] maze, int startRow, int startCol) {
		if (startCol >= 0 && startCol < 6 && startRow >=0 && startRow < 4) {
			switch (maze[startRow][startCol]) {
			case 0: 
			case 3: return false;

			case 2: System.out.println("Cheese found at row " + startRow + ", column " + startCol);
			return true;

			case 1: 
				maze[startRow][startCol] = 3; // Mark cell as visited
				return (solveMaze(maze, startRow - 1, startCol) ||
						solveMaze(maze, startRow, startCol + 1) ||
						solveMaze(maze, startRow + 1, startCol) ||
						solveMaze(maze, startRow, startCol - 1));
			default:
				return false;
			}
		}
		return false; // Mouse outside maze
	}

	private static class MazeFrame {
		public int row;
		public int col;
		public MazeFrame(int row,int col) { 
			this.row = row;
			this.col = col;
		}
	}

	public static boolean solveMazeIterative(int[][] maze, int startRow, int startCol) {

		Stack<MazeFrame> s = new Stack<MazeFrame>();
		s.push(new MazeFrame(0,0));
		while (!s.empty()) {
			MazeFrame f = s.pop();
			if (f.row >= 0 && f.row < 4 && f.col >=0 && f.col<6) {
				switch(maze[f.row][f.col]) {
				case 2: System.out.println("Found cheese at row " + f.row + " col " + f.col);
				return true;
				case 1: s.push(new MazeFrame(f.row-1,f.col));
				s.push(new MazeFrame(f.row,f.col+1));
				s.push(new MazeFrame(f.row+1,f.col));
				s.push(new MazeFrame(f.row,f.col-1));
				break;
				case 0:
				case 3:
				default:
				}
			}
		}
		return false;
	}
}
