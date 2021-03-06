package EasyClasses;

import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * @author Gary Litvin
 * @version 1.8, 01/01/15
 * <p>
 * Appendix to:
 * <p>
 * <i>Java Methods: Object-Oriented Programming and Data Structures</i>, 3rd AP Edition<br>
 * (Skylight Publishing 2015, ISBN 978-0-9824775-6-4)
 * <p>
 * EasyReader provides simple methods for reading keyboard input and
 * text files.  All exceptions are handled inside the class and are
 * hidden from the user.
   <pre>
   
   Example:
   =======
 
       EasyReader kboard = new EasyReader();
       System.out.print("Enter input file name: ");
       String fileName = kboard.readLine();

       EasyReader inputFile = new EasyReader(fileName);
       if (inputFile.bad())
       {
         System.err.println("*** Cannot open " + fileName + " ***");
         System.exit(1);
       }

       String firstLine = inputFile.readLine();
       if (!inputFile.eof())   // or:  if (firstLine != null)
         System.out.println("The first line is : " + firstLine);

       System.out.print("Enter the maximum number of integers to read: ");
       int maxCount = kboard.readInt();
       int count = 0;

       while (count < maxCount && !inputFile.eof())
       {
         int k = inputFile.readInt();
         if (!inputFile.eof())
         {
           // process or store this number
           count++;
         }
       }

       inputFile.close();    // optional
       System.out.println(count + " numbers read");

    </pre>
 */

public class EasyReader
{
  private String myFileName;
  private BufferedReader myInFile;
  private int myErrorFlags = 0;
  private static final int OPENERROR = 0x0001;
  private static final int CLOSEERROR = 0x0002;
  private static final int READERROR = 0x0004;
  private static final int EOF = 0x0100;

  /**
   * Constructs an <code>EasyReader</code> associated with
   * <code>System.in</code>.
   */
  public EasyReader()
  {
    myFileName = null;
    myErrorFlags = 0;
    myInFile = new BufferedReader(
                            new InputStreamReader(System.in), 128);
  }

  /**
   * Constructs an <code>EasyReader</code> associated with a file for reading.
   * @param fileName the name or pathname of the file.
   */
  public EasyReader(String fileName)
  {
    myFileName = fileName;
    myErrorFlags = 0;
    try
    {
      myInFile = new BufferedReader(new FileReader(fileName), 1024);
    }
    catch (FileNotFoundException e)
    {
      myErrorFlags |= OPENERROR;
      myFileName = null;
    }
  }

  /**
   * Closes the file.
   */
  public void close()
  {
    if (myFileName == null)
      return;
    try
    {
      myInFile.close();
    }
    catch (IOException e)
    {
      System.err.println("Error closing " + myFileName + "\n");
      myErrorFlags |= CLOSEERROR;
    }
  }

  /**
   * Checks the status of the file.
   * @return true if an error occurred when opening or reading the file;
   * false otherwise.
   */
  public boolean bad()
  {
    return myErrorFlags != 0;
  }

  /**
   * Checks the EOF status of the file.
   * @return true if EOF was encountered in the previous read
   * operation; false otherwise.
   */
  public boolean eof()
  {
    return (myErrorFlags & EOF) != 0;
  }

  private boolean ready() throws IOException
  {
    return myFileName == null || myInFile.ready();
  }

  /**
   * Reads the next character from the file (any character including
   * a space or a newline character).
   * @return the character read or <code>null</code> character
   * (Unicode 0) if trying to read beyond the EOF.
   */
  public char readChar()
  {
    char ch = '\u0000';

    try
    {
      if (ready())
      {
         ch = (char)myInFile.read();
      }
    }
    catch (IOException e)
    {
      if (myFileName != null)
        System.err.println("Error reading " + myFileName + "\n");
      myErrorFlags |= READERROR;
    }

    if (ch == '\u0000')
      myErrorFlags |= EOF;

    return ch;
  }

  /**
   * Reads from the current position in the file up to and including
   * the next newline character.  The newline character is thrown away.
   * @return the string read (excluding the newline character) or
   * null, if trying to read beyond the EOF.
   */
  public String readLine()
  {
    String s = null;

    try
    {
      s = myInFile.readLine();
    }
    catch (IOException e)
    {
      if (myFileName != null)
        System.err.println("Error reading " + myFileName + "\n");
      myErrorFlags |= READERROR;
    }

    if (s == null)
      myErrorFlags |= EOF;
    return s;
  }

  /**
   * Skips whitespace and reads the next word (a contiguous string of
   * non-whitespace characters), up to but excluding the next space,
   * newline, etc.
   * @return the string read or null, if trying to read beyond the EOF.
   */
  public String readWord()
  {
    StringBuffer buffer = new StringBuffer(128);
    char ch = ' ';
    int count = 0;
    String s = null;

    try
    {
      while (ready() && Character.isWhitespace(ch))
        ch = (char)myInFile.read();
      while (ready() && !Character.isWhitespace(ch))
      {
        count++;
        buffer.append(ch);
        myInFile.mark(1);
        ch = (char)myInFile.read();
      };

      if (count > 0)
      {
        myInFile.reset();
        s = buffer.toString();
      }
      else
      {
        myErrorFlags |= EOF;
      }
    }

    catch (IOException e)
    {
      if (myFileName != null)
        System.err.println("Error reading " + myFileName + "\n");
      myErrorFlags |= READERROR;
    }

    return s;
  }

  /**
   * Reads the next integer (without validating its format).
   * @return the integer read or 0 if, trying to read beyond the EOF,
   * or if the read word does not represent a valid integer.
   */
  public int readInt()
  {
    int result = 0;
    String s = readWord();

    if (s != null)
    {
      try
      {
        result = Integer.parseInt(s);
      }
      catch (NumberFormatException ex)
      {
      }
    }

    return result;
  }

  /**
   * Reads the next double (without validating its format).
   * @return the number read or <code>Double.NaN</code>, if trying to read
   * beyond the EOF, or if the token read does not represent a valid double.
   */
  public double readDouble()
  {
    double result = Double.NaN;

    String s = readWord();
    if (s != null)
    {
      try
      {
        result = Double.parseDouble(s);
      }
      catch (NumberFormatException ex)
      {
      }
    }
    return result;
  }
}

