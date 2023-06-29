package com.ale.englishnote.service;

import com.ale.englishnote.model.Word;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileParser {

    public ArrayList<Word> getFileData() {
        try {
            File file = new ClassPathResource("/static/english.json").getFile();
            ObjectMapper mapper = new ObjectMapper();
            ArrayList<Word> data = mapper.readValue(file, new TypeReference<>(){});
            return data;
        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
