package com.xgc.blog.po;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "t_type")
@NoArgsConstructor
@Data
@ToString
public class Type {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "分类名称不能为空")
    private String name;

    //关系被维护端
    @OneToMany(mappedBy = "type")
    private List<Blog> blogs = new ArrayList<>();
}
