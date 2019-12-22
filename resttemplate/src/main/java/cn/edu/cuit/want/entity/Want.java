package cn.edu.cuit.want.entity;

import lombok.*;

import java.io.Serializable;
import java.util.Date;

/**
 * (Want)实体类
 *
 * @author fpc
 * create on 2019-12-22 16:46:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Want implements Serializable {
    private static final long serialVersionUID = -72701046737603776L;

    private Integer id;
    private String name;
    private Integer amount;
    private Double price;
    private String remark;
    private Date date;
    private Integer status;
    
}