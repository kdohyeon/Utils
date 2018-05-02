package analysis.basics.finance;

public class KoreanWonUnit {
	public KoreanWonUnit() {
		
	}
	
	public String getNearestValue(long value) {
		
		String unit = "원";
		int cnt = -1;
		while(true) {
			System.out.println(value);
			
			if(cnt == -1) {
				unit = "원";
				if(value >= 10000) {
					cnt++;
				}else {
					break;
				}
			}else if(cnt == 0) {
				unit = "만원";
				if(value >= 10000000) {
					
				}
				value = value / 1000;
				cnt++;
			}else if(cnt == 1){
				unit = "천만원";
				value = value / 10;
				cnt++;
			}else if(cnt == 2) {
				unit = "억";
				value = value / 1000;
				cnt++;
			}else if(cnt == 3) {
				unit = "조";
				value = value / 1000;
				cnt++;
			}
		}
		
		String result = String.valueOf(value) + " " + unit;
		
		return result;
	}
}
