public class Lottery {
    private String lotteryNumber;

    public Lottery()
    {
        lotteryNumber = String.valueOf((int)(Math.random()*100));
        if (lotteryNumber.equals("0") || lotteryNumber.equals("1") || lotteryNumber.equals("2") || lotteryNumber.equals("3") || lotteryNumber.equals("4") || lotteryNumber.equals("5") || lotteryNumber.equals("6") || lotteryNumber.equals("7") || lotteryNumber.equals("8") || lotteryNumber.equals("9"))
        {
            lotteryNumber = "0" + lotteryNumber;
        }
    }
    public String toString()
    {
        return "The lottery number is " + lotteryNumber;
    }
    public int determineWinnings(String userNumber)
    {
        if (userNumber.equals(String.valueOf(lotteryNumber)))
        {
            return 100;
        }
        if ((userNumber.substring(1)+userNumber.substring(0,1)).equals(String.valueOf(lotteryNumber)))
        {
            return 10;
        }
        if (userNumber.substring(0,1).equals(String.valueOf(lotteryNumber).substring(0,1)) ||
                userNumber.substring(1).equals(String.valueOf(lotteryNumber).substring(0,1)) ||
                userNumber.substring(0,1).equals(String.valueOf(lotteryNumber).substring(1)) ||
                userNumber.substring(1).equals(String.valueOf(lotteryNumber).substring(1)) )
        {
            return 3;
        }
        else
        {
            return 0;
        }
    }
    public String getWinMessage(int moneyWon)
    {
        if (moneyWon == 100)
        {
            return "Exact match:  You win $100!";
        }
        if (moneyWon == 10)
        {
            return "Match all digits but not in correct order:  You win $10!";
        }
        if (moneyWon == 3)
        {
            return "Match one digit: you win $3!";
        }
        else
        {
            return "No matching numbers, you win nothing :(";
        }
    }
}
