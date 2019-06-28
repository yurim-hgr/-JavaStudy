package ch12;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupTest1 {
	public static void main(String[] args) throws IOException {
		Connection con = 
				Jsoup.connect("https://comic.naver.com/webtoon/list.nhn?titleId=552960&weekday=fri");
		Document doc = con.get();
		Elements ele = doc.select("td.title > a");
		for(int i = 0; i < ele.size(); i++) {
			Element e = ele.get(i);
			String text = e.text();
			System.out.println(text);
		}
	}
}