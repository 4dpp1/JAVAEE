package com.homework.pojo;


import com.homework.anno.State;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;
@Data
public class Ware {
    private Integer id;//主键ID
    @NotEmpty
    @Pattern(regexp = "^\\S{1,10}$")
    private String name;//货物名称
    @NotEmpty
    private String content;//内容
    @NotEmpty
    @URL
    private String coverImg;//图像
    @State
    private String state;//状态：入库 出库
    @NotNull
    private Integer categoryId;//货物分类id
    private Integer createUser;//创建人ID
    private LocalDateTime createTime;//创建时间
    private LocalDateTime updateTime;//更新时间
}
