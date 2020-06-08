package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Marketuser;
import com.woniu.gdj.entity.MarketuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int countByExample(MarketuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByExample(MarketuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByPrimaryKey(Integer isdefaul);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insert(Marketuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insertSelective(Marketuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    List<Marketuser> selectByExample(MarketuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Marketuser record, @Param("example") MarketuserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table marketuser
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExample(@Param("record") Marketuser record, @Param("example") MarketuserExample example);
}