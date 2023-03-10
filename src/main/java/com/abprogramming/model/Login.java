package com.abprogramming.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.apache.ibatis.annotations.Param;

@Data
public class Login {

    @TableId
    private String username;
    private String password;
    private String lid;
}
