package lrf.serial.serializable;

import java.io.Serializable;

/**
 * 实体类实现了Serializable接口，意味着对象
 * 会自动进行序列化，不需要实现任何方法
 */
public class People1 implements Serializable{

    private static final long serialVersionUID = 1969583891010536170L;

    // 虽然实现Serializable接口，但是name属性已被transient修饰，是不会被序列化的
    transient private String name;
    private int age;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}