package com.qfedu.dao;

import com.qfedu.pojo.Process;

import java.util.List;
import java.util.Map;

/**
 * Created by 86186 on 2019/6/20.
 */
public interface ProcessDao {
    void processadd(Process process);

    List<Process> processnolist(Integer checkedId);

    void processupdate(Map map);

    List<Process> myprocesslist(String startno);

    void processdel(Integer id);
}
