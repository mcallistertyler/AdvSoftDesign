package tdt4250.coursework;

import tdt4250.coursework.*;
import java.util.ArrayList;

public abstract class CourseworkHTMLGenerator {

	ArrayList<String> generateHTML(University university){
		ArrayList<String> htmlPages = new ArrayList<String>();
		for(Course course : university.getCourse()) {
			htmlPages.add(generateCourseHTML(course));
		}
		return htmlPages;
	}
	
	String generateCourseHTML(Course course) {
		String coursehtml = "<html>"
				+ "<title>"
				+ course.getCode()
				+ " "
				+ course.getName()
				+ "</title>"
				+ "<body>"
				+ courseWorkTableGen(course)
				+ contentGen(course)
				+ assignmentGen(course)
				+ pkGen(course)
				+ reductionTableGen(course)
				+ timetableGen(course);

		coursehtml += "</body></html>";
		
		return coursehtml;
	}
	
	String courseWorkTableGen(Course course) {
		EvaluationForm evalform = course.getSemesterSpecificCourseInstance().get(0).getEvaluationform();
		String evalTable = "<div><h1>Examination Arrangements</h1><table>"
							+"<tr>"
							+ "<th>"
							+ "Evaluation form"
							+ "</th>"
							+ "<th>"
							+ "Weighting"
							+ " </th>"
							+ "</tr>";
		for (Evaluation eval : evalform.getEvaluation()) {
			evalTable += "<tr>"
					+ "<th>"
					+ eval.getEvaluationKind().getName()
					+ "</th>"
					+ "</tr>";
		}
		evalTable += "</table></div>";
		return evalTable;
	}
	
	String contentGen(Course course) {
		String contentDiv = "<div><h1>Course Content</h1>"
							+ course.getContent()
							+ "</div>";
		return contentDiv;
	}
	
	String assignmentGen(Course course) {
		String assignmentDiv = "<div><h1>Compulsory Assignments</h1>";
		for(Evaluation eval : course.getSemesterSpecificCourseInstance().get(0).getEvaluationform().getEvaluation()) {
			if(!eval.getEvaluationKind().equals(EvaluationKinds.getByName("Exam"))) {
				assignmentDiv += "<br>"
								+ eval.getEvaluationKind().getName()
								+ "</br>";
			}
		}
		assignmentDiv += "</div>";
		return assignmentDiv;
	}
	
	String pkGen(Course course) {
		String pkDiv = "<div><h1>Recommended Previous Knowledge</h1>";
		for(Course recCourse : course.getRecommendedCourse()) {
			pkDiv += "Course"
				  + recCourse.getCode()
				  + " "
				  + recCourse.getName()
				  + ", or equivalent. <br>";
		}
		pkDiv += "</div>";
		
		pkDiv = "<div><h1>Required Previous Knowledge</h1>";
		for(Course reqCourse : course.getRequiredCourse()) {
			pkDiv += "Course"
				  + reqCourse.getCode()
				  + " "
				  + reqCourse.getName()
				  + ", or equivalent. <br>";
		}
		pkDiv += "</div>";
		return pkDiv;
	}

	String reductionTableGen(Course course) {
		String reducDiv = "<div><h1>Credit Reductions</h1><table><br>"
				+"<tr>"
				+ "<th>"
				+ "Course Code"
				+ "</th>"
				+ "<th>"
				+ "Reduction"
				+ " </th>"
				+ "</tr>";
		for (CreditReduction crRed : course.getCreditreduction()) {
			reducDiv += "<tr>"
					+ "<th>"
					+ crRed.getCourse().getCode()
					+ "</th>"
					+ "<th>"
					+ crRed.getReductionValue()
					+ " </th>"
					+ "</tr>";

		}
		reducDiv += "</div>";
		return reducDiv;
	}
	
	String timetableGen(Course course) {
		String timetableDiv = "<div><h1>Timetable</h1><table><br>"
							+ "<tr>"
							+ "<th>"
							+ "Date"
							+ "</th>"
							+ "<th>"
							+ "Type"
							+ "</th>"
							+ "<th>"
							+ "Study Programs"
							+ "</th>"
							+ "<th>"
							+ "Room"
							+ "</th>"
							+ "</tr>";
		for(TimetableSlot timeslot : course.getSemesterSpecificCourseInstance().get(0).getTimetable().getLecture()) {
			   timetableDiv += "<tr>"
							+ "<th>"
							+ timeslot.getDate()
							+ "</th>"
							+ "<th>"
							+ timeslot.getTimetableSlotKind().getName()
							+ "</th>"
							+ "<th>";
			   for(StudyProgram sp : timeslot.getStudyprogram()) {
				   timetableDiv += sp.getName() + "<br>";
				};
			   timetableDiv += "</th>"
							+ "<th>"
							+ timeslot.getRoom().getName()
							+ "</th>"
							+ "</tr>";
		}
		timetableDiv += "</table></div>";
		return timetableDiv;
	}
	
	public static void main(String[] args) {
		Course uni = new Course();
	}
	
}
