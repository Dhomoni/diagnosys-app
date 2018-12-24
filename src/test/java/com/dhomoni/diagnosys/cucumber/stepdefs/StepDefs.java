package com.dhomoni.diagnosys.cucumber.stepdefs;

import com.dhomoni.diagnosys.DiagnosysApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DiagnosysApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
