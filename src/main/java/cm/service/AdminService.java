package cm.service;

import cm.dao.AdminDAO;
import cm.dao.TeacherDAO;
import cm.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminDAO adminDAO;
    @Autowired
    private TeacherDAO teacherDAO;

    public boolean vertify(String account, String password)
    {
        if(adminDAO.getAdminByAdminAccount(account).getPassword().equals(password))
            return true;
        else
            return false;
    }

    public boolean addTeacher(String account,String teacherName,String email,String password)
    {
        if(teacherDAO.createTeacher(new Teacher(null,account,password,teacherName,email))!=null)
            return true;
        else
            return false;
    }
}
