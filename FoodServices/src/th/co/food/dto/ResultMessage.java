package th.co.food.dto;

import java.io.Serializable;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
 
 
@XStreamAlias("vresultMessage")
public class ResultMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	 
	//@XStreamImplicit(itemFieldName="resultListObj")
	@XStreamAlias("resultListObj") 
	private List resultListObj;
	
	@XStreamAlias("resultDTO") 
	private ResultDTO resultDTO;

	public List getResultListObj() {
		return resultListObj;
	}

	public void setResultListObj(List resultListObj) {
		this.resultListObj = resultListObj;
	}

	public ResultDTO getResultDTO() {
		return resultDTO;
	}

	public void setResultDTO(ResultDTO resultDTO) {
		this.resultDTO = resultDTO;
	}
	
	 
	
}
