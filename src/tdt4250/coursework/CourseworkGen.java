package tdt4250.coursework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import tdt4250.coursework.University;
import tdt4250.coursework.CourseworkPackage;
import tdt4250.coursework.util.CourseworkResourceFactoryImpl;

public class CourseworkGen {

	public static void main(String[] args) throws IOException {
		
		University university = getQuiz();
		CourseworkHTMLGenerator generator = new CourseworkHTMLGenerator();
		generator.generateHTML(university);
		System.out.println("Test");
	}

	public static University getQuiz() throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(CourseworkPackage.eNS_URI, CourseworkPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new CourseworkResourceFactoryImpl());
		File f = new File("C:/Users/Ty/eclipse-workspace/tdt4250.coursework/model/NTNU.xmi");
		Resource resource = resSet.getResource(URI.createFileURI(f.getAbsolutePath()), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof University) {
				return (University) eObject;
			}
		}
		return null;
	}
	
	public static String generateHtml(University newUniversity) throws FileNotFoundException {
		CourseworkHTMLGenerator generator = new CourseworkHTMLGenerator();
		generator.generateHTML(newUniversity);
		
		//System.out.println(newUniversity.getCourse().get(0).getSemesterSpecificCourseInstance().get(0).getEvaluationform().getEvaluation());
		return null;
	}
}
