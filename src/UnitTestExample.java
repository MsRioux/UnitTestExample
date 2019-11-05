public class UnitTestExample
{
    private String someString;
    private int someNum, anothNum;

    public UnitTestExample(String someString, int someNum, int anothNum)
    {
        this.someNum = someNum;
        this.someString = someString;
        this.anothNum = anothNum;
    }//end constructor

    public UnitTestExample(int someNum, int anothNum)
    {
        this.anothNum = anothNum;
        this.someNum = someNum;
        someString = null;
    }//end constructor to be used when only need the two numbers

    public int getSomeNum()
    {
        return someNum;
    }

    //brain method : if
    public boolean simpleIfNumsEqual()
    {
        if(someNum == anothNum)
            return true;
        return false;
    }


    @Override
    public String toString()
    {
        return someString + " " + someNum + " " + anothNum;
    }
}
