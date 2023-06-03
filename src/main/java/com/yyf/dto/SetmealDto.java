package com.yyf.dto;

import com.yyf.entity.Setmeal;
import com.yyf.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
