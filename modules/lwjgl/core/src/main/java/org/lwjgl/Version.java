/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import java.util.*;

/** This class can be used to query the LWJGL version. */
public final class Version {

    /** Current version of library. */
    public static final int
        VERSION_MAJOR    = 3,
        VERSION_MINOR    = 3,
        VERSION_REVISION = 1;

    /** The development state of the current build. */
    public static final BuildType BUILD_TYPE = BuildType.STABLE;

    private static final String version =
        String.valueOf(VERSION_MAJOR) +
        '.' + VERSION_MINOR +
        '.' + VERSION_REVISION + BUILD_TYPE.postfix +
        ' ' + Optional.ofNullable(Version.class.getPackage().getImplementationVersion()).orElse("SNAPSHOT");

    private Version() {
    }

    public static void main(String[] args) {
        System.out.println(version);
        System.err.println(version.substring(0, version.indexOf(' ')));
    }

    /** Returns the LWJGL version. */
    public static String getVersion() {
        return version;
    }

    /** The development state of the current build. */
    public enum BuildType {
        /** Work in progress, unstable. */
        ALPHA("a"),
        /** Feature complete, unstable. */
        BETA("b"),
        /** Feature complete, stable, official release. */
        STABLE("");

        public final String postfix;

        BuildType(String postfix) {
            this.postfix = postfix;
        }
    }

}