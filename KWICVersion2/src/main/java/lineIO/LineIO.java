package lineIO;

import lineManager.LineManager;

import java.io.File;

public class LineIO {

    private LineManager theManager;
    private File theFile;
    private static final String fileName = "myfile.txt";

    public LineIO(LineManager manager) {

        theManager = manager;

        theFile = new File(fileName);
    }

    public void readLines() {

        /*
        open file
        while (!endOFFile) {
            read in a line
            theManager.addLine(line)
        }
        close file
        */
    }

    public void writeLines() {

        /* open file
           for(int i = 0; i < theManager.getNumLines(); i++) {
                do something
           }
           close file
        */
    }
}
