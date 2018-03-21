package br.org.mcr.codewars.challenges.tenminutewalk;

public class TenMinuteWalk {
	public static boolean isValid(char[] walk) {
		// Insert brilliant code here
		
		int countSouth =0;
		int countNorth = 0;		
		int countWest = 0;
		int countEast = 0;
		
		if (walk == null || walk.length > 10 || walk.length == 1)
			return false;
		
		for (char c : walk) {
			if(c == 'n')
				countNorth++;
			if(c == 's')
				countSouth++;
			if(c=='e')
				countEast++;
			if(c=='w')
				countWest++;
		} 
		
		if(countNorth==countSouth && countEast == countWest)
			return true;
		else
			return false;
		
/*        String s = new String(walk);
        return s.chars().filter(p->p=='n').count()==s.chars().filter(p->p=='s').count()&&
                s.chars().filter(p->p=='e').count()==s.chars().filter(p->p=='w').count()&&s.chars().count()==10;
*/		
	}

}
