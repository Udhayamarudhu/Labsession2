package com.greatlearning.currency;

public class NotesCount {
	public void calculateNotesCount(int[] sortedDenominations,int amount)
	{
		int[] notesCount=new int[sortedDenominations.length];
   try{
		for(int i=0;i<sortedDenominations.length;i++) 
		{
			if(sortedDenominations[i]<=amount)
			{
			 notesCount[i]=amount/sortedDenominations[i];
			 amount =amount % sortedDenominations[i];
		     if(amount==0)
		     {
			   break;
		     }
	       }
		}
		if(amount==0)
		{
			System.out.println("The possibe currency highest  Denomination with count values");
			for(int i=0;i<sortedDenominations.length;i++)
			{
				if(notesCount[i]>0 )
				{
					System.out.println(sortedDenominations[i]+":"+notesCount[i]);
				}
			}
		}
		else
	    {
		   System.out.println("The given amount cannot be achived using highest denominations");
	    }
     }
		catch(ArithmeticException ae)
        {
			System.out.println("Zero is not a valid denomination");
		}
  }
}
