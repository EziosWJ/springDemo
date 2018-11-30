package cn.ezios.wj.practice;

public class Parent {

    public Parent() {
    }
    /**
    * 身份证号
    */
    private String idCard;
    /**
    * 姓名
    */
    private String name;
    /**
    * 年龄
    */
    private Integer age;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "parent{" +
                "idCard='" + idCard + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
