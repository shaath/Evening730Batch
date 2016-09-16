package excelops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.orgHRM.master.orgMaster;

public class basicxlops
{
	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		
		String xlpath="F:\\Sumitha\\selenium\\src\\com\\orgHRM\\Testdata\\Testdata.xlsx";
		String xlout="F:\\Sumitha\\selenium\\src\\com\\orgHRM\\results\\Empres.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
		
//		XSSFRow r=ws.getRow(3);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		om.org_Launch("http://orangehrm.qedgetech.com");
		om.org_Login("Admin", "admin");
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.createCell(2);
			
			
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			
			System.out.println(f+"--"+l);
			String res=om.org_Empreg(f, l);
			c2.setCellValue(res);
//			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			if (res.equalsIgnoreCase("Pass"))
			{
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
				
			}
			else
			{
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			}
			
			
//			font.setColor(IndexedColors.GREEN.getIndex());
//			style.setFont(font);
			
			c2.setCellStyle(style);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();
		
	}
}