/* The following code was generated by JFlex 1.4.2 on 07/12/13 23:35 */

import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on 07/12/13 23:35 from the specification file
 * <tt>D:/FAC/Master/Compilation/compilation/Dmcompilation/lexer/tree.jflex</tt>
 */
class MyLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\0\26\0\1\45\4\0\1\40\1\0\1\36\1\37\1\6"+
    "\1\35\1\0\1\4\1\2\1\5\12\10\1\0\1\46\1\44\1\43"+
    "\1\42\2\0\4\7\1\3\25\7\6\0\1\12\1\16\1\27\1\26"+
    "\1\25\1\21\1\24\1\30\1\13\2\7\1\20\1\11\1\14\1\17"+
    "\2\7\1\31\1\23\1\15\1\22\1\7\1\32\3\7\1\33\1\41"+
    "\1\34\u05e2\0\12\1\206\0\12\1\u026c\0\12\1\166\0\12\1\166\0"+
    "\12\1\166\0\12\1\166\0\12\1\167\0\11\1\166\0\12\1\166\0"+
    "\12\1\166\0\12\1\340\0\12\1\166\0\12\1\106\0\12\1\u0116\0"+
    "\12\1\u031f\0\11\1\u046e\0\12\1\46\0\12\1\u012c\0\12\1\ue5c0\0"+
    "\12\1\346\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\11\3"+
    "\1\7\1\10\1\11\1\12\1\13\2\1\1\14\1\15"+
    "\1\16\1\17\1\20\2\0\1\3\1\21\1\0\2\3"+
    "\1\22\10\3\1\23\1\24\1\25\1\0\1\26\2\2"+
    "\3\0\1\3\1\27\1\3\1\30\6\3\1\31\1\0"+
    "\1\32\1\33\3\3\1\34\1\35\1\3\1\36\2\3"+
    "\1\37\1\3\1\40\1\3\1\41";

  private static int [] zzUnpackAction() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\47\0\116\0\165\0\234\0\303\0\47\0\352"+
    "\0\u0111\0\u0138\0\u015f\0\u0186\0\u01ad\0\u01d4\0\u01fb\0\u0222"+
    "\0\47\0\47\0\47\0\47\0\47\0\u0249\0\u0270\0\u0297"+
    "\0\47\0\u02be\0\47\0\47\0\u02e5\0\u030c\0\u0333\0\47"+
    "\0\u035a\0\u0381\0\u03a8\0\165\0\u03cf\0\u03f6\0\u041d\0\u0444"+
    "\0\u046b\0\u0492\0\u04b9\0\u04e0\0\47\0\47\0\47\0\u0507"+
    "\0\47\0\u052e\0\u0555\0\u0555\0\u057c\0\u05a3\0\u05ca\0\165"+
    "\0\u05f1\0\165\0\u0618\0\u063f\0\u0666\0\u068d\0\u06b4\0\u06db"+
    "\0\47\0\u0702\0\165\0\165\0\u0729\0\u0750\0\u0777\0\165"+
    "\0\165\0\u079e\0\165\0\u07c5\0\u07ec\0\165\0\u0813\0\165"+
    "\0\u083a\0\165";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\4"+
    "\1\3\1\10\1\4\1\11\2\4\1\12\2\4\1\13"+
    "\1\14\1\15\1\4\1\16\1\4\1\17\2\4\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\50\0\1\3\1\35\1\36"+
    "\4\0\1\3\14\0\1\36\24\0\1\4\3\0\1\4"+
    "\1\37\22\4\56\0\1\40\12\0\1\41\43\0\1\4"+
    "\3\0\1\4\1\37\1\4\1\42\20\4\17\0\1\4"+
    "\3\0\1\4\1\37\3\4\1\43\4\4\1\44\11\4"+
    "\17\0\1\4\3\0\1\4\1\37\6\4\1\45\13\4"+
    "\17\0\1\4\3\0\1\4\1\37\6\4\1\46\1\47"+
    "\12\4\17\0\1\4\3\0\1\4\1\37\3\4\1\50"+
    "\16\4\17\0\1\4\3\0\1\4\1\37\4\4\1\51"+
    "\15\4\17\0\1\4\3\0\1\4\1\37\7\4\1\52"+
    "\12\4\17\0\1\4\3\0\1\4\1\37\17\4\1\53"+
    "\2\4\17\0\1\4\3\0\1\4\1\37\17\4\1\54"+
    "\2\4\54\0\1\55\47\0\1\56\50\0\1\57\7\0"+
    "\1\60\36\0\1\61\4\0\1\62\6\0\1\62\37\0"+
    "\1\63\2\0\1\64\3\0\1\63\24\0\1\64\21\0"+
    "\1\37\36\0\6\65\1\66\40\65\3\0\1\4\3\0"+
    "\1\4\1\37\2\4\1\67\17\4\17\0\1\4\3\0"+
    "\1\4\1\37\4\4\1\70\15\4\17\0\1\4\3\0"+
    "\1\4\1\37\6\4\1\71\13\4\17\0\1\4\3\0"+
    "\1\4\1\37\20\4\1\72\1\4\17\0\1\4\3\0"+
    "\1\4\1\37\6\4\1\73\13\4\17\0\1\4\3\0"+
    "\1\4\1\37\12\4\1\74\7\4\17\0\1\4\3\0"+
    "\1\4\1\37\20\4\1\75\1\4\17\0\1\4\3\0"+
    "\1\4\1\37\12\4\1\76\7\4\17\0\1\4\3\0"+
    "\1\4\1\37\1\4\1\77\20\4\17\0\1\4\3\0"+
    "\1\4\1\37\2\4\1\100\17\4\56\0\1\101\5\0"+
    "\1\62\1\0\1\36\4\0\1\62\14\0\1\36\22\0"+
    "\1\63\6\0\1\63\36\0\6\65\1\102\40\65\5\0"+
    "\1\2\1\66\43\0\1\4\3\0\1\4\1\37\3\4"+
    "\1\103\16\4\17\0\1\4\3\0\1\4\1\37\7\4"+
    "\1\104\12\4\17\0\1\4\3\0\1\4\1\37\1\4"+
    "\1\105\20\4\17\0\1\4\3\0\1\4\1\37\2\4"+
    "\1\106\17\4\17\0\1\4\3\0\1\4\1\37\2\4"+
    "\1\107\17\4\17\0\1\4\3\0\1\4\1\37\14\4"+
    "\1\110\5\4\17\0\1\4\3\0\1\4\1\37\20\4"+
    "\1\111\1\4\17\0\1\4\3\0\1\4\1\37\7\4"+
    "\1\112\12\4\14\0\5\65\1\2\1\102\40\65\3\0"+
    "\1\4\3\0\1\4\1\37\4\4\1\113\15\4\17\0"+
    "\1\4\3\0\1\4\1\37\13\4\1\114\6\4\17\0"+
    "\1\4\3\0\1\4\1\37\3\4\1\115\16\4\17\0"+
    "\1\4\3\0\1\4\1\37\14\4\1\116\5\4\17\0"+
    "\1\4\3\0\1\4\1\37\3\4\1\117\16\4\17\0"+
    "\1\4\3\0\1\4\1\37\13\4\1\120\6\4\17\0"+
    "\1\4\3\0\1\4\1\37\14\4\1\121\5\4\17\0"+
    "\1\4\3\0\1\4\1\37\15\4\1\122\4\4\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2145];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\11\1\5\11\3\1\1\11"+
    "\1\1\2\11\2\0\1\1\1\11\1\0\13\1\3\11"+
    "\1\0\1\11\2\1\3\0\12\1\1\11\1\0\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[82];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MyLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  MyLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.DIVIDE, yyline, yycolumn);
          }
        case 34: break;
        case 15: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.NON, yyline, yycolumn);
          }
        case 35: break;
        case 29: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.CHAR, yyline, yycolumn);
          }
        case 36: break;
        case 13: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.EQ, yyline, yycolumn);
          }
        case 37: break;
        case 3: 
          { System.err.println(" Symbole id: " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.ID, yyline, yycolumn, new String(yytext()));
          }
        case 38: break;
        case 31: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.WHILE, yyline, yycolumn);
          }
        case 39: break;
        case 2: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
				return new Symbol(TreeSymbol.NUMBER, yyline, yycolumn, new Float(yytext()));
          }
        case 40: break;
        case 6: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.TIMES, yyline, yycolumn);
          }
        case 41: break;
        case 23: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.INT, yyline, yycolumn);
          }
        case 42: break;
        case 33: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 			return new Symbol(TreeSymbol.UNSIGNED, yyline, yycolumn);
          }
        case 43: break;
        case 28: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
		return new Symbol(TreeSymbol.IF, yyline, yycolumn);
          }
        case 44: break;
        case 7: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
	return new Symbol(TreeSymbol.LACC, yyline, yycolumn);
          }
        case 45: break;
        case 10: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.LPAR, yyline, yycolumn);
          }
        case 46: break;
        case 30: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.FLOAT, yyline, yycolumn);
          }
        case 47: break;
        case 22: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PPE, yyline, yycolumn);
          }
        case 48: break;
        case 17: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.IMP, yyline, yycolumn);
          }
        case 49: break;
        case 18: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.IF, yyline, yycolumn);
          }
        case 50: break;
        case 24: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.FOR, yyline, yycolumn);
          }
        case 51: break;
        case 16: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.SEMIC, yyline, yycolumn);
          }
        case 52: break;
        case 21: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PGE, yyline, yycolumn);
          }
        case 53: break;
        case 32: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 			return new Symbol(TreeSymbol.STRING, yyline, yycolumn);
          }
        case 54: break;
        case 19: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.AND, yyline, yycolumn);
          }
        case 55: break;
        case 26: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.MAIN, yyline, yycolumn);
          }
        case 56: break;
        case 27: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.BOOL, yyline, yycolumn);
          }
        case 57: break;
        case 20: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.OR, yyline, yycolumn);
          }
        case 58: break;
        case 25: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.EQUI, yyline, yycolumn);
          }
        case 59: break;
        case 14: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PPS, yyline, yycolumn);
          }
        case 60: break;
        case 8: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
	return new Symbol(TreeSymbol.RACC, yyline, yycolumn);
          }
        case 61: break;
        case 4: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.MINUS, yyline, yycolumn);
          }
        case 62: break;
        case 12: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PGS, yyline, yycolumn);
          }
        case 63: break;
        case 1: 
          { 
          }
        case 64: break;
        case 11: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.RPAR, yyline, yycolumn);
          }
        case 65: break;
        case 9: 
          { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PLUS, yyline, yycolumn);
          }
        case 66: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(TreeSymbol.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
