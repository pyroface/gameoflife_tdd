package gameoflife;

import gameoflife.Cell.CellState;
import org.junit.Test;
import static org.junit.Assert.*;

public class CellTest {

  //RULE 1: Cell with less than two neighbors
  //will die of underpopulation
  @Test
  public void ShouldDieWithOneNeighbor(){
    Cell cell = new Cell(Cell.CellState.alive);

    //Cell.CellState actual = cell.GetNextState(1);
    //i = amount of neighbors
    CellState actual = cell.GetNextState(1);

    assertEquals(Cell.CellState.dead, actual);
  }
  @Test
  public void ShouldDieWithNoNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);

    //i = amount of neighbors
    CellState actual = cell.GetNextState(0);

    assertEquals(Cell.CellState.dead, actual);
  }
  //RULE 1 END

}
