/**
 * Created by Murik on 01.05.2015.
 */
public class Address {
    String name;
    String phone;
    String mail;

    public Address(String name, String phone, String mail) {
        this.name = name;
        this.phone = phone;
        this.mail = mail;
    }
    @Override
        public String toString() {
            return  "name = " + name + ", phone = " + phone + ",mail = " + mail;
        }
}
