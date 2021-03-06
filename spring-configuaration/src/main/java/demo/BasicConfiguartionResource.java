package demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicConfiguartionResource {

	@Autowired
	private BasicConfiguration configuration;

	@RequestMapping("/get-configuration")
	public Map dynamicConfiguration() {
	    
	    Map map = new HashMap();
	    map.put("message", configuration.getMessage());
	    map.put("number", configuration.getNumber());
	    map.put("key", configuration.isValue());
	    return map;
	}
}
