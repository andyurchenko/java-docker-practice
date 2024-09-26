package ru.thumbtack.dockerpracticejava.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.redis.core.RedisHash;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("sessions")
public class Session extends BaseEntity{

    private String userName;

    private Integer countOfRequests;

}
