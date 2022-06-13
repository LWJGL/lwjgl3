/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl;

/**
 * Finds the LWJGL implementation version (build type/number).
 *
 * <p>Base implementation for Java 8. When run in the module path, it cannot find the implementation version without reading the JAR manifest. See the
 * {@code lwjgl.core9} module for the module-aware implementation.</p>
 */
final class VersionImpl {

    static String find() {
        Package org_lwjgl = Version.class.getPackage();

        String specVersion = org_lwjgl.getSpecificationVersion();
        String implVersion = org_lwjgl.getImplementationVersion();
        if (specVersion != null && implVersion != null) {
            return Version.createImplementation(specVersion, implVersion);
        }

        String version = Version.findImplementationFromManifest();
        if (version != null) {
            return version;
        }

        return "-snapshot";
    }

}