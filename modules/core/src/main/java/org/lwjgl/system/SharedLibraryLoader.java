/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.util.zip.*;

import static org.lwjgl.system.APIUtil.*;

/**
 * Loads shared libraries from the classpath. The libraries may be packed in JAR files, in which case they will be extracted to a temporary directory and that
 * directory will be prepended to {@link Configuration#LIBRARY_PATH}.
 *
 * @author Mario Zechner (https://github.com/badlogic)
 * @author Nathan Sweet (https://github.com/NathanSweet)
 * @see Configuration#SHARED_LIBRARY_EXTRACT_DIRECTORY
 * @see Configuration#SHARED_LIBRARY_EXTRACT_PATH
 */
final class SharedLibraryLoader {

    private static File extractPath;

    private SharedLibraryLoader() {
    }

    /** Extracts the specified shared library from the classpath to a temporary directory. */
    static FileChannel load(String name, String libName, URL libURL) {
        try {
            File extractedFile = extractFile(libName, libURL);

            // Wait for other processes (usually antivirus software) to unlock the extracted file
            // before attempting to load it.
            try {
                @SuppressWarnings("resource")
                FileChannel fc = new FileInputStream(extractedFile).getChannel();

                //noinspection resource
                if (fc.tryLock(0L, Long.MAX_VALUE, true) == null) {
                    if (Configuration.DEBUG_LOADER.get(false)) {
                        apiLog("\tFile is locked by another process, waiting...");
                    }

                    //noinspection resource
                    fc.lock(0L, Long.MAX_VALUE, true); // this will block until the file is locked
                }

                // the lock will be released when the channel is closed
                return fc;
            } catch (Exception e) {
                throw new RuntimeException("Failed to lock the extracted file.", e);
            }
        } catch (Exception e) {
            throw new RuntimeException("\tFailed to extract " + name + " library", e);
        }
    }

    /**
     * Extracts the specified file into the temp directory if it does not already exist or the CRC does not match.
     *
     * @param libraryFile the file to extract from the classpath.
     *
     * @return The extracted file.
     */
    private static File extractFile(String libraryFile, URL libURL) throws IOException {
        File extractedFile = getExtractedFile(extractPath, libraryFile);

        if (extractPath == null) {
            extractPath = extractedFile.getParentFile();

            // Prepend the path in which the libraries were extracted to org.lwjgl.librarypath
            String libPath = Configuration.LIBRARY_PATH.get();
            if (libPath == null || libPath.isEmpty()) {
                libPath = extractPath.getAbsolutePath();
            } else {
                libPath = extractPath.getAbsolutePath() + File.pathSeparator + libPath;
            }

            System.setProperty(Configuration.LIBRARY_PATH.getProperty(), libPath);
            Configuration.LIBRARY_PATH.set(libPath);
        }

        extractFile(libURL, extractedFile);

        return extractedFile;
    }

    /**
     * Returns a path to a file that can be written. Tries multiple locations and verifies writing succeeds.
     *
     * @param libraryPath the library path
     * @param fileName    the library file
     *
     * @return the extracted library
     */
    private static File getExtractedFile(File libraryPath, String fileName) {
        // Reuse the lwjgl shared library location
        if (libraryPath != null && libraryPath.isDirectory()) {
            return new File(libraryPath, fileName);
        }

        if (Configuration.SHARED_LIBRARY_EXTRACT_PATH.get() != null) {
            return new File(Configuration.SHARED_LIBRARY_EXTRACT_PATH.get(), fileName);
        }

        String version = Version.getVersion().replace(' ', '-');

        // Temp directory with username in path
        String tempDirectory = Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl" + System.getProperty("user.name"));
        File   file          = new File(System.getProperty("java.io.tmpdir") + "/" + tempDirectory + "/" + version, fileName);
        if (canWrite(file)) {
            return file;
        }

        // User home
        tempDirectory = Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl");
        file = new File(System.getProperty("user.home") + "/." + tempDirectory + "/" + version, fileName);
        if (canWrite(file)) {
            return file;
        }

        // Relative directory
        file = new File("." + tempDirectory + "/" + version, fileName);
        if (canWrite(file)) {
            return file;
        }

        // System provided temp directory
        try {
            file = File.createTempFile("lwjgl", "");
            file.delete();
            file = new File(file, fileName);
            if (canWrite(file)) {
                return file;
            }
        } catch (IOException ignored) {
        }

        throw new RuntimeException("Failed to find an appropriate directory to extract the native library");
    }

    /**
     * Extracts a native library.
     *
     * @param libURL        the library resource
     * @param extractedFile the extracted file
     *
     * @throws IOException if an IO error occurs
     */
    private static void extractFile(URL libURL, File extractedFile) throws IOException {
        if (extractedFile.isFile()) {
            try (
                InputStream input = libURL.openStream();
                InputStream target = new FileInputStream(extractedFile);
            ) {
                if (crc(input) == crc(target)) {
                    apiLog(String.format("\tFound at: %s", extractedFile));
                    return;
                }
            }
        }

        // If file doesn't exist or the CRC doesn't match, extract it to the temp dir.
        apiLog(String.format("\tExtracting: %s", libURL.getPath()));

        extractedFile.getParentFile().mkdirs();
        try (
            InputStream src = libURL.openStream();
            OutputStream trg = new FileOutputStream(extractedFile);
        ) {
            byte[] buffer = new byte[8 * 1024];
            for (int n; (n = src.read(buffer)) != -1; ) {
                trg.write(buffer, 0, n);
            }
        }
    }

    /**
     * Returns a CRC of the remaining bytes in a stream.
     *
     * @param input the stream
     *
     * @return the CRC
     */
    private static long crc(InputStream input) throws IOException {
        CRC32 crc = new CRC32();

        byte[] buffer = new byte[8 * 1024];
        for (int n; (n = input.read(buffer)) != -1; ) {
            crc.update(buffer, 0, n);
        }

        return crc.getValue();
    }

    /**
     * Returns true if the parent directories of the file can be created and the file can be written.
     *
     * @param file the file to test
     *
     * @return true if the file is writable
     */
    private static boolean canWrite(File file) {
        File parent = file.getParentFile();

        File testFile;
        if (file.isFile()) {
            if (!file.canWrite()) {
                return false;
            }

            // Don't overwrite existing file just to check if we can write to directory.
            testFile = new File(parent, ".lwjgl.test");
        } else {
            parent.mkdirs();
            testFile = file;
        }

        try (OutputStream out = new FileOutputStream(testFile)) {
            out.write(0);
            testFile.delete();
            return true;
        } catch (Throwable ignored) {
            return false;
        }
    }

}