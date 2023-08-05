
import java.util.*;

public class adjMatrix{
    private boolean adjMatrix[][];
    private int numVertices;

    public adjMatrix(int numVertices){
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = true;
        adjMatrix[j][i] = true;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = false;
        adjMatrix[j][i] = false;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numVertices; i++) {
          s.append(i + ": ");
          for (boolean j : adjMatrix[i]) {
            s.append((j ? 1 : 0) + " ");
          }
          s.append("\n");
        }
        return s.toString();
      }

}

