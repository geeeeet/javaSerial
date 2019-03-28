package lrf.serial.externalizable;

import java.io.*;

/**
 * 实体类实现了Externalizable接口，需要重写
 * writeExternal和readExternal方法，实现自定义
 * 的序列化
 */
public class People implements Externalizable{

    private static final long serialVersionUID = 4242424L;
    private String another;
    private String name;
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

    /**
     * 这里必须实现这两个方法，否则所有的属性均不能被序列化
     * @param out
     * @throws IOException
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(age);
        // 我们测试不序列化phone属性
//        out.writeObject(phone);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        this.age = (int) in.readObject();
//        this.phone = (String) in.readObject();
    }
}