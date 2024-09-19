import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class exaample {

	public static void main(String[] args) {
		try {
			// Load the screenshot image
			
			  BufferedImage screenshotImage = ImageIO.read(new
			  File("./screenshotfolder1/screenshot3.png"));
			  
			  
			  // Create a new PDF document PDDocument document = new PDDocument(); PDPage
			 // page = new PDPage(new PDRectangle(screenshotImage.getWidth(),
			//  screenshotImage.getHeight())); document.addPage(page);
			  
			  // Add the screenshot image to the PDF PDImageXObject imageXObject =
			 // PDImageXObject.createFromByteArray(document, ImageIO.write(screenshotImage,
			 // "png", new File("./screenshotfolder1/screenshot3.png"))); PDPageContentStream
			 // contentStream = new PDPageContentStream(document, page);
			  //contentStream.drawImage(imageXObject, 0, 0); contentStream.close();
			  
			  // Save the PDF document
			  
			 // document.save("./screenshotfolder1/screenshot.pdf"); document.close();
			 
			 
			System.out.println("PDF created successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

