package com.woniu.gdj.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Cashlog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.userCashLogID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private Integer usercashlogid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.userID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.userCashLogDT
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private Date usercashlogdt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.userCashLogCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private BigDecimal usercashlogcash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.userCashLogLastCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private BigDecimal usercashloglastcash;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cashlog.theNote
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    private String thenote;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.userCashLogID
     *
     * @return the value of cashlog.userCashLogID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public Integer getUsercashlogid() {
        return usercashlogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.userCashLogID
     *
     * @param usercashlogid the value for cashlog.userCashLogID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setUsercashlogid(Integer usercashlogid) {
        this.usercashlogid = usercashlogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.userID
     *
     * @return the value of cashlog.userID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.userID
     *
     * @param userid the value for cashlog.userID
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.userCashLogDT
     *
     * @return the value of cashlog.userCashLogDT
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public Date getUsercashlogdt() {
        return usercashlogdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.userCashLogDT
     *
     * @param usercashlogdt the value for cashlog.userCashLogDT
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setUsercashlogdt(Date usercashlogdt) {
        this.usercashlogdt = usercashlogdt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.userCashLogCash
     *
     * @return the value of cashlog.userCashLogCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public BigDecimal getUsercashlogcash() {
        return usercashlogcash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.userCashLogCash
     *
     * @param usercashlogcash the value for cashlog.userCashLogCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setUsercashlogcash(BigDecimal usercashlogcash) {
        this.usercashlogcash = usercashlogcash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.userCashLogLastCash
     *
     * @return the value of cashlog.userCashLogLastCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public BigDecimal getUsercashloglastcash() {
        return usercashloglastcash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.userCashLogLastCash
     *
     * @param usercashloglastcash the value for cashlog.userCashLogLastCash
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setUsercashloglastcash(BigDecimal usercashloglastcash) {
        this.usercashloglastcash = usercashloglastcash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cashlog.theNote
     *
     * @return the value of cashlog.theNote
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public String getThenote() {
        return thenote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cashlog.theNote
     *
     * @param thenote the value for cashlog.theNote
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setThenote(String thenote) {
        this.thenote = thenote;
    }
}