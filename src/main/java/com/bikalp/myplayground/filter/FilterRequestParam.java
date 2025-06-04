package com.bikalp.myplayground.filter;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilterRequestParam {

    private String name;
    private String email;
    private String phone;

    @JsonGetter("name")
    public String getNameJson() {
        return name != null ? name.strip() : null;
    }

    @JsonGetter("email")
    public String getEmailJson() {
        return email != null ? email.strip() : null;
    }

    @JsonGetter("phone")
    public String getPhoneJson() {
        return phone != null ? phone.strip() : null;
    }
}
