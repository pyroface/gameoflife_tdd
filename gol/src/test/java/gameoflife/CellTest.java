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
    CellState a = cell.GetNextState(1);
    assertEquals(Cell.CellState.dead, a);
  }
  @Test
  public void ShouldDieWithNoNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    //i = amount of neighbors
    CellState a = cell.GetNextState(0);
    assertEquals(Cell.CellState.dead, a);
  }
  //RULE 1 END

  //RULE 2. Any live cell with two or three live neighbors lives on to the next generation.
  @Test
  public void ShouldLiveWithTwoNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    //i = amount of neighbors
    //taking in two neighbors
    CellState a = cell.GetNextState(2);
    assertEquals(Cell.CellState.alive, a);
  }
  @Test
  public void ShouldLiveWithThreeNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    //i = amount of neighbors
    CellState a = cell.GetNextState(3);
    assertEquals(Cell.CellState.alive, a);
  }
  //RULE 2 END

  //RULE 3. Any live cell with more than three live neighbors dies, as if by overcrowding.
  @Test
  public void ShouldDieWithFourNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    //i = amount of neighbors
    CellState a = cell.GetNextState(4);
    assertEquals(Cell.CellState.dead, a);
  }
  @Test
  public void ShouldDieWithFiveNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    //i = amount of neighbors
    CellState a = cell.GetNextState(5);
    assertEquals(Cell.CellState.dead, a);
  }
  /*
    These tests can be repeated to work for any amount
    of neighbors in a 3x3 grid. Max number is 8 neighbors.
   */
  //RULE 3 END

  //RULE 4. Any dead cell with exactly three live neighbors becomes a live cell.
  @Test
  public void WillStartLivingWithThreeNeighbors(){
    Cell cell = new Cell(Cell.CellState.alive);
    CellState a = cell.GetNextState(3);
    assertEquals(Cell.CellState.alive, a);
  }
}
