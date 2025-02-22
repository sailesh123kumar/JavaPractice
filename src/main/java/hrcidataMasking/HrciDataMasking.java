package hrcidataMasking;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringReader;
import java.io.StringWriter;
import org.xml.sax.InputSource;

public class HrciDataMasking {

	public static void main(String[] args) {
		
		
		        String xmlInput = """
		            <root>
		                <ns5:externalIdentifiers>
		                    <systemId>CARD</systemId>
		                    <subSystemId>0001</subSystemId>
		                </ns5:externalIdentifiers>

		                <ns5:status>Active</ns5:status>

		                <ns5:nationalRegistrations>
		                    <number>240627677</number>
		                    <startDate>2024-01-29</startDate>
		                    <priorityOrder>1000003</priorityOrder>
		                    <typeCode>SSN</typeCode>
		                    <value>SOCIAL SECURITY NUMBER</value>
		                    <priorityOrderDescription>OTHER</priorityOrderDescription>
		                </ns5:nationalRegistrations>

		                <ns5:nationalRegistrations>
		                    <description>EMPLOYMENT AUTHORIZATION</description>
		                    <endDate>2029-01-31</endDate>
		                    <number>240627677</number>
		                    <startDate>2024-01-01</startDate>
		                    <priorityOrder>1000001</priorityOrder>
		                    <typeCode>EA</typeCode>
		                    <value>INS EMP AUTO ID W/ PHOTO</value>
		                    <priorityOrderDescription>PRIMARY</priorityOrderDescription>
		                </ns5:nationalRegistrations>

		                <ns5:nationalRegistrations>
		                    <description>SOCIAL SECURITY CARD</description>
		                    <endDate>9999-12-01</endDate>
		                    <number>0085</number>
		                    <startDate>9999-12-01</startDate>
		                    <priorityOrder>1000002</priorityOrder>
		                    <typeCode>OTHER</typeCode>
		                    <value>OTHER</value>
		                    <priorityOrderDescription>SECONDARY</priorityOrderDescription>
		                </ns5:nationalRegistrations>

		                <ns5:riskAssessments/>
		            </root>
		            """;

		        // Call your function
		        String maskedXml = maskTagValue(xmlInput);

		        // Print the masked XML
		        System.out.println("Masked XML:\n" + maskedXml);
		    }
		

    

	
	 public static String maskTagValue(String xmlResponse) {
		 
			try {
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document document = builder.parse(new InputSource(new StringReader(xmlResponse)));

	            NodeList parentList = document.getElementsByTagName("ns5:nationalRegistrations");

	            for (int i = 0, len = parentList.getLength(); i < len; i++) {
	                Element parentElement = (Element) parentList.item(i);
	                NodeList numberList = parentElement.getElementsByTagName("number");

	                if (numberList.getLength() > 0) {
	                    Element numberElement = (Element) numberList.item(0);
	                    numberElement.setTextContent(numberElement.getTextContent().replaceAll(".", "X"));
	                }
	            }
	            
	            
	          
	            
	            
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            StringWriter writer = new StringWriter();
	            transformer.transform(new DOMSource(document), new StreamResult(writer));

	            return writer.toString();

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
		 
		 
	 }

}

		
		
		
	
