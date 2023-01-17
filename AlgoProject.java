
import java.util.List;

public class AlgoProject {
    public static void main(String[] args) {
        RubikCube obj = new RubikCube(CellState.b,CellState.b,CellState.b,CellState.b, // 0. face 
                                      CellState.g,CellState.g,CellState.g,CellState.g, // 1. face  
                                      CellState.o,CellState.o,CellState.o,CellState.o, // 2. face 
                                      CellState.r,CellState.r,CellState.r,CellState.r, // 3. face
                                      CellState.w,CellState.w,CellState.w,CellState.w, // 4. face
                                      CellState.y,CellState.y, CellState.y,CellState.y) ; //5.face

        System.out.println(obj);
    }

}