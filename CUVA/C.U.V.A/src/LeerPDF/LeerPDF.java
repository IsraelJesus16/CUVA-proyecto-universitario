import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;

public class LeerPDF {
    public static void main(String[] args) throws Exception {

        File file = new File("N-32066670.pdf");
        PDDocument document = Loader.loadPDF(file);

        PDFTextStripper stripper = new PDFTextStripper();

        String texto = stripper.getText(document);

        document.close();

        System.out.println(texto);
    }
}

