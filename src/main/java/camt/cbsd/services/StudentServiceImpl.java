package camt.cbsd.services;

import camt.cbsd.dao.StudentDao;
import camt.cbsd.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Profile("firstDataSource")
@ConfigurationProperties(prefix="server")
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentdao;
    public List<Student> getStudents() {
        return studentdao.getStudents();
    }

    @Override
    public Student findById(long id) {
        return studentdao.findById(id);
    }
}
