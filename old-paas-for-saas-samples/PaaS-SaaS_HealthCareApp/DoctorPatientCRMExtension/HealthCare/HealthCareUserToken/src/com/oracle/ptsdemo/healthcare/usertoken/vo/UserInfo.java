package com.oracle.ptsdemo.healthcare.usertoken.vo;

import java.io.Serializable;

public class UserInfo implements Serializable {

    @SuppressWarnings("compatibility:-1532139803101331071")
    private static final long serialVersionUID = 1L;
    private String PersonId;
    private String PersonNumber;
    private String UserId;
    private String Username;
    private String UserGUID;
    private String ActiveFlag;
    private String UserDistinguishedName;

    private String Title;
    private String LastName;
    private String FirstName;
    private String MiddleNames;
    private String DisplayName;
    private String Suffix;
    private String Honors;
    private String PreNameAdjunct;
    private String KnownAs;
    private String EmailAddress;
    private String PhoneId;
    private String PhoneAreaCode;
    private String PhoneCountryCodeNumber;
    private String PhoneNumber;

    private String Language;
    private String DateFormat;
    private String TimeFormat;
    private String Currency;
    private String GroupingSeparator;
    private String DecimalSeparator;
    private String TimeZone;
    private String ClientEncoding;
    private String Territory;
    private String FontSize;
    private String AccessibilityMode;
    private String ColorContrast;
    private String ServerTime;
    private String ServerTimeForUserInfo;


    private String BusinessUnitId;
    private String BusinessUnitName;
    private String LegalEntityName;
    private String PersonTypeId;
    private String SystemPersonType;
    private String UserPersonType;

    private String JobName;
    private String DepartmentName;
    private String LocationTownOrCity;
    private String LocationPostalCode;
    private String LocationCountry;


    public UserInfo() {
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getLanguage() {
        return Language;
    }

    public void setDateFormat(String DateFormat) {
        this.DateFormat = DateFormat;
    }

    public String getDateFormat() {
        return DateFormat;
    }

    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public String getTimeFormat() {
        return TimeFormat;
    }

    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setGroupingSeparator(String GroupingSeparator) {
        this.GroupingSeparator = GroupingSeparator;
    }

    public String getGroupingSeparator() {
        return GroupingSeparator;
    }

    public void setDecimalSeparator(String DecimalSeparator) {
        this.DecimalSeparator = DecimalSeparator;
    }

    public String getDecimalSeparator() {
        return DecimalSeparator;
    }

    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    public String getTimeZone() {
        return TimeZone;
    }

    public void setClientEncoding(String ClientEncoding) {
        this.ClientEncoding = ClientEncoding;
    }

    public String getClientEncoding() {
        return ClientEncoding;
    }

    public void setTerritory(String Territory) {
        this.Territory = Territory;
    }

    public String getTerritory() {
        return Territory;
    }

    public void setFontSize(String FontSize) {
        this.FontSize = FontSize;
    }

    public String getFontSize() {
        return FontSize;
    }

    public void setAccessibilityMode(String AccessibilityMode) {
        this.AccessibilityMode = AccessibilityMode;
    }

    public String getAccessibilityMode() {
        return AccessibilityMode;
    }

    public void setColorContrast(String ColorContrast) {
        this.ColorContrast = ColorContrast;
    }

    public String getColorContrast() {
        return ColorContrast;
    }

    public void setServerTimeForUserInfo(String ServerTimeForUserInfo) {
        this.ServerTimeForUserInfo = ServerTimeForUserInfo;
    }

    public String getServerTimeForUserInfo() {
        return ServerTimeForUserInfo;
    }

    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    public String getPersonId() {
        return PersonId;
    }

    public void setPersonNumber(String PersonNumber) {
        this.PersonNumber = PersonNumber;
    }

    public String getPersonNumber() {
        return PersonNumber;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getUsername() {
        return Username;
    }

    public void setUserGUID(String UserGUID) {
        this.UserGUID = UserGUID;
    }

    public String getUserGUID() {
        return UserGUID;
    }

    public void setActiveFlag(String ActiveFlag) {
        this.ActiveFlag = ActiveFlag;
    }

    public String getActiveFlag() {
        return ActiveFlag;
    }

    public void setUserDistinguishedName(String UserDistinguishedName) {
        this.UserDistinguishedName = UserDistinguishedName;
    }

    public String getUserDistinguishedName() {
        return UserDistinguishedName;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getTitle() {
        return Title;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setMiddleNames(String MiddleNames) {
        this.MiddleNames = MiddleNames;
    }

    public String getMiddleNames() {
        return MiddleNames;
    }

    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public void setSuffix(String Suffix) {
        this.Suffix = Suffix;
    }

    public String getSuffix() {
        return Suffix;
    }

    public void setHonors(String Honors) {
        this.Honors = Honors;
    }

    public String getHonors() {
        return Honors;
    }

    public void setPreNameAdjunct(String PreNameAdjunct) {
        this.PreNameAdjunct = PreNameAdjunct;
    }

    public String getPreNameAdjunct() {
        return PreNameAdjunct;
    }

    public void setKnownAs(String KnownAs) {
        this.KnownAs = KnownAs;
    }

    public String getKnownAs() {
        return KnownAs;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setPhoneId(String PhoneId) {
        this.PhoneId = PhoneId;
    }

    public String getPhoneId() {
        return PhoneId;
    }

    public void setPhoneAreaCode(String PhoneAreaCode) {
        this.PhoneAreaCode = PhoneAreaCode;
    }

    public String getPhoneAreaCode() {
        return PhoneAreaCode;
    }

    public void setPhoneCountryCodeNumber(String PhoneCountryCodeNumber) {
        this.PhoneCountryCodeNumber = PhoneCountryCodeNumber;
    }

    public String getPhoneCountryCodeNumber() {
        return PhoneCountryCodeNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setBusinessUnitId(String BusinessUnitId) {
        this.BusinessUnitId = BusinessUnitId;
    }

    public String getBusinessUnitId() {
        return BusinessUnitId;
    }

    public void setBusinessUnitName(String BusinessUnitName) {
        this.BusinessUnitName = BusinessUnitName;
    }

    public String getBusinessUnitName() {
        return BusinessUnitName;
    }

    public void setLegalEntityName(String LegalEntityName) {
        this.LegalEntityName = LegalEntityName;
    }

    public String getLegalEntityName() {
        return LegalEntityName;
    }

    public void setPersonTypeId(String PersonTypeId) {
        this.PersonTypeId = PersonTypeId;
    }

    public String getPersonTypeId() {
        return PersonTypeId;
    }

    public void setSystemPersonType(String SystemPersonType) {
        this.SystemPersonType = SystemPersonType;
    }

    public String getSystemPersonType() {
        return SystemPersonType;
    }

    public void setUserPersonType(String UserPersonType) {
        this.UserPersonType = UserPersonType;
    }

    public String getUserPersonType() {
        return UserPersonType;
    }

    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    public String getJobName() {
        return JobName;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setLocationTownOrCity(String LocationTownOrCity) {
        this.LocationTownOrCity = LocationTownOrCity;
    }

    public String getLocationTownOrCity() {
        return LocationTownOrCity;
    }

    public void setLocationPostalCode(String LocationPostalCode) {
        this.LocationPostalCode = LocationPostalCode;
    }

    public String getLocationPostalCode() {
        return LocationPostalCode;
    }

    public void setLocationCountry(String LocationCountry) {
        this.LocationCountry = LocationCountry;
    }

    public String getLocationCountry() {
        return LocationCountry;
    }

    public void setServerTime(String ServerTime) {
        this.ServerTime = ServerTime;
    }

    public String getServerTime() {
        return ServerTime;
    }
}
