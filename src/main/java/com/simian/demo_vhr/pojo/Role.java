package com.simian.demo_vhr.pojo;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by sang on 2017/12/28.
 */
@Data
@Getter
@Setter
public class Role implements Serializable {
    private Long id;
    private String name;
    private String nameZh;

}
