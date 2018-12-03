package cn.ezios.wj.practice.bean;

public class CustomerBean {
    /**
    * id
    */
    private String id;

    /**
    * name
    */
    private String name;
    /**
    * wangted
    */
    private String wanted;

    public CustomerBean() {
    }

    public CustomerBean(String id, String name, String wanted) {
        this.id = id;
        this.name = name;
        this.wanted = wanted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWanted() {
        return wanted;
    }

    public void setWanted(String wanted) {
        this.wanted = wanted;
    }

    @Override
    public String toString() {
        return "CustomerBean{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", wanted='" + wanted + '\'' +
                '}';
    }
}
