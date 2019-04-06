package cn.jbit.EmplySys.Opera;

import cn.jbit.EmplySys.Employee;

/**
 * Created by Administrator on 2018/9/27.
 */
public interface OpreraInterface {
    void addEmpoy(Employee employee);
    void updateEmpoy(int employId,double salary);
    void deleteEmpoy(int employId);
    void getEmpoys();
    void getEmpoysById(int employId);
}
