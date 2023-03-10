package com.abprogramming.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Concern {
    @TableId
    private String id;
    private String fan;
    private String target;
}
