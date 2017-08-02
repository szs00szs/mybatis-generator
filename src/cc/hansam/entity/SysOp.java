package cc.hansam.entity;

public class SysOp {
    private Long id;

    private String opCode;

    private String opName;

    private Short opKind;

    private String mobileNo;

    private String emailAdress;

    private String loginCode;

    private String loginPasswd;

    private String shortName;

    private String notes;

    private Short allowChangePasswd;

    private Long lastLoginLogId;

    private Long lastLoginTime;

    private Integer tryTimes;

    private Short loginFlag;

    private Short superUserFlag;

    private Long passwdValidDays;

    private Short lockFlag;

    private Short isUpdatePwd;

    private String loginAuthCode;

    private String custom1;

    private String custom2;

    private String custom3;

    private Long custom4;

    private Long custom5;

    private Long custom6;

    private Short status;

    private Long domainId;

    private Long userDomainId;

    private Short dataStatus;

    private String creator;

    private String modifier;

    private Long createTime;

    private Long modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode == null ? null : opCode.trim();
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public Short getOpKind() {
        return opKind;
    }

    public void setOpKind(Short opKind) {
        this.opKind = opKind;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress == null ? null : emailAdress.trim();
    }

    public String getLoginCode() {
        return loginCode;
    }

    public void setLoginCode(String loginCode) {
        this.loginCode = loginCode == null ? null : loginCode.trim();
    }

    public String getLoginPasswd() {
        return loginPasswd;
    }

    public void setLoginPasswd(String loginPasswd) {
        this.loginPasswd = loginPasswd == null ? null : loginPasswd.trim();
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName == null ? null : shortName.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Short getAllowChangePasswd() {
        return allowChangePasswd;
    }

    public void setAllowChangePasswd(Short allowChangePasswd) {
        this.allowChangePasswd = allowChangePasswd;
    }

    public Long getLastLoginLogId() {
        return lastLoginLogId;
    }

    public void setLastLoginLogId(Long lastLoginLogId) {
        this.lastLoginLogId = lastLoginLogId;
    }

    public Long getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Long lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getTryTimes() {
        return tryTimes;
    }

    public void setTryTimes(Integer tryTimes) {
        this.tryTimes = tryTimes;
    }

    public Short getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(Short loginFlag) {
        this.loginFlag = loginFlag;
    }

    public Short getSuperUserFlag() {
        return superUserFlag;
    }

    public void setSuperUserFlag(Short superUserFlag) {
        this.superUserFlag = superUserFlag;
    }

    public Long getPasswdValidDays() {
        return passwdValidDays;
    }

    public void setPasswdValidDays(Long passwdValidDays) {
        this.passwdValidDays = passwdValidDays;
    }

    public Short getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Short lockFlag) {
        this.lockFlag = lockFlag;
    }

    public Short getIsUpdatePwd() {
        return isUpdatePwd;
    }

    public void setIsUpdatePwd(Short isUpdatePwd) {
        this.isUpdatePwd = isUpdatePwd;
    }

    public String getLoginAuthCode() {
        return loginAuthCode;
    }

    public void setLoginAuthCode(String loginAuthCode) {
        this.loginAuthCode = loginAuthCode == null ? null : loginAuthCode.trim();
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    public String getCustom3() {
        return custom3;
    }

    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    public Long getCustom4() {
        return custom4;
    }

    public void setCustom4(Long custom4) {
        this.custom4 = custom4;
    }

    public Long getCustom5() {
        return custom5;
    }

    public void setCustom5(Long custom5) {
        this.custom5 = custom5;
    }

    public Long getCustom6() {
        return custom6;
    }

    public void setCustom6(Long custom6) {
        this.custom6 = custom6;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Long getDomainId() {
        return domainId;
    }

    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    public Long getUserDomainId() {
        return userDomainId;
    }

    public void setUserDomainId(Long userDomainId) {
        this.userDomainId = userDomainId;
    }

    public Short getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Short dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }
}