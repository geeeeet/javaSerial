package lrf.serial.serializable;

import lrf.serial.externalizable.People;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {

    public static void main(String[] args) {

        try {
            // 设置属性值
            People people = new People();
            people.setName("lrf");
            people.setAge(21);
            people.setPhone("100001");
            // 序列化
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\Externalizable.txt"));
            outputStream.writeObject(people);
            System.out.println("序列化成功！！！");

            // 反序列化
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\Externalizable.txt"));
            People people1 = (People) inputStream.readObject();
            System.out.println("name:"+people1.getName());
            System.out.println("age:"+people1.getAge());
            System.out.println("phone:"+people1.getPhone());
            System.out.println("反序列化成功！！！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
