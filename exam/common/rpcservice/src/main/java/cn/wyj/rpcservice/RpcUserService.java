package cn.wyj.rpcservice;

import cn.wyj.common.pojo.New;

import java.util.List;

public interface RpcUserService {
    List<New> queryAll();
    int delete(int id);
}
