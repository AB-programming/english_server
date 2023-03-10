package com.abprogramming.controller;

import com.abprogramming.model.Word;
import com.abprogramming.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping("/selectWord")
    public List<Word> selectWord(String wid) {
        return wordService.selectWord(wid);
    }

    @PostMapping("/deleteWordByEngAndWid")
    public Integer deleteWordByEngAndWid(String eng, String wid) {
        return wordService.deleteWordByEngAndWid(eng, wid);
    }

    @PostMapping("/addWord")
    public Integer addWord(Word word) {
        return wordService.addWord(word);
    }
}
