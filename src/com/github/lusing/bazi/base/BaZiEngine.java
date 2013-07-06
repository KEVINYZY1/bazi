package com.github.lusing.bazi.base;

/**
 * 天干代表所见到的表面，外性格。性格、行为举止、容颜、六亲状况、有钱、凶灾。
 * <p/>
 * 地支代表内心，内环境。善恶、忠奸、心中想法。
 * 
 * @author Louis
 */

public class BaZiEngine {
	public static final int YEAR = 0;
	public static final int MONTH = 1;
	public static final int DAY = 2;
	public static final int HOUR = 3;

	int year_tg;
	int year_dz;
	int month_tg;
	int month_dz;
	int day_tg;
	int day_dz;
	int hour_tg;
	int hour_dz;
	TianGan[] tgs;
	DiZhi[] dzs;

	public BaZiEngine(int y1, int y2, int m1, int m2, int d1, int d2, int h1,
			int h2) {
		this.year_tg = y1;
		this.year_dz = y2;
		this.month_tg = m1;
		this.month_dz = m2;
		this.day_tg = d1;
		this.day_dz = d2;
		this.hour_tg = h1;
		this.hour_dz = h2;

		tgs = new TianGan[4];
		dzs = new DiZhi[4];

		tgs[0] = new TianGan(y1);
		tgs[1] = new TianGan(m1);
		tgs[2] = new TianGan(d1);
		tgs[3] = new TianGan(h1);

		dzs[0] = new DiZhi(y2);
		dzs[1] = new DiZhi(m2);
		dzs[2] = new DiZhi(d2);
		dzs[3] = new DiZhi(h2);

	}

	public void run() {
		checkLiuQin();
		checkWuXing();
	}

	private void checkLiuQin() {
		System.out.println("日主：" + tgs[2]);
		System.out.println(tgs[0] + " "
				+ ShiShen.getShiShen(tgs[2], tgs[0]).toString());
		System.out.println(tgs[1] + " "
				+ ShiShen.getShiShen(tgs[2], tgs[1]).toString());
		System.out.println(tgs[3] + " "
				+ ShiShen.getShiShen(tgs[2], tgs[3]).toString());
	}

	private void checkWuXing() {
		for (int i = 0; i < tgs.length; i++) {
			System.out.print(tgs[i].getXing().toString() + dzs[i].getXing()
					+ "\t");
		}
		System.out.println();

		System.out.println(checkWangShuai());
	}

	/**
	 * 检查日主的旺衰
	 */
	private BaziResult checkWangShuai() {
		return checkGenYinXiangFu();
	}

	/**
	 * 根印帮扶法
	 */
	private BaziResult checkGenYinXiangFu() {
		boolean isWang = false;
		// 1.2.日主在月令得根或印一次便是有旺的可能，再得年支或日支根一次便以旺论, 不必再看天干。
		int gen = tgs[DAY].getXing().getXing();
		if (isGen(dzs[MONTH]) || isYin(dzs[MONTH])) {
			if (isGen(dzs[YEAR]) || isGen(dzs[DAY]))
				return new BaziResult(BaziResult.WANG, "图1~2");
		}

		// 3.日主根印临日时支以身弱论命。
		if (isGen(dzs[DAY])) {
			if(isGenYin(dzs[HOUR])){
				if(isAllBiOrYin()){
					return new BaziResult(BaziResult.WANG, "图4");
				}
				else{
					return new BaziResult(BaziResult.RUO, "图3");
				}
			}
		}
		// 4. 如果天干全是印比则以身旺论。

		// 5. 印星临年月以弱论。即使天干印比一片也弱。地支中印星同时出现两个，不论在何位置均以弱论。

		return new BaziResult(BaziResult.UNKNOWN, "暂时还处理不了");
	}

	private boolean isGen(DiZhi dz) {
		return dz.getXing().getXing() == tgs[DAY].getXing().getXing();
	}

	private boolean isYin(DiZhi dz) {
		return dz.getXing().isSheng(tgs[DAY].getXing());
	}
	
	private boolean isGenYin(DiZhi dz){
		return isGen(dz) || isYin(dz);
	}
	
	private boolean isBi(TianGan tg){
		return tgs[DAY].getXing().getXing() == tg.getXing().getXing();
	}
	
	private boolean isYin(TianGan tg){
		return tg.isSheng(tgs[DAY]);
	}
	
	private boolean isAllBiOrYin(){
		boolean result = true;
		for(int i=YEAR;i<=HOUR;i++){
			result = result && (isYin(tgs[i]) || isBi(tgs[i]));
		}
		return result;
	}
}
