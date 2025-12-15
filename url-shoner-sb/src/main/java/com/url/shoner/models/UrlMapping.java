package com.url.shoner.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class UrlMapping {
    @Id
    private Long id;
    private String Originalurl;
    private String ShortUrl;
    private  int click_count=0;
    private  LocalDateTime createdDate;


}
