package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.Memo;

import java.util.List;

@Mapper
public interface MemosMapper {
    List<Memo> selectAll();

    List<Memo> selectById(String id);

    List<Memo> selectByUser(String user);

    void insert(Memo memo);

    void updateById(Memo memo);

    void deleteById(Memo memo);

}