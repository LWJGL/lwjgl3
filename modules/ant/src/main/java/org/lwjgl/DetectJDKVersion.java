/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import org.apache.tools.ant.*;

import java.util.*;
import java.util.regex.*;

public class DetectJDKVersion extends Task {

    private static final Pattern JAVA_VERSION_PATTERN = Pattern.compile("^([1-9][0-9]*)(?:(?:\\.0)*\\.[1-9][0-9]*)*(?:-[a-zA-Z0-9]+)?");

    private static final int[] LTS_RELEASES = {11, 17, 21, 25};

    private static final int LTS_RELEASE_FIRST = LTS_RELEASES[0];
    private static final int LTS_RELEASE_LAST  = LTS_RELEASES[LTS_RELEASES.length - 1];

    @Override
    public void execute() {
        String javaVersion = System.getProperty("java.version");

        Matcher matcher = JAVA_VERSION_PATTERN.matcher(javaVersion);

        if (!matcher.find()) {
            if (javaVersion.startsWith("1.")) {
                if (!javaVersion.startsWith("1.8.")) {
                    throw new BuildException("JDK 8 or newer is required.");
                }
                return;
            }
            throw new BuildException("Failed to parse java.version: " + javaVersion);
        }

        Project LWJGL = getProject();

        int version = Integer.parseInt(matcher.group(1));

        LWJGL.setProperty("jdk.version", Integer.toString(version));
        for (int v = version; LTS_RELEASE_FIRST <= v; v--) {
            if (v < LTS_RELEASE_LAST && Arrays.binarySearch(LTS_RELEASES, v) < 0) {
                continue;
            }
            LWJGL.setProperty("jdk" + v, "true");
        }
    }

}
