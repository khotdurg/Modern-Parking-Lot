package Project.TicTacToe.Controller.Service.BotPlayingStrategy;

import Project.TicTacToe.Controller.Model.Board;
import Project.TicTacToe.Controller.Model.Move;
import Project.TicTacToe.Controller.Model.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
