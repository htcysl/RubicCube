import java.lang.Thread.State;
import java.util.*;

enum CellState {
    r, g, w, b, o, y
};

public class RubikCube {

    public CellState[][] state;
    public RubikCube parent;

    public RubikCube() {

        state = new CellState[][] { // front counterclockwise one direction
                { CellState.r, CellState.b, CellState.y, CellState.o },
                { CellState.w, CellState.r, CellState.g, CellState.y },
                { CellState.b, CellState.r, CellState.o, CellState.w },
                { CellState.y, CellState.b, CellState.g, CellState.o },
                { CellState.g, CellState.y, CellState.w, CellState.o },
                { CellState.r, CellState.b, CellState.g, CellState.w }
        };
        this.parent = null;
    }

    public RubikCube(CellState flu, CellState fru, CellState fld, CellState frd, // 0. face
            CellState rlu, CellState rru, CellState rld, CellState rrd, // 1. face
            CellState blu, CellState bru, CellState bld, CellState brd, // 2. face
            CellState llu, CellState lru, CellState lld, CellState lrd, // 3. face
            CellState tlu, CellState tru, CellState tld, CellState trd, // 4. face
            CellState btlu, CellState btru, CellState btld, CellState btrd) { // constructor method

        state = new CellState[][] { { flu, fru, fld, frd }, { rlu, rru, rld, rrd },
                { blu, bru, bld, brd }, { llu, lru, lld, lrd },
                { tlu, tru, tld, trd, }, { btlu, btru, btld, btrd } };
        this.parent = null;
    }

    // front quadrant, clockwise direction 
    public RubikCube frontQuadrupleClockWise() {

 

        return new RubikCube(this.state[0][2], this.state[0][0], this.state[0][3], this.state[0][1],
                this.state[4][2], this.state[1][1], this.state[4][3], this.state[1][3],
                this.state[2][0], this.state[2][1], this.state[2][2], this.state[2][3],
                this.state[3][0], this.state[5][2], this.state[3][2], this.state[5][3],
                this.state[4][0], this.state[4][1], this.state[3][3], this.state[3][1],
                this.state[5][0], this.state[5][1], this.state[1][2], this.state[1][0]);
    }
  // front quadrant, counterclockwise direction
    public RubikCube frontQuadrupleCounterClockWise() {

 

        return new RubikCube(this.state[0][1], this.state[0][3], this.state[0][0], this.state[0][2],
                this.state[5][3], this.state[1][1], this.state[5][2], this.state[1][3],
                this.state[2][0], this.state[2][1], this.state[2][2], this.state[2][3],
                this.state[3][0], this.state[4][3], this.state[3][2], this.state[4][2],
                this.state[4][0], this.state[4][1], this.state[1][0], this.state[1][2],
                this.state[5][0], this.state[5][1], this.state[3][1], this.state[3][3]);
    }

    // top 4 , clockwise direction
    public RubikCube topQuadrupleClockWise() {
        return new RubikCube(this.state[1][0], this.state[1][1], this.state[0][2], this.state[0][3],
                this.state[2][0], this.state[2][1], this.state[1][2], this.state[1][3],
                this.state[3][0], this.state[3][1], this.state[2][2], this.state[2][3],
                this.state[0][0], this.state[0][1], this.state[3][2], this.state[3][3],
                this.state[4][2], this.state[4][0], this.state[4][3], this.state[4][1],
                this.state[5][0], this.state[5][1], this.state[5][2], this.state[5][3]);
    }
    public RubikCube topQuadrupleCounterClockWise() {
        return new RubikCube(this.state[3][0], this.state[3][1], this.state[0][2], this.state[0][3],
                this.state[0][0], this.state[0][1], this.state[1][2], this.state[1][3],
                this.state[1][0], this.state[1][1], this.state[2][2], this.state[2][3],
                this.state[2][0], this.state[2][1], this.state[3][2], this.state[3][3],
                this.state[4][1], this.state[4][3], this.state[4][0], this.state[4][2],
                this.state[5][0], this.state[5][1], this.state[5][2], this.state[5][3]);
    }
    public RubikCube rightQuadrupleClockWise() {

 

        return new RubikCube(this.state[0][0], this.state[5][3], this.state[0][2], this.state[5][1],
                this.state[1][2], this.state[1][0], this.state[1][3], this.state[1][1],
                this.state[4][3], this.state[2][1], this.state[4][1], this.state[2][3],
                this.state[3][0], this.state[3][1], this.state[3][2], this.state[3][3],
                this.state[4][0], this.state[0][1], this.state[4][2], this.state[0][3],
                this.state[5][0], this.state[2][0], this.state[5][2], this.state[2][2]);
    }

 

    public RubikCube rightQuadrupleCounterClockWise() {

 

        return new RubikCube(this.state[0][0], this.state[4][1], this.state[0][2], this.state[4][3],
                this.state[1][1], this.state[1][3], this.state[1][0], this.state[1][2],
                this.state[5][1], this.state[2][1], this.state[5][3], this.state[2][3], // ? 
                this.state[3][0], this.state[3][1], this.state[3][2], this.state[3][3],
                this.state[4][0], this.state[2][2], this.state[4][2], this.state[2][0],
                this.state[5][0], this.state[0][3], this.state[5][2], this.state[0][1]);
    }
    // bfs search 
    public void bfs() {

        Queue<RubikCube> queue = new LinkedList<RubikCube>(); // for child state  
        HashSet<RubikCube> set = new HashSet<RubikCube>(); // for processed state 

        queue.add(this); // adding initial state to queue
        System.out.println("The initial state: ");
        System.out.println(this.toString());
        
        while (queue.size() > 0) { // while running until queue is empty or goal state is found 
            RubikCube cur = queue.poll();
            
            if (cur.isGoal()) { // checking whether or not goal step    
                System.out.println("Solution list: "); 
                display(cur.getSolution(cur)) ;  // solution sequence 
                     
                System.out.println("Queue: " + queue.size());
                System.out.println("Set: " + set.size());
                return;
            }
             
            set.add(cur);   // processed state is adding to HashSet 
            
            // Runing all methods to take children 
            RubikCube child = cur.frontQuadrupleClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
            child = cur.frontQuadrupleCounterClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
            child = cur.topQuadrupleClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
            child = cur.topQuadrupleCounterClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
            child = cur.rightQuadrupleClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
            child = cur.rightQuadrupleCounterClockWise();
            if (!queue.contains(child) && !set.contains(child)) {
                child.parent = cur ;
                queue.add(child);
            }
        }
    }
    public List<RubikCube> getSolution(RubikCube obj) {
        
        List<RubikCube> list = new ArrayList<>() ;
        list.add(obj) ;
        
        RubikCube tmp=obj.parent  ;
        while(tmp != null) {
            list.add(tmp) ;
            tmp = tmp.parent ;
        }        
        return list ;
    }
    public void display(List<RubikCube> list) {
        
        int n = list.size() ;
        for(int i=n-1;i>=0;i--) {
            System.out.println(list.get(i).toString()) ;
        }
    } 
    
    @Override
    public RubikCube clone() throws CloneNotSupportedException {
        return new RubikCube();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof RubikCube) {
            RubikCube state = (RubikCube) obj;
            for (int y = 0; y < 6; y++) {
                for (int x = 0; x < 4; x++) {
                    if (this.state[y][x] != state.state[y][x]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        long code = 0;

        for (int i = 0; i < 6 * 4; i++) {
            int x = i % 4;
            int y = i / 6;
            code = (code << 2) | (state[y][x].ordinal() + 1);
        }
        return new Long(code).hashCode();
    }
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("[ ") ;
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 4; x++) {
                sb.append(state[y][x].toString());
            }
            sb.append(" ");
        }
         sb.append(" ]") ;
        sb.append("\n----------------------------------------\n");
        return sb.toString();
    }

}
