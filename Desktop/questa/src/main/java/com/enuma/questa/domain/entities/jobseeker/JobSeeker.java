package com.enuma.questa.domain.entities.jobseeker;

import com.enuma.questa.domain.entities.Report;
import com.enuma.questa.domain.entities.base.Person;
import com.enuma.questa.domain.entities.jobpost.Applications;
import com.enuma.questa.domain.entities.jobseeker.profile.*;
import com.enuma.questa.domain.enums.Gender;
import com.enuma.questa.domain.enums.JobType;
import com.enuma.questa.domain.enums.PayRate;
import com.enuma.questa.domain.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "job_seeker")
public class JobSeeker extends Person {
    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    private LocalDate dateOfBirth;

    private String resume;

    private String coverLetter;

    private String workSchedule;

    private String basePay;

    @Enumerated(EnumType.STRING)
    private PayRate payRate;

    @Enumerated(EnumType.STRING)
    private JobType jobType;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<WorkExperience> workExperiences = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Education> educations = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Skills> skills = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<License> licenses = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Certification> certifications = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Language> languages = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<JobPreference> jobPreferences = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Applications> applications = new HashSet<>();

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Report> report = new HashSet<>();
}