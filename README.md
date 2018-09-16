# TDT4250 - Webpage Modeling 
## Name: Tyler McAllister
I worked on this Coursework task with Simon Smeets.
This model details the information on NTNU course web pages.

## Classes
- **University**: The root class which contains **Course**, **Room**, **StudyProgram** and **Organisation** objects.
- **Course**: Attributes are the code, name, content and size representing the number of credits given for the course. Container object for the **CourseInstance** objects. References itself as a **Course** object can be required or recommended to take the course. Also contains a *CreditReduction** object that can reduce the size attribute. Many **Course** objects can also be part of an **Organisation** object.
- **CourseInstance**: A semester specific instance of a course. A container object for the **EvaluationForm** object and **Timetable** object.
- **EvaluationForm**: An object representing a container for the evaluation objects. Contains all evaluations used for a course e.g. one exam and one project or three projects etc.
- **Evaluation**: Represents one evaluation for a course instance. For example an exam. Uses enumerator **EvaluationKinds** to represent this. Also contains a float 'totalPercentage' to show the amount the evaluation is worth.
- **Organisation**: A department in the university that contains **Person** objects.
- **Person**: Represents a person who is part of a university department. Has a name attribute. A container for **Role** objects.
- **Role**: Represents a role. A **Person** object can have multiple roles. Uses the **RoleKinds** enumerator to represent Lecturer, CourseCoordinator and Other roles.
- **CreditReduction**: Contained by Course. Represents a reduction value for other Courses.
- **Timetable**: Container for **TimetableSlot**. Attributes labHours and lectureHours represent the total amount of lab and lecture hours for a course instance.
- **TimetableSlot**: A specific slot of a timetable. Uses the **TimetableSlotKinds** enumerator to describe whether the slot is a Lab or a Lecture. Attributes duration describe the length of time for the slot and date specifies the date of the slot.
- **Room**: Referenced by **TimetableSlot**. Details the name of the room for the slot.
- **StudyProgram**: Referenced by **TimetableSlot** and **Course**. Represents the Study Program that relates to the course.

## Enumerators
- **EvaluationKinds**
- **TimetableSlotKinds**
- **RoleKinds**

## Important Files/Directories
- **src-gen**: Contains model code, implementation and util packages
- **model**: Contains ecore, genmodel and NTNU.xmi which has the TDT4250 course and TDT4100 course details.

## Constraints
Constrains are all coded in Java, they are:
- **validateCourseInstance_hasCourseCoordinator**: Ensures that a course has at least one course coordinator.
- **validateEvaluationForm_totalPercentageEqualsOneHundred**: Checks that the total percentage of evaluation for a course instance is exactly 1.0
- **validateTimetable_maximumScheduledHours**: Checks that the maximum scheduled hours for a course in a study program are met according to the timetable