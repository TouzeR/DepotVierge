package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testAjouter() {
        Document doc =new Document();
        doc.ajouter("Hello World!");
        assertEquals(doc.getTexte(),"Hello World!");
    }
}
