package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY,MEDIUM,HARD;
	
	private int iDifficultyValue;
	
	private static Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	public static eGameDifficulty get(int num) {
		if (num>=1000)
			return eGameDifficulty.HARD;
		else if (num>=500)
			return eGameDifficulty.MEDIUM;
		else if (num>=100)
			return eGameDifficulty.EASY;
		else
			return null;
	}
	
	private int getiDifficulty() {
		return this.iDifficultyValue;
	}
}
