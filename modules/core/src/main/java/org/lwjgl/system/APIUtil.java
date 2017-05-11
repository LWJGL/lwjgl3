/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.macosx.*;
import org.lwjgl.system.windows.*;

import java.io.*;
import java.lang.reflect.*;
import java.net.*;
import java.nio.*;
import java.util.*;
import java.util.function.*;
import java.util.jar.*;
import java.util.regex.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.Pointer.*;

/**
 * Utility class useful to API bindings. [INTERNAL USE ONLY]
 *
 * <p>Method names in this class are prefixed with {@code api} to avoid ambiguities when used with static imports.</p>
 *
 * @see Configuration#DEBUG_STREAM
 */
public final class APIUtil {

    /**
     * The {@link PrintStream} used by LWJGL to print debug information and non-fatal errors. Defaults to {@link System#err} which can be changed with
     * {@link Configuration#DEBUG_STREAM}.
     */
    public static final PrintStream DEBUG_STREAM = getDebugStream();

    @SuppressWarnings("unchecked")
    private static PrintStream getDebugStream() {
        @SuppressWarnings("UseOfSystemOutOrSystemErr")
        PrintStream debugStream = System.err;

        Object state = Configuration.DEBUG_STREAM.get();
        if (state instanceof String) {
            try {
                Supplier<PrintStream> factory = (Supplier<PrintStream>)Class.forName((String)state).getConstructor().newInstance();
                debugStream = factory.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (state instanceof Supplier<?>) {
            debugStream = ((Supplier<PrintStream>)state).get();
        } else if (state instanceof PrintStream) {
            debugStream = (PrintStream)state;
        }

        return debugStream;
    }

    private APIUtil() {
    }

    /**
     * Prints the specified message to the {@link #DEBUG_STREAM} if {@link Checks#DEBUG} is true.
     *
     * @param msg the message to print
     */
    public static void apiLog(CharSequence msg) {
        if (DEBUG) {
            DEBUG_STREAM.print("[LWJGL] ");
            DEBUG_STREAM.println(msg);
        }
    }

    /**
     * Returns the value of the specified manifest attribute in the LWJGL JAR file.
     *
     * @param attributeName the attribute name
     *
     * @return the attribute value or null if the attribute was not found or there is no LWJGL JAR file
     */
    public static Optional<String> apiGetManifestValue(String attributeName) {
        URL url = APIUtil.class.getClassLoader().getResource("org/lwjgl/system/APIUtil.class");
        if (url != null) {
            String classURL = url.toString();
            if (classURL.startsWith("jar:")) {
                try (InputStream stream = new URL(classURL.substring(0, classURL.lastIndexOf("!") + 1) + '/' + JarFile.MANIFEST_NAME).openStream()) {
                    return Optional.ofNullable(new Manifest(stream).getAttributes("org/lwjgl/")).map(attr -> attr.getValue(attributeName));
                } catch (Exception e) {
                    e.printStackTrace(APIUtil.DEBUG_STREAM);
                }
            }
        }

        return Optional.empty();
    }

    public static SharedLibrary apiCreateLibrary(String name) {
        switch (Platform.get()) {
            case WINDOWS:
                return new WindowsLibrary(name);
            case LINUX:
                return new LinuxLibrary(name);
            case MACOSX:
                return MacOSXLibrary.create(name);
            default:
                throw new IllegalStateException();
        }
    }

    public static long apiGetFunctionAddress(FunctionProvider provider, String functionName) {
        return check(provider.getFunctionAddress(functionName));
    }

    public static ByteBuffer apiGetMappedBuffer(ByteBuffer buffer, long mappedAddress, int capacity) {
        return buffer == null || memAddress(buffer) != mappedAddress || buffer.capacity() != capacity
            ? memByteBuffer(mappedAddress, capacity)
            : buffer;
    }

    /** A data class for API versioning information. */
    public static class APIVersion {

        /** Returns the API major version. */
        public final int major;
        /** Returns the API minor version. */
        public final int minor;

        /** Returns the API revision. May be null. */
        public final String revision;
        /** Returns the API implementation-specific versioning information. May be null. */
        public final String implementation;

        public APIVersion(int major, int minor) {
            this(major, minor, null, null);
        }

        public APIVersion(int major, int minor, String revision, String implementation) {
            this.major = major;
            this.minor = minor;
            this.revision = revision;
            this.implementation = implementation;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(16);
            sb.append(major).append('.').append(minor);
            if (revision != null) {
                sb.append('.').append(revision);
            }
            if (implementation != null) {
                sb.append(" (").append(implementation).append(')');
            }
            return sb.toString();
        }
    }

    /**
     * Returns the {@link APIVersion} value of the specified option.
     *
     * @param option the option to query
     */
    public static APIVersion apiParseVersion(Configuration<?> option) {
        APIVersion version;

        Object state = option.get();
        if (state instanceof String) {
            version = apiParseVersion((String)state, null);
        } else if (state instanceof APIVersion) {
            version = (APIVersion)state;
        } else {
            version = null;
        }

        return version;
    }

    /**
     * Parses a version string. The version string must have the format {@code MAJOR.MINOR.REVISION IMPL}, where {@code MAJOR} is the major version (integer),
     * {@code MINOR} is the minor version (integer), {@code REVISION} is the revision version (string, optional) and {@code IMPL} is implementation-specific
     * information (string, optional).
     *
     * @param version the API version string
     *
     * @return the parsed {@link APIVersion}
     */
    public static APIVersion apiParseVersion(String version) {
        return apiParseVersion(version, null);
    }

    /**
     * Parses a version string. The version string must have the format {@code PREFIX MAJOR.MINOR.REVISION IMPL}, where {@code PREFIX} is the specified prefix
     * (string, optional), {@code MAJOR} is the major version (integer), {@code MINOR} is the minor version (integer), {@code REVISION} is the revision version
     * (string, optional) and {@code IMPL} is implementation-specific information (string, optional).
     *
     * @param version the version string
     * @param prefix  the version string prefix, may be null
     *
     * @return the parsed {@link APIVersion}
     */
    public static APIVersion apiParseVersion(String version, String prefix) {
        String pattern = "([0-9]+)[.]([0-9]+)([.]\\S+)?\\s*(.+)?";
        if (prefix != null) {
            pattern = "(?:" + prefix + "\\s+)?" + pattern;
        }

        Matcher matcher = Pattern.compile(pattern).matcher(version);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(String.format("Malformed API version string [%s]", version));
        }

        return new APIVersion(
            Integer.parseInt(matcher.group(1)),
            Integer.parseInt(matcher.group(2)),
            matcher.group(3),
            matcher.group(4)
        );
    }

    public static String apiUnknownToken(int token) {
        return apiUnknownToken("Unknown", token);
    }

    public static String apiUnknownToken(String description, int token) {
        return String.format("%s [0x%X]", description, token);
    }

    /**
     * Returns a map of public static final integer fields in the specified classes, to their String representations. An optional filter can be specified to
     * only include specific fields. The target map may be null, in which case a new map is allocated and returned.
     *
     * <p>This method is useful when debugging to quickly identify values returned from an API.</p>
     *
     * @param filter       the filter to use (optional)
     * @param target       the target map (optional)
     * @param tokenClasses the classes to get tokens from
     *
     * @return the token map
     */
    public static Map<Integer, String> apiClassTokens(BiPredicate<Field, Integer> filter, Map<Integer, String> target, Class<?>... tokenClasses) {
        if (target == null) {
            target = new HashMap<>(64);
        }

        int TOKEN_MODIFIERS = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;

        for (Class<?> tokenClass : tokenClasses) {
            if (tokenClass == null) {
                continue;
            }

            for (Field field : tokenClass.getDeclaredFields()) {
                // Get only <public static final int> fields.
                if ((field.getModifiers() & TOKEN_MODIFIERS) == TOKEN_MODIFIERS && field.getType() == int.class) {
                    try {
                        Integer value = field.getInt(null);
                        if (filter != null && !filter.test(field, value)) {
                            continue;
                        }

                        String name = target.get(value);
                        target.put(value, name == null ? field.getName() : name + "|" + field.getName());
                    } catch (IllegalAccessException e) {
                        // Ignore
                    }
                }
            }
        }

        return target;
    }

    // ----------------------------------------

    /**
     * Stores the specified array of pointer addresses on the specified {@link MemoryStack}.
     *
     * @param stack     the stack to use
     * @param addresses the pointer addresses to store
     *
     * @return the pointer array address on the stack
     */
    public static long apiArray(MemoryStack stack, long... addresses) {
        PointerBuffer pointers = stack.mallocPointer(addresses.length);

        for (long address : addresses) {
            pointers.put(address);
        }

        return memAddress0(pointers);
    }

    /**
     * Stores the addresses of the specified array of buffers on the specified {@link MemoryStack}.
     *
     * @param stack   the stack to use
     * @param buffers the buffers to store
     *
     * @return the pointer array address on the stack
     */
    public static long apiArray(MemoryStack stack, ByteBuffer... buffers) {
        PointerBuffer pointers = stack.mallocPointer(buffers.length);

        for (ByteBuffer buffer : buffers) {
            pointers.put(buffer);
        }

        return memAddress0(pointers);
    }

    /**
     * Stores the addresses of the specified array of buffers on the specified {@link MemoryStack}. A second array that contains the buffer remaining bytes is
     * stored immediately after the pointer array. Length values are pointer-sized integers.
     *
     * @param stack   the stack to use
     * @param buffers the buffers to store
     *
     * @return the pointer array address on the stack
     */
    public static long apiArrayp(MemoryStack stack, ByteBuffer... buffers) {
        long pointers = apiArray(stack, buffers);

        PointerBuffer lengths = stack.mallocPointer(buffers.length);
        for (ByteBuffer buffer : buffers) {
            lengths.put(buffer.remaining());
        }

        return pointers;
    }

    // ----------------------------------------

    public interface Encoder {
        ByteBuffer encode(CharSequence text, boolean nullTerminated);
    }

    /**
     * Encodes the specified strings with the specified {@link Encoder} and stores an array of pointers to the encoded data on the specified
     * {@link MemoryStack}. The encoded strings include null-termination.
     *
     * @param stack   the stack to use
     * @param encoder the encoder to use
     * @param strings the strings to encode
     *
     * @return the pointer array address on the stack
     */
    public static long apiArray(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        PointerBuffer pointers = stack.mallocPointer(strings.length);

        for (CharSequence s : strings) {
            pointers.put(encoder.encode(s, true));
        }

        return memAddress0(pointers);
    }

    /**
     * Encodes the specified strings with the specified {@link Encoder} and stores an array of pointers to the encoded data on the specified
     * {@link MemoryStack}. A second array that contains the string lengths is stored immediately after the pointer array. Length values are 4-byte integers.
     *
     * <p>The encoded buffers must be freed with {@link #apiArrayFree}.</p>
     *
     * @param stack   the stack to use
     * @param encoder the encoder to use
     * @param strings the strings to encode
     *
     * @return the pointer array address on the stack
     */
    public static long apiArrayi(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        // Alignment rules guarantee these two will be contiguous
        PointerBuffer pointers = stack.mallocPointer(strings.length);
        IntBuffer     lengths  = stack.mallocInt(strings.length);

        for (CharSequence s : strings) {
            ByteBuffer buffer = encoder.encode(s, false);

            pointers.put(buffer);
            lengths.put(buffer.capacity());
        }

        return memAddress0(pointers);
    }

    /**
     * Encodes the specified strings with the specified {@link Encoder} and stores an array of pointers to the encoded data on the specified
     * {@link MemoryStack}. A second array that contains the string lengths is stored immediately after the pointer array. Length values are pointer-sized
     * integers.
     *
     * <p>The encoded buffers must be freed with {@link #apiArrayFree}.</p>
     *
     * @param stack   the stack to use
     * @param encoder the encoder to use
     * @param strings the strings to encode
     *
     * @return the pointer array address on the stack
     */
    public static long apiArrayp(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        PointerBuffer pointers = stack.mallocPointer(strings.length);
        PointerBuffer lengths  = stack.mallocPointer(strings.length);

        for (CharSequence s : strings) {
            ByteBuffer buffer = encoder.encode(s, false);

            pointers.put(buffer);
            lengths.put(buffer.capacity());
        }

        return memAddress0(pointers);
    }

    /**
     * Frees the specified array of pointers.
     *
     * @param pointers the pointer array to free
     * @param length   the pointer array length
     */
    public static void apiArrayFree(long pointers, int length) {
        for (int i = length; --i >= 0; ) {
            nmemFree(memGetAddress(pointers + (i << POINTER_SHIFT)));
        }
    }

    // ----------------------------------------

}