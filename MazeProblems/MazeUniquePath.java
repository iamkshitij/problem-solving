/**
 * MazeUniquePath
 * Find the total number of unique paths which the robot can take in a given maze to reach the destination from given source.
 */
public class MazeUniquePath {

    static final int N = 4;
    public static void main(String[] args) {
        
        int maze[][] =
		{
			{ 1, 1, 1, 1 },
			{ 0, 1, 0, 1 },
			{ 1, 1, 0, 0 },
			{ 1, 0, 1, 1 }
        };
        
        int count = 0;
        boolean[][] visited  = new boolean[N][N];

        count = countPath(maze, 0, 0, visited, count);
        System.out.println(count);
    }

    // first check whether the traversing cell is valid or not !
    static boolean isVaildPath(int x, int y){
        if( x >= 0 && y >= 0 && x < N && y < N) return true;
        return false;
    }

    // count the no of paths that could be traversed !
    static int countPath(int[][] maze, int x ,int y ,boolean[][] visited ,int count){


        // if destination is found increment the count of paths.
        if( x == N-1 && y == N-1){
            count ++;
            return count;
        }

        // make current path as visited
        visited[x][y] = true;

        if(isVaildPath(x, y) && maze[x][y] == 1){
            // moving down direction
            if(x + 1 < N && !visited[x+1][y])
                count = countPath(maze, x+1, y, visited, count);

            // moving up direction
            if(x-1 >= 0 && !visited[x-1][y])
                count = countPath(maze, x - 1, y, visited, count);

            // moving left direction
            if(y-1 >= 0 && !visited[x][y-1])
                count = countPath(maze, x, y - 1, visited, count);

            // moving right direction
            if(y+1 < N && !visited[x][y+1])
                count = countPath(maze, x, y + 1, visited, count);
        }

        // backtrack condition for unmarking the visited cell
        visited[x][y] = false;

        return count;
    }


}