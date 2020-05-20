package com.service.reactive.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Table("users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {

    private Long id;

    private String firstName;

    private String lastName;

    private String phone;
}
