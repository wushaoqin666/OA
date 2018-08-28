package com.oa.utils;

import java.io.OutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;


import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddress;

import com.oa.entity.Tb_social_insurance;
 
public class ExportUtil {
	
	/**
	 * 导出社保列表到表格 
	 * @param userList 参数为社保集合列表
	 * @param outputStream 参数为输出流
	 */
	public static void exportExcel(Page<Tb_social_insurance> page, OutputStream outputStream) {
		try {
			//1  创建工作薄
			HSSFWorkbook workBook = new HSSFWorkbook();
				//1.1  创建合并单元格对象 
			CellRangeAddress cellRangeAddress = new CellRangeAddress(0, 0, 0, 4);				
			//2 创建工作表
			HSSFSheet sheet = workBook.createSheet();
			
				//2.1 加载合并单元格对象
			sheet.addMergedRegion(cellRangeAddress);			
			//3 创建行 
				//3.1头标题行
			HSSFRow rowHead = sheet.createRow(0);
			HSSFCell cellHead = rowHead.createCell(0);		
			cellHead.setCellValue("用户列表");
				//3.1.3将设置好的样式添加到头标题行		
			//cellHead.setCellStyle( getStyle(workBook,(short) 16));			
				//3.2 标题行
			HSSFRow rowColumn = sheet.createRow(1);
				//3.2.1 标题数组
			String[] title={"客户名称","身份证号","社保卡号","缴费基数","应缴金额","个人比率","单位比率","养老保险","医疗保险","公伤保险","失业保险","生育保险","预交款日","代理费用","状态"};
			for(int i=0 ; i< title.length;i++){//遍历数组
				HSSFCell cellColumn = rowColumn.createCell(i);
				//3.2.2 调用方法 设置标题行样式
				//cellColumn.setCellStyle(getStyle(workBook,(short) 12));
				//3.2.3 设置标题
				cellColumn.setCellValue(title[i]);
			}			
			//4 操作单元格
			if(page.getList() != null){
				for (int j=0;j<page.getList().size();j++) {			
					HSSFRow row = sheet.createRow(j+2);
					row.createCell(0).setCellValue(page.getList().get(j).getTb_customer().getName());						
					row.createCell(1).setCellValue(page.getList().get(j).getIdCard());						
					row.createCell(2).setCellValue(page.getList().get(j).getSbCard());						
					row.createCell(3).setCellValue(page.getList().get(j).getBasePay());						
					row.createCell(5).setCellValue(page.getList().get(j).getMustPay());
					row.createCell(6).setCellValue(page.getList().get(j).getPersonRatio());
					row.createCell(7).setCellValue(page.getList().get(j).getCompanyRatio());
					row.createCell(8).setCellValue(page.getList().get(j).getYanglao());
					row.createCell(9).setCellValue(page.getList().get(j).getYiliao());
					row.createCell(10).setCellValue(page.getList().get(j).getGongshang());
					row.createCell(11).setCellValue(page.getList().get(j).getShiye());
					row.createCell(12).setCellValue(page.getList().get(j).getShengyu());
					row.createCell(13).setCellValue(page.getList().get(j).getPayDate());
					row.createCell(14).setCellValue(page.getList().get(j).getProxyFee());
					row.createCell(15).setCellValue(page.getList().get(j).getStatus()=="男"?"男":"女");
				}			
			}
			
	        sheet.autoSizeColumn(( short ) 4); // 调整第五列宽度 邮箱列
			
			
			//5、输出
			workBook.write(outputStream);
			outputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	/*private static HSSFCellStyle getStyle(HSSFWorkbook workBook,short fontSize){
		HSSFCellStyle style = workBook.createCellStyle();
		//3.1.1设置头标题行居中
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.ALIGN_CENTER);
			//3.1.2设置头标题行字体加粗居中
		HSSFFont font = workBook.createFont();
		font.setBoldweight(fontSize);
		font.setFontHeightInPoints(fontSize);
		style.setFont(font);
		return style;
	}

*/

}
