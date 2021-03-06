package org.tmp.enrollment.domain.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class Tournament {

    @Id
    private String id;
    private String organizerName;
    private String name;
    private String place;
    private String description;
    private Sport sport;
    private Strategy strategy;
    private TournamentState state;
    private List<String> referees;
    private Capacity capacity;
    private Enrollment enrollment;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime backupStartTime;
    private LocalDateTime backupEndTime;
}
