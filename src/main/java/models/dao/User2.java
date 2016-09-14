package models.dao;

/**
 * @author gacl
 *         users表所对应的实体类
 */
public class User2 {

    //实体类的属性和表的字段名称一一对应
    private int id;
    private String name;
    private int age;

    public User2(int id, String name, int age) {
        id = id;
        name = name;
        age = age;
    }

    public User2() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}