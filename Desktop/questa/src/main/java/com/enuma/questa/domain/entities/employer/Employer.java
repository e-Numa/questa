package com.enuma.questa.domain.entities.employer;

import com.enuma.questa.domain.entities.base.Person;
import com.enuma.questa.domain.entities.jobpost.JobPost;
import com.enuma.questa.domain.enums.CompanyType;
import com.enuma.questa.domain.enums.Industry;
import com.enuma.questa.domain.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employer")
public class Employer extends Person {
    private String companyName;

    private String companyDescription;

    private Long numberOfEmployees;

    private String website;

    private String facebook;

    private String twitter;

    private String instagram;

    private String position;

    @Enumerated(value = EnumType.STRING)
    private CompanyType companyType;

    @Enumerated(value = EnumType.STRING)
    private Industry industry;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "employer", cascade = CascadeType.ALL)
    private Set<JobPost> JobPosts = new HashSet<>();
}
