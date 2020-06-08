package com.woniu.gdj.mapper;

import com.woniu.gdj.entity.Recharge;
import com.woniu.gdj.entity.RechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int countByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int deleteByPrimaryKey(Integer rechargeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insert(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int insertSelective(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    List<Recharge> selectByExample(RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    Recharge selectByPrimaryKey(Integer rechargeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExampleSelective(@Param("record") Recharge record, @Param("example") RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByExample(@Param("record") Recharge record, @Param("example") RechargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKeySelective(Recharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    int updateByPrimaryKey(Recharge record);
}