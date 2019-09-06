package com.simian.demo_vhr.common;

import com.simian.demo_vhr.pojo.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

public class HrUtils {
    public static Hr getCurrentHr(){
        return (Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
