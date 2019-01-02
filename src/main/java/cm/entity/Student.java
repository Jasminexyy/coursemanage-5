package cm.entity;

import lombok.Data;

import java.util.List;

/**
 * @Author: Yunfeng Huang
 * @Description:
 * @Date: Created in 2018/12/19
 */
@Data
public class Student {
    private Long id;
    private String account;
    private String password;
    private Byte isActive=0;
    private String studentName;
    private String email;
    List<Long>courseIdList;

    public Student() {
    }

    public Student(Long id, String account, String studentName, String email) {
        this.id = id;
        this.account = account;
        this.studentName = studentName;
        this.email = email;
    }

}
