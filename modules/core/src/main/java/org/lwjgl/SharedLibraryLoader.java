/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl;

import java.io.*;
import java.lang.reflect.Method;
import java.util.EnumSet;
import java.util.UUID;
import java.util.zip.CRC32;

/**
 * Loads shared libraries from the classpath. The libraries may be packed in JAR files, in which case they will be extracted to a temporary directory and that
 * directory will be prepended to {@code org.lwjgl.librarypath}
 *
 * The temporary directory name defaults to {@code lwjgl&lt;user name&gt;}. To change it, set the {@code org.lwjgl.SLLTempDirectory} system property.
 *
 * @author Mario Zechner (https://github.com/badlogic)
 * @author Nathan Sweet (https://github.com/NathanSweet)
 */
final class SharedLibraryLoader {

	private static final boolean LINUX;
	private static final boolean MACOSX;
	private static final boolean WINDOWS;

	private static final boolean AOT; // iOS?

	private static final boolean ARM;
	private static final boolean x64;

	private static final String ABI;

	static {
		// OS flags
		String osName = System.getProperty("os.name");
		String osArch = System.getProperty("os.arch");

		LINUX = osName.contains("Linux");
		MACOSX = osName.contains("Mac");
		WINDOWS = osName.contains("Windows");

		String runtime = System.getProperty("java.runtime.name");
		AOT = !(runtime != null && runtime.contains("Android Runtime")) && !LINUX && !MACOSX && !WINDOWS;

		ARM = osArch.startsWith("arm");
		x64 = osArch.contains("64");

		String archABI = System.getProperty("sun.arch.abi"); // JDK 8 only
		ABI = archABI != null ? archABI : "";
	}

	/** A library bundled with LWJGL. */
	enum Library {
		LWJGL("lwjgl"),
		JEMALLOC("jemalloc"),
		GLFW("glfw"),
		OPENAL(WINDOWS ? "OpenAL" : "openal");

		final String file;

		Library(String file) {
			String libname = file;
			if ( LINUX && ARM )
				libname += "arm" + ABI;
			if ( !x64 )
				libname += "32";

			this.file = System.mapLibraryName(libname);
		}

		/**
		 * Returns the library file for the current platform.
		 *
		 * @return the library file
		 */
		public String getFile() {
			return file;
		}
	}

	private static final EnumSet<Library> loadedLibraries = EnumSet.noneOf(Library.class);

	private SharedLibraryLoader() {
	}

	/**
	 * Extracts the LWJGL native libraries from the classpath and sets the {@code org.lwjgl.librarypath} system property.
	 */
	static void load() {
		if ( AOT || !loadedLibraries.isEmpty() )
			return;

		// Don't extract natives if using JWS
		try {
			Method method = Class.forName("javax.jnlp.ServiceManager").getDeclaredMethod("lookup", String.class);
			method.invoke(null, "javax.jnlp.PersistenceService");
			return;
		} catch (Throwable ignored) {
		}

		Library[] libraries = Library.values();

		File extractPath;
		try {
			// Extract the lwjgl shared library and get the library path
			extractPath = extractFile(libraries[0].file, null).getParentFile();

		} catch (Throwable t) {
			throw new RuntimeException("Unable to extract LWJGL natives.", t);
		}

		// Extract the other shared libraries in the same path
		for ( int i = 1; i < libraries.length; i++ ) {
			try {
				extractFile(libraries[i].file, extractPath);
			} catch (Exception e) {
				LWJGLUtil.log("Failed to extract " + libraries[i].name() + " library.");
			}
		}

		// Prepend the path in which the libraries were extracted to org.lwjgl.librarypath
		String libraryPath = System.getProperty("org.lwjgl.librarypath");
		if ( libraryPath == null || libraryPath.isEmpty() )
			libraryPath = extractPath.getAbsolutePath();
		else
			libraryPath = extractPath.getAbsolutePath() + File.pathSeparator + libraryPath;
		System.setProperty("org.lwjgl.librarypath", libraryPath);
	}

	/**
	 * Extracts the specified file into the temp directory if it does not already exist or the CRC does not match.
	 *
	 * @param libraryFile the file to extract from the classpath.
	 * @param libraryPath the subdirectory where the file will be extracted. If null, the file's CRC will be used.
	 *
	 * @return The extracted file.
	 */
	private static File extractFile(String libraryFile, File libraryPath) throws IOException {
		String libraryCRC = crc(readResource(libraryFile));

		File extractedFile = getExtractedFile(
			libraryPath == null ? new File(libraryCRC) : libraryPath,
			new File(libraryFile).getName()
		);
		extractFile(libraryFile, libraryCRC, extractedFile);

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
		if ( libraryPath.isDirectory() )
			return new File(libraryPath, fileName);

		// The first time libraryPath will be a relative path (the lwjgl shared library CRC)

		// Temp directory with username in path
		String tempDirectory = System.getProperty("org.lwjgl.SLLTempDirectory", "lwjgl" + System.getProperty("user.name"));
		File file = new File(System.getProperty("java.io.tmpdir") + "/" + tempDirectory + "/" + libraryPath, fileName);
		if ( canWrite(file) ) return file;

		// User home
		tempDirectory = System.getProperty("org.lwjgl.SLLTempDirectory", "lwjgl");
		file = new File(System.getProperty("user.home") + "/." + tempDirectory + "/" + libraryPath, fileName);
		if ( canWrite(file) ) return file;

		// Relative directory
		file = new File("." + tempDirectory + "/" + libraryPath, fileName);
		if ( canWrite(file) ) return file;

		// System provided temp directory
		try {
			file = File.createTempFile(libraryPath.getName(), null);
			if ( file.delete() ) {
				file = new File(file, fileName);
				if ( canWrite(file) ) return file;
			}
		} catch (IOException ignored) {
		}

		throw new RuntimeException("Failed to find an appropriate directory to extract the native library");
	}

	/**
	 * Extracts a native library.
	 *
	 * @param libraryFile   the library file
	 * @param libraryCRC    the library file CRC
	 * @param extractedFile the extracted file
	 *
	 * @throws IOException if an IO error occurs
	 */
	private static void extractFile(String libraryFile, String libraryCRC, File extractedFile) throws IOException {
		String extractedCrc = null;
		if ( extractedFile.exists() )
			try {
				extractedCrc = crc(new FileInputStream(extractedFile));
			} catch (FileNotFoundException ignored) {
			}

		// If file doesn't exist or the CRC doesn't match, extract it to the temp dir.
		if ( extractedCrc == null || !extractedCrc.equals(libraryCRC) ) {
			InputStream input = readResource(libraryFile);
			extractedFile.getParentFile().mkdirs();

			FileOutputStream output = new FileOutputStream(extractedFile);
			byte[] buffer = new byte[4096];
			while ( true ) {
				int length = input.read(buffer);
				if ( length == -1 ) break;
				output.write(buffer, 0, length);
			}
			input.close();
			output.close();
		}
	}

	/**
	 * Opens an {@link InputStream} to the specified resource in the classpath.
	 *
	 * @param path the resource to read
	 *
	 * @return an {@link InputStream} for the resource
	 */
	private static InputStream readResource(String path) {
		InputStream input = SharedLibraryLoader.class.getResourceAsStream("/" + path);
		if ( input == null )
			throw new RuntimeException("Unable to read file for extraction: " + path);

		return input;
	}

	/**
	 * Returns a CRC of the remaining bytes in a stream.
	 *
	 * @param input the stream
	 *
	 * @return the CRC as a hex String
	 */
	private static String crc(InputStream input) {
		if ( input == null )
			throw new IllegalArgumentException("input cannot be null.");

		CRC32 crc = new CRC32();
		byte[] buffer = new byte[4096];
		try {
			while ( true ) {
				int length = input.read(buffer);
				if ( length == -1 ) break;
				crc.update(buffer, 0, length);
			}
		} catch (Exception e) {
			try {
				input.close();
			} catch (IOException ignored) {
			}
		}

		return Long.toHexString(crc.getValue());
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
		if ( file.exists() ) {
			if ( !file.canWrite() || !canExecute(file) )
				return false;

			// Don't overwrite existing file just to check if we can write to directory.
			testFile = new File(parent, UUID.randomUUID().toString());
		} else {
			parent.mkdirs();
			if ( !parent.isDirectory() )
				return false;

			testFile = file;
		}

		try {
			new FileOutputStream(testFile).close();
			return canExecute(testFile);
		} catch (Throwable t) {
			return false;
		} finally {
			testFile.delete();
		}
	}

	/**
	 * Returns true if the specified file is or was made executable.
	 *
	 * @param file the file
	 *
	 * @return true if the file is executable
	 */
	private static boolean canExecute(File file) {
		try {
			Method canExecute = File.class.getMethod("canExecute");
			if ( (Boolean)canExecute.invoke(file) )
				return true;

			Method setExecutable = File.class.getMethod("setExecutable", boolean.class, boolean.class);
			setExecutable.invoke(file, true, false);

			return (Boolean)canExecute.invoke(file);
		} catch (Exception ignored) {
		}

		return false;
	}

}