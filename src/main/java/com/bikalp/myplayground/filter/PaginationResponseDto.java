package com.bikalp.myplayground.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaginationResponseDto<T> {

    private List<T> content;

    private long totalElements;

    private long totalPages;

    private Long nextPage;

    private int currentPage;

    private int pageSize;
}
