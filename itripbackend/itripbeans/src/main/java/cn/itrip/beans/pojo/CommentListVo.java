package cn.itrip.beans.pojo;

import lombok.Data;
/*"checkInDate": "2019-01-17",
        "content": "123",
        "creationDate": "2019-03-08",
        "hotelLevel": null,
        "id": 86,
        "isHavingImg": 1,
        "roomTitle": null,
        "score": 5,
        "tripModeName": "朋友出游",
        "userCode": "itrip@163.com"*/
@Data
public class CommentListVo {
    private String checkInDate;
    private String content;
    private String creationDate;
    private Integer hotelLevel;
    private int id;
    private int isHavingImg;
    private String roomTitle;
    private int score;
    private String tripModeName;
    private String userCode;
}
