package com.cn.kitty.mapper;

import com.cn.kitty.bean.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WordMapper {
    @Select({
            "SELECT *,RAND() as r FROM word_two ORDER BY r LIMIT 0,20"
    })
    List<Word>getTwentyWords();

    @Select({
            "SELECT *,RAND() as r FROM word_two ORDER BY r LIMIT 0,#{sum}"
    })
    List<Word>getWordsByNum(Integer num);
}
