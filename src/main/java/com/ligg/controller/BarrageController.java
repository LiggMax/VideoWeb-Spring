package com.ligg.controller;

import com.ligg.anno.Log;
import com.ligg.pojo.Barrage;
import com.ligg.pojo.Result;
import com.ligg.service.BarrageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/barrage")
public class BarrageController {

    @Autowired
    BarrageService barrageService;

    //发送弹幕
    @Log
    @PostMapping("/send")
    public Result<String> sendBarrage(@RequestBody Barrage barrage) {
        return Result.success(barrageService.sendBarrage(barrage));
    }

}
