package com.cpw.entry;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
public class Person implements Cloneable{
    private  String name;
    private  String age;
    private  String address;
    private  String sex;
    private Date birthDay;
    public Person clone() throws CloneNotSupportedException {
        Person  person = (Person) super.clone();
        person.birthDay=new Date(100000);
        return person;
    }

    static enum SingletonEnum{
        INSTANCE(1);
        private Person person;
        private int id;
        private SingletonEnum(int id) {
            person=new Person();
            this.id=id+1;
            System.out.println(id);
        }
        public Person getPersonInstance(){
            return person;
        }
    }
    public  static Person getInstance(){return SingletonEnum.INSTANCE.getPersonInstance();}
}
