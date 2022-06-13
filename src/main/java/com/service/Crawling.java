package com.service;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service("crawlingservice")
public class Crawling {
	private Document doc = null;
	Connection conn  = Jsoup.connect("https://lib.seoul.go.kr/main/searchBrief?st=KWRD&si=TOTAL&sts=Y&lmt0=&searchType=&q=%EC%84%A4%EB%AF%BC%EC%84%9D+%EC%A1%B0%EC%84%A0%EC%99%95%EC%A1%B0+%EC%8B%A4%EB%A1%9D");
	// 상단 에 크롤링할 대상 웹페이지 주소를 입력합니다 주소는 URL 인코더가 되어 있어야 합니다 
	public void test() {
		   try {
	            Document doc = conn.get(); // 위에 적힌 웹페이지에 접속을 합니다 이때 접속한 페이지가 값을 줄때 까지 awit 합니다 
	            Elements getTitleElements = doc.getElementsByTag("title");
	            //이는 doc 에서 가져온 모든 태그를 분석할때 title 이라는 태그만 가져와서 분석을 할것이고
	            for(Element e : getTitleElements){
	                System.out.println(e); // 태그 포함 데이터 
	                System.out.println(e.text()); // 태그 미포함 value 만 가져오는 방법
	            }
	        }catch (Exception e){
	            throw new RuntimeException(e.toString());
	        }
	}
}
