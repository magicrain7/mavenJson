package co.micol.json;

import org.json.simple.JSONObject;

public class JsonAdd {
	public String json;
	
	public void jsonadd() {
		JSONObject inner = new JSONObject();
		inner.put("name", "홍길동");
		inner.put("gender", "남자");
		inner.put("age", "25");
		inner.put("address", "seoul");
		
		JSONObject outter = new JSONObject();
		outter.put("inf", inner);
		
		json = outter.toJSONString();
		
		System.out.println(json);
	}
}
