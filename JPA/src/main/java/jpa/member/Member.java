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
@NoArgsConstructor
public class Member {

    @Id
    @Column(name="MEMBER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String city;
    private String street;
    private String zipcode;

//    @Enumerated(EnumType.STRING)
//    private RoleType roleType;
//
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date createdDate;
//
//    @Temporal(TemporalType.TIME)
//    private Date lastModifiedDate;
//
//    @Lob
//    private String description;

}
