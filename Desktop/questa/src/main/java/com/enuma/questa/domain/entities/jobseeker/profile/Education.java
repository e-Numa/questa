package com.enuma.questa.domain.entities.jobseeker.profile;

import com.enuma.questa.domain.entities.base.Base;
import com.enuma.questa.domain.entities.jobseeker.JobSeeker;
import com.enuma.questa.domain.enums.EducationLevel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "education")
public class Education extends Base {
    @Enumerated(EnumType.STRING)
    private EducationLevel educationLevel;

    private String fieldOfStudy;

    private String yearOfGraduation;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;
}
