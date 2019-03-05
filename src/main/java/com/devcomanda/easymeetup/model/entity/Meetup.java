package com.devcomanda.easymeetup.model.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "meetup")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@EqualsAndHashCode
@ToString
// TODO We should use custom settings for sequence configuration
// because we use sql files for setting dev data
public class Meetup extends AbstractPersistable<Long> {

    private String name;
    private String address;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;
    private String description;
    private String speaker;

    @ManyToMany(mappedBy = "meetups")
    private List<User> users = new ArrayList<>();

    @Builder
    private Meetup(
            final Long id,
            final String name,
            final String address,
            final LocalDateTime startDate,
            final LocalDateTime endDate,
            final String description,
            final String speaker,
            final List<User> users

    ) {
        super();
        super.setId(id);

        this.name = name;
        this.address = address;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.speaker = speaker;
        this.users = users;
    }
}
