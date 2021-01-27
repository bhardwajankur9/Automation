package com.ankurAPI.utilities;

import java.io.BufferedWriter;
import org.apache.commons.io.output.FileWriterWithEncoding;
import org.testng.ITestListener;

import com.ankurAPI.base.TestBase;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class HtmlReport extends TestBase implements ITestListener{
	
	 public static FileWriter htmlFile = null;
	 public static BufferedWriter out = null;

	public static void setHtml() {
		

        try {
            FileWriterWithEncoding htmlFile = new FileWriterWithEncoding(
                    System.getProperty("user.dir")+ "/Reports/TestSummaryReport.html",StandardCharsets.UTF_8, true);
            BufferedWriter out = new BufferedWriter(htmlFile);
            out.newLine();
    out.write("<html>"
		+ "<head>"
		+ "</head>"
		+ "<body>"
		+ "<div >"
		+ "  <div >"
		+ "<br>"
		+ "<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0 width=\"100%\" style='width:100.0%'><tr><td valign=top style='background:#73C6B6;padding:.25in .25in .25in .25in'><p class=MsoNormal align=center style='text-align:center'><span class=test-suite-title1><span style='font-size:17.5pt;font-family:\"Helvetica\",\"sans-serif\"'>Test Automation Summary Report </span></span><o:p></o:p></p></td></tr></table></td></tr><tr><td valign=top style='padding:.25in .25in .25in .25in'><table class=MsoNormalTable border=0 cellspacing=0 cellpadding=0 width=\"100%\" style='width:100.0%'><tr><td valign=top style='padding:0in 0in 0in 0in'><table class=MsoNormalTable border=0 cellspacing=3 cellpadding=0 width=\"100%\" style='width:100.0%'><tr><td valign=top style='padding:.75pt .75pt .75pt .75pt'><table class=MsoNormalTable border=3 cellspacing=0 cellpadding=0 width=\"100%\" style='width:100.0%'><tr><td width=" + " valign=top style='width:92.0%;background:#52B255;padding:6.0pt 6.0pt 6.0pt 6.0pt'><p class=MsoNormal align=center style='text-align:center'><span class=summary1><span style='font-size:10.5pt;font-family:\"Helvetica\",\"sans-serif\";color:white'>"+"</span></span><td width="+ "valign=top style='width:2.0%;background:#F44336;padding:6.0pt 6.0pt 6.0pt 6.0pt'><p class=MsoNormal align=center style='text-align:center'><span class=summary1><span style='font-size:10.5pt;font-family:\"Helvetica\",\"sans-serif\";color:white'>"+ "</span></span><span style='font-size:10.5pt;font-family:\"Helvetica\",\"sans-serif\";color:white'> </span><o:p></o:p></p></td></tr></table>"
		+ "<br>"
		    
		+ "<table border=2 cellspacing=1 cellpadding=1 align = left-side  borderColor = '#73C6B6';>"
		+ "<caption>Automation</caption>"
		+ "  <thead>"
		+ "  <tr>"
		+ "      <th>Project</th>"
		+ "	  <th>Number</th>"
		+ "	  <th>Date</th>"
		+ "   </tr>"
		+ " </thead>"
		+ "  <tbody>"
		+ "    <tr>"
		+ "     <td>API Automation</td>"
		 + "     <td>21</td>"
		 + "     <td>Date</td>"
		 + "   </tr>"
		 + " </tbody>"
		+ "</table>"
		+ "  </div>"
		+ "  <div >"
		+ "     </div>"
		+ "</div>"

		+ "<div >"
		+ "  <div >"
		+ "    <div >"
		+ "	<br>"

		+ "<table border=2 cellspacing=1 cellpadding=1 align = center >"
		+ "<thead>"
		+ "  <tr >"
		+ "    <th></th>"
		 + "   <th colspan='6'>Steps</th>"
		 + "	<th colspan='6'>API Health Status</th>"
		 + " </tr>"
		+ "  <tr>"
		+ "	<th>Module/API</th>"
		 + "   <th>Test Case</th>"
		+ "	<th bgColor = '#73C6B6' >Passed</th>"
		+ "   <th >Failed</th>"
		+ "   <th >Skipped</th>"
		+ "   <th >Pending</th>"
		+ "   <th >Undefined</th>"
		+ "   <th >Total</th>"

		+ "   <th>Duration</th>"
		 + "   <th>Status</th>"
		+ "  </tr>"
		+ "</thead>"

		 + " <tbody>");
    
 //   ITestResult result = null;
  // Iterator<ITestNGMethod> txt =  result.getTestContext().getFailedTests().getAllMethods().iterator();
 //  while (txt.hasNext())
   {
       
		 out.write("<tr>"
			+ "		<td></td>"
			//+ "       <td>"+txt.next().getMethodName()+"</a></td>"
		//	+ "      <td >" +txt.next().getMethodName()+"</td>"
			+ "      <td >0</td>"
			+ "      <td >0</td>"
			+ "      <td >0</td>"
			+ "      <td >0</td>"
			+ "     <td >146</td>"
			+ "     <td >11:46.487</td>"
			+ "      <td >Passed</td>"
			+ "   </tr>");
    }
		 out.write("</tbody>"

		+ "  <tfoot >"
		+ "   <tr>"
		 + "     <td></td>"
		+ "	  <td></td>"
		  + "    <td>9</td>"
		  + "    <td>0</td>"
		  + "    <td>0</td>"
		      + "    <td>0</td>"
		   + "   <td>0</td>"
		  + "    <td>9</td>"

			+ "  <td>2:58:9.931</td>"
			+ "    <td>22</td>"
		  + "  </tr>"
		  + "  <tr>"
		   + "   <td></td>"
			+ "  <td></td>"
		  + "    <td>100%</td>"
		   + "   <td>1.37%</td>"
		      + "   <td>2.33%</td>"
		   + "   <td>0.00%</td>"
		    + "  <td>0.00%</td>"
		    + "  <td></td>"
		   + "   <td></td>"
		   + "   <td>36.36%</td>"
		 + "   </tr>"
		+ "  </tfoot>"
		+ "</table>"
		+ "</div>"
		+ "  </div>"
		+ "</div>"
		+ "</body>"
		+ "</html>");
    
    out.close();
	} // end of try
        catch (Exception e) {
            e.printStackTrace();
        }

	}
}
