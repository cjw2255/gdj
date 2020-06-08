package com.woniu.gdj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwopwareExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public SwopwareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSwopwareidIsNull() {
            addCriterion("swopwareId is null");
            return (Criteria) this;
        }

        public Criteria andSwopwareidIsNotNull() {
            addCriterion("swopwareId is not null");
            return (Criteria) this;
        }

        public Criteria andSwopwareidEqualTo(String value) {
            addCriterion("swopwareId =", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidNotEqualTo(String value) {
            addCriterion("swopwareId <>", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidGreaterThan(String value) {
            addCriterion("swopwareId >", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidGreaterThanOrEqualTo(String value) {
            addCriterion("swopwareId >=", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidLessThan(String value) {
            addCriterion("swopwareId <", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidLessThanOrEqualTo(String value) {
            addCriterion("swopwareId <=", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidLike(String value) {
            addCriterion("swopwareId like", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidNotLike(String value) {
            addCriterion("swopwareId not like", value, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidIn(List<String> values) {
            addCriterion("swopwareId in", values, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidNotIn(List<String> values) {
            addCriterion("swopwareId not in", values, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidBetween(String value1, String value2) {
            addCriterion("swopwareId between", value1, value2, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andSwopwareidNotBetween(String value1, String value2) {
            addCriterion("swopwareId not between", value1, value2, "swopwareid");
            return (Criteria) this;
        }

        public Criteria andMerchartidIsNull() {
            addCriterion("merchartId is null");
            return (Criteria) this;
        }

        public Criteria andMerchartidIsNotNull() {
            addCriterion("merchartId is not null");
            return (Criteria) this;
        }

        public Criteria andMerchartidEqualTo(Integer value) {
            addCriterion("merchartId =", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidNotEqualTo(Integer value) {
            addCriterion("merchartId <>", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidGreaterThan(Integer value) {
            addCriterion("merchartId >", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchartId >=", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidLessThan(Integer value) {
            addCriterion("merchartId <", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidLessThanOrEqualTo(Integer value) {
            addCriterion("merchartId <=", value, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidIn(List<Integer> values) {
            addCriterion("merchartId in", values, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidNotIn(List<Integer> values) {
            addCriterion("merchartId not in", values, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidBetween(Integer value1, Integer value2) {
            addCriterion("merchartId between", value1, value2, "merchartid");
            return (Criteria) this;
        }

        public Criteria andMerchartidNotBetween(Integer value1, Integer value2) {
            addCriterion("merchartId not between", value1, value2, "merchartid");
            return (Criteria) this;
        }

        public Criteria andWareidIsNull() {
            addCriterion("wareId is null");
            return (Criteria) this;
        }

        public Criteria andWareidIsNotNull() {
            addCriterion("wareId is not null");
            return (Criteria) this;
        }

        public Criteria andWareidEqualTo(Integer value) {
            addCriterion("wareId =", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotEqualTo(Integer value) {
            addCriterion("wareId <>", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThan(Integer value) {
            addCriterion("wareId >", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wareId >=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThan(Integer value) {
            addCriterion("wareId <", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidLessThanOrEqualTo(Integer value) {
            addCriterion("wareId <=", value, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidIn(List<Integer> values) {
            addCriterion("wareId in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotIn(List<Integer> values) {
            addCriterion("wareId not in", values, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidBetween(Integer value1, Integer value2) {
            addCriterion("wareId between", value1, value2, "wareid");
            return (Criteria) this;
        }

        public Criteria andWareidNotBetween(Integer value1, Integer value2) {
            addCriterion("wareId not between", value1, value2, "wareid");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeIsNull() {
            addCriterion("swopwareTime is null");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeIsNotNull() {
            addCriterion("swopwareTime is not null");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeEqualTo(Date value) {
            addCriterion("swopwareTime =", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeNotEqualTo(Date value) {
            addCriterion("swopwareTime <>", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeGreaterThan(Date value) {
            addCriterion("swopwareTime >", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("swopwareTime >=", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeLessThan(Date value) {
            addCriterion("swopwareTime <", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeLessThanOrEqualTo(Date value) {
            addCriterion("swopwareTime <=", value, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeIn(List<Date> values) {
            addCriterion("swopwareTime in", values, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeNotIn(List<Date> values) {
            addCriterion("swopwareTime not in", values, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeBetween(Date value1, Date value2) {
            addCriterion("swopwareTime between", value1, value2, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopwaretimeNotBetween(Date value1, Date value2) {
            addCriterion("swopwareTime not between", value1, value2, "swopwaretime");
            return (Criteria) this;
        }

        public Criteria andSwopexplainIsNull() {
            addCriterion("swopExplain is null");
            return (Criteria) this;
        }

        public Criteria andSwopexplainIsNotNull() {
            addCriterion("swopExplain is not null");
            return (Criteria) this;
        }

        public Criteria andSwopexplainEqualTo(String value) {
            addCriterion("swopExplain =", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainNotEqualTo(String value) {
            addCriterion("swopExplain <>", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainGreaterThan(String value) {
            addCriterion("swopExplain >", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainGreaterThanOrEqualTo(String value) {
            addCriterion("swopExplain >=", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainLessThan(String value) {
            addCriterion("swopExplain <", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainLessThanOrEqualTo(String value) {
            addCriterion("swopExplain <=", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainLike(String value) {
            addCriterion("swopExplain like", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainNotLike(String value) {
            addCriterion("swopExplain not like", value, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainIn(List<String> values) {
            addCriterion("swopExplain in", values, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainNotIn(List<String> values) {
            addCriterion("swopExplain not in", values, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainBetween(String value1, String value2) {
            addCriterion("swopExplain between", value1, value2, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopexplainNotBetween(String value1, String value2) {
            addCriterion("swopExplain not between", value1, value2, "swopexplain");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateIsNull() {
            addCriterion("swopwareState is null");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateIsNotNull() {
            addCriterion("swopwareState is not null");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateEqualTo(String value) {
            addCriterion("swopwareState =", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateNotEqualTo(String value) {
            addCriterion("swopwareState <>", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateGreaterThan(String value) {
            addCriterion("swopwareState >", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateGreaterThanOrEqualTo(String value) {
            addCriterion("swopwareState >=", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateLessThan(String value) {
            addCriterion("swopwareState <", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateLessThanOrEqualTo(String value) {
            addCriterion("swopwareState <=", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateLike(String value) {
            addCriterion("swopwareState like", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateNotLike(String value) {
            addCriterion("swopwareState not like", value, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateIn(List<String> values) {
            addCriterion("swopwareState in", values, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateNotIn(List<String> values) {
            addCriterion("swopwareState not in", values, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateBetween(String value1, String value2) {
            addCriterion("swopwareState between", value1, value2, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andSwopwarestateNotBetween(String value1, String value2) {
            addCriterion("swopwareState not between", value1, value2, "swopwarestate");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeIsNull() {
            addCriterion("consigneePostcode is null");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeIsNotNull() {
            addCriterion("consigneePostcode is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeEqualTo(String value) {
            addCriterion("consigneePostcode =", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeNotEqualTo(String value) {
            addCriterion("consigneePostcode <>", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeGreaterThan(String value) {
            addCriterion("consigneePostcode >", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("consigneePostcode >=", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeLessThan(String value) {
            addCriterion("consigneePostcode <", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeLessThanOrEqualTo(String value) {
            addCriterion("consigneePostcode <=", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeLike(String value) {
            addCriterion("consigneePostcode like", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeNotLike(String value) {
            addCriterion("consigneePostcode not like", value, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeIn(List<String> values) {
            addCriterion("consigneePostcode in", values, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeNotIn(List<String> values) {
            addCriterion("consigneePostcode not in", values, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeBetween(String value1, String value2) {
            addCriterion("consigneePostcode between", value1, value2, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneepostcodeNotBetween(String value1, String value2) {
            addCriterion("consigneePostcode not between", value1, value2, "consigneepostcode");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeIsNull() {
            addCriterion("supplierConfirmTime is null");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeIsNotNull() {
            addCriterion("supplierConfirmTime is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeEqualTo(Date value) {
            addCriterion("supplierConfirmTime =", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeNotEqualTo(Date value) {
            addCriterion("supplierConfirmTime <>", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeGreaterThan(Date value) {
            addCriterion("supplierConfirmTime >", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("supplierConfirmTime >=", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeLessThan(Date value) {
            addCriterion("supplierConfirmTime <", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeLessThanOrEqualTo(Date value) {
            addCriterion("supplierConfirmTime <=", value, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeIn(List<Date> values) {
            addCriterion("supplierConfirmTime in", values, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeNotIn(List<Date> values) {
            addCriterion("supplierConfirmTime not in", values, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeBetween(Date value1, Date value2) {
            addCriterion("supplierConfirmTime between", value1, value2, "supplierconfirmtime");
            return (Criteria) this;
        }

        public Criteria andSupplierconfirmtimeNotBetween(Date value1, Date value2) {
            addCriterion("supplierConfirmTime not between", value1, value2, "supplierconfirmtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swopware
     *
     * @mbggenerated do_not_delete_during_merge Sat Jun 06 18:59:37 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table swopware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}