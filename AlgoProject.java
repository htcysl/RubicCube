
import java.util.List;

public class AlgoProject {
    public static void main(String[] args) {
       //        // Goal state 
//        RubikCube obj = new RubikCube(CellState.b,CellState.b,CellState.b,CellState.b, // 0. face 
//                                      CellState.g,CellState.g,CellState.g,CellState.g, // 1. face  
//                                      CellState.o,CellState.o,CellState.o,CellState.o, // 2. face 
//                                      CellState.r,CellState.r,CellState.r,CellState.r, // 3. face
//                                      CellState.w,CellState.w,CellState.w,CellState.w, // 4. face
//                                      CellState.y,CellState.y, CellState.y,CellState.y) ; //5.face 
//        obj.bfs();
       
//        
//       System.out.println("\nOne steps before the goal state :");   
//       RubikCube obj1 = new RubikCube(CellState.w,CellState.w,CellState.w,CellState.w, // 0. face 
//                                      CellState.o,CellState.b,CellState.o,CellState.b, // 1. face  
//                                      CellState.y,CellState.y,CellState.y,CellState.y, // 2. face 
//                                      CellState.g,CellState.r,CellState.g,CellState.r, // 3. face
//                                      CellState.r,CellState.r,CellState.b,CellState.b, // 4. face
//                                      CellState.o,CellState.o, CellState.g,CellState.g); //5. face 
//     
//        obj1.bfs();
        

//        System.out.println("\nTwo steps before the goal state :");
//        RubikCube obj2 = new RubikCube(CellState.g,CellState.g,CellState.b,CellState.b, // 0. face 
//                                      CellState.w,CellState.w,CellState.y,CellState.y, // 1. face  
//                                      CellState.b,CellState.b,CellState.g,CellState.g, // 2. face 
//                                      CellState.y,CellState.y,CellState.w,CellState.w, // 3. face
//                                      CellState.r,CellState.r,CellState.r,CellState.r, // 4. face
//                                      CellState.o,CellState.o, CellState.o,CellState.o) ; // 5. face 
//        
//        
//       obj2.bfs();
//       
       
       System.out.println("\nFive steps before the goal state :");
       RubikCube obj5 = new RubikCube(CellState.y,CellState.r,CellState.o,CellState.b, // 0. face 
                                      CellState.w,CellState.g,CellState.o,CellState.y, // 1. face  
                                      CellState.w,CellState.r,CellState.g,CellState.y, // 2. face 
                                      CellState.b,CellState.r,CellState.o,CellState.w, // 3. face
                                      CellState.y,CellState.r,CellState.g,CellState.b, // 4. face
                                      CellState.b,CellState.o, CellState.g,CellState.w) ; // 5. face 
        
        
         obj5.bfs();
        
        

//       System.out.println("\nSix steps before the goal state :");
//       RubikCube obj6 = new RubikCube(CellState.b,CellState.y,CellState.g,CellState.g, // 0. face 
//                                      CellState.b,CellState.y,CellState.w,CellState.r, // 1. face  
//                                      CellState.o,CellState.b,CellState.b,CellState.r, // 2. face 
//                                      CellState.y,CellState.o,CellState.w,CellState.r, // 3. face
//                                      CellState.r,CellState.g,CellState.w,CellState.o, // 4. face
//                                      CellState.g,CellState.w, CellState.y,CellState.o) ; // 5. face 
//        
//        
//         obj6.bfs();
//        

//       System.out.println("\nSeven steps before the goal state :");
//       RubikCube obj7 = new RubikCube(CellState.b,CellState.y,CellState.w,CellState.r, // 0. face 
//                                      CellState.b,CellState.y,CellState.b,CellState.r, // 1. face  
//                                      CellState.o,CellState.b,CellState.w,CellState.r, // 2. face 
//                                      CellState.y,CellState.o,CellState.g,CellState.g, // 3. face
//                                      CellState.r,CellState.g,CellState.w,CellState.o, // 4. face
//                                      CellState.y,CellState.g, CellState.o,CellState.w) ; // 5. face 
//        
//        
//         obj7.bfs();


//       System.out.println("\nEight steps before the goal state :");
//       RubikCube obj8 = new RubikCube(CellState.y,CellState.o,CellState.w,CellState.r, // 0. face 
//                                      CellState.b,CellState.y,CellState.b,CellState.r, // 1. face  
//                                      CellState.b,CellState.y,CellState.w,CellState.r, // 2. face 
//                                      CellState.o,CellState.b,CellState.g,CellState.g, // 3. face
//                                      CellState.g,CellState.o,CellState.r,CellState.w, // 4. face
//                                      CellState.y,CellState.g,CellState.o,CellState.w) ; // 5. face 
//        
//        
//         obj8.bfs();


       System.out.println("\nNine steps before the goal state :");
       RubikCube obj9 = new RubikCube(CellState.y,CellState.o,CellState.w,CellState.r, // 0. face 
                                      CellState.b,CellState.g,CellState.b,CellState.o, // 1. face  
                                      CellState.y,CellState.r,CellState.b,CellState.w, // 2. face 
                                      CellState.y,CellState.b,CellState.g,CellState.g, // 3. face
                                      CellState.g,CellState.o,CellState.r,CellState.w, // 4. face
                                      CellState.r,CellState.y,CellState.o,CellState.w) ; // 5. face 
        
        
         obj9.bfs();

    }
        
        
    }

}
