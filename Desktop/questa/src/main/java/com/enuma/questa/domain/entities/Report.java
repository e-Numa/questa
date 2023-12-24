package com.enuma.questa.domain.entities;

import com.enuma.questa.domain.entities.base.Base;
import com.enuma.questa.domain.entities.jobpost.JobPost;
import com.enuma.questa.domain.entities.jobseeker.JobSeeker;
import com.enuma.questa.domain.enums.ReportCat;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reports")
public class Report extends Base {
    private String comment;

    @Enumerated(value = EnumType.STRING)
    private ReportCat report_category;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "job_post_id")
    private JobPost jobPost;
}
