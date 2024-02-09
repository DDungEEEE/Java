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
@Table(name="MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"}
)})
@NoArgsConstructor
public class Member {

    @Id
    @Column(name="ID")
    private String id;

    @Column(name="NAME", nullable = false, length = 10)
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
