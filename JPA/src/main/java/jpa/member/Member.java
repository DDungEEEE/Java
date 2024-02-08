package jpa.member;

import jakarta.persistence.*;
import jpa.dto.RoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import java.util.Date;

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

    //추가
    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIME)
    private Date lastModifiedDate;

    @Lob
    private String description;
    
}
