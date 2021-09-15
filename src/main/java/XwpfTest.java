//import java.io.*;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import org.apache.commons.lang.StringUtils;
//import org.apache.poi.util.Units;
//import org.apache.poi.xwpf.usermodel.XWPFDocument;
//import org.apache.poi.xwpf.usermodel.XWPFFooter;
//import org.apache.poi.xwpf.usermodel.XWPFHeader;
//import org.apache.poi.xwpf.usermodel.XWPFParagraph;
//import org.apache.poi.xwpf.usermodel.XWPFRun;
//import org.apache.poi.xwpf.usermodel.XWPFTable;
//import org.apache.poi.xwpf.usermodel.XWPFTableCell;
//import org.apache.poi.xwpf.usermodel.XWPFTableRow;
//import org.apache.xmlbeans.XmlToken;
//import org.openxmlformats.schemas.drawingml.x2006.main.CTNonVisualDrawingProps;
//import org.openxmlformats.schemas.drawingml.x2006.main.CTPositiveSize2D;
//import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.CTInline;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTFonts;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTHpsMeasure;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTJc;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPPr;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSpacing;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTbl;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblPr;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTc;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTcPr;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTVerticalJc;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.STLineSpacingRule;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.STMerge;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;
//import org.openxmlformats.schemas.wordprocessingml.x2006.main.STVerticalJc;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class XwpfTest {
//
//   /**
//    * 通过XWPFDocument对内容进行访问。对于XWPF文档而言，用这种方式进行读操作更佳。
//    * @throws Exception
//    */
//   public static void main(String[] args) throws Exception {
//      XwpfTest test = new XwpfTest();
//      test.testReadByDoc();
//
//   }
//   public void testReadByDoc() throws Exception {
//      InputStream is = new FileInputStream("C:\\Users\\Administrator\\Desktop\\民族风欲村011.docx");
//      XWPFDocument doc = new XWPFDocument(is);
//      List<XWPFParagraph> paras = doc.getParagraphs();
//      int i=0;
//      for (XWPFParagraph para : paras) {
//         //当前段落的属性
////       CTPPr pr = para.getCTP().getPPr();
//         System.out.println("段落"+(i++)+"："+para.getText());
//      }
//
//
//
//      //doc.write(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\write.docx"));
//
//
//      this.close(is);
//   }
//
//   /**
//    * 关闭输入流
//    * @param is
//    */
//   private void close(InputStream is) {
//      if (is != null) {
//         try {
//            is.close();
//         } catch (IOException e) {
//            e.printStackTrace();
//         }
//      }
//   }
//
//   /**
//    * 替换全部文本
//    * @param textMap 替换信息
//    * @param paragraphs 段落
//    */
//   public static void replaceAllTexts(Map<String, String> textMap, List<XWPFParagraph> paragraphs) {
//      Set<Map.Entry<String, String>> textEntrySet = textMap.entrySet();
//      for (Map.Entry<String, String> entry : textEntrySet) {
//         String key = entry.getKey();
//         String value = CommonUtil.converObjToStr(entry.getValue());
//         // 替换全部文本
//         replaceAllTexts(key, value, paragraphs);
//      }
//   }
//
//   /**
//    * 替换全部文本
//    * @param key 替换键
//    * @param value 替换值
//    * @param paragraphs 段落
//    */
//   public static void replaceAllTexts(String key, String value, List<XWPFParagraph> paragraphs) {
//      for (XWPFParagraph paragraph : paragraphs) {
//         // 待替换文本
//         String text = paragraph.getText();
//         if (StringUtils.isNotEmpty(text) && text.contains(key)) {
//            List<XWPFRun> runs = paragraph.getRuns();
//            // 只保留第一个Run
//            for (int i = (runs.size() - 1); i > 0; i--) {
//               paragraph.removeRun(i);
//            }
//            runs.get(0).setText(text.replace(key, CommonUtil.converObjToStr(value)), 0);
//         }
//      }
//   }
//
//
//}
