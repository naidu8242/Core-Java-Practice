package parties;
import java.io.FileOutputStream;
import java.io.StringReader;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.html.simpleparser.HTMLWorker; // deprecated
import com.itextpdf.text.pdf.PdfWriter;

public class HtmlToPDF1 {
  // itextpdf-5.4.1.jar  http://sourceforge.net/projects/itext/files/iText/
  public static void main(String ... args ) {
    try {
      Document document = new Document(PageSize.LETTER);
      PdfWriter.getInstance(document, new FileOutputStream("F://testpdf2.pdf"));
      document.open();
      document.addAuthor("Real Gagnon");
      document.addCreator("Real's HowTo");
      document.addSubject("Thanks for your support");
      document.addCreationDate();
      document.addTitle("Please read this");

      HTMLWorker htmlWorker = new HTMLWorker(document);
      String str = "<html><head></head><body>"+
        "<h2 style=\"color: rgb(0, 0, 0); background-image: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial; margin: 1em 0px 0.25em; overflow: hidden; padding-bottom: 0px; border-bottom-style: solid; border-bottom-color: rgb(162, 169, 177); font-size: 1.5em; font-family: &quot;Linux Libertine&quot;, Georgia, Times, serif; line-height: 1.3;\"><span class=\"mw-headline\" id=\"Content_and_Format\">Content and Format</span><span class=\"mw-editsection\" style=\"user-select: none; font-size: small; margin-left: 1em; vertical-align: baseline; line-height: 1em; font-family: sans-serif; white-space: nowrap; unicode-bidi: isolate;\"><span class=\"mw-editsection-bracket\" style=\"margin-right: 0.25em; color: rgb(84, 89, 93);\"><gwmw class=\"gingermodule-highlighter-mistake-anim ginger-module-highlighter-mistake-type-3\" id=\"gwmw15395836912670522209727\">[</gwmw></span><a href=\"https://en.wikipedia.org/w/index.php?title=Release_notes&amp;action=edit&amp;section=2\" title=\"Edit section: Content and Format\" style=\"color: rgb(11, 0, 128); background-image: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial;\">edit</a><span class=\"mw-editsection-bracket\" style=\"margin-left: 0.25em; color: rgb(84, 89, 93);\">]</span></span></h2><p style=\"margin-top: 0.5em; margin-bottom: 0.5em; line-height: inherit; color: rgb(34, 34, 34); font-family: sans-serif;\">There is no standard format for release notes that is followed throughout different organizations. Organizations normally adopt their own formatting styles based on the requirement and <gwmw class=\"ginger-module-highlighter-mistake-anim ginger-module-highlighter-mistake-type-3\" id=\"gwmw-15395836932967905434389\">type</gwmw> of the information to be circulated. The content of release notes also vary according to the release type. For products that are at testing stage and that are newly released, the content is usually more descriptive compared to release notes for bug fixes and feature enhancements, which are usually brief. Release notes may include the following sections:</p><ul style=\"margin-top: 0.3em; margin-bottom: 0px; margin-left: 1.6em; padding-left: 0px; liststyle-image: url(&quot;data:image/svg+xml,%3Csvg xmlns=%22http://www.w3.org/2000/svg%22 width=%225%22 height=%2213%22%3E %3Ccircle cx=%222.5%22 cy=%229.5%22 r=%222.5%22 fill=%22%2300528c%22/%3E %3C/svg%3E&quot;); color: rgb(34, 34, 34); font-family: sans-serif;\"><li style=\"margin-bottom: 0.1em;\"><b>Header</b>&nbsp;� Document Name (i.e. Release Notes), product name, release number, release date, note date, note version, etc.</li><li style=\"margin-bottom: 0.1em;\"><b>Overview</b>&nbsp;- A brief overview of the product and changes, in the absence of other formal documentation.</li><li style=\"margin-bottom: 0.1em;\"><b>Purpose</b>&nbsp;- A brief overview of the purpose of the release note with a listing of what is new in this release, including&nbsp;<a href=\"https://en.wikipedia.org/wiki/Bug_fix\" class=\"mw-redirect\" title=\"Bug fix\" style=\"color: rgb(11, 0, 128); background-image: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial;\">bug fixes</a>&nbsp;and new features.</li><li style=\"margin-bottom: 0.1em;\"><b>Issue Summary</b>&nbsp;- A short description of the bug or the enhancement in the release.</li><li style=\"margin-bottom: 0.1em;\"><b>Steps to Reproduce</b>&nbsp;- The steps that were followed when the bug was encountered.</li><li style=\"margin-bottom: 0.1em;\"><b>Resolution</b>&nbsp;- A short description of the modification/enhancement that was made to fix the bug.</li><li style=\"margin-bottom: 0.1em;\"><b>End-User Impact</b>&nbsp;- What different actions are needed by the end-users of the application. This should include whether other functionality is impacted by these changes.</li><li style=\"margin-bottom: 0.1em;\"><b>Support Impacts</b>&nbsp;- Changes required in the daily process of administering the software.</li><li style=\"margin-bottom: 0.1em;\"><b>Notes</b>&nbsp;- Notes about software or hardware&nbsp;<a href=\"https://en.wikipedia.org/wiki/Installation_(computer_programs)\" title=\"Installation (computer programs)\" style=\"color: rgb(11, 0, 128); background-image: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial;\">installation</a>, upgrades and product documentation (including documentation updates)</li><li style=\"margin-bottom: 0.1em;\"><b>Disclaimers</b>&nbsp;- Company and standard product related messages. e.g.;&nbsp;<a href=\"https://en.wikipedia.org/wiki/Freeware\" title=\"Freeware\" style=\"color: rgb(11, 0, 128); background-image: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial;\">freeware</a>,&nbsp;<a href=\"https://en.wikipedia.org/wiki/Copy_protection#Anti-piracy\" title=\"Copy protection\" style=\"color: rgb(11, 0, 128); backgroundimage: none; background-position: initial; background-size: initial; background-repeat: initial; background-attachment: initial; background-origin: initial; background-clip: initial;\">anti-piracy</a>, duplication etc.. See also&nbsp;<a href=\"https://en.wikipedia.org/wiki/Disclaimer\" title=\"Disclaimer\" style=\"color: rgb(11, 0, 128); background-image: none;\r\n" + 
        "" +
        "</body></html>";
      htmlWorker.parse(new StringReader(str));
      document.close();
      System.out.println("Done");
      }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}