package gameoflife;
/*
RULES FOR CONWAY'S GAME OF LIFE
1. Any live cell with fewer than two live neighbors dies, as if caused by underpopulation.
2. Any live cell with more than three live neighbors dies, as if by overcrowding.
3. Any live cell with two or three live neighbors lives on to the next generation.
4. Any dead cell with exactly three live neighbors becomes a live cell.
*/

public class Cell {

  private CellState state;

  public Cell(CellState state){
    this.state = state;
  }

  public CellState GetNextState(int i) {
    //if i is higher than 1 cell is alive
    //else cell is dead
    return i > 1 && i < 4 ? CellState.alive : CellState.dead;
  }

  //TRY change to a boolean
  public enum CellState{
    alive, dead
  }


}
