package cm.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @Author: Yunfeng Huang
 * @Description:
 * @Date: Created in 2018/12/21
 */
@Data
public class StudentScoreVO {
    private Long courseId;

    private String courseName;

    @JsonProperty("className")
    private String klassName;

    @JsonProperty("rounds")
    private List<RoundScoreVO<SimpleSeminarScoreVO>> roundScoreVOList;

    public void setKlassName(Integer grade, Byte klassSerial) {
        this.klassName = String.valueOf(grade)+"(" +String.valueOf(klassSerial)+")";
    }
}
