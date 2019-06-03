package com.ohiohealth.utility;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXMLFile {

  public static void main(String[] args) {

    try {

//	File file = new File("/Users/abhishekjena/Documents/workspace/XmlUtility/src/data/EpicAccess/Receipt/request.xml");
    	//File file = new File("/Users/abhishekjena/Documents/workspace/XmlUtility/src/data/EpicAccess/Receipt/response.xml");
    	
    	//File file = new File("/Users/abhishekjena/Documents/workspace/XmlUtility/src/data/EpicAccessGeneratedServices/CreatRelease2/request.xml");
    	File file = new File("/Users/abhishekjena/Documents/workspace/XmlUtility/src/data/EpicAccessGeneratedServices/CreatRelease2/response.xml");


	DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
                             .newDocumentBuilder();

	Document doc = dBuilder.parse(file);

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

	if (doc.hasChildNodes()) {

		printNote(doc.getChildNodes());

	}

    } catch (Exception e) {
	System.out.println(e.getMessage());
    }

  }

  private static void printNote(NodeList nodeList) {

    for (int count = 0; count < nodeList.getLength(); count++) {

	Node tempNode = nodeList.item(count);

	// make sure it's element node.
	if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

		// get node name and value
		System.out.println("\nParent Node Name =" + tempNode.getNodeName() + " [OPEN]");
	//	System.out.println("Node Value =" + tempNode.getTextContent());
		if (tempNode.hasChildNodes()) {
		//if (tempNode.hasAttributes()) {

			// get attributes names and values
			NamedNodeMap nodeMap = tempNode.getAttributes();
			NodeList childNodeList = tempNode.getChildNodes();
			
			
			 for (int count2 = 0; count < childNodeList.getLength(); count++) {
				 Node childTempNode = childNodeList.item(count2);
				// make sure it's element node.
					if (childTempNode.getNodeType() == Node.ELEMENT_NODE) {
						System.out.println("\nNode Name =" + childTempNode.getNodeName() + " [OPEN]");
					}
			 }
			
			
			for (int i = 0; i < nodeMap.getLength(); i++) {

				Node node = nodeMap.item(i);
				System.out.println("attr name : " + node.getNodeName());
				System.out.println("attr value : " + node.getNodeValue());

			}

		}

		if (tempNode.hasChildNodes()) {

			// loop again if has child nodes
			printNote(tempNode.getChildNodes());

		}

		System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

	}

    }

  }

}

