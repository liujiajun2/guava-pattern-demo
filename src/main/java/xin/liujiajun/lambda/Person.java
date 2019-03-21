package xin.liujiajun.lambda;

/**
 * @author liujiajun
 * @description
 * @create 2019-03-21 10:44
 **/
public class Person {

    private String name;
    private Integer age;
    private Integer gender;

    public Person(){
        this("");
    }

    public Person(String name){
        this(name,0);
    }
    public Person(String name,Integer age){
        this(name,age,0);
    }

    public Person(String name,Integer age,Integer gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
