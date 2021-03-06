package com.xcart.prognosis.controllers

import com.xcart.prognosis.presentation.WorkloadPageState
import com.xcart.prognosis.reports.Workload
import com.xcart.prognosis.repositories.YouTrack
import com.xcart.prognosis.services.WorkloadAnalysis
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class AppController @Autowired constructor(val report: Workload){
    @RequestMapping("/")
    fun index(): ModelAndView {
        val mav = ModelAndView("index")
        val state = WorkloadPageState(report.gatherReport())
        mav.addObject("state", state)
        return mav
    }
}