
package th.co.food.services.rest.resource;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.restlet.data.MediaType;
import org.restlet.ext.xml.DomRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import th.co.food.domain.FoodMenu;
import th.co.food.dto.FoodMenuDTO;
import th.co.food.dto.ResultDTO;
import th.co.food.dto.ResultMessage;
import th.co.food.service.FoodService;
import th.co.food.services.common.util.XStreamUtils;
 
public class FoodsResource  extends ServerResource {

 
	private FoodService foodService;
	private com.thoughtworks.xstream.XStream xstream;
 
 

	public FoodService getFoodService() {
		return foodService;
	}

	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}

	public com.thoughtworks.xstream.XStream getXstream() {
		return xstream;
	}

	public void setXstream(com.thoughtworks.xstream.XStream xstream) {
		this.xstream = xstream;
	} 
	/*
	 * // /foods
	 */
	@Post
	public org.restlet.representation.Representation acceptContact(
			org.restlet.representation.Representation entity)
			throws ResourceException {
		InputStream in = null;
		ResultDTO resultDTO= null;
		try { 
			in = entity.getStream(); 
			th.co.food.dto.BaseDTO  baseDTO = null;
			Object baseObj = XStreamUtils.getXstream().fromXML(in);
			if (baseObj != null) {
				baseDTO = (th.co.food.dto.BaseDTO) baseObj;
			} 
			String serviceName = "";
			serviceName = baseDTO.getServiceName();  
			if("searchFoodMenu".equals(serviceName)){
				resultDTO = new ResultDTO();
				FoodMenu foodMenu =new FoodMenu(); 
				List list = foodService.searchFoodMenu(foodMenu);
				if(list!=null && list.size()>0){
					List l = (List) list.get(0);
					int size = l.size();
					ArrayList result = new ArrayList(size);
					for (int i = 0; i < size; i++) {
						FoodMenuDTO dto =new FoodMenuDTO(); 
						FoodMenu menu =(FoodMenu)l.get(i);
						dto.setFmId(menu.getFmId());
						dto.setFmCalories(menu.getFmCalories());
						dto.setFmDetail(menu.getFmDetail());
						dto.setFmPrice(menu.getFmPrice());
						dto.setFmName(menu.getFmName());
						dto.setFmPictureName(menu.getFmPictureName());
						dto.setFmPicturePath(menu.getFmPicturePath());
						result.add(dto);
					}
					resultDTO.setResultList(result);
				}
			} 
			
			if (resultDTO != null) {
				ResultMessage vresultMessage = new ResultMessage();
				vresultMessage.setResultDTO(resultDTO);  
				return export(vresultMessage, XStreamUtils.getXstream());
			}  
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null; 
	}
	@Get
	public org.restlet.representation.Representation represent() throws ResourceException { 
		ResultDTO resultDTO= null;
		FoodMenu foodMenu =new FoodMenu(); 
		List list = foodService.searchFoodMenu(foodMenu);
		if(list!=null && list.size()>0){
			resultDTO = new ResultDTO();
			List l = (List) list.get(0);
			int size = l.size();
			ArrayList result = new ArrayList(size);
			for (int i = 0; i < size; i++) {
				FoodMenu menu =(FoodMenu)l.get(i);
				FoodMenuDTO dto =new FoodMenuDTO(); 
				dto.setFmId(menu.getFmId());
				dto.setFmCalories(menu.getFmCalories());
				dto.setFmDetail(menu.getFmDetail());
				dto.setFmPrice(menu.getFmPrice());
				dto.setFmName(menu.getFmName());
				dto.setFmPictureName(menu.getFmPictureName());
				dto.setFmPicturePath(menu.getFmPicturePath());
				result.add(dto);
			}
			resultDTO.setResultList(result);
		}
		if (resultDTO != null) {
			ResultMessage vresultMessage = new ResultMessage();
			vresultMessage.setResultDTO(resultDTO);  
			return export(vresultMessage, XStreamUtils.getXstream());
		}
		return null;  
	} 
	 
	public Representation export( ResultMessage resultMessage,
			com.thoughtworks.xstream.XStream xstream) {

		 
		DomRepresentation representation_aoe = null;

		javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory
				.newInstance();
		dbf.setNamespaceAware(true);
		javax.xml.parsers.DocumentBuilder db = null;
		try {
			db = dbf.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*	xstream
				.processAnnotations(ResultDTO.class);// or
		xstream
		.processAnnotations(VResultMessage.class);*/
																					// xstream.autodetectAnnotations(true);
																					// (Auto-detect
																					// Annotations)
	//	xstream.autodetectAnnotations(true);
		String xml = xstream.toXML(resultMessage);
		Document document = null;
		InputStream in = null;
		try {
			in = new ByteArrayInputStream(xml.getBytes("UTF-8"));
			document = db.parse(in);
		} catch (UnsupportedEncodingException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		document.normalizeDocument();
		try {
			representation_aoe = new DomRepresentation(
			// MediaType.TEXT_XML);
					MediaType.APPLICATION_ATOM_XML);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		representation_aoe.setDocument(document);
		//getResponse().setEntity(representation_aoe);
		return representation_aoe;
	}
}
