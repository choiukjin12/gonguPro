package com.example.gongu.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class LikeDto {
   private Long fileNumber;
   private Long userNumber;
   private Long studyNumber;
}
