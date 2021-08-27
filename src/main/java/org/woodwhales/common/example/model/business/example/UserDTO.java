package org.woodwhales.common.example.model.business.example;

import lombok.Data;

/**
 * @author woodwhales on 2021-08-27 15:02
 * @description
 */
@Data
public class UserDTO {

    private Integer id;
    private String userName;

    public UserDTO(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
