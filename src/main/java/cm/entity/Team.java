package cm.entity;

import cm.dao.KlassDAO;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: Yunfeng Huang
 * @Description:
 * @Date: Created in 2018/12/19
 */
@Data
public class Team {
    private Long id;
    private Long courseId;
    private Long klassId;
    private Long leaderId;
    private String teamName;
    private Byte teamSerial;
    private Byte status=0;
    private List<Student>students;

    @Autowired
    private KlassDAO klassDAO;

    public Integer getKlassSerial() {
        Klass klass=klassDAO.getByKlassId(klassId);
        int a=klass.getKlassSerial();
        return a;
    }
}
