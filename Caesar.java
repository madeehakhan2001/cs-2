package matrices;
import static java.lang.System.*;

public class Caesar implements Cipher
{
	private final String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String shiftSt;
	private int howFar;

	public Caesar()
	{
		howFar = (int)(Math.random()*26);
		shiftSt = alpha.substring(howFar) + alpha.substring(0,howFar);
		
	}

	public Caesar(int far)
	{
		howFar = far;
		shiftSt = alpha.substring(howFar) + alpha.substring(0,howFar);
	}

	public String encode(String toEncode)
	{
		String code = "";
		for ( int let = 0; let < toEncode.length(); let++)
		{
			toEncode = toEncode.toUpperCase();
			char letter = toEncode.charAt(let);
			int place = alpha.indexOf(letter);
			code += shiftSt.charAt(place);
		}
		return code;
	}

	public String decode(String toDecode)
	{
		String code = "";
		for ( int let = 0; let < toDecode.length(); let++)
		{
			char letter = toDecode.charAt(let);
			int place = shiftSt.indexOf(letter);
			code += alpha.charAt(place);
		}
		return code;
		
	}
}