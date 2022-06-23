package com.example.promise.pharmacy.application.dto.time;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TimeDto {
    private long id;
    private String mon_start;
    private String mon_end;
    private String tue_start;
    private String tue_end;
    private String wed_start;
    private String wed_end;
    private String thu_start;
    private String thu_end;
    private String fri_start;
    private String fri_end;
    private String sat_start;
    private String sat_end;
    private String sun_start;
    private String sun_end;
    private String hol_start;
    private String hol_end;
}
