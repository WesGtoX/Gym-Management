package report;

import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import static view.FormReports.exp;


/**
 *
 * @author Wesley, Quemuel
 */
public class report {
        
    //Display paremeterized report
    public void display(Connection con, String report,HashMap options){
        
        try {
            
            //Load report layout
            JasperDesign jd = JRXmlLoader.load(getClass().getResourceAsStream("/report/"+report));
            
            //Compile report
            JasperReport jr = JasperCompileManager.compileReport(jd);
            
            //Populate report
            JasperPrint jp = JasperFillManager.fillReport(jr,options,con);
            
            //Display report
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            
            if(exp.equals("PDF")){
                //Export PDF report
                JasperExportManager.exportReportToPdfFile(jp,System.getProperty("user.home") + "\\Desktop\\Relatório.pdf");
            }
            
            if(exp.equals("XLSx")){
                //Export XLS report
                JRXlsExporter xlsReport = new JRXlsExporter();
                xlsReport.setParameter(JRXlsExporterParameter.JASPER_PRINT, jr);
                xlsReport.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, System.getProperty("user.home") + "\\Desktop\\Relatório.xls");
                xlsReport.setParameter(JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,Boolean.TRUE);
                xlsReport.setParameter(JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,Boolean.TRUE);
                xlsReport.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,Boolean.FALSE);
                
                xlsReport.exportReport();
            }
            
        }catch(Exception e){
            System.out.println("Não foi possível gerar o relatório, erro: "+e.getMessage());
            System.out.println("diretorio para salvar: "+System.getProperty("user.home") + "\\Desktop"+report);
        }
    }
}
