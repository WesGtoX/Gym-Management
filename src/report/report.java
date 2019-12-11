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
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
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
                JasperExportManager.exportReportToPdfFile(jp,"c:\\relatorio.pdf");
            }
            
            if(exp.equals("HTML")){
                //Export HTML report
                JasperExportManager.exportReportToHtmlFile(jp,"c:\\relatorio.pdf");
            }
            
            if(exp.equals("XLSx")){
                //Export XLSx report
                JRXlsxExporter export = new JRXlsxExporter();
                export.setParameter(JRExporterParameter.JASPER_PRINT, jp);
                export.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, report);
                export.exportReport();
            }
            
        }catch(Exception e){
            System.out.println("Não foi possível gerar o relatório, erro: "+e.getMessage());
            System.out.println("diretorio para salvar: "+System.getProperty("user.dir")+"\\Desktop");
        }
    }
}
