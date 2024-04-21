package Project.TicTacToe.Controller.Model;

import Project.TicTacToe.Controller.Model.*;
import Project.TicTacToe.Controller.Service.BotPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;

    public Bot(int id, char symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, "CHITTI", symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board){
        return BotPlayingStrategyFactory.getBotPlayingStrategy().makeMove(board, this);
    }
}