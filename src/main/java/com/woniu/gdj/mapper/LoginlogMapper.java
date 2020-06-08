package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Loginlog;
import com.woniu.gdj.entity.LoginlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginlogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int countByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByPrimaryKey(Integer loginid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insert(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insertSelective(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    List<Loginlog> selectByExample(LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    Loginlog selectByPrimaryKey(Integer loginid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExample(@Param("record") Loginlog record, @Param("example") LoginlogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKeySelective(Loginlog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table loginlog
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKey(Loginlog record);
}