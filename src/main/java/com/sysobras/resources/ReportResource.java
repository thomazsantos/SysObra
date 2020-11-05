package com.sysobras.resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/report")
public class ReportResource {

	@RequestMapping(value = "/{id}", method = { RequestMethod.GET, RequestMethod.POST })
	public void getDocument(HttpServletResponse response, @PathVariable Long id) throws IOException, JRException {

		String sourceFileName = ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "Invoice_Table_Based.jasper")
				.getAbsolutePath();
		// creating our list of beans
		// creating datasource from bean list
		//JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(dataList);
		Map parameters = new HashMap();
		// JasperPrint jasperPrint = JasperFillManager.fillReport(sourceFileName, parameters, beanColDataSource);
		// JasperExportManager.exportReportToPdfStream(jasperPrint, response.getOutputStream());
		response.setContentType("application/pdf");
		response.addHeader("Content-Disposition", "inline; filename=jasper.pdf;");
	}

}
