package cn.itrip.beans.pojo;

import lombok.Data;

@Data
public class AvgHotelScore {
    private Integer avgFacilitiesScore;
    private Integer avgHygieneScore;
    private Integer avgPositionScore;
    private Integer avgScore;
    private Integer avgServiceScore;
    private int improve;
    private int isok;
    private int havingimg;
    private int allcomment;//
}
