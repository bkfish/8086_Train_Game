package com.cn.kitty.service.Impl;

import com.cn.kitty.mapper.WordMapper;
import com.cn.kitty.service.WordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WordServiceImpl implements WordService {
    @Resource
    private WordMapper wordMapper;
    @Override
    public Object getTwentyWords() {
        return wordMapper.getTwentyWords();
    }

    @Override
    public Object getWordsByNum(Integer num) {
        return wordMapper.getWordsByNum(num);
    }
}
