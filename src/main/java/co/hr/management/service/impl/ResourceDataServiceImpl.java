package co.hr.management.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.hr.management.dto.ResourceDataDTO;
import co.hr.management.model.ResourceData;
import co.hr.management.repository.ResourceDataRepository;
import co.hr.management.service.ResourceDataService;
import co.hr.management.util.DateUtil;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ResourceDataServiceImpl implements ResourceDataService {

	@Autowired
	ResourceDataRepository resourceDataRepository;

	public List<ResourceDataDTO> getResourceDataAll() {
		log.info("get");
		List<ResourceDataDTO> result = new ArrayList<>();

		List<ResourceData> fromDb = resourceDataRepository.findAll();
		String tanggalMasuk = "-";
		String tanggalKeluar = "-";
		String tanggalLahir = "-";
		for (int i = 0; i < fromDb.size(); i++) {
			if (fromDb.get(i).getTanggalMasuk() != null) {
				tanggalMasuk = DateUtil.formatDate1(fromDb.get(i).getTanggalMasuk());
			}
			if (fromDb.get(i).getTanggalKeluar() != null) {
				tanggalKeluar = DateUtil.formatDate1(fromDb.get(i).getTanggalKeluar());
			}
			if (fromDb.get(i).getTanggalLahir() != null) {
				tanggalLahir = DateUtil.formatDate1(fromDb.get(i).getTanggalLahir());
			}
			ResourceDataDTO temp = new ResourceDataDTO();
			temp.setNo(fromDb.get(i).getNo());
			temp.setBranchCode(fromDb.get(i).getBranchCode());
			temp.setBranchName(fromDb.get(i).getBranchName());
			temp.setBranchDetail(fromDb.get(i).getBranchDetail());
			temp.setUmr(fromDb.get(i).getUmr());
			temp.setTanggalMasuk(tanggalMasuk);
			temp.setTanggalKeluar(tanggalKeluar);
			temp.setNamaPelaksana(fromDb.get(i).getNamaPelaksana());
			temp.setJabatan(fromDb.get(i).getJabatan());
			temp.setNik(fromDb.get(i).getNik());
			temp.setTanggalLahir(tanggalLahir);
			temp.setJenisKelamin(fromDb.get(i).getJenisKelamin());
			temp.setVendor(fromDb.get(i).getVendor());

			result.add(temp);
		}
		return result;
	}

	public ResourceDataDTO getResourceDataById(String id) {
		log.info("get by id");
		ResourceDataDTO result = new ResourceDataDTO();

		ResourceData fromDb = resourceDataRepository.findOneByNo(id);
		String tanggalMasuk = "-";
		String tanggalKeluar = "-";
		String tanggalLahir = "-";
		if (fromDb.getTanggalMasuk() != null) {
			tanggalMasuk = DateUtil.formatDate1(fromDb.getTanggalMasuk());
		}
		if (fromDb.getTanggalKeluar() != null) {
			tanggalKeluar = DateUtil.formatDate1(fromDb.getTanggalKeluar());
		}
		if (fromDb.getTanggalLahir() != null) {
			tanggalLahir = DateUtil.formatDate1(fromDb.getTanggalLahir());
		}
		result.setNo(fromDb.getNo());
		result.setBranchCode(fromDb.getBranchCode());
		result.setBranchName(fromDb.getBranchName());
		result.setBranchDetail(fromDb.getBranchDetail());
		result.setUmr(fromDb.getUmr());
		result.setTanggalMasuk(tanggalMasuk);
		result.setTanggalKeluar(tanggalKeluar);
		result.setNamaPelaksana(fromDb.getNamaPelaksana());
		result.setJabatan(fromDb.getJabatan());
		result.setNik(fromDb.getNik());
		result.setTanggalLahir(tanggalLahir);
		result.setJenisKelamin(fromDb.getJenisKelamin());
		result.setVendor(fromDb.getVendor());

		return result;
	}

	public String saveResourceData(ResourceDataDTO requset) throws ParseException {
		log.info("save");
		String result = "Berhasil Save data";
		Date tanggalKeluar = null;
		if (requset.getTanggalKeluar() != null && !requset.getTanggalKeluar().equals("") ) {
			tanggalKeluar = DateUtil.parseDate1(requset.getTanggalKeluar());
		}
		ResourceData rd = new ResourceData();
		rd.setNo(requset.getNo());
		rd.setBranchCode(requset.getBranchCode());
		rd.setBranchName(requset.getBranchName());
		rd.setBranchDetail(requset.getBranchDetail());
		rd.setUmr(requset.getUmr());
		rd.setTanggalMasuk(DateUtil.parseDate1(requset.getTanggalMasuk()));
		rd.setTanggalKeluar(tanggalKeluar);
		rd.setNamaPelaksana(requset.getNamaPelaksana());
		rd.setJabatan(requset.getJabatan());
		rd.setNik(requset.getNik());
		rd.setTanggalLahir(DateUtil.parseDate1(requset.getTanggalLahir()));
		rd.setJenisKelamin(requset.getJenisKelamin());
		rd.setVendor(requset.getVendor());

		resourceDataRepository.save(rd);
		return result;
	}
}