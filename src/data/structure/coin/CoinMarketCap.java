package data.structure.coin;

public class CoinMarketCap {
	
	private String id = "id";
	private String name;
	private String symbol = "symbol";
	private String rank;
	private String price_usd = "price_usd";
	private String price_krw = "price_krw";
	private String price_btc = "price_btc";
	private String volume_usd_24h = "24h_volumne_usd";
	private String market_cap_usd = "market_cap_usd";
	private String market_cap_krw = "market_cap_krw";
	private String available_supply = "available_supply";
	private String total_supply = "total_supply";
	private String max_supply = "max_supply";
	private String percent_change_1h = "percent_change_1h";
	private String percent_change_24h = "percent_change_24h";
	private String percent_change_7d = "percent_change_7d";
	private String last_updated = "last_updated";
	
	public CoinMarketCap() {
		
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

	public String getPrice_krw() {
		return price_krw;
	}

	public void setPrice_krw(String price_krw) {
		this.price_krw = price_krw;
	}

	public String getMarket_cap_krw() {
		return market_cap_krw;
	}

	public void setMarket_cap_krw(String market_cap_krw) {
		this.market_cap_krw = market_cap_krw;
	}
}
