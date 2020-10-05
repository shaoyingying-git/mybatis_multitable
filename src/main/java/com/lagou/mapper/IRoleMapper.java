package com.lagou.mapper;

import com.lagou.pojo.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IRoleMapper {


    //根据用户id查询角色信息
    @Select("select * from sys_role r,sys_user_role ur where r.id = ur.roleid and ur.userid = #{uid}")
    public List<Role> findRoleByUid(Integer uid);
}
