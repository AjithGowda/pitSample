package com.org.sample

import com.intellij.ui.JBColor
import com.intellij.ui.treeStructure.Tree
import spock.lang.Specification

import javax.swing.JTree

class RendererTest extends Specification {
    def mockTree
    def setup() {

    }

    def "CustomizeCellRenderer"() {
        given:
        mockTree = new JTree();
        when:
        Renderer render = new Renderer()
        render.customizeCellRenderer(mockTree, "Value", false, false, false, 1, false)
        then:
        render.foreground == JBColor.GRAY
    }
}
