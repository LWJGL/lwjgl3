/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct PathRead_t {
 *     PathHandle_t ulPath;
 *     void * pvBuffer;
 *     uint32_t unBufferSize;
 *     PropertyTypeTag_t unTag;
 *     uint32_t unRequiredBufferSize;
 *     ETrackedPropertyError {@link #eError};
 *     char * pszPath;
 * }</code></pre>
 */
@NativeType("struct PathRead_t")
public class PathRead extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULPATH,
        PVBUFFER,
        UNBUFFERSIZE,
        UNTAG,
        UNREQUIREDBUFFERSIZE,
        EERROR,
        PSZPATH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULPATH = layout.offsetof(0);
        PVBUFFER = layout.offsetof(1);
        UNBUFFERSIZE = layout.offsetof(2);
        UNTAG = layout.offsetof(3);
        UNREQUIREDBUFFERSIZE = layout.offsetof(4);
        EERROR = layout.offsetof(5);
        PSZPATH = layout.offsetof(6);
    }

    /**
     * Creates a {@code PathRead} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PathRead(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ulPath} field. */
    @NativeType("PathHandle_t")
    public long ulPath() { return nulPath(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
    @NativeType("void *")
    public ByteBuffer pvBuffer() { return npvBuffer(address()); }
    /** @return the value of the {@code unBufferSize} field. */
    @NativeType("uint32_t")
    public int unBufferSize() { return nunBufferSize(address()); }
    /** @return the value of the {@code unTag} field. */
    @NativeType("PropertyTypeTag_t")
    public int unTag() { return nunTag(address()); }
    /** @return the value of the {@code unRequiredBufferSize} field. */
    @NativeType("uint32_t")
    public int unRequiredBufferSize() { return nunRequiredBufferSize(address()); }
    /** one of:<br><table><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_Success}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDataType}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDeviceClass}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_BufferTooSmall}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_UnknownProperty}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CouldNotContactServer}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_NotYetAvailable}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_PermissionDenied}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidOperation}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CannotWriteToWildcards}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_IPCReadFailure}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_OutOfMemory}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidContainer}</td></tr></table> */
    @NativeType("ETrackedPropertyError")
    public int eError() { return neError(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pszPath} field. */
    @NativeType("char *")
    public ByteBuffer pszPath() { return npszPath(address()); }
    /** @return the null-terminated string pointed to by the {@code pszPath} field. */
    @NativeType("char *")
    public String pszPathString() { return npszPathString(address()); }

    /** Sets the specified value to the {@code ulPath} field. */
    public PathRead ulPath(@NativeType("PathHandle_t") long value) { nulPath(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
    public PathRead pvBuffer(@NativeType("void *") ByteBuffer value) { npvBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code unTag} field. */
    public PathRead unTag(@NativeType("PropertyTypeTag_t") int value) { nunTag(address(), value); return this; }
    /** Sets the specified value to the {@code unRequiredBufferSize} field. */
    public PathRead unRequiredBufferSize(@NativeType("uint32_t") int value) { nunRequiredBufferSize(address(), value); return this; }
    /** Sets the specified value to the {@link #eError} field. */
    public PathRead eError(@NativeType("ETrackedPropertyError") int value) { neError(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pszPath} field. */
    public PathRead pszPath(@NativeType("char *") ByteBuffer value) { npszPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PathRead set(
        long ulPath,
        ByteBuffer pvBuffer,
        int unTag,
        int unRequiredBufferSize,
        int eError,
        ByteBuffer pszPath
    ) {
        ulPath(ulPath);
        pvBuffer(pvBuffer);
        unTag(unTag);
        unRequiredBufferSize(unRequiredBufferSize);
        eError(eError);
        pszPath(pszPath);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public PathRead set(PathRead src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PathRead} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PathRead malloc() {
        return wrap(PathRead.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code PathRead} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PathRead calloc() {
        return wrap(PathRead.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code PathRead} instance allocated with {@link BufferUtils}. */
    public static PathRead create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(PathRead.class, memAddress(container), container);
    }

    /** Returns a new {@code PathRead} instance for the specified memory address. */
    public static PathRead create(long address) {
        return wrap(PathRead.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PathRead createSafe(long address) {
        return address == NULL ? null : wrap(PathRead.class, address);
    }

    /**
     * Returns a new {@link PathRead.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PathRead.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PathRead.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link PathRead.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PathRead.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code PathRead} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PathRead malloc(MemoryStack stack) {
        return wrap(PathRead.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code PathRead} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PathRead calloc(MemoryStack stack) {
        return wrap(PathRead.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link PathRead.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PathRead.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PathRead.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulPath}. */
    public static long nulPath(long struct) { return UNSAFE.getLong(null, struct + PathRead.ULPATH); }
    /** Unsafe version of {@link #pvBuffer() pvBuffer}. */
    public static ByteBuffer npvBuffer(long struct) { return memByteBuffer(memGetAddress(struct + PathRead.PVBUFFER), nunBufferSize(struct)); }
    /** Unsafe version of {@link #unBufferSize}. */
    public static int nunBufferSize(long struct) { return UNSAFE.getInt(null, struct + PathRead.UNBUFFERSIZE); }
    /** Unsafe version of {@link #unTag}. */
    public static int nunTag(long struct) { return UNSAFE.getInt(null, struct + PathRead.UNTAG); }
    /** Unsafe version of {@link #unRequiredBufferSize}. */
    public static int nunRequiredBufferSize(long struct) { return UNSAFE.getInt(null, struct + PathRead.UNREQUIREDBUFFERSIZE); }
    /** Unsafe version of {@link #eError}. */
    public static int neError(long struct) { return UNSAFE.getInt(null, struct + PathRead.EERROR); }
    /** Unsafe version of {@link #pszPath}. */
    public static ByteBuffer npszPath(long struct) { return memByteBufferNT1(memGetAddress(struct + PathRead.PSZPATH)); }
    /** Unsafe version of {@link #pszPathString}. */
    public static String npszPathString(long struct) { return memASCII(memGetAddress(struct + PathRead.PSZPATH)); }

    /** Unsafe version of {@link #ulPath(long) ulPath}. */
    public static void nulPath(long struct, long value) { UNSAFE.putLong(null, struct + PathRead.ULPATH, value); }
    /** Unsafe version of {@link #pvBuffer(ByteBuffer) pvBuffer}. */
    public static void npvBuffer(long struct, ByteBuffer value) { memPutAddress(struct + PathRead.PVBUFFER, memAddress(value)); nunBufferSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code unBufferSize} field of the specified {@code struct}. */
    public static void nunBufferSize(long struct, int value) { UNSAFE.putInt(null, struct + PathRead.UNBUFFERSIZE, value); }
    /** Unsafe version of {@link #unTag(int) unTag}. */
    public static void nunTag(long struct, int value) { UNSAFE.putInt(null, struct + PathRead.UNTAG, value); }
    /** Unsafe version of {@link #unRequiredBufferSize(int) unRequiredBufferSize}. */
    public static void nunRequiredBufferSize(long struct, int value) { UNSAFE.putInt(null, struct + PathRead.UNREQUIREDBUFFERSIZE, value); }
    /** Unsafe version of {@link #eError(int) eError}. */
    public static void neError(long struct, int value) { UNSAFE.putInt(null, struct + PathRead.EERROR, value); }
    /** Unsafe version of {@link #pszPath(ByteBuffer) pszPath}. */
    public static void npszPath(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + PathRead.PSZPATH, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + PathRead.PVBUFFER));
        check(memGetAddress(struct + PathRead.PSZPATH));
    }

    // -----------------------------------

    /** An array of {@link PathRead} structs. */
    public static class Buffer extends StructBuffer<PathRead, Buffer> implements NativeResource {

        private static final PathRead ELEMENT_FACTORY = PathRead.create(-1L);

        /**
         * Creates a new {@code PathRead.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PathRead#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected PathRead getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ulPath} field. */
        @NativeType("PathHandle_t")
        public long ulPath() { return PathRead.nulPath(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
        @NativeType("void *")
        public ByteBuffer pvBuffer() { return PathRead.npvBuffer(address()); }
        /** @return the value of the {@code unBufferSize} field. */
        @NativeType("uint32_t")
        public int unBufferSize() { return PathRead.nunBufferSize(address()); }
        /** @return the value of the {@code unTag} field. */
        @NativeType("PropertyTypeTag_t")
        public int unTag() { return PathRead.nunTag(address()); }
        /** @return the value of the {@code unRequiredBufferSize} field. */
        @NativeType("uint32_t")
        public int unRequiredBufferSize() { return PathRead.nunRequiredBufferSize(address()); }
        /** @return the value of the {@link PathRead#eError} field. */
        @NativeType("ETrackedPropertyError")
        public int eError() { return PathRead.neError(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pszPath} field. */
        @NativeType("char *")
        public ByteBuffer pszPath() { return PathRead.npszPath(address()); }
        /** @return the null-terminated string pointed to by the {@code pszPath} field. */
        @NativeType("char *")
        public String pszPathString() { return PathRead.npszPathString(address()); }

        /** Sets the specified value to the {@code ulPath} field. */
        public PathRead.Buffer ulPath(@NativeType("PathHandle_t") long value) { PathRead.nulPath(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
        public PathRead.Buffer pvBuffer(@NativeType("void *") ByteBuffer value) { PathRead.npvBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code unTag} field. */
        public PathRead.Buffer unTag(@NativeType("PropertyTypeTag_t") int value) { PathRead.nunTag(address(), value); return this; }
        /** Sets the specified value to the {@code unRequiredBufferSize} field. */
        public PathRead.Buffer unRequiredBufferSize(@NativeType("uint32_t") int value) { PathRead.nunRequiredBufferSize(address(), value); return this; }
        /** Sets the specified value to the {@link PathRead#eError} field. */
        public PathRead.Buffer eError(@NativeType("ETrackedPropertyError") int value) { PathRead.neError(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pszPath} field. */
        public PathRead.Buffer pszPath(@NativeType("char *") ByteBuffer value) { PathRead.npszPath(address(), value); return this; }

    }

}