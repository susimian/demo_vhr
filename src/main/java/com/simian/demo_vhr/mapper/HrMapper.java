package com.simian.demo_vhr.mapper;

import com.simian.demo_vhr.pojo.Hr;
import org.springframework.stereotype.Repository;

@Repository
public interface HrMapper {
    Hr loadUserByUsername(String username);
}
