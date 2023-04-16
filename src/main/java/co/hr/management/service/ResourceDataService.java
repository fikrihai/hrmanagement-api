package co.hr.management.service;

import java.text.ParseException;
import java.util.List;

import co.hr.management.dto.ResourceDataDTO;

public interface ResourceDataService {
	public List<ResourceDataDTO> getResourceDataAll();
	public String saveResourceData(ResourceDataDTO requset) throws ParseException ;
	public ResourceDataDTO getResourceDataById(String id);
}
