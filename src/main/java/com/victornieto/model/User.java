package com.victornieto.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * Created by victor.nieto.castan on 26/06/2017.
 */
@Data
public class User {
    @Id
    private Long id ;
    private String name ;
    private String surname ;
    private String address ;
    private String password ;
}
