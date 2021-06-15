package com.github.ilyashikhovtsev.zkidea.services

import com.github.ilyashikhovtsev.zkidea.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
