package cn.ezios.wj.practice.bean;

/**
 * @ClassName CarBean
 * @Description TODO
 * @Date 2018/12/18 21:48
 * @Creaded By wangj
 */
public class CarBean {
    /**
    *
    **/
    private String code;
    /**
    *
    **/
    private String sign;
    /**
    *
    **/
    private String price;

    public CarBean() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarBean{" +
                "code='" + code + '\'' +
                ", sign='" + sign + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
