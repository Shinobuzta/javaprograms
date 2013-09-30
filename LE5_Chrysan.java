public class LE5_Chrysan
{
	public static void main(String[] args) 
	{
		for (int i=0; i< args.length;i++) 
		{ 
			System.out.println("args[" + i + "]" + "=" + args[i] + "=" + args[i].length() + "=" + getLast(args[i]));
		}
	}
	public static String getLast(String arg){
		int intVal=(int) arg.charAt(arg.length()-1);
		if ((intVal >= 97 && intVal <= 122) ||
			(intVal >= 65 && intVal <= 90))
		{
			switch((char) intVal)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':return "Vowel";
				default :return "Consonant";
			}

		}
		if (intVal >= 48 && intVal <= 57) {
			return "Number";
		}
		else {
			return "Symbol";
		}
	}
}
