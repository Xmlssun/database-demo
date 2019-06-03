package org.newit.microservice.model;

import java.util.Date;

public class UserEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.created_time
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private Date createdTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.usercol
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private String usercol;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.nick_name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.memo
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    private String memo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.name
     *
     * @return the value of user.name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.name
     *
     * @param name the value for user.name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.created_time
     *
     * @return the value of user.created_time
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.created_time
     *
     * @param createdTime the value for user.created_time
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.usercol
     *
     * @return the value of user.usercol
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public String getUsercol() {
        return usercol;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.usercol
     *
     * @param usercol the value for user.usercol
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setUsercol(String usercol) {
        this.usercol = usercol == null ? null : usercol.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.nick_name
     *
     * @return the value of user.nick_name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.nick_name
     *
     * @param nickName the value for user.nick_name
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.memo
     *
     * @return the value of user.memo
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.memo
     *
     * @param memo the value for user.memo
     *
     * @mbg.generated Mon Jun 03 19:54:26 CST 2019
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}