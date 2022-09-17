public class AuthorWriteOnly {
    String name;
    String gender;

    AuthorWriteOnly(String name,String gender){
        this.name=name;
        this.gender=gender;
    }
public void setName(String name){
    this.name=name;
}

void setGender(String gender){
    this.gender=gender;
}




}
