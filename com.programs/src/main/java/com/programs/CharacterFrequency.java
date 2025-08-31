package com.programs;

public class CharacterFrequency {
	
	public long checkCount(String targetWord,char target)
	{
		String Word = targetWord;
		
		char charWord = target;
		
		long count = Word.chars().filter(ch -> ch == charWord).count();
		
		return count;
	}
	public static void main(String args[])
	{
		String targetWord ="Capgemini";
		
		char target = 'i';
		
		CharacterFrequency charFreq = new CharacterFrequency();
		
		long checkCount = charFreq.checkCount(targetWord,target);
		
		System.out.println(checkCount);
	}

}
