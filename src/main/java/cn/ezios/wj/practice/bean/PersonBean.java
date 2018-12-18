package cn.ezios.wj.practice.bean;

/**
 * @ClassName PersonBean
 * @Description TODO
 * @Date 2018/12/18 22:10
 * @Creaded By Wangj
 */
public class PersonBean {
    /**
    *
    **/
    private String name;
    /**
    *
    **/
    private String age;
    /**
    *
    **/
    private CarBean car;

    public PersonBean() {
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public CarBean getCar() {
        return car;
    }

    public void setCar(CarBean car) {
        this.car = car;
    }
}
