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