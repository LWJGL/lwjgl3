/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

import static org.lwjgl.system.APIUtil.*;

/** This class can be used to query the LWJGL version. */
public final class Version {

    /** Current version of library. */
    public static final int
        VERSION_MAJOR    = 3,
        VERSION_MINOR    = 1,
        VERSION_REVISION = 3;

    /** The development state of the current build. */
    public static final BuildType BUILD_TYPE = BuildType.STABLE;

    private static final String version =
        String.valueOf(VERSION_MAJOR) +
        '.' + VERSION_MINOR +
        '.' + VERSION_REVISION + BUILD_TYPE.postfix +
        ' ' + apiGetManifestValue("Implementation-Version").orElse("SNAPSHOT");

    private Version() {
    }

    public static void main(String[] args) {
        System.out.println(getVersion());
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

        final String postfix;

        BuildType(String postfix) {
            this.postfix = postfix;
        }
    }

}