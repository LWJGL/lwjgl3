/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.apache.tools.ant.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

import static java.lang.String.*;

public class BindingConfig extends Task {

    private boolean isTrue(String name) {
        return "true".equals(getProject().getProperty(name));
    }

    private boolean isFalse(String name) {
        return "false".equals(getProject().getProperty(name));
    }

    @Override public void execute() {
        if (isTrue("binding.nanovg")) {
            if (isFalse("binding.stb") || !(
                isTrue("binding.bgfx") ||
                isTrue("binding.opengl") ||
                isTrue("binding.opengles"))
            ) {
                throw new BuildException("The nanovg module depends on the stb and one of bgfx/OpenGL/OpenGL ES modules.");
            }
        }

        if (isTrue("binding.ovr")) {
            if (isFalse("binding.opengl") && isFalse("binding.vulkan")) {
                throw new BuildException("The OpenGL or Vulkan bindings are required.");
            }
        }

        Project LWJGL = getProject();

        ArrayList<String> modules = new ArrayList<>(64);
        modules.add("core");

        ArrayList<String> bindings = new ArrayList<>(64);
        bindings.add("-Dbinding.DISABLE_CHECKS=" + LWJGL.getProperty("binding.DISABLE_CHECKS"));

        for (Map.Entry<String, Object> p : LWJGL.getProperties().entrySet()) {
            String name = p.getKey();
            if (name.startsWith("binding.") && "true".equals(p.getValue())) {
                modules.add(name.substring(8));
                bindings.add("-D" + name + "=true");
            }
        }

        LWJGL.setProperty("binding.core", "true");
        LWJGL.setProperty("generator.bindings", join(" ", bindings));
        LWJGL.setProperty("module.list", join(",", modules));

        ArrayList<String> classes   = new ArrayList<>(modules.size());
        ArrayList<String> templates = new ArrayList<>(modules.size());
        ArrayList<String> sources   = new ArrayList<>(modules.size() * 2);

        modules.forEach(it -> {
            LWJGL.setProperty("module." + it + ".path", it.equals("core") ? "org/lwjgl" : "org/lwjgl/" + it);

            classes.add("bin/classes/lwjgl/" + it);

            String src = "modules/lwjgl/" + it + "/src";

            templates.add(src + "/templates/kotlin");
            sources.add(src + "/generated/java");
            if (Files.isDirectory(Paths.get(src + "/main/java"))) {
                sources.add(src + "/main/java");
            }
        });

        LWJGL.setProperty("module.classpath", join(File.pathSeparator, classes));
        LWJGL.setProperty("module.templatepath", join(File.pathSeparator, templates));
        LWJGL.setProperty("module.sourcepath", join(File.pathSeparator, sources));
        LWJGL.setProperty("module.javadocsourcepath", String.join(File.pathSeparator, sources));
    }

}
