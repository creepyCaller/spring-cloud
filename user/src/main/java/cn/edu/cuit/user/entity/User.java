package cn.edu.cuit.user.entity;

import lombok.*;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author fpc
 * create on 2019-12-22 16:45:53
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {
    private static final long serialVersionUID = 826106041301372843L;

    private Integer id;
    private String username;
    private String password;
    private String email;
    private Integer status;
    
}