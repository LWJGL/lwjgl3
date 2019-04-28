/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;

import javax.annotation.*;
import javax.annotation.concurrent.*;
import java.io.*;
import java.net.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.util.concurrent.locks.*;
import java.util.stream.*;
import java.util.zip.*;

import static org.lwjgl.system.APIUtil.*;

/**
 * Loads shared libraries and native resources from the classpath.
 *
 * <p>The libraries may be packed in JAR files, in which case they will be extracted to a temporary directory and that directory will be prepended to
 * {@link Configuration#LIBRARY_PATH}.
 * </p>
 *
 * @author Mario Zechner (https://github.com/badlogic)
 * @author Nathan Sweet (https://github.com/NathanSweet)
 * @see Configuration#SHARED_LIBRARY_EXTRACT_DIRECTORY
 * @see Configuration#SHARED_LIBRARY_EXTRACT_PATH
 */
final class SharedLibraryLoader {

    private static final Lock EXTRACT_PATH_LOCK = new ReentrantLock();

    @GuardedBy("EXTRACT_PATH_LOCK")
    @Nullable
    private static Path extractPath;

    private SharedLibraryLoader() {
    }

    /**
     * Extracts the specified shared library or native resource from the classpath to a temporary directory.
     *
     * @param name     the resource name
     * @param filename the resource filename
     * @param resource the classpath {@link URL} were the resource can be found
     *
     * @return a {@link FileChannel} that has locked the resource file
     */
    static FileChannel load(String name, String filename, URL resource) {
        try {
            Path extractedFile;

            EXTRACT_PATH_LOCK.lock();
            try {
                if (extractPath != null) {
                    // Reuse the lwjgl shared library location
                    extractedFile = extractPath.resolve(filename);
                } else {
                    extractedFile = getExtractPath(filename, resource);
                    // Do not store unless the test for JDK-8195129 has passed
                    if (Platform.get() != Platform.WINDOWS || workaroundJDK8195129(extractedFile)) {
                        initExtractPath(extractPath = extractedFile.getParent());
                    }
                }
            } finally {
                EXTRACT_PATH_LOCK.unlock();
            }

            return extract(extractedFile, resource);
        } catch (Exception e) {
            throw new RuntimeException("\tFailed to extract " + name + " library", e);
        }
    }

    private static void initExtractPath(Path extractPath) {
        String newLibPath = extractPath.toAbsolutePath().toString();

        // Prepend the path in which the libraries were extracted to org.lwjgl.librarypath
        String libPath = Configuration.LIBRARY_PATH.get();
        if (libPath != null && !libPath.isEmpty()) {
            newLibPath += File.pathSeparator + libPath;
        }

        System.setProperty(Configuration.LIBRARY_PATH.getProperty(), newLibPath);
        Configuration.LIBRARY_PATH.set(newLibPath);
    }

    /**
     * Returns a path to a file that can be written. Tries multiple locations and verifies writing succeeds.
     *
     * @param filename the resource filename
     *
     * @return the extracted library
     */
    private static Path getExtractPath(String filename, URL resource) {
        String override = Configuration.SHARED_LIBRARY_EXTRACT_PATH.get();
        if (override != null) {
            return Paths.get(override, filename);
        }

        String version = Version.getVersion().replace(' ', '-');

        Path tempDirectory;
        Path root, file;

        // Temp directory with username in path
        tempDirectory = Paths.get(Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl" + System.getProperty("user.name")), version, filename);
        file = (root = Paths.get(System.getProperty("java.io.tmpdir"))).resolve(tempDirectory);
        if (canWrite(root, file, resource)) {
            return file;
        }

        // User home
        tempDirectory = Paths.get(Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY.get("lwjgl"), version, filename);
        file = (root = Paths.get(System.getProperty("user.home"))).resolve(tempDirectory);
        if (canWrite(root, file, resource)) {
            return file;
        }

        // Working directory
        file = (root = Paths.get("").toAbsolutePath()).resolve(tempDirectory);
        if (canWrite(root, file, resource)) {
            return file;
        }

        if (Platform.get() == Platform.WINDOWS) {
            // C:\Windows\Temp
            String env = System.getenv("SystemRoot");
            if (env != null) {
                file = (root = Paths.get(env, "Temp")).resolve(tempDirectory);
                if (canWrite(root, file, resource)) {
                    return file;
                }
            }

            // C:\Temp
            env = System.getenv("SystemDrive");
            if (env != null) {
                file = (root = Paths.get(env + "/")).resolve(Paths.get("Temp").resolve(tempDirectory));
                if (canWrite(root, file, resource)) {
                    return file;
                }
            }
        }

        // System provided temp directory (in java.io.tmpdir)
        try {
            file = Files.createTempDirectory("lwjgl");
            root = file.getParent();
            file = file.resolve(filename);
            if (canWrite(root, file, resource)) {
                return file;
            }
        } catch (IOException ignored) {
        }

        throw new RuntimeException("Failed to find an appropriate directory to extract the native library");
    }

    /**
     * Extracts a native library resource if it does not already exist or the CRC does not match.
     *
     * @param resource the resource to extract
     * @param file     the extracted file
     *
     * @return a {@link FileChannel} that has locked the resource
     *
     * @throws IOException if an IO error occurs
     */
    private static FileChannel extract(Path file, URL resource) throws IOException {
        if (Files.exists(file)) {
            try (
                InputStream source = resource.openStream();
                InputStream target = Files.newInputStream(file)
            ) {
                if (crc(source) == crc(target)) {
                    if (Configuration.DEBUG_LOADER.get(false)) {
                        apiLog(String.format("\tFound at: %s", file));
                    }
                    return lock(file);
                }
            }
        }

        // If file doesn't exist or the CRC doesn't match, extract it to the temp dir.
        apiLog(String.format("    Extracting: %s", resource.getPath()));
        //noinspection FieldAccessNotGuarded (already inside the lock)
        if (extractPath == null) {
            apiLog(String.format("            to: %s", file));
        }

        Files.createDirectories(file.getParent());
        try (InputStream source = resource.openStream()) {
            Files.copy(source, file, StandardCopyOption.REPLACE_EXISTING);
        }

        return lock(file);
    }

    /**
     * Locks a file.
     *
     * @param file the file to lock
     */
    private static FileChannel lock(Path file) {
        // Wait for other processes (usually antivirus software) to unlock the extracted file
        // before attempting to load it.
        try {
            FileChannel fc = FileChannel.open(file);

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
            throw new RuntimeException("Failed to lock file.", e);
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
    private static boolean canWrite(Path root, Path file, URL resource) {
        Path testFile;
        if (Files.exists(file)) {
            if (!Files.isWritable(file)) {
                return false;
            }

            // Don't overwrite existing file just to check if we can write to directory.
            testFile = file.getParent().resolve(".lwjgl.test");
        } else {
            try {
                Files.createDirectories(file.getParent());
            } catch (IOException ignored) {
                return false;
            }
            testFile = file;
        }

        try {
            Files.write(testFile, new byte[0]);
            Files.delete(testFile);

            if (workaroundJDK8195129(file)) {
                // We have full access, the JVM has locked the file, but System.load can still fail if
                // the path contains unicode characters, due to JDK-8195129. Test for this here and
                // return false if it fails to try other paths.
                try (FileChannel ignored = extract(file, resource)) {
                    System.load(file.toAbsolutePath().toString());
                }
            }

            return true;
        } catch (Throwable ignored) {
            if (file == testFile) {
                canWriteCleanup(root, file);
            }
            return false;
        }
    }

    private static void canWriteCleanup(Path root, Path file) {
        try {
            // remove any files or directories created by canWrite
            Files.deleteIfExists(file);

            // delete empty directories from parent down to root (exclusive)
            Path parent = file.getParent();
            while (!Files.isSameFile(parent, root)) {
                try (Stream<Path> dir = Files.list(parent)) {
                    if (dir.findAny().isPresent()) {
                        break;
                    }
                }
                Files.delete(parent);
                parent = parent.getParent();
            }
        } catch (IOException ignored) {
        }
    }

    private static boolean workaroundJDK8195129(Path file) {
        return Platform.get() == Platform.WINDOWS && file.toString().endsWith(".dll");
    }

}