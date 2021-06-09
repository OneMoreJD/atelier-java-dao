package fr.wildcodeschool.students.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import fr.wildcodeschool.students.dao.StudentDao;
import fr.wildcodeschool.students.models.Student;

@Repository
@Qualifier("Toulouse")
public class StudentRepoTls implements StudentDao {

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Bernard"));
        students.add(new Student("Hoagie"));
        students.add(new Student("Laverne"));
        return students;
    }

}
