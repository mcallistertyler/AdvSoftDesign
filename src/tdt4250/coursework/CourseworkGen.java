package tdt4250.coursework;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import tdt4250.coursework.University;
import tdt4250.coursework.impl.CourseworkFactoryImpl;

public class CourseworkGen {

	public static void main(String[] args) throws IOException {
		University university = getQuiz(args[0]);
	}

	public static University getQuiz(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(CourseworkPackage.eNS_URI, CourseworkPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("university", new CourseworkFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof University) {
				System.out.println((University) eObject);
				return (University) eObject;
			}
		}
		return null;
	}

	
}
