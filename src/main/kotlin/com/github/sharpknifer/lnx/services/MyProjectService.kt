package com.github.sharpknifer.lnx.services

import com.github.sharpknifer.lnx.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
