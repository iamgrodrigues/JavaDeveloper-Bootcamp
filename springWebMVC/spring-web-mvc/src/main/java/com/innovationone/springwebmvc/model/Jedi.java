package com.innovationone.springwebmvc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Jedi {

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;
}