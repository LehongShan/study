package com.shan.excel;

import com.shan.common.Common;
import com.shan.excel.utils.Util;
import com.shan.excel.vo.Student;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shanlehong on 2017/5/8.
 */
public class ReadExcel {

    public List<Student> readExcel(String path) throws IOException{
        if (path == null ||Common.EMPTY.equals(path)){
            return  null;
        }else {
            String postfix = Util.getPostfix(path);
            if (!Common.EMPTY.equals(postfix)){
                if (Common.OFFICE_EXCEL_2003_POSTFIX.equals(postfix)){
                   return readXls(path);
                }

                if (Common.OFFICE_EXCEL_2010_POSTFIX.equals(postfix)){
                    return readXlsx(path);
                }
            }else {
                System.out.println(path+Common.NOT_EXCEL_FILE);
            }
        }
        return null;
    }


    public List<Student> readXlsx(String path) throws IOException{
        System.out.println(Common.PROCESSING+path);
        InputStream is = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(is);
        Student student = null;
        List<Student> list = new ArrayList<>();
        for (int numSheet = 0;numSheet < xssfWorkbook.getNumberOfSheets();numSheet++){
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(numSheet);
            if (xssfSheet == null){
                continue;
            }
            //Read the Row
            for (int rowNum = 1; rowNum <= xssfSheet.getLastRowNum(); rowNum++){
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow !=null){
                    student = new Student();

                    XSSFCell no = xssfRow.getCell(0);
                    XSSFCell name = xssfRow.getCell(1);
                    XSSFCell age = xssfRow.getCell(2);
                    XSSFCell score = xssfRow.getCell(3);
                    student.setNo(getValue(no));
                    student.setName(getValue(name));
                    student.setAge(getValue(age));
                    student.setScore(Float.valueOf(getValue(score)));
                    list.add(student);
                }
            }

        }
        return list;

    }

    public List<Student> readXls(String path) throws IOException{
        System.out.println(Common.PROCESSING+path);
        InputStream is = new FileInputStream(path);
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(is);
        Student student = null;
        List<Student> list = new ArrayList<>();
        for (int numSheet = 0; numSheet<hssfWorkbook.getNumberOfSheets();numSheet++){
            HSSFSheet hssfSheet = hssfWorkbook.getSheetAt(numSheet);
            if (hssfSheet == null){
                continue;
            }
            //Read the Row
            for (int numRow = 1;numRow<=hssfSheet.getLastRowNum();numRow++){
                HSSFRow hssfRow = hssfSheet.getRow(numRow);
                if (hssfRow != null){
                    HSSFCell no = hssfRow.getCell(0);
                    HSSFCell name = hssfRow.getCell(1);
                    HSSFCell age = hssfRow.getCell(2);
                    HSSFCell scorce = hssfRow.getCell(3);
                    student = new Student();
                    student.setNo(getValue(no));
                    student.setName(getValue(name));
                    student.setAge(getValue(age));
                    student.setScore(Float.valueOf(getValue(scorce)));
                    list.add(student);

                }

            }
        }

    return list;

    }


    @SuppressWarnings("static-access")
    private String getValue(XSSFCell xssfCell){
        if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN){
            return  String.valueOf(xssfCell.getBooleanCellValue());

        }else if (xssfCell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC){
            return String.valueOf(xssfCell.getNumericCellValue());

        }else {
            return String.valueOf(xssfCell.getRichStringCellValue());
        }

    }


    @SuppressWarnings("static-access")
    private String getValue(HSSFCell hssfCell){
        if (hssfCell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN){
            return  String.valueOf(hssfCell.getBooleanCellValue());

        }else if (hssfCell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC){
            return String.valueOf(hssfCell.getNumericCellValue());

        }else {
            return String.valueOf(hssfCell.getRichStringCellValue());
        }

    }
}
