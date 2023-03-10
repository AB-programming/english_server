package com.abprogramming.service.impl;

import com.abprogramming.mapper.WordMapper;
import com.abprogramming.model.Word;
import com.abprogramming.service.WordService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public List<Word> selectWord(String wid) {
        return wordMapper.selectList((Wrapper<Word>) new QueryWrapper().eq("wid", wid));
    }

    @Override
    public Integer deleteWordByEngAndWid(String eng, String wid) {
        Map<String, Object> delMap = new HashMap<>();
        delMap.put("eng", eng);
        delMap.put("wid", wid);
        return wordMapper.deleteByMap(delMap);
    }

    @Override
    public Integer addWord(Word word) {
        return wordMapper.insert(word);
    }
}
