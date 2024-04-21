package Project.TicTacToe.Controller.Service.WinningStrategy;

import Project.TicTacToe.Controller.Model.Board;
import Project.TicTacToe.Controller.Model.Move;
import Project.TicTacToe.Controller.Model.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
