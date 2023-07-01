package com.example.mavendemo01.SQL;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
//注解表示该类是一个MyBatis接口文件，并保证能够被Spring Boot自动扫描到Spring容器中;
// 在接口内部，分别通过@select、@Insert、@Update、@Delete注解配合SOL语句完成了对数据库t_comment数据的增删改查操作
public interface CommentMapper {
    @Select("SELECT * FROM t_comment WHERE id =#{id}")
    public Comment findById(Integer id);

    @Insert("INSERT INTO t_comment(content,author,a_id) " +
            "values (#{content},#{author},#{aId})")
    public int insertComment(Comment comment);

}
