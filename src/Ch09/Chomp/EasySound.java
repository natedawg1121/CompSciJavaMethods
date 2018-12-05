package Ch09.Chomp;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * @author Gary Litvin
 * @version 1.8, 01/01/15
 * <p>
 * Appendix to:
 * <p>
 * <i>Java Methods: Object-Oriented Programming and Data Structures</i>, 3rd AP Edition<br>
 * (Skylight Publishing 2015, ISBN 978-0-9824775-6-4)
 * <p>
 * EasySound provides a simple way od playing a sound in an application.
   <pre>
   
   Example:
   =======
 
       EasySound bells = new EasySound("bells.wav");
       bells.play();

    </pre>
 */

public class EasySound
{
  private SourceDataLine line = null;
  private byte[] audioBytes;
  private int numBytes;

  /**
   * Constructs an <code>EasySound</code> for a given audio file.
   * @param fileName the name or pathname of the audio clip file.
   */
  public EasySound(String fileName)
  {
    File  soundFile = new File(fileName);
    AudioInputStream audioInputStream = null;
    try
    {
      audioInputStream = AudioSystem.getAudioInputStream(soundFile);
    }
    catch (Exception ex)
    {
      System.out.println("*** Cannot find " + fileName + " ***");
      System.exit(1);
    }

    AudioFormat audioFormat = audioInputStream.getFormat();
    DataLine.Info info = new DataLine.Info(SourceDataLine.class,
                         audioFormat);
    try
    {
      line = (SourceDataLine)AudioSystem.getLine(info);
      line.open(audioFormat);
    }
    catch (LineUnavailableException ex)
    {
      System.out.println("*** Audio line unavailable ***");
      System.exit(1);
    }

    line.start();

    audioBytes = new byte[(int)soundFile.length()];

    try
    {
      numBytes = audioInputStream.read(audioBytes, 0, audioBytes.length);
    }
    catch (IOException ex)
    {
      System.out.println("*** Cannot read " + fileName + " ***");
      System.exit(1);
    }
  }

  /**
   * Plays this <code>EasySound</code>.
   */
  public void play()
  {
    line.write(audioBytes, 0, numBytes);
  }
}
