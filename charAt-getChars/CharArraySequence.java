  public class CharArraySequence implements CharSequence {

  private final char[] buff;
  private final int offset;
  private final int count;

  /**
   * @param buff
   */
  public CharArraySequence(char[] buff) {
    this(buff, 0, buff.length);
  }

  /**
   * @param buff
   * @param count
   */
  public CharArraySequence(char[] buff, int count) {
    this(buff, 0, count);
  }

  /**
   * @param buff
   * @param offset
   * @param count
   */
  public CharArraySequence(char[] buff, int offset, int count) {
    this.buff = buff;
    this.offset = offset;
    this.count = count;
  }

  /*
   * @see java.lang.CharSequence#charAt(int)
   */
  public char charAt(int index) {
    if (index < 0 || index >= count) {
      throw new StringIndexOutOfBoundsException(index);
    }
    return buff[offset + index];
  }

  /*
   * @see java.lang.CharSequence#length()
   */
  public int length() {
    return count;
  }

  /*
   * @see java.lang.CharSequence#subSequence(int, int)
   */
  public CharSequence subSequence(int beginIndex, int endIndex) {
    if (beginIndex < 0) {
      throw new StringIndexOutOfBoundsException(beginIndex);
    }
    if (endIndex > count) {
      throw new StringIndexOutOfBoundsException(endIndex);
    }
    if (beginIndex > endIndex) {
      throw new StringIndexOutOfBoundsException(endIndex - beginIndex);
    }
    return ((beginIndex == 0) && (endIndex == count)) ? this
        : new CharArraySequence(buff, offset + beginIndex, endIndex
            - beginIndex);
  }

  public String toString() {
    return new String(this.buff, this.offset, this.count);
  }
 }