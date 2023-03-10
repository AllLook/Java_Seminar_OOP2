package terminal;

import data.Student;
import service.StudentServiceImpl;

public class DeleteStudentExecutable implements CommandExecutable{
    private StudentServiceImpl studentService;
    private Student student;

    public DeleteStudentExecutable(StudentServiceImpl studentService, Student student){
        this.studentService = studentService;
        this.student = student;
    }
    @Override
    public void execute() {
        studentService.deleteStudent(student);

    }
}
