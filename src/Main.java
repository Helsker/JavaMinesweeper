public class Main
{
    public static void main (String[] args)
    {
        int x = 50;		//Width of the board
        int y = 50;		//Height of the board
        int d = 25;		//The difficulty of the game, the percentage of mines in the board. The number of mines per board is random, but this number is the probability that a cell will become
        //a mine.

        new Minesweeper(x, y, d);
    }
}