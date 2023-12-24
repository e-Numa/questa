package com.enuma.questa.domain.entities.jobseeker.profile;

import com.enuma.questa.domain.entities.base.Base;
import com.enuma.questa.domain.entities.jobseeker.JobSeeker;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "language")
public class Language extends Base {
    private String language;

    private String proficiency;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;
}
