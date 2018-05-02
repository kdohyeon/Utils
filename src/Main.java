import java.net.MalformedURLException;

import analysis.basics.finance.KoreanWonUnit;
import analysis.basics.strings.Palindrome;
import data.importing.api.coin.CoinMarketCapAPI;

public class Main {
	public static void main(String args[]) {
		
		Palindrome drome = new Palindrome();
		System.out.println(drome.getPalindrome("12321"));
		
		/*
		CoinMarketCapAPI coinMarketCap = new CoinMarketCapAPI();
		try {
			coinMarketCap.getData();
			
			coinMarketCap.printCoinList();
			
			KoreanWonUnit krwUnit = new KoreanWonUnit();
			
			System.out.println(krwUnit.getNearestValue(10));
			System.out.println(krwUnit.getNearestValue(100));
			System.out.println(krwUnit.getNearestValue(1000));
			System.out.println(krwUnit.getNearestValue(10000));
			System.out.println(krwUnit.getNearestValue(100000));
			System.out.println(krwUnit.getNearestValue(2000000));
			System.out.println(krwUnit.getNearestValue(20000000));
			System.out.println(krwUnit.getNearestValue(200000000));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
