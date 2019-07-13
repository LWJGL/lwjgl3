/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.cuda;

import org.lwjgl.system.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * CUDA utilities.
 *
 * <p>The CUDA Driver API can be used immediately, without any configuration.</p>
 *
 * <p>LWJGL does not bundle CUDA Toolkit libraries. For the bindings of such a library to work, LWJGL must be able to find the corresponding shared libraries
 * that export the library's API. By default, LWJGL scans the standard CUDA Toolkit installation directory and loads the shared libraries of the CUDA Toolkit
 * with the greatest version it can detect. This process can be overridden with the {@link Configuration#CUDA_TOOLKIT_VERSION} and
 * {@link Configuration#CUDA_TOOLKIT_PATH} options.</p>
 *
 * <p>In the case of a custom CUDA Toolkit library distribution:</p>
 * <ul>
 * <li>
 * Add the path that contains the shared libraries to either {@code -Djava.library.path} or {@code -Dorg.lwjgl.librarypath}.
 *
 * <p>Note that, on Windows, the shared libraries should be renamed to drop the <em>&lt;bits&gt;_&lt;version&gt;</em> suffix. For example
 * {@code nvgraph64_100.dll} should be renamed to just {@code nvgraph.dll}. On Linux &amp; macOS, either rename the shared libraries or include the unversioned
 * symbolic links.</p>
 * </li>
 * <li>Use individual {@link Configuration} options to set the name or path of each shared library, e.g. {@link Configuration#CUDA_NVRTC_LIBRARY_NAME}.</li>
 * </ul>
 */
public final class CUDA {

    private static final String  TOOLKIT_DEFAULT_ROOT;
    private static final String  TOOLKIT_PREFIX;
    private static final Pattern TOOLKIT_REGEX;

    static {
        switch (Platform.get()) {
            case LINUX:
                TOOLKIT_DEFAULT_ROOT = "/usr/local/";
                TOOLKIT_PREFIX = "cuda-";
                break;
            case MACOSX:
                TOOLKIT_DEFAULT_ROOT = "/Developer/NVIDIA/";
                TOOLKIT_PREFIX = "CUDA-";
                break;
            case WINDOWS:
                TOOLKIT_DEFAULT_ROOT = "C:/Program Files/NVIDIA GPU Computing Toolkit/CUDA/";
                TOOLKIT_PREFIX = "v";
                break;
            default:
                throw new UnsupportedOperationException();
        }
        TOOLKIT_REGEX = Pattern.compile("^" + TOOLKIT_PREFIX + "(\\d+\\.\\d+)$");
    }
    private CUDA() {}

    /**
     * Returns true if the CUDA driver supports per-thread synchronization for the default stream.
     *
     * <p>CUDA defaults to the legacy default stream. If this method returns {@code true} and per-thread synchronization is desired, set
     * {@link Configuration#CUDA_API_PER_THREAD_DEFAULT_STREAM} to {@code true} before initializing the driver.</p>
     *
     * @return true if per-thread synchronization is supported, false if only the legacy default stream is supported
     */
    public static boolean isPerThreadDefaultStreamSupported() {
        try (SharedLibrary lib = Library.loadNative(CU.class, "org.lwjgl.cuda", Configuration.CUDA_LIBRARY_NAME, "nvcuda")) {
            return lib.getFunctionAddress("cuLaunchKernel_ptsz") != NULL;
        }
    }

    private static Path getToolkitPath() {
        String toolkitPath = Configuration.CUDA_TOOLKIT_PATH.get();
        if (toolkitPath != null) {
            return Paths.get(toolkitPath);
        }

        String version = Configuration.CUDA_TOOLKIT_VERSION.get();
        if (version != null) {
            Path toolkit = Paths.get(TOOLKIT_DEFAULT_ROOT + TOOLKIT_PREFIX + version);
            if (Files.isDirectory(toolkit)) {
                return toolkit;
            }
        }

        Path root = Paths.get(TOOLKIT_DEFAULT_ROOT);
        if (!Files.isDirectory(root)) {
            throw new IllegalStateException("Failed to find CUDA Toolkit root path.");
        }

        try (Stream<Path> directories = Files.find(
            root, 1,
            (path, basicFileAttributes) -> basicFileAttributes.isDirectory() && TOOLKIT_REGEX.matcher(path.getFileName().toString()).matches())
        ) {
            return directories
                .max(Comparator.comparing(path -> {
                    Matcher m = TOOLKIT_REGEX.matcher(path.getFileName().toString());
                    if (!m.find()) {
                        throw new IllegalStateException();
                    }
                    return apiParseVersion(m.group(1));
                }))
                .orElseThrow(() -> new IllegalStateException("Failed to find CUDA Toolkit path."));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getToolkitLibrary(String name) {
        Path toolkit = getToolkitPath();
        switch (Platform.get()) {
            case LINUX:
                // fall-through
            case MACOSX:
                toolkit = toolkit.resolve("lib");
                break;
            case WINDOWS:
                toolkit = toolkit.resolve("bin");
                break;
            default:
                throw new UnsupportedOperationException();
        }
        if (!Files.isDirectory(toolkit)) {
            throw new IllegalStateException();
        }

        try (Stream<Path> files = Files.find(toolkit, 1, (path, basicFileAttributes) -> {
            if (basicFileAttributes.isRegularFile()) {
                String fileName = path.getFileName().toString();
                switch (Platform.get()) {
                    case LINUX:
                        if (fileName.startsWith("lib" + name) && fileName.endsWith(".so")) {
                            return true;
                        }
                        break;
                    case MACOSX:
                        if (fileName.startsWith("lib" + name) && fileName.endsWith(".dylib")) {
                            return true;
                        }
                        break;
                    case WINDOWS:
                        if (fileName.startsWith(name + "64") && fileName.endsWith(".dll")) {
                            return true;
                        }
                        break;
                }
            }
            return false;
        })) {
            return files
                .findAny()
                .map(path -> path.toAbsolutePath().toString()).orElseThrow(IllegalStateException::new);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static SharedLibrary getToolkitLibrary(Class<?> context, Configuration<String> option, String name) {
        return Library.loadNative(
            context, "org.lwjgl.cuda", option,
            () -> Library.loadNative(context, "org.lwjgl.cuda", CUDA.getToolkitLibrary(name)),
            name
        );
    }

    static String __CUDA_API_PTDS(String api) { return Configuration.CUDA_API_PER_THREAD_DEFAULT_STREAM.get(false) ? api + "_ptds" : api; }
    static String __CUDA_API_PTSZ(String api) { return Configuration.CUDA_API_PER_THREAD_DEFAULT_STREAM.get(false) ? api + "_ptsz" : api; }

    static String __CUDA_API_VERSION(String api, int version) {
        SharedLibrary CUDA = CU.getLibrary();
        for (int i = version; 1 < i; i--) {
            String functionName = api + "_v" + i;
            if (CUDA.getFunctionAddress(functionName) != NULL) {
                return functionName;
            }
        }
        return api;
    }

}