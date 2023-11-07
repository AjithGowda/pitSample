package com.org.sample;

import com.intellij.ide.util.treeView.NodeRenderer;
import com.intellij.openapi.util.NlsSafe;
import com.intellij.ui.JBColor;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Renderer extends NodeRenderer {
    @Override
    public void customizeCellRenderer(@NotNull JTree tree, @NlsSafe Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
        super.customizeCellRenderer(tree, value, selected, expanded, leaf, row, hasFocus);
        if(value instanceof  String){
            this.setForeground(JBColor.GRAY);
        }else{
            this.setForeground(JBColor.RED);
        }

        System.out.println("Test");
    }
}
