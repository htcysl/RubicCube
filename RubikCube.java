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

}