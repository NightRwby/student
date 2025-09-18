package com.example.demo.RestController;

import com.example.demo.Dto.MemoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/rest2")
public class RestTest2Controller {

    @GetMapping("/test1")
    @ResponseBody
    public String t1() {
        log.info("GET /rest2/test1...");
        return "HELLOWORLD";
    }


}
