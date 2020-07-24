package co.micol.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class App {
	//https://song-yoshiii.tistory.com/7 실습주소
	public static void main(String[] args) {
		System.out.println("Hello World");
		JsonAdd jsonadd = new JsonAdd();
		jsonadd.jsonadd();
		
		JSONParser parser = new JSONParser();
		try {
			JSONObject obj = (JSONObject) parser.parse(jsonadd.json); //넘어온 문자열을 JSONObject 변경
			JSONObject info = (JSONObject) obj.get("inf");
			System.out.println((String) info.get("name"));
			System.out.println((String) info.get("gender"));
			System.out.println((String) info.get("age"));
			System.out.println((String) info.get("address"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
