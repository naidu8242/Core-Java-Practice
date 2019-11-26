package parties;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Bytes2StringTest {

  /**
   * @param args
   */
  public static void main(String[] args) {

    long sizeInBytes = 786;
    System.out.println(sizeInBytes + " Bytes = " + bytes2String(sizeInBytes));
    
    sizeInBytes = 456321;
    System.out.println(sizeInBytes + " Bytes = " + bytes2String(sizeInBytes));
    
    sizeInBytes = 896789489;
    System.out.println(sizeInBytes + " Bytes = " + bytes2String(sizeInBytes));
    
    sizeInBytes = 989678948985L;
    System.out.println(sizeInBytes + " Bytes = " + bytes2String(sizeInBytes));
    
    sizeInBytes = 1698296768946289482L;
    System.out.println(sizeInBytes + " Bytes = " + bytes2String(sizeInBytes));
  }

  public static final double SPACE_KB = 1024;
  public static final double SPACE_MB = 1024 * SPACE_KB;
  public static final double SPACE_GB = 1024 * SPACE_MB;
  public static final double SPACE_TB = 1024 * SPACE_GB;

  public static String bytes2String(long sizeInBytes) {

    NumberFormat nf = new DecimalFormat();
    nf.setMaximumFractionDigits(2);

    try {
      if ( sizeInBytes < SPACE_KB ) {
        return nf.format(sizeInBytes) + " Byte(s)";
      } else if ( sizeInBytes < SPACE_MB ) {
        return nf.format(sizeInBytes/SPACE_KB) + " KB";
      } else if ( sizeInBytes < SPACE_GB ) {
        return nf.format(sizeInBytes/SPACE_MB) + " MB";
      } else if ( sizeInBytes < SPACE_TB ) {
        return nf.format(sizeInBytes/SPACE_GB) + " GB";
      } else {
        return nf.format(sizeInBytes/SPACE_TB) + " TB";
      }          
    } catch (Exception e) {
      return sizeInBytes + " Byte(s)";
    }

  }/* end of bytes2String method */
}