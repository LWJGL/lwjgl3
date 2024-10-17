/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.apache.tools.ant.*;

import java.util.regex.*;

public class DetectJDKVersion extends Task {

    @Override public void execute() {

        String javaVersion = System.getProperty("java.version");

        Matcher matcher = Pattern
            .compile("^([1-9][0-9]*)(?:(?:\\.0)*\\.[1-9][0-9]*)*(?:-[a-zA-Z0-9]+)?")
            .matcher(javaVersion);

        if (!matcher.find()) {
            if (javaVersion.startsWith("1.")) {
                if (!javaVersion.startsWith("1.8.")) {
                    throw new BuildException("JDK 8 or newer is required.");
                }
                return;
            }
            throw new BuildException("Failed to parse java.version: " + javaVersion);
        }

        int version = Integer.parseInt(matcher.group(1));

        Project LWJGL = getProject();
        for (int v = version; 9 <= v; v--) {
            LWJGL.setProperty("jdk" + v, "true");
        }
    }

}
