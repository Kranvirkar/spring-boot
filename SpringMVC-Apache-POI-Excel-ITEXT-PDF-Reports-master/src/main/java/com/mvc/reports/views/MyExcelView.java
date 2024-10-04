package com.mvc.reports.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.mvc.reports.model.Product;

public class MyExcelView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> map, Workbook book, HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		Sheet sheet = book.createSheet("Products Details");

		Row headerRow = sheet.createRow(0);

		headerRow.createCell(0).setCellValue("S.No");
		headerRow.createCell(1).setCellValue("PID");
		headerRow.createCell(2).setCellValue("PName");

		List<Product> pList = (List) map.get("products");

		if (!pList.isEmpty()) {
			int rowIndex = 1;
			for (Product p : pList) {
				Row dataRow = sheet.createRow(rowIndex);
				dataRow.createCell(0).setCellValue(rowIndex);
				dataRow.createCell(1).setCellValue(p.getPid());
				dataRow.createCell(2).setCellValue(p.getPname());
				rowIndex++;
			}
		}

	}

}
