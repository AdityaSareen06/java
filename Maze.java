public class Maze { 
      static int N; 
  
      void printSol(int sol[][]) 
      { 
            for (int i = 0; i < N; i++) { 
                for (int j = 0; j < N; j++) 
                    System.out.print(" " + sol[i][j] + " "); 
                System.out.println(); 
            } 
      } 
  
    
        boolean isValid(int maze[][], int x, int y) 
        { 
            
            return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1); 
        } 
      
        
        boolean solMaze(int maze[][]) 
        { 
            int sol[][] = new int[N][N]; 
      
            if (solMazeUtil(maze, 0, 0, sol) == false) { 
                System.out.print("Solution doesn't exist"); 
                return false; 
            } 
      
            printSol(sol); 
            return true; 
        } 
      
       
        boolean solMazeUtil(int maze[][], int x, int y, 
                              int sol[][]) 
        { 
            
            if (x == N - 1 && y == N - 1 && maze[x][y] == 1) { 
                sol[x][y] = 1; 
                return true; 
            } 
      
            
            if (isValid(maze, x, y) == true) { 
                
                sol[x][y] = 1; 
      
                
                if (solMazeUtil(maze, x + 1, y, sol)) 
                    return true; 
      
                
                if (solMazeUtil(maze, x, y + 1, sol)) 
                    return true; 
      
                 
                
                sol[x][y] = 0; 
                return false; 
            } 
      
            return false; 
        } 
      
        public static void main() 
        { 
            Maze rat = new Maze(); 
            int maze[][] = { { 1, 1, 0, 0 }, 
                             { 0, 1, 1, 1 }, 
                             { 0, 0, 1, 0 }, 
                             { 1, 0, 1, 1 } }; 

      
            N = maze.length; 
            rat.solMaze(maze); 
        } 
} 
