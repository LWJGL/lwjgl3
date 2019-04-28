/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import javax.annotation.*;
import java.util.function.*;
import java.util.regex.*;

import static org.lwjgl.system.APIUtil.*;

/** The platforms supported by LWJGL. */
public enum Platform {

    LINUX("Linux") {
        private final Pattern SO = Pattern.compile("(?:^|/)lib\\w+[.]so(?:[.]\\d+)*$");

        @Override
        String mapLibraryName(String name) {
            if (SO.matcher(name).find()) {
                return name;
            }

            return System.mapLibraryName(name);
        }
    },
    // TODO: Rename to MACOS in LWJGL 4
    MACOSX("macOS") {
        private final Pattern DYLIB = Pattern.compile("(?:^|/)lib\\w+(?:[.]\\d+)*[.]dylib$");

        @Override
        String mapLibraryName(String name) {
            if (DYLIB.matcher(name).find()) {
                return name;
            }

            return System.mapLibraryName(name);
        }
    },
    WINDOWS("Windows") {
        @Override
        String mapLibraryName(String name) {
            if (name.endsWith(".dll")) {
                return name;
            }

            return System.mapLibraryName(name);
        }
    };

    /** The architectures supported by LWJGL. */
    public enum Architecture {
        X64,
        X86,
        ARM64,
        ARM32
    }

    private static final Platform     current;
    private static final Architecture architecture;

    private static final Function<String, String> bundledLibraryNameMapper;
    private static final Function<String, String> bundledLibraryPathMapper;

    static {
        String osName = System.getProperty("os.name");
        if (osName.startsWith("Windows")) {
            current = WINDOWS;
        } else if (osName.startsWith("Linux") || osName.startsWith("FreeBSD") || osName.startsWith("SunOS") || osName.startsWith("Unix")) {
            current = LINUX;
        } else if (osName.startsWith("Mac OS X") || osName.startsWith("Darwin")) {
            current = MACOSX;
        } else {
            throw new LinkageError("Unknown platform: " + osName);
        }

        String  osArch  = System.getProperty("os.arch");
        boolean is64Bit = osArch.contains("64") || osArch.startsWith("armv8");
        architecture = osArch.startsWith("arm") || osArch.startsWith("aarch64")
            ? (is64Bit ? Architecture.ARM64 : Architecture.ARM32)
            : (is64Bit ? Architecture.X64 : Architecture.X86);

        bundledLibraryNameMapper = getMapper(
            Configuration.BUNDLED_LIBRARY_NAME_MAPPER.get(),
            name -> name,
            name -> is64Bit ? name : name + "32"
        );
        bundledLibraryPathMapper = getMapper(
            Configuration.BUNDLED_LIBRARY_PATH_MAPPER.get(),
            name -> architecture.name().toLowerCase() + "/" + name,
            name -> name
        );
    }

    private final String name;

    Platform(String name) {
        this.name = name;
    }

    /** Returns the platform name. */
    public String getName() {
        return name;
    }

    abstract String mapLibraryName(String name);

    /** Returns the platform on which the library is running. */
    public static Platform get() {
        return current;
    }

    /** Returns the architecture on which the library is running. */
    public static Architecture getArchitecture() {
        return architecture;
    }

    public static String mapLibraryNameBundled(String name) {
        return bundledLibraryNameMapper.apply(name);
    }

    static String mapLibraryPathBundled(String name) {
        return bundledLibraryPathMapper.apply(name);
    }

    @SuppressWarnings("unchecked")
    private static Function<String, String> getMapper(
        @Nullable Object mapper,
        Function<String, String> defaultMapper,
        Function<String, String> legacyMapper
    ) {
        if (mapper == null || "default".equals(mapper)) {
            return defaultMapper;
        }

        if ("legacy".equals(mapper)) {
            return legacyMapper;
        }

        if (mapper instanceof Function) {
            return (Function<String, String>)mapper;
        }

        String className = mapper.toString();
        try {
            return (Function<String, String>)Class
                .forName(className)
                .getConstructor()
                .newInstance();
        } catch (Throwable t) {
            if (Checks.DEBUG) {
                t.printStackTrace(DEBUG_STREAM);
            }
            apiLog(String.format("Warning: Failed to instantiate bundled library mapper: %s. Using the default.", className));
            return defaultMapper;
        }
    }

}