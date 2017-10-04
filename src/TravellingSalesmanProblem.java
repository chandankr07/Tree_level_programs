import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
 
public class TravellingSalesmanProblem
{
    private int numberOfNodes;
    private Stack<Integer> stack;
 
    public TravellingSalesmanProblem()
    {
        stack = new Stack<Integer>();
    }
 
    public void tsp(int adjacencyMatrix[][])
    {
        numberOfNodes = adjacencyMatrix[1].length - 1;
        int[] visited = new int[numberOfNodes + 1];
        visited[1] = 1;	
        stack.push(1);
        int element, dist = 0, i;
        
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(1 + "\t");
        int count=0;
 
        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= numberOfNodes)
            {
                if (adjacencyMatrix[element][i] > 1 && visited[i] == 0)
                {
                    if (min > adjacencyMatrix[element][i])
                    {
                        min = adjacencyMatrix[element][i];
                        dist = i;
                        minFlag = true;
                        count =count+min;
                    }
                }
                i++;
            }
            if (minFlag)
            {
                visited[dist] = 1;
                stack.push(dist);
                System.out.print(dist + "\t");
                minFlag = false;
                continue;
            }
            stack.pop();
        }
        
        System.out.println("\n\nThe Weight of the TSP is : "+count);
    }
 
    public static void main(String... arg)
    {
        try
        {
            System.out.println("Enter the number of nodes in the graph");
           
            Scanner scanner = new Scanner(System.in);
            int number_of_nodes = scanner.nextInt();
     
            int adjacency_matrix[][] = new int[number_of_nodes + 1][number_of_nodes + 1];
            
            System.out.println("Enter the adjacency matrix");
            for (int i = 1; i <= number_of_nodes; i++)
            {
                for (int j = 1; j <= number_of_nodes; j++)
                {
                    adjacency_matrix[i][j] = scanner.nextInt();
                }
            }
            for (int i = 1; i <= number_of_nodes; i++)
            {
                for (int j = 1; j <= number_of_nodes; j++)
                {
                    if (adjacency_matrix[i][j] == 1 && adjacency_matrix[j][i] == 0)
                    {
                        adjacency_matrix[j][i] = 1;
                    }
                }
            }
            System.out.println("\nthe citys are visited as follows : ");
            TravellingSalesmanProblem tspNearestNeighbour = new TravellingSalesmanProblem();
            tspNearestNeighbour.tsp(adjacency_matrix);
        } catch (InputMismatchException inputMismatch)
         {
             System.out.println("Wrong Input format");
         }
    }
}