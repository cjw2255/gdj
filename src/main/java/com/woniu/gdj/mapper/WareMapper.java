package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Ware;
import com.woniu.gdj.entity.WareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WareMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int countByExample(WareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByExample(WareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByPrimaryKey(Integer wareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insert(Ware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insertSelective(Ware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    List<Ware> selectByExample(WareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    Ware selectByPrimaryKey(Integer wareid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Ware record, @Param("example") WareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExample(@Param("record") Ware record, @Param("example") WareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKeySelective(Ware record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKey(Ware record);
}