package com.woniu.gdj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReturnwareExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public ReturnwareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
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
     * This method corresponds to the database table returnware
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
     * This method corresponds to the database table returnware
     *
     * @mbggenerated Sat Jun 06 18:59:37 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table returnware
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
     * This class corresponds to the database table returnware
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

        public Criteria andReturnwareidIsNull() {
            addCriterion("returnwareId is null");
            return (Criteria) this;
        }

        public Criteria andReturnwareidIsNotNull() {
            addCriterion("returnwareId is not null");
            return (Criteria) this;
        }

        public Criteria andReturnwareidEqualTo(String value) {
            addCriterion("returnwareId =", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidNotEqualTo(String value) {
            addCriterion("returnwareId <>", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidGreaterThan(String value) {
            addCriterion("returnwareId >", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidGreaterThanOrEqualTo(String value) {
            addCriterion("returnwareId >=", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidLessThan(String value) {
            addCriterion("returnwareId <", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidLessThanOrEqualTo(String value) {
            addCriterion("returnwareId <=", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidLike(String value) {
            addCriterion("returnwareId like", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidNotLike(String value) {
            addCriterion("returnwareId not like", value, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidIn(List<String> values) {
            addCriterion("returnwareId in", values, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidNotIn(List<String> values) {
            addCriterion("returnwareId not in", values, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidBetween(String value1, String value2) {
            addCriterion("returnwareId between", value1, value2, "returnwareid");
            return (Criteria) this;
        }

        public Criteria andReturnwareidNotBetween(String value1, String value2) {
            addCriterion("returnwareId not between", value1, value2, "returnwareid");
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

        public Criteria andReturnwaretimeIsNull() {
            addCriterion("returnwareTime is null");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeIsNotNull() {
            addCriterion("returnwareTime is not null");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeEqualTo(Date value) {
            addCriterion("returnwareTime =", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeNotEqualTo(Date value) {
            addCriterion("returnwareTime <>", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeGreaterThan(Date value) {
            addCriterion("returnwareTime >", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("returnwareTime >=", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeLessThan(Date value) {
            addCriterion("returnwareTime <", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeLessThanOrEqualTo(Date value) {
            addCriterion("returnwareTime <=", value, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeIn(List<Date> values) {
            addCriterion("returnwareTime in", values, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeNotIn(List<Date> values) {
            addCriterion("returnwareTime not in", values, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeBetween(Date value1, Date value2) {
            addCriterion("returnwareTime between", value1, value2, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnwaretimeNotBetween(Date value1, Date value2) {
            addCriterion("returnwareTime not between", value1, value2, "returnwaretime");
            return (Criteria) this;
        }

        public Criteria andReturnexplainIsNull() {
            addCriterion("returnExplain is null");
            return (Criteria) this;
        }

        public Criteria andReturnexplainIsNotNull() {
            addCriterion("returnExplain is not null");
            return (Criteria) this;
        }

        public Criteria andReturnexplainEqualTo(String value) {
            addCriterion("returnExplain =", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainNotEqualTo(String value) {
            addCriterion("returnExplain <>", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainGreaterThan(String value) {
            addCriterion("returnExplain >", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainGreaterThanOrEqualTo(String value) {
            addCriterion("returnExplain >=", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainLessThan(String value) {
            addCriterion("returnExplain <", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainLessThanOrEqualTo(String value) {
            addCriterion("returnExplain <=", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainLike(String value) {
            addCriterion("returnExplain like", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainNotLike(String value) {
            addCriterion("returnExplain not like", value, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainIn(List<String> values) {
            addCriterion("returnExplain in", values, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainNotIn(List<String> values) {
            addCriterion("returnExplain not in", values, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainBetween(String value1, String value2) {
            addCriterion("returnExplain between", value1, value2, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnexplainNotBetween(String value1, String value2) {
            addCriterion("returnExplain not between", value1, value2, "returnexplain");
            return (Criteria) this;
        }

        public Criteria andReturnstateIsNull() {
            addCriterion("returnState is null");
            return (Criteria) this;
        }

        public Criteria andReturnstateIsNotNull() {
            addCriterion("returnState is not null");
            return (Criteria) this;
        }

        public Criteria andReturnstateEqualTo(String value) {
            addCriterion("returnState =", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateNotEqualTo(String value) {
            addCriterion("returnState <>", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateGreaterThan(String value) {
            addCriterion("returnState >", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateGreaterThanOrEqualTo(String value) {
            addCriterion("returnState >=", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateLessThan(String value) {
            addCriterion("returnState <", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateLessThanOrEqualTo(String value) {
            addCriterion("returnState <=", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateLike(String value) {
            addCriterion("returnState like", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateNotLike(String value) {
            addCriterion("returnState not like", value, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateIn(List<String> values) {
            addCriterion("returnState in", values, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateNotIn(List<String> values) {
            addCriterion("returnState not in", values, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateBetween(String value1, String value2) {
            addCriterion("returnState between", value1, value2, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnstateNotBetween(String value1, String value2) {
            addCriterion("returnState not between", value1, value2, "returnstate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateIsNull() {
            addCriterion("returnMoneyState is null");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateIsNotNull() {
            addCriterion("returnMoneyState is not null");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateEqualTo(String value) {
            addCriterion("returnMoneyState =", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateNotEqualTo(String value) {
            addCriterion("returnMoneyState <>", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateGreaterThan(String value) {
            addCriterion("returnMoneyState >", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateGreaterThanOrEqualTo(String value) {
            addCriterion("returnMoneyState >=", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateLessThan(String value) {
            addCriterion("returnMoneyState <", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateLessThanOrEqualTo(String value) {
            addCriterion("returnMoneyState <=", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateLike(String value) {
            addCriterion("returnMoneyState like", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateNotLike(String value) {
            addCriterion("returnMoneyState not like", value, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateIn(List<String> values) {
            addCriterion("returnMoneyState in", values, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateNotIn(List<String> values) {
            addCriterion("returnMoneyState not in", values, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateBetween(String value1, String value2) {
            addCriterion("returnMoneyState between", value1, value2, "returnmoneystate");
            return (Criteria) this;
        }

        public Criteria andReturnmoneystateNotBetween(String value1, String value2) {
            addCriterion("returnMoneyState not between", value1, value2, "returnmoneystate");
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
     * This class corresponds to the database table returnware
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
     * This class corresponds to the database table returnware
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