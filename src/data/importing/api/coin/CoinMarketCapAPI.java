package data.importing.api.coin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import data.structure.coin.CoinMarketCap;

public class CoinMarketCapAPI {
	
	private String id = "id";
	private String name = "name";
	private String symbol = "symbol";
	private String rank = "rank";
	private String price_usd = "price_usd";
	private String price_btc = "price_btc";
	private String volume_usd_24h = "24h_volumne_usd";
	private String market_cap_usd = "market_cap_usd";
	private String available_supply = "available_supply";
	private String total_supply = "total_supply";
	private String max_supply = "max_supply";
	private String percent_change_1h = "percent_change_1h";
	private String percent_change_24h = "percent_change_24h";
	private String percent_change_7d = "percent_change_7d";
	private String last_updated = "last_updated";
	
	private ArrayList<CoinMarketCap> coinList;
	
	private double todayDollarPrice = 1063.48;
	
	public CoinMarketCapAPI() {
		
	}
	
	public void getData() throws MalformedURLException {
		BufferedReader in = null;
		
		
		try {
			URL obj = new URL("https://api.coinmarketcap.com/v1/ticker/"); //call url
			HttpURLConnection con = (HttpURLConnection)obj.openConnection();
			
			con.setRequestMethod("GET");
			
			in = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			coinList = new ArrayList<CoinMarketCap>();
			
			String line;
			
			
			
			
			while( (line = in.readLine()) != null) { // print response in order
				if(line.contains("{")){
					
					CoinMarketCap thisCoin = new CoinMarketCap(); // new coin
					
					String key = ""; // key
					String value = ""; // value
					String[] parsed;
					
					while( !(line = in.readLine()).contains("}")) {
						
						//System.out.println(line);
						line = line.replace("\"", "");
						line = line.replace(" ", "");
						line = line.replace(",", "");
						
						parsed = line.split(":");
						
						key = parsed[0];
						value = parsed[1];
						
						//System.out.println(key + " " + value);
						if(key.equals(this.getRank())) {
							thisCoin.setRank(value);
						}else if(key.equals(this.getId())) {
							thisCoin.setId(value);
						}else if(key.equals(this.getName())) {
							thisCoin.setName(value);
						}else if(key.equals(this.getMarket_cap_usd())){
							thisCoin.setMarket_cap_usd(value);
							thisCoin.setMarket_cap_krw( String.valueOf(Double.parseDouble(value) * todayDollarPrice) );
						}else if(key.equals(this.getPrice_usd())){
							thisCoin.setPrice_usd(value);
						}else if(key.equals(this.getVolume_usd_24h())){
							thisCoin.setVolume_usd_24h(value);
						}else if(key.equals(this.getTotal_supply())){
							thisCoin.setTotal_supply(value);
						}else {
							
						}
					}
					
					coinList.add(thisCoin);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public void printCoinList() {
		for(int i = 0; i < coinList.size(); i++) {
			System.out.println(
					coinList.get(i).getRank() + ". " 
							+ coinList.get(i).getId() + " // "
							+ coinList.get(i).getName() + " // " 
							+ coinList.get(i).getMarket_cap_usd() 
							+ " // " + coinList.get(i).getTotal_supply());
		}
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getPrice_usd() {
		return price_usd;
	}

	public void setPrice_usd(String price_usd) {
		this.price_usd = price_usd;
	}

	public String getPrice_btc() {
		return price_btc;
	}

	public void setPrice_btc(String price_btc) {
		this.price_btc = price_btc;
	}

	public String getVolume_usd_24h() {
		return volume_usd_24h;
	}

	public void setVolume_usd_24h(String volume_usd_24h) {
		this.volume_usd_24h = volume_usd_24h;
	}

	public String getMarket_cap_usd() {
		return market_cap_usd;
	}

	public void setMarket_cap_usd(String market_cap_usd) {
		this.market_cap_usd = market_cap_usd;
	}

	public String getAvailable_supply() {
		return available_supply;
	}

	public void setAvailable_supply(String available_supply) {
		this.available_supply = available_supply;
	}

	public String getTotal_supply() {
		return total_supply;
	}

	public void setTotal_supply(String total_supply) {
		this.total_supply = total_supply;
	}

	public String getMax_supply() {
		return max_supply;
	}

	public void setMax_supply(String max_supply) {
		this.max_supply = max_supply;
	}

	public String getPercent_change_1h() {
		return percent_change_1h;
	}

	public void setPercent_change_1h(String percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}

	public String getPercent_change_24h() {
		return percent_change_24h;
	}

	public void setPercent_change_24h(String percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}

	public String getPercent_change_7d() {
		return percent_change_7d;
	}

	public void setPercent_change_7d(String percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
}
