package th.co.food.services.common.util;

import com.thoughtworks.xstream.XStream;

public class XStreamUtils {
	private static com.thoughtworks.xstream.XStream xstream =  new XStream(new com.thoughtworks.xstream.io.xml.Dom4JDriver());

	static{
		Class[] classes = new Class[5];
		classes[0] = th.co.food.dto.ResultDTO.class;
		classes[1] = th.co.food.dto.ResultMessage.class;
		classes[2]= th.co.food.dto.FoodMenuDTO.class;
		classes[3]= th.co.food.dto.FoodBillDTO.class;
		classes[4]= th.co.food.dto.FoodOrderDTO.class;
		 
		xstream.processAnnotations(classes);
	} 
	public static com.thoughtworks.xstream.XStream getXstream() {
		return xstream;
	}
}
