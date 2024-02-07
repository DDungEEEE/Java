package jpa.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="MEMBER")
@NoArgsConstructor
public class Member {
    @Id
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String username;

    private Integer age;

}
