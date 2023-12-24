package com.enuma.questa.domain.entities.notification;

import com.enuma.questa.domain.entities.base.Base;
import com.enuma.questa.domain.entities.jobpost.JobPost;
import com.enuma.questa.domain.entities.jobseeker.JobSeeker;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "notifications")
public class Notification extends Base {

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private JobSeeker recipient;

    private String message;

    private boolean read;

    @ManyToOne
    @JoinColumn(name = "related_job_post_id")
    private JobPost relatedJobPost;
}

