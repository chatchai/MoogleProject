package th.co.food.dto;

import java.io.Serializable;
import java.util.ArrayList;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("resultDTO")
public class ResultDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias("baseDto")
	private BaseDTO baseDto;
	
	/*@XStreamAlias("resultMessage")
	private ResultMessage resultMessage;*/
	
	@XStreamAlias("resultList")
	private ArrayList resultList;
	
	public BaseDTO getBaseDto() {
		return baseDto;
	}
	public void setBaseDto(BaseDTO baseDto) {
		this.baseDto = baseDto;
	}
	public ArrayList getResultList() {
		return resultList;
	}
	public void setResultList(ArrayList resultList) {
		this.resultList = resultList;
	}
	/*public ResultMessage getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(ResultMessage resultMessage) {
		this.resultMessage = resultMessage;
	}
	*/
}
