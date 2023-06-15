package com.CodeLine.Sports_Leaderboard_API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.MappedSuperclass;
import java.util.Date;

// Inhiritance to All other classes, so we don't repeat our code.
@MappedSuperclass

// To auto generate Getter & Setter for Properties
@Getter
@Setter

// Makes it easier to work with your Java classes by generating helpful methods automatically (toString, equals, hashCode)
@Data

public class BaseEntity {
    // Creates Date
@CreatedDate
    Date createdDate;

// Update up tp date
@UpdateTimestamp
    Date updatedDate;
    Boolean isActive;
}
