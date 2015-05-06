
public class AddressBook {
    Address[] list = new Address[100];// list это массив класса Address
    int count = 0;// счетчик

    void add (Address newAddress) {
        list[count] = newAddress;
        count++;
    }
    void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(list[i]);
        }
    }
    void delete(){
        int n;
        n = count;
        list[n] = null;
    }

}