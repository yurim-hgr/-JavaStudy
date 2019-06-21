package ch12;

public class Data {
	public static void main(String[] args) {
		NetworkUtil u = new NetworkUtil();
		String result = u.get("https://dhlottery.co.kr/gameResult.do?method=byWin&wiselog=H_C_1_1");

		int sIdx = 0;
		int eIdx = 0;

		sIdx = result.indexOf("<div class=\"num win");
		eIdx = result.indexOf("</p>", sIdx);

		
//		<div class="num win">
//		<strong>??¡À???</strong>
//		<p>
//			<span class="ball_645 lrg ball2">16</span>
//			<span class="ball_645 lrg ball3">21</span>
//			<span class="ball_645 lrg ball3">28</span>
//			<span class="ball_645 lrg ball4">35</span>
//			<span class="ball_645 lrg ball4">39</span>
//			<span class="ball_645 lrg ball5">43</span>
		

		
		
		String div = result.substring(sIdx, eIdx);
		System.out.println(div);
	}
}
