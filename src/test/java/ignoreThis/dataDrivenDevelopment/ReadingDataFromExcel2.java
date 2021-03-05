package ignoreThis.dataDrivenDevelopment;

import java.io.IOException;
import utilities.ExcelUtils;

public class ReadingDataFromExcel2 extends ExcelUtils {

	public static void main(String[] args) throws IOException {

		rowNumber = 10 ;

		String dataInfo = null;
		String val = ExcelUtils.getFieldValue(dataInfo,"EMAIL", String.valueOf(rowNumber));
		
		System.out.println("val = "+val.toString());
		
		System.out.println("===========");
		
		
		String expVal = "NEIOENLLEN@gmail.com"; 
		
		if(val.equals(expVal)) {
			ExcelUtils.setCellValueForResult(dataInfo,"EMAIL", rowNumber, "RESULT2", "Passed");
		} else {
			ExcelUtils.setCellValueForResult(dataInfo,"EMAIL", rowNumber, "RESULT2","Failed");
		}
		
		

	}

}
