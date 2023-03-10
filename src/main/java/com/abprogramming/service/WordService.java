package com.abprogramming.service;

import com.abprogramming.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;
public interface WordService {
    List<Word> selectWord(String wid);

    Integer deleteWordByEngAndWid(String eng, String wid);

    Integer addWord(Word word);
}
