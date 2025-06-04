package com.bikalp.myplayground.filter;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class FilterRequest {
    private Long currentPage;

    private Long pageSize;

    private FilterRequestParam filterParams;

}
