package sprproject.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="MEMBER")
@Getter
@Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member(){
    }

    public Member(String username, int age){
        this.username = username;
        this.age = age;
    }
}
