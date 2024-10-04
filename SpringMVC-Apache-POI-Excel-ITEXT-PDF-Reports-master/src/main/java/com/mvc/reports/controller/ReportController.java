package com.mvc.reports.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.reports.model.Product;

@Controller
public class ReportController {

	@RequestMapping("/excel")
	public ModelAndView generateExcel() {
		List<Product> pList = getProductsData();
		return new ModelAndView("excelView", "products", pList);
	}

	@RequestMapping("/pdf")
	public ModelAndView generatePdf() {
		List<Product> pList = getProductsData();
		return new ModelAndView("pdfView", "products", pList);
	}

	private List<Product> getProductsData() {
		List<Product> pList = new ArrayList<Product>();
		pList.add(new Product(501, "Keyboard"));
		pList.add(new Product(502, "Mouse"));
		pList.add(new Product(503, "Hard disk"));
		return pList;
	}

}
