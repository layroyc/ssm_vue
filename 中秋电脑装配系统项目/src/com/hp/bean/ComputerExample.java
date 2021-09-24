package com.hp.bean;

import java.util.ArrayList;
import java.util.List;

public class ComputerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ComputerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

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

        public Criteria andComputerIdIsNull() {
            addCriterion("computer_id is null");
            return (Criteria) this;
        }

        public Criteria andComputerIdIsNotNull() {
            addCriterion("computer_id is not null");
            return (Criteria) this;
        }

        public Criteria andComputerIdEqualTo(Integer value) {
            addCriterion("computer_id =", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotEqualTo(Integer value) {
            addCriterion("computer_id <>", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdGreaterThan(Integer value) {
            addCriterion("computer_id >", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("computer_id >=", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdLessThan(Integer value) {
            addCriterion("computer_id <", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdLessThanOrEqualTo(Integer value) {
            addCriterion("computer_id <=", value, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdIn(List<Integer> values) {
            addCriterion("computer_id in", values, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotIn(List<Integer> values) {
            addCriterion("computer_id not in", values, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdBetween(Integer value1, Integer value2) {
            addCriterion("computer_id between", value1, value2, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("computer_id not between", value1, value2, "computerId");
            return (Criteria) this;
        }

        public Criteria andComputerNameIsNull() {
            addCriterion("Computer_name is null");
            return (Criteria) this;
        }

        public Criteria andComputerNameIsNotNull() {
            addCriterion("Computer_name is not null");
            return (Criteria) this;
        }

        public Criteria andComputerNameEqualTo(String value) {
            addCriterion("Computer_name =", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameNotEqualTo(String value) {
            addCriterion("Computer_name <>", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameGreaterThan(String value) {
            addCriterion("Computer_name >", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Computer_name >=", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameLessThan(String value) {
            addCriterion("Computer_name <", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameLessThanOrEqualTo(String value) {
            addCriterion("Computer_name <=", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameLike(String value) {
            addCriterion("Computer_name like", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameNotLike(String value) {
            addCriterion("Computer_name not like", value, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameIn(List<String> values) {
            addCriterion("Computer_name in", values, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameNotIn(List<String> values) {
            addCriterion("Computer_name not in", values, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameBetween(String value1, String value2) {
            addCriterion("Computer_name between", value1, value2, "computerName");
            return (Criteria) this;
        }

        public Criteria andComputerNameNotBetween(String value1, String value2) {
            addCriterion("Computer_name not between", value1, value2, "computerName");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("memory is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("memory is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(String value) {
            addCriterion("memory =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(String value) {
            addCriterion("memory <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(String value) {
            addCriterion("memory >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("memory >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(String value) {
            addCriterion("memory <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(String value) {
            addCriterion("memory <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLike(String value) {
            addCriterion("memory like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotLike(String value) {
            addCriterion("memory not like", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<String> values) {
            addCriterion("memory in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<String> values) {
            addCriterion("memory not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(String value1, String value2) {
            addCriterion("memory between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(String value1, String value2) {
            addCriterion("memory not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andCupIsNull() {
            addCriterion("cup is null");
            return (Criteria) this;
        }

        public Criteria andCupIsNotNull() {
            addCriterion("cup is not null");
            return (Criteria) this;
        }

        public Criteria andCupEqualTo(String value) {
            addCriterion("cup =", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotEqualTo(String value) {
            addCriterion("cup <>", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupGreaterThan(String value) {
            addCriterion("cup >", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupGreaterThanOrEqualTo(String value) {
            addCriterion("cup >=", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLessThan(String value) {
            addCriterion("cup <", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLessThanOrEqualTo(String value) {
            addCriterion("cup <=", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupLike(String value) {
            addCriterion("cup like", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotLike(String value) {
            addCriterion("cup not like", value, "cup");
            return (Criteria) this;
        }

        public Criteria andCupIn(List<String> values) {
            addCriterion("cup in", values, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotIn(List<String> values) {
            addCriterion("cup not in", values, "cup");
            return (Criteria) this;
        }

        public Criteria andCupBetween(String value1, String value2) {
            addCriterion("cup between", value1, value2, "cup");
            return (Criteria) this;
        }

        public Criteria andCupNotBetween(String value1, String value2) {
            addCriterion("cup not between", value1, value2, "cup");
            return (Criteria) this;
        }

        public Criteria andVideocardIsNull() {
            addCriterion("videocard is null");
            return (Criteria) this;
        }

        public Criteria andVideocardIsNotNull() {
            addCriterion("videocard is not null");
            return (Criteria) this;
        }

        public Criteria andVideocardEqualTo(String value) {
            addCriterion("videocard =", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardNotEqualTo(String value) {
            addCriterion("videocard <>", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardGreaterThan(String value) {
            addCriterion("videocard >", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardGreaterThanOrEqualTo(String value) {
            addCriterion("videocard >=", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardLessThan(String value) {
            addCriterion("videocard <", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardLessThanOrEqualTo(String value) {
            addCriterion("videocard <=", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardLike(String value) {
            addCriterion("videocard like", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardNotLike(String value) {
            addCriterion("videocard not like", value, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardIn(List<String> values) {
            addCriterion("videocard in", values, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardNotIn(List<String> values) {
            addCriterion("videocard not in", values, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardBetween(String value1, String value2) {
            addCriterion("videocard between", value1, value2, "videocard");
            return (Criteria) this;
        }

        public Criteria andVideocardNotBetween(String value1, String value2) {
            addCriterion("videocard not between", value1, value2, "videocard");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(String value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(String value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(String value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(String value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(String value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(String value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLike(String value) {
            addCriterion("display like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotLike(String value) {
            addCriterion("display not like", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<String> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<String> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(String value1, String value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(String value1, String value2) {
            addCriterion("display not between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andHddIsNull() {
            addCriterion("hdd is null");
            return (Criteria) this;
        }

        public Criteria andHddIsNotNull() {
            addCriterion("hdd is not null");
            return (Criteria) this;
        }

        public Criteria andHddEqualTo(String value) {
            addCriterion("hdd =", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddNotEqualTo(String value) {
            addCriterion("hdd <>", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddGreaterThan(String value) {
            addCriterion("hdd >", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddGreaterThanOrEqualTo(String value) {
            addCriterion("hdd >=", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddLessThan(String value) {
            addCriterion("hdd <", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddLessThanOrEqualTo(String value) {
            addCriterion("hdd <=", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddLike(String value) {
            addCriterion("hdd like", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddNotLike(String value) {
            addCriterion("hdd not like", value, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddIn(List<String> values) {
            addCriterion("hdd in", values, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddNotIn(List<String> values) {
            addCriterion("hdd not in", values, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddBetween(String value1, String value2) {
            addCriterion("hdd between", value1, value2, "hdd");
            return (Criteria) this;
        }

        public Criteria andHddNotBetween(String value1, String value2) {
            addCriterion("hdd not between", value1, value2, "hdd");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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