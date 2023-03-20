/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;
import org.lwjgl.system.linux.*;
import org.lwjgl.system.macosx.*;
import org.lwjgl.system.windows.*;

import javax.annotation.*;
import java.io.*;
import java.lang.reflect.*;
import java.nio.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.wrap;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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

    private static final Pattern API_VERSION_PATTERN;

    static {
        String PREFIX         = "[^\\d\\n\\r]*";
        String VERSION        = "(\\d+)[.](\\d+)(?:[.](\\S+))?";
        String IMPLEMENTATION = "(?:\\s+(.+?))?\\s*";

        API_VERSION_PATTERN = Pattern.compile("^" + PREFIX + VERSION + IMPLEMENTATION + "$", Pattern.DOTALL);
    }

    @SuppressWarnings({"unchecked", "UseOfSystemOutOrSystemErr"})
    private static PrintStream getDebugStream() {
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
            DEBUG_STREAM.print("[LWJGL] " + msg + "\n");
        }
    }

    /**
     * Same as {@link #apiLog}, but replaces the LWJGL prefix with a tab character.
     *
     * @param msg the message to print, in continuation of a previous message
     */
    public static void apiLogMore(CharSequence msg) {
        if (DEBUG) {
            DEBUG_STREAM.print("\t" + msg + "\n");
        }
    }

    public static void apiLogMissing(String api, ByteBuffer functionName) {
        if (DEBUG) {
            String function = memASCII(functionName, functionName.remaining() - 1);
            DEBUG_STREAM.print("[LWJGL] Failed to locate address for " + api + " function " + function + "\n");
        }
    }

    public static String apiFindLibrary(String start, String name) {
        String libName = Platform.get().mapLibraryName(name);
        try (Stream<Path> paths = Files.find(
            Paths.get(start).toAbsolutePath(),
            Integer.MAX_VALUE,
            (path, attributes) -> attributes.isRegularFile() && path.getFileName().toString().equals(libName)
        )) {
            return paths
                .findFirst()
                .map(Path::toString)
                .orElse(name);
        } catch (IOException e) {
            return name;
        }
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
        long a = provider.getFunctionAddress(functionName);
        if (a == NULL) {
            requiredFunctionMissing(functionName);
        }
        return a;
    }
    private static void requiredFunctionMissing(String functionName) {
        if (!Configuration.DISABLE_FUNCTION_CHECKS.get(false)) {
            throw new NullPointerException("A required function is missing: " + functionName);
        }
    }

    public static long apiGetFunctionAddressOptional(SharedLibrary library, String functionName) {
        long a = library.getFunctionAddress(functionName);
        if (DEBUG_FUNCTIONS && a == NULL) {
            optionalFunctionMissing(library, functionName);
        }
        return a;
    }
    private static void optionalFunctionMissing(SharedLibrary library, String functionName) {
        if (DEBUG) {
            DEBUG_STREAM.print("[LWJGL] Failed to locate address for " + library.getName() + " function " + functionName + "\n");
        }
    }

    @Nullable
    public static ByteBuffer apiGetMappedBuffer(@Nullable ByteBuffer buffer, long mappedAddress, int capacity) {
        if (buffer != null && memAddress(buffer) == mappedAddress && buffer.capacity() == capacity) {
            return buffer;
        }
        return mappedAddress == NULL ? null : wrap(BUFFER_BYTE, mappedAddress, capacity).order(NATIVE_ORDER);
    }

    public static long apiGetBytes(int elements, int elementShift) {
        return (elements & 0xFFFF_FFFFL) << elementShift;
    }

    public static long apiCheckAllocation(int elements, long bytes, long maxBytes) {
        if (DEBUG) {
            if (elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements");
            }
            if ((maxBytes + Long.MIN_VALUE) < (bytes + Long.MIN_VALUE)) { // unsigned comparison
                throw new IllegalArgumentException("The request allocation is too large");
            }
        }
        return bytes;
    }

    /** A data class for API versioning information. */
    public static class APIVersion implements Comparable<APIVersion> {

        /** Returns the API major version. */
        public final int major;
        /** Returns the API minor version. */
        public final int minor;

        /** Returns the API revision. May be null. */
        @Nullable
        public final String revision;
        /** Returns the API implementation-specific versioning information. May be null. */
        @Nullable
        public final String implementation;

        public APIVersion(int major, int minor) {
            this(major, minor, null, null);
        }

        public APIVersion(int major, int minor, @Nullable String revision, @Nullable String implementation) {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof APIVersion)) {
                return false;
            }

            APIVersion that = (APIVersion)o;

            return this.major == that.major &&
                   this.minor == that.major &&
                   Objects.equals(this.revision, that.revision) &&
                   Objects.equals(this.implementation, that.implementation);
        }

        @Override
        public int hashCode() {
            int result = major;
            result = 31 * result + minor;
            result = 31 * result + (revision != null ? revision.hashCode() : 0);
            result = 31 * result + (implementation != null ? implementation.hashCode() : 0);
            return result;
        }

        @Override
        public int compareTo(APIVersion other) {
            if (this.major != other.major) {
                return Integer.compare(this.major, other.major);
            }

            if (this.minor != other.minor) {
                return Integer.compare(this.minor, other.minor);
            }

            return 0;
        }
    }

    /**
     * Returns the {@link APIVersion} value of the specified option.
     *
     * @param option the option to query
     */
    @Nullable
    public static APIVersion apiParseVersion(Configuration<?> option) {
        APIVersion version;

        Object state = option.get();
        if (state instanceof String) {
            version = apiParseVersion((String)state);
        } else if (state instanceof APIVersion) {
            version = (APIVersion)state;
        } else {
            version = null;
        }

        return version;
    }

    /**
     * Parses a version string.
     *
     * <p>The version string must have the format {@code PREFIX MAJOR.MINOR.REVISION IMPL}, where {@code PREFIX} is a prefix without digits (string, optional),
     * {@code MAJOR} is the major version (integer), {@code MINOR} is the minor version (integer), {@code REVISION} is the revision version (string, optional)
     * and {@code IMPL} is implementation-specific information (string, optional).</p>
     *
     * @param version the version string
     *
     * @return the parsed {@link APIVersion}
     */
    public static APIVersion apiParseVersion(String version) {
        Matcher matcher = API_VERSION_PATTERN.matcher(version);
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

    public static void apiFilterExtensions(Set<String> extensions, Configuration<Object> option) {
        Object value = option.get();
        if (value == null) {
            return;
        }

        if (value instanceof String) {
            String s = (String)value;
            if (s.indexOf('.') != -1) { // classpath
                try {
                    @SuppressWarnings("unchecked") Predicate<String> predicate = (Predicate<String>)Class.forName(s).newInstance();
                    extensions.removeIf(predicate);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } else {
                for (String extension : s.split(",")) {
                    extensions.remove(extension);
                }
            }
        } else if (value instanceof List<?>) {
            @SuppressWarnings("unchecked") List<String> list = (List<String>)value;
            extensions.removeAll(list);
        } else if (value instanceof Predicate<?>) {
            @SuppressWarnings("unchecked") Predicate<String> predicate = (Predicate<String>)value;
            extensions.removeIf(predicate);
        } else {
            throw new IllegalStateException("Unsupported " + option.getProperty() + " value specified.");
        }
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
    public static Map<Integer, String> apiClassTokens(@Nullable BiPredicate<Field, Integer> filter, @Nullable Map<Integer, String> target, Class<?>... tokenClasses) {
        if (target == null) {
            //noinspection AssignmentToMethodParameter
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
        PointerBuffer pointers = memPointerBuffer(stack.nmalloc(POINTER_SIZE, addresses.length << POINTER_SHIFT), addresses.length);

        for (long address : addresses) {
            pointers.put(address);
        }

        return pointers.address;
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
        PointerBuffer pointers = memPointerBuffer(stack.nmalloc(POINTER_SIZE, buffers.length << POINTER_SHIFT), buffers.length);

        for (ByteBuffer buffer : buffers) {
            pointers.put(buffer);
        }

        return pointers.address;
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

        return pointers.address;
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

        return pointers.address;
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

        return pointers.address;
    }

    /**
     * Frees the specified array of pointers.
     *
     * @param pointers the pointer array to free
     * @param length   the pointer array length
     */
    public static void apiArrayFree(long pointers, int length) {
        for (int i = length; --i >= 0; ) {
            nmemFree(memGetAddress(pointers + Integer.toUnsignedLong(i) * POINTER_SIZE));
        }
    }

    // ----------------------------------------

    // These FFITypes will never be deallocated, use the allocator directly to ignore them when detecting memory leaks.

    public static FFIType apiCreateStruct(FFIType... members) {
        MemoryAllocator allocator = MemoryUtil.getAllocator();

        PointerBuffer elementBuffer = PointerBuffer.create(
            allocator.malloc((members.length + 1) * POINTER_SIZE),
            members.length + 1
        );
        for (int i = 0; i < members.length; i++) {
            elementBuffer.put(i, members[i]);
        }
        elementBuffer.put(members.length, NULL);

        return FFIType.create(allocator.calloc(1, FFIType.SIZEOF))
            .type(FFI_TYPE_STRUCT)
            .elements(elementBuffer);
    }

    private static FFIType prep(FFIType type) {
        try (MemoryStack stack = stackPush()) {
            FFICIF cif = FFICIF.calloc(stack);
            if (ffi_prep_cif(cif, FFI_DEFAULT_ABI, type, null) != FFI_OK) {
                throw new IllegalStateException("Failed to prepare LibFFI type.");
            }
        }
        return type;
    }

    public static FFIType apiCreateUnion(FFIType... members) {
        MemoryAllocator allocator = MemoryUtil.getAllocator();

        // ffi_prep_cif is used to make libffi initialize size/alignment of each member
        FFIType maxType      = prep(members[0]);
        short   maxAlignment = members[0].alignment();
        for (int i = 1; i < members.length; i++) {
            FFIType type = prep(members[i]);
            if (maxType.size() < type.size()) {
                maxType = type;
            }
            if (maxAlignment < type.alignment()) {
                maxAlignment = type.alignment();
            }
        }

        return FFIType.create(allocator.malloc(FFIType.SIZEOF))
            .size(maxType.size())
            .alignment(maxAlignment)
            .type(FFI_TYPE_STRUCT)
            .elements(PointerBuffer.create(allocator.malloc(2 * POINTER_SIZE), 2)
                .put(0, maxType)
                .put(1, NULL));
    }

    public static FFIType apiCreateArray(FFIType type, int length) {
        MemoryAllocator allocator = MemoryUtil.getAllocator();

        PointerBuffer elementBuffer = PointerBuffer.create(
            allocator.malloc((length + 1) * POINTER_SIZE),
            length + 1
        );
        for (int i = 0; i < length; i++) {
            elementBuffer.put(i, type);
        }
        elementBuffer.put(length, NULL);

        return FFIType.create(allocator.calloc(1, FFIType.SIZEOF))
            .type(FFI_TYPE_STRUCT)
            .elements(elementBuffer);
    }

    /** Allocates and prepares a libffi CIF. */
    public static FFICIF apiCreateCIF(int abi, FFIType rtype, FFIType... atypes) {
        // These CIFs will never be deallocated, use the allocator directly to ignore them when detecting memory leaks.
        MemoryAllocator allocator = MemoryUtil.getAllocator();

        PointerBuffer pArgTypes = PointerBuffer.create(allocator.malloc(atypes.length * POINTER_SIZE), atypes.length);
        for (int i = 0; i < atypes.length; i++) {
            pArgTypes.put(i, atypes[i]);
        }

        FFICIF cif = FFICIF.create(allocator.malloc(FFICIF.SIZEOF));

        int errcode = ffi_prep_cif(cif, abi, rtype, pArgTypes);
        if (errcode != FFI_OK) {
            throw new IllegalStateException("Failed to prepare libffi CIF: " + errcode);
        }

        return cif;
    }

    /** Allocates and prepares a libffi var CIF. */
    public static FFICIF apiCreateCIFVar(int abi, int nfixedargs, FFIType rtype, FFIType... atypes) {
        // These CIFs will never be deallocated, use the allocator directly to ignore them when detecting memory leaks.
        MemoryAllocator allocator = MemoryUtil.getAllocator();

        PointerBuffer pArgTypes = PointerBuffer.create(allocator.malloc(atypes.length * POINTER_SIZE), atypes.length);
        for (int i = 0; i < atypes.length; i++) {
            pArgTypes.put(i, atypes[i]);
        }

        FFICIF cif = FFICIF.create(allocator.malloc(FFICIF.SIZEOF));

        int errcode = ffi_prep_cif_var(cif, abi, nfixedargs, rtype, pArgTypes);
        if (errcode != FFI_OK) {
            throw new IllegalStateException("Failed to prepare libffi var CIF: " + errcode);
        }

        return cif;
    }

    public static int apiStdcall() {
        return Platform.get() == Platform.WINDOWS && Pointer.BITS32 ? FFI_STDCALL : FFI_DEFAULT_ABI;
    }

    public static void apiClosureRet(long ret, boolean __result) { memPutAddress(ret, __result ? 1L : 0L); }
    public static void apiClosureRet(long ret, byte __result)    { memPutAddress(ret, __result & 0xFFL); }
    public static void apiClosureRet(long ret, short __result)   { memPutAddress(ret, __result & 0xFFFFL); }
    public static void apiClosureRet(long ret, int __result)     { memPutAddress(ret, __result & 0xFFFF_FFFFL); }
    public static void apiClosureRetL(long ret, long __result)   { memPutLong(ret, __result); }
    public static void apiClosureRetP(long ret, long __result)   { memPutAddress(ret, __result); }
    public static void apiClosureRet(long ret, float __result)   { memPutFloat(ret, __result); }
    public static void apiClosureRet(long ret, double __result)  { memPutDouble(ret, __result); }

}