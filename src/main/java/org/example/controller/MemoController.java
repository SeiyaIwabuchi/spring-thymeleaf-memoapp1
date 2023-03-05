package org.example.controller;

import org.example.mapper.MemosMapper;
import org.example.model.Memo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class MemoController {

    @Autowired
    private MemosMapper memosMapper;

    @GetMapping("/")
    public String getMemos(Authentication loginUser, Model model) {
        model.addAttribute("memos", memosMapper.selectByUser(loginUser.getName()));
        model.addAttribute("username", loginUser.getName());
        return "index.html";
    }

    @GetMapping("/create")
    public String createForm(Authentication loginUser, Model model, @RequestParam("id") Optional<String> id) {
        model.addAttribute("username", loginUser.getName());
        if (id.isEmpty())
            model.addAttribute("memo", new Memo());
        else
            model.addAttribute("memo", memosMapper.selectById(id.get()).get(0));
        return "create.html";
    }

    @PostMapping("/create")
    public String create(Authentication loginUser, Memo memo, @RequestParam("action") String action) {
        memo.setUser(loginUser.getName());
        switch (action) {
            case "create" -> memosMapper.insert(memo);
            case "save" -> memosMapper.updateById(memo);
            case "delete" -> memosMapper.deleteById(memo);
        }
        return "redirect:/";
    }
}
