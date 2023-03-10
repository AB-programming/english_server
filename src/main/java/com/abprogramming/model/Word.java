package com.abprogramming.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Word {
    @TableId
    private Long id;
    private String eng;
    private String chi;
    private String color;
    private String wid;
}
