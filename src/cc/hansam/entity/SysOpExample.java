package cc.hansam.entity;

import java.util.ArrayList;
import java.util.List;

public class SysOpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysOpExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNull() {
            addCriterion("OP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOpCodeIsNotNull() {
            addCriterion("OP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOpCodeEqualTo(String value) {
            addCriterion("OP_CODE =", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotEqualTo(String value) {
            addCriterion("OP_CODE <>", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThan(String value) {
            addCriterion("OP_CODE >", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OP_CODE >=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThan(String value) {
            addCriterion("OP_CODE <", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLessThanOrEqualTo(String value) {
            addCriterion("OP_CODE <=", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeLike(String value) {
            addCriterion("OP_CODE like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotLike(String value) {
            addCriterion("OP_CODE not like", value, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeIn(List<String> values) {
            addCriterion("OP_CODE in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotIn(List<String> values) {
            addCriterion("OP_CODE not in", values, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeBetween(String value1, String value2) {
            addCriterion("OP_CODE between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpCodeNotBetween(String value1, String value2) {
            addCriterion("OP_CODE not between", value1, value2, "opCode");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNull() {
            addCriterion("OP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOpNameIsNotNull() {
            addCriterion("OP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOpNameEqualTo(String value) {
            addCriterion("OP_NAME =", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotEqualTo(String value) {
            addCriterion("OP_NAME <>", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThan(String value) {
            addCriterion("OP_NAME >", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameGreaterThanOrEqualTo(String value) {
            addCriterion("OP_NAME >=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThan(String value) {
            addCriterion("OP_NAME <", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLessThanOrEqualTo(String value) {
            addCriterion("OP_NAME <=", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameLike(String value) {
            addCriterion("OP_NAME like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotLike(String value) {
            addCriterion("OP_NAME not like", value, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameIn(List<String> values) {
            addCriterion("OP_NAME in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotIn(List<String> values) {
            addCriterion("OP_NAME not in", values, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameBetween(String value1, String value2) {
            addCriterion("OP_NAME between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andOpNameNotBetween(String value1, String value2) {
            addCriterion("OP_NAME not between", value1, value2, "opName");
            return (Criteria) this;
        }

        public Criteria andOpKindIsNull() {
            addCriterion("OP_KIND is null");
            return (Criteria) this;
        }

        public Criteria andOpKindIsNotNull() {
            addCriterion("OP_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andOpKindEqualTo(Short value) {
            addCriterion("OP_KIND =", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindNotEqualTo(Short value) {
            addCriterion("OP_KIND <>", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindGreaterThan(Short value) {
            addCriterion("OP_KIND >", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindGreaterThanOrEqualTo(Short value) {
            addCriterion("OP_KIND >=", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindLessThan(Short value) {
            addCriterion("OP_KIND <", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindLessThanOrEqualTo(Short value) {
            addCriterion("OP_KIND <=", value, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindIn(List<Short> values) {
            addCriterion("OP_KIND in", values, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindNotIn(List<Short> values) {
            addCriterion("OP_KIND not in", values, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindBetween(Short value1, Short value2) {
            addCriterion("OP_KIND between", value1, value2, "opKind");
            return (Criteria) this;
        }

        public Criteria andOpKindNotBetween(Short value1, Short value2) {
            addCriterion("OP_KIND not between", value1, value2, "opKind");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNull() {
            addCriterion("MOBILE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMobileNoIsNotNull() {
            addCriterion("MOBILE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNoEqualTo(String value) {
            addCriterion("MOBILE_NO =", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotEqualTo(String value) {
            addCriterion("MOBILE_NO <>", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThan(String value) {
            addCriterion("MOBILE_NO >", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO >=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThan(String value) {
            addCriterion("MOBILE_NO <", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_NO <=", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoLike(String value) {
            addCriterion("MOBILE_NO like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotLike(String value) {
            addCriterion("MOBILE_NO not like", value, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoIn(List<String> values) {
            addCriterion("MOBILE_NO in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotIn(List<String> values) {
            addCriterion("MOBILE_NO not in", values, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoBetween(String value1, String value2) {
            addCriterion("MOBILE_NO between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andMobileNoNotBetween(String value1, String value2) {
            addCriterion("MOBILE_NO not between", value1, value2, "mobileNo");
            return (Criteria) this;
        }

        public Criteria andEmailAdressIsNull() {
            addCriterion("EMAIL_ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andEmailAdressIsNotNull() {
            addCriterion("EMAIL_ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAdressEqualTo(String value) {
            addCriterion("EMAIL_ADRESS =", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressNotEqualTo(String value) {
            addCriterion("EMAIL_ADRESS <>", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressGreaterThan(String value) {
            addCriterion("EMAIL_ADRESS >", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADRESS >=", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressLessThan(String value) {
            addCriterion("EMAIL_ADRESS <", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ADRESS <=", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressLike(String value) {
            addCriterion("EMAIL_ADRESS like", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressNotLike(String value) {
            addCriterion("EMAIL_ADRESS not like", value, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressIn(List<String> values) {
            addCriterion("EMAIL_ADRESS in", values, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressNotIn(List<String> values) {
            addCriterion("EMAIL_ADRESS not in", values, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressBetween(String value1, String value2) {
            addCriterion("EMAIL_ADRESS between", value1, value2, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andEmailAdressNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ADRESS not between", value1, value2, "emailAdress");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNull() {
            addCriterion("LOGIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNotNull() {
            addCriterion("LOGIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeEqualTo(String value) {
            addCriterion("LOGIN_CODE =", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotEqualTo(String value) {
            addCriterion("LOGIN_CODE <>", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThan(String value) {
            addCriterion("LOGIN_CODE >", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_CODE >=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThan(String value) {
            addCriterion("LOGIN_CODE <", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_CODE <=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLike(String value) {
            addCriterion("LOGIN_CODE like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotLike(String value) {
            addCriterion("LOGIN_CODE not like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIn(List<String> values) {
            addCriterion("LOGIN_CODE in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotIn(List<String> values) {
            addCriterion("LOGIN_CODE not in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeBetween(String value1, String value2) {
            addCriterion("LOGIN_CODE between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotBetween(String value1, String value2) {
            addCriterion("LOGIN_CODE not between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdIsNull() {
            addCriterion("LOGIN_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdIsNotNull() {
            addCriterion("LOGIN_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdEqualTo(String value) {
            addCriterion("LOGIN_PASSWD =", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotEqualTo(String value) {
            addCriterion("LOGIN_PASSWD <>", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdGreaterThan(String value) {
            addCriterion("LOGIN_PASSWD >", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWD >=", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLessThan(String value) {
            addCriterion("LOGIN_PASSWD <", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_PASSWD <=", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdLike(String value) {
            addCriterion("LOGIN_PASSWD like", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotLike(String value) {
            addCriterion("LOGIN_PASSWD not like", value, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdIn(List<String> values) {
            addCriterion("LOGIN_PASSWD in", values, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotIn(List<String> values) {
            addCriterion("LOGIN_PASSWD not in", values, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWD between", value1, value2, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andLoginPasswdNotBetween(String value1, String value2) {
            addCriterion("LOGIN_PASSWD not between", value1, value2, "loginPasswd");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("NOTES is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("NOTES =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("NOTES <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("NOTES >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("NOTES >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("NOTES <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("NOTES <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("NOTES like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("NOTES not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("NOTES in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("NOTES not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("NOTES between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("NOTES not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdIsNull() {
            addCriterion("ALLOW_CHANGE_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdIsNotNull() {
            addCriterion("ALLOW_CHANGE_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdEqualTo(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD =", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdNotEqualTo(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD <>", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdGreaterThan(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD >", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdGreaterThanOrEqualTo(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD >=", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdLessThan(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD <", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdLessThanOrEqualTo(Short value) {
            addCriterion("ALLOW_CHANGE_PASSWD <=", value, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdIn(List<Short> values) {
            addCriterion("ALLOW_CHANGE_PASSWD in", values, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdNotIn(List<Short> values) {
            addCriterion("ALLOW_CHANGE_PASSWD not in", values, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdBetween(Short value1, Short value2) {
            addCriterion("ALLOW_CHANGE_PASSWD between", value1, value2, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andAllowChangePasswdNotBetween(Short value1, Short value2) {
            addCriterion("ALLOW_CHANGE_PASSWD not between", value1, value2, "allowChangePasswd");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIsNull() {
            addCriterion("LAST_LOGIN_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIsNotNull() {
            addCriterion("LAST_LOGIN_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdEqualTo(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID =", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotEqualTo(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID <>", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdGreaterThan(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID >", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID >=", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdLessThan(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID <", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdLessThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_LOG_ID <=", value, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdIn(List<Long> values) {
            addCriterion("LAST_LOGIN_LOG_ID in", values, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotIn(List<Long> values) {
            addCriterion("LAST_LOGIN_LOG_ID not in", values, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_LOG_ID between", value1, value2, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginLogIdNotBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_LOG_ID not between", value1, value2, "lastLoginLogId");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Long value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Long value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Long> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Long> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNull() {
            addCriterion("TRY_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTryTimesIsNotNull() {
            addCriterion("TRY_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTryTimesEqualTo(Integer value) {
            addCriterion("TRY_TIMES =", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotEqualTo(Integer value) {
            addCriterion("TRY_TIMES <>", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThan(Integer value) {
            addCriterion("TRY_TIMES >", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES >=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThan(Integer value) {
            addCriterion("TRY_TIMES <", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesLessThanOrEqualTo(Integer value) {
            addCriterion("TRY_TIMES <=", value, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesIn(List<Integer> values) {
            addCriterion("TRY_TIMES in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotIn(List<Integer> values) {
            addCriterion("TRY_TIMES not in", values, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andTryTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("TRY_TIMES not between", value1, value2, "tryTimes");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNull() {
            addCriterion("LOGIN_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIsNotNull() {
            addCriterion("LOGIN_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFlagEqualTo(Short value) {
            addCriterion("LOGIN_FLAG =", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotEqualTo(Short value) {
            addCriterion("LOGIN_FLAG <>", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThan(Short value) {
            addCriterion("LOGIN_FLAG >", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("LOGIN_FLAG >=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThan(Short value) {
            addCriterion("LOGIN_FLAG <", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagLessThanOrEqualTo(Short value) {
            addCriterion("LOGIN_FLAG <=", value, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagIn(List<Short> values) {
            addCriterion("LOGIN_FLAG in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotIn(List<Short> values) {
            addCriterion("LOGIN_FLAG not in", values, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagBetween(Short value1, Short value2) {
            addCriterion("LOGIN_FLAG between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andLoginFlagNotBetween(Short value1, Short value2) {
            addCriterion("LOGIN_FLAG not between", value1, value2, "loginFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagIsNull() {
            addCriterion("SUPER_USER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagIsNotNull() {
            addCriterion("SUPER_USER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagEqualTo(Short value) {
            addCriterion("SUPER_USER_FLAG =", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagNotEqualTo(Short value) {
            addCriterion("SUPER_USER_FLAG <>", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagGreaterThan(Short value) {
            addCriterion("SUPER_USER_FLAG >", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("SUPER_USER_FLAG >=", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagLessThan(Short value) {
            addCriterion("SUPER_USER_FLAG <", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagLessThanOrEqualTo(Short value) {
            addCriterion("SUPER_USER_FLAG <=", value, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagIn(List<Short> values) {
            addCriterion("SUPER_USER_FLAG in", values, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagNotIn(List<Short> values) {
            addCriterion("SUPER_USER_FLAG not in", values, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagBetween(Short value1, Short value2) {
            addCriterion("SUPER_USER_FLAG between", value1, value2, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andSuperUserFlagNotBetween(Short value1, Short value2) {
            addCriterion("SUPER_USER_FLAG not between", value1, value2, "superUserFlag");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysIsNull() {
            addCriterion("PASSWD_VALID_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysIsNotNull() {
            addCriterion("PASSWD_VALID_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysEqualTo(Long value) {
            addCriterion("PASSWD_VALID_DAYS =", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysNotEqualTo(Long value) {
            addCriterion("PASSWD_VALID_DAYS <>", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysGreaterThan(Long value) {
            addCriterion("PASSWD_VALID_DAYS >", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysGreaterThanOrEqualTo(Long value) {
            addCriterion("PASSWD_VALID_DAYS >=", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysLessThan(Long value) {
            addCriterion("PASSWD_VALID_DAYS <", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysLessThanOrEqualTo(Long value) {
            addCriterion("PASSWD_VALID_DAYS <=", value, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysIn(List<Long> values) {
            addCriterion("PASSWD_VALID_DAYS in", values, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysNotIn(List<Long> values) {
            addCriterion("PASSWD_VALID_DAYS not in", values, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysBetween(Long value1, Long value2) {
            addCriterion("PASSWD_VALID_DAYS between", value1, value2, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andPasswdValidDaysNotBetween(Long value1, Long value2) {
            addCriterion("PASSWD_VALID_DAYS not between", value1, value2, "passwdValidDays");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNull() {
            addCriterion("LOCK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLockFlagIsNotNull() {
            addCriterion("LOCK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLockFlagEqualTo(Short value) {
            addCriterion("LOCK_FLAG =", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotEqualTo(Short value) {
            addCriterion("LOCK_FLAG <>", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThan(Short value) {
            addCriterion("LOCK_FLAG >", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("LOCK_FLAG >=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThan(Short value) {
            addCriterion("LOCK_FLAG <", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagLessThanOrEqualTo(Short value) {
            addCriterion("LOCK_FLAG <=", value, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagIn(List<Short> values) {
            addCriterion("LOCK_FLAG in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotIn(List<Short> values) {
            addCriterion("LOCK_FLAG not in", values, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagBetween(Short value1, Short value2) {
            addCriterion("LOCK_FLAG between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andLockFlagNotBetween(Short value1, Short value2) {
            addCriterion("LOCK_FLAG not between", value1, value2, "lockFlag");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdIsNull() {
            addCriterion("IS_UPDATE_PWD is null");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdIsNotNull() {
            addCriterion("IS_UPDATE_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdEqualTo(Short value) {
            addCriterion("IS_UPDATE_PWD =", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdNotEqualTo(Short value) {
            addCriterion("IS_UPDATE_PWD <>", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdGreaterThan(Short value) {
            addCriterion("IS_UPDATE_PWD >", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_UPDATE_PWD >=", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdLessThan(Short value) {
            addCriterion("IS_UPDATE_PWD <", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdLessThanOrEqualTo(Short value) {
            addCriterion("IS_UPDATE_PWD <=", value, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdIn(List<Short> values) {
            addCriterion("IS_UPDATE_PWD in", values, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdNotIn(List<Short> values) {
            addCriterion("IS_UPDATE_PWD not in", values, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdBetween(Short value1, Short value2) {
            addCriterion("IS_UPDATE_PWD between", value1, value2, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andIsUpdatePwdNotBetween(Short value1, Short value2) {
            addCriterion("IS_UPDATE_PWD not between", value1, value2, "isUpdatePwd");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeIsNull() {
            addCriterion("LOGIN_AUTH_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeIsNotNull() {
            addCriterion("LOGIN_AUTH_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeEqualTo(String value) {
            addCriterion("LOGIN_AUTH_CODE =", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeNotEqualTo(String value) {
            addCriterion("LOGIN_AUTH_CODE <>", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeGreaterThan(String value) {
            addCriterion("LOGIN_AUTH_CODE >", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_AUTH_CODE >=", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeLessThan(String value) {
            addCriterion("LOGIN_AUTH_CODE <", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_AUTH_CODE <=", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeLike(String value) {
            addCriterion("LOGIN_AUTH_CODE like", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeNotLike(String value) {
            addCriterion("LOGIN_AUTH_CODE not like", value, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeIn(List<String> values) {
            addCriterion("LOGIN_AUTH_CODE in", values, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeNotIn(List<String> values) {
            addCriterion("LOGIN_AUTH_CODE not in", values, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeBetween(String value1, String value2) {
            addCriterion("LOGIN_AUTH_CODE between", value1, value2, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andLoginAuthCodeNotBetween(String value1, String value2) {
            addCriterion("LOGIN_AUTH_CODE not between", value1, value2, "loginAuthCode");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNull() {
            addCriterion("CUSTOM_1 is null");
            return (Criteria) this;
        }

        public Criteria andCustom1IsNotNull() {
            addCriterion("CUSTOM_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom1EqualTo(String value) {
            addCriterion("CUSTOM_1 =", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotEqualTo(String value) {
            addCriterion("CUSTOM_1 <>", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThan(String value) {
            addCriterion("CUSTOM_1 >", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_1 >=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThan(String value) {
            addCriterion("CUSTOM_1 <", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1LessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_1 <=", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Like(String value) {
            addCriterion("CUSTOM_1 like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotLike(String value) {
            addCriterion("CUSTOM_1 not like", value, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1In(List<String> values) {
            addCriterion("CUSTOM_1 in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotIn(List<String> values) {
            addCriterion("CUSTOM_1 not in", values, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1Between(String value1, String value2) {
            addCriterion("CUSTOM_1 between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom1NotBetween(String value1, String value2) {
            addCriterion("CUSTOM_1 not between", value1, value2, "custom1");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNull() {
            addCriterion("CUSTOM_2 is null");
            return (Criteria) this;
        }

        public Criteria andCustom2IsNotNull() {
            addCriterion("CUSTOM_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom2EqualTo(String value) {
            addCriterion("CUSTOM_2 =", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotEqualTo(String value) {
            addCriterion("CUSTOM_2 <>", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThan(String value) {
            addCriterion("CUSTOM_2 >", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_2 >=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThan(String value) {
            addCriterion("CUSTOM_2 <", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2LessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_2 <=", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Like(String value) {
            addCriterion("CUSTOM_2 like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotLike(String value) {
            addCriterion("CUSTOM_2 not like", value, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2In(List<String> values) {
            addCriterion("CUSTOM_2 in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotIn(List<String> values) {
            addCriterion("CUSTOM_2 not in", values, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2Between(String value1, String value2) {
            addCriterion("CUSTOM_2 between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom2NotBetween(String value1, String value2) {
            addCriterion("CUSTOM_2 not between", value1, value2, "custom2");
            return (Criteria) this;
        }

        public Criteria andCustom3IsNull() {
            addCriterion("CUSTOM_3 is null");
            return (Criteria) this;
        }

        public Criteria andCustom3IsNotNull() {
            addCriterion("CUSTOM_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom3EqualTo(String value) {
            addCriterion("CUSTOM_3 =", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotEqualTo(String value) {
            addCriterion("CUSTOM_3 <>", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3GreaterThan(String value) {
            addCriterion("CUSTOM_3 >", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3GreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_3 >=", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3LessThan(String value) {
            addCriterion("CUSTOM_3 <", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3LessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_3 <=", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3Like(String value) {
            addCriterion("CUSTOM_3 like", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotLike(String value) {
            addCriterion("CUSTOM_3 not like", value, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3In(List<String> values) {
            addCriterion("CUSTOM_3 in", values, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotIn(List<String> values) {
            addCriterion("CUSTOM_3 not in", values, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3Between(String value1, String value2) {
            addCriterion("CUSTOM_3 between", value1, value2, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom3NotBetween(String value1, String value2) {
            addCriterion("CUSTOM_3 not between", value1, value2, "custom3");
            return (Criteria) this;
        }

        public Criteria andCustom4IsNull() {
            addCriterion("CUSTOM_4 is null");
            return (Criteria) this;
        }

        public Criteria andCustom4IsNotNull() {
            addCriterion("CUSTOM_4 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom4EqualTo(Long value) {
            addCriterion("CUSTOM_4 =", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotEqualTo(Long value) {
            addCriterion("CUSTOM_4 <>", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4GreaterThan(Long value) {
            addCriterion("CUSTOM_4 >", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4GreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_4 >=", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4LessThan(Long value) {
            addCriterion("CUSTOM_4 <", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4LessThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_4 <=", value, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4In(List<Long> values) {
            addCriterion("CUSTOM_4 in", values, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotIn(List<Long> values) {
            addCriterion("CUSTOM_4 not in", values, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4Between(Long value1, Long value2) {
            addCriterion("CUSTOM_4 between", value1, value2, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom4NotBetween(Long value1, Long value2) {
            addCriterion("CUSTOM_4 not between", value1, value2, "custom4");
            return (Criteria) this;
        }

        public Criteria andCustom5IsNull() {
            addCriterion("CUSTOM_5 is null");
            return (Criteria) this;
        }

        public Criteria andCustom5IsNotNull() {
            addCriterion("CUSTOM_5 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom5EqualTo(Long value) {
            addCriterion("CUSTOM_5 =", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotEqualTo(Long value) {
            addCriterion("CUSTOM_5 <>", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5GreaterThan(Long value) {
            addCriterion("CUSTOM_5 >", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5GreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_5 >=", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5LessThan(Long value) {
            addCriterion("CUSTOM_5 <", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5LessThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_5 <=", value, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5In(List<Long> values) {
            addCriterion("CUSTOM_5 in", values, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotIn(List<Long> values) {
            addCriterion("CUSTOM_5 not in", values, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5Between(Long value1, Long value2) {
            addCriterion("CUSTOM_5 between", value1, value2, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom5NotBetween(Long value1, Long value2) {
            addCriterion("CUSTOM_5 not between", value1, value2, "custom5");
            return (Criteria) this;
        }

        public Criteria andCustom6IsNull() {
            addCriterion("CUSTOM_6 is null");
            return (Criteria) this;
        }

        public Criteria andCustom6IsNotNull() {
            addCriterion("CUSTOM_6 is not null");
            return (Criteria) this;
        }

        public Criteria andCustom6EqualTo(Long value) {
            addCriterion("CUSTOM_6 =", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotEqualTo(Long value) {
            addCriterion("CUSTOM_6 <>", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6GreaterThan(Long value) {
            addCriterion("CUSTOM_6 >", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6GreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_6 >=", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6LessThan(Long value) {
            addCriterion("CUSTOM_6 <", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6LessThanOrEqualTo(Long value) {
            addCriterion("CUSTOM_6 <=", value, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6In(List<Long> values) {
            addCriterion("CUSTOM_6 in", values, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotIn(List<Long> values) {
            addCriterion("CUSTOM_6 not in", values, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6Between(Long value1, Long value2) {
            addCriterion("CUSTOM_6 between", value1, value2, "custom6");
            return (Criteria) this;
        }

        public Criteria andCustom6NotBetween(Long value1, Long value2) {
            addCriterion("CUSTOM_6 not between", value1, value2, "custom6");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDomainIdIsNull() {
            addCriterion("DOMAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andDomainIdIsNotNull() {
            addCriterion("DOMAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDomainIdEqualTo(Long value) {
            addCriterion("DOMAIN_ID =", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotEqualTo(Long value) {
            addCriterion("DOMAIN_ID <>", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdGreaterThan(Long value) {
            addCriterion("DOMAIN_ID >", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DOMAIN_ID >=", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdLessThan(Long value) {
            addCriterion("DOMAIN_ID <", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdLessThanOrEqualTo(Long value) {
            addCriterion("DOMAIN_ID <=", value, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdIn(List<Long> values) {
            addCriterion("DOMAIN_ID in", values, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotIn(List<Long> values) {
            addCriterion("DOMAIN_ID not in", values, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdBetween(Long value1, Long value2) {
            addCriterion("DOMAIN_ID between", value1, value2, "domainId");
            return (Criteria) this;
        }

        public Criteria andDomainIdNotBetween(Long value1, Long value2) {
            addCriterion("DOMAIN_ID not between", value1, value2, "domainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdIsNull() {
            addCriterion("USER_DOMAIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdIsNotNull() {
            addCriterion("USER_DOMAIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdEqualTo(Long value) {
            addCriterion("USER_DOMAIN_ID =", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdNotEqualTo(Long value) {
            addCriterion("USER_DOMAIN_ID <>", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdGreaterThan(Long value) {
            addCriterion("USER_DOMAIN_ID >", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_DOMAIN_ID >=", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdLessThan(Long value) {
            addCriterion("USER_DOMAIN_ID <", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_DOMAIN_ID <=", value, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdIn(List<Long> values) {
            addCriterion("USER_DOMAIN_ID in", values, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdNotIn(List<Long> values) {
            addCriterion("USER_DOMAIN_ID not in", values, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdBetween(Long value1, Long value2) {
            addCriterion("USER_DOMAIN_ID between", value1, value2, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andUserDomainIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_DOMAIN_ID not between", value1, value2, "userDomainId");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(Short value) {
            addCriterion("DATA_STATUS =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(Short value) {
            addCriterion("DATA_STATUS <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(Short value) {
            addCriterion("DATA_STATUS >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("DATA_STATUS >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(Short value) {
            addCriterion("DATA_STATUS <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(Short value) {
            addCriterion("DATA_STATUS <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<Short> values) {
            addCriterion("DATA_STATUS in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<Short> values) {
            addCriterion("DATA_STATUS not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(Short value1, Short value2) {
            addCriterion("DATA_STATUS between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(Short value1, Short value2) {
            addCriterion("DATA_STATUS not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("MODIFIER is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("MODIFIER is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(String value) {
            addCriterion("MODIFIER =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(String value) {
            addCriterion("MODIFIER <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(String value) {
            addCriterion("MODIFIER >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFIER >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(String value) {
            addCriterion("MODIFIER <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(String value) {
            addCriterion("MODIFIER <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLike(String value) {
            addCriterion("MODIFIER like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotLike(String value) {
            addCriterion("MODIFIER not like", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<String> values) {
            addCriterion("MODIFIER in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<String> values) {
            addCriterion("MODIFIER not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(String value1, String value2) {
            addCriterion("MODIFIER between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(String value1, String value2) {
            addCriterion("MODIFIER not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Long value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Long value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Long value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Long value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Long value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Long> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Long> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Long value1, Long value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Long value1, Long value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

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