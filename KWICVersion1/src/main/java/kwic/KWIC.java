package kwic;

import fileio.Filer;

public class KWIC
{
    private static Filer filer = new Filer("myFile.txt");

    public static void main(String[] args)
    {
        //print out menu

        //option 1: circulate the lines in the text file
        filer.circulate();

        //option 2: show current results
        filer.outputResults();

        //option 3: exit
    }
}
