package com.cpw.entry;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Data
public class Person {
    private  String name;
    private  String age;
    private  String address;
    private  String sex;
    static enum SingletonEnum{
        INSTANCE;
        private Person person;

        private SingletonEnum() {
            person=new Person();
        }
        public Person getPersonInstance(){
            return person;
        }
    }
    public  static Person getInstance(){return SingletonEnum.INSTANCE.getPersonInstance();}
}
