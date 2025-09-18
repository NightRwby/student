package com.example.demo.Controller;

import com.example.demo.Domain.Common.Dto.PageDto;
import com.example.demo.Domain.Common.Entity.Memo;
import com.example.demo.Domain.Common.Service.MemoService;
import com.example.demo.Dto.MemoDto;
import com.example.demo.Dto.PersonDto;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@Slf4j
@RequestMapping("/memo")
public class MemoController {

    @GetMapping("/param1")
    @ResponseBody
    public void param1(MemoDto dto) {
        log.info("GET /memo/param1..." + dto);
    }

    @GetMapping("/param2/{id}/{text}/{writer}")
    @ResponseBody
    public void param2(MemoDto dto) {
        log.info("GET /memo/param2..." + dto);
    }

}
