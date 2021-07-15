package com.github.mikey75.intelijplugintemplate.services

import com.github.mikey75.intelijplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
