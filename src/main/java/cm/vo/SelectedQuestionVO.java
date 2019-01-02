package cm.vo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: Yunfeng Huang
 * @Description:
 * @Date: Created in 2018/12/30
 */
@Data
public class SelectedQuestionVO {
    private String studentAccount;

    private String studentName;

    private String teamNumber;

    private Integer status;

    public void setTeamNumber(Integer klassSerial,Integer teamSerial) {
        this.teamNumber = String.valueOf(klassSerial)+"-" +String.valueOf(teamSerial);
    }
}

