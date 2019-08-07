package com.casit.boot.mapper;
import com.casit.boot.bean.t_user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface userMapper {
    List<t_user> list();
    List<t_user> get(t_user category);
    void edit(t_user category);
    void delete(t_user category);
}
