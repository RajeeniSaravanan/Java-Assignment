package javaHackathon;

public class Q19CharacterFrequency 
{

	public static void main(String[] args) 
	{
		String inputString = "Sri rajeeni Sudha";
		int[] characterFrequency = new int[inputString.length()];
		
		//Convert String into character array		
		char inputCharArray[] = inputString.toCharArray();
		
		for(int i=0; i<inputString.length(); i++) 
		{
	        characterFrequency[i] = 1;
            for(int j=i+1; j<characterFrequency.length; j++)
            {
            	if(inputCharArray[i] ==inputCharArray[j]
            			&& inputCharArray[i] != Character.MIN_VALUE) // Ignore comparing Character.MIN_VALUE 	
            	{
            		characterFrequency[i]++;
            		inputCharArray[j] = Character.MIN_VALUE; // To ignore comparing the already matched character, set an unusual value 
            	}
            }
	    }
		
		System.out.println("Characters (unique) and their corresponding frequencies");
		
		for(int i =0; i<characterFrequency.length; i++)
		{
			if(inputCharArray[i] != Character.MIN_VALUE)
				System.out.println(inputCharArray[i] + "-" + characterFrequency[i]);
		}
    }
}

