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
 * struct PathWrite_t {
 *     PathHandle_t ulPath;
 *     EPropertyWriteType {@link #writeType};
 *     ETrackedPropertyError {@link #eSetError};
 *     void * pvBuffer;
 *     uint32_t unBufferSize;
 *     PropertyTypeTag_t unTag;
 *     ETrackedPropertyError {@link #eError};
 *     char * pszPath;
 * }</code></pre>
 */
@NativeType("struct PathWrite_t")
public class PathWrite extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULPATH,
        WRITETYPE,
        ESETERROR,
        PVBUFFER,
        UNBUFFERSIZE,
        UNTAG,
        EERROR,
        PSZPATH;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULPATH = layout.offsetof(0);
        WRITETYPE = layout.offsetof(1);
        ESETERROR = layout.offsetof(2);
        PVBUFFER = layout.offsetof(3);
        UNBUFFERSIZE = layout.offsetof(4);
        UNTAG = layout.offsetof(5);
        EERROR = layout.offsetof(6);
        PSZPATH = layout.offsetof(7);
    }

    /**
     * Creates a {@code PathWrite} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PathWrite(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ulPath} field. */
    @NativeType("PathHandle_t")
    public long ulPath() { return nulPath(address()); }
    /** one of:<br><table><tr><td>{@link VR#EPropertyWriteType_PropertyWrite_Set}</td><td>{@link VR#EPropertyWriteType_PropertyWrite_Erase}</td></tr><tr><td>{@link VR#EPropertyWriteType_PropertyWrite_SetError}</td></tr></table> */
    @NativeType("EPropertyWriteType")
    public int writeType() { return nwriteType(address()); }
    /** one of:<br><table><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_Success}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDataType}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_WrongDeviceClass}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_BufferTooSmall}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_UnknownProperty}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CouldNotContactServer}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_ValueNotProvidedByDevice}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_StringExceedsMaximumLength}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_NotYetAvailable}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_PermissionDenied}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidOperation}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_CannotWriteToWildcards}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_IPCReadFailure}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_OutOfMemory}</td></tr><tr><td>{@link VR#ETrackedPropertyError_TrackedProp_InvalidContainer}</td></tr></table> */
    @NativeType("ETrackedPropertyError")
    public int eSetError() { return neSetError(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
    @NativeType("void *")
    public ByteBuffer pvBuffer() { return npvBuffer(address()); }
    /** @return the value of the {@code unBufferSize} field. */
    @NativeType("uint32_t")
    public int unBufferSize() { return nunBufferSize(address()); }
    /** @return the value of the {@code unTag} field. */
    @NativeType("PropertyTypeTag_t")
    public int unTag() { return nunTag(address()); }
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
    public PathWrite ulPath(@NativeType("PathHandle_t") long value) { nulPath(address(), value); return this; }
    /** Sets the specified value to the {@link #writeType} field. */
    public PathWrite writeType(@NativeType("EPropertyWriteType") int value) { nwriteType(address(), value); return this; }
    /** Sets the specified value to the {@link #eSetError} field. */
    public PathWrite eSetError(@NativeType("ETrackedPropertyError") int value) { neSetError(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
    public PathWrite pvBuffer(@NativeType("void *") ByteBuffer value) { npvBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code unTag} field. */
    public PathWrite unTag(@NativeType("PropertyTypeTag_t") int value) { nunTag(address(), value); return this; }
    /** Sets the specified value to the {@link #eError} field. */
    public PathWrite eError(@NativeType("ETrackedPropertyError") int value) { neError(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pszPath} field. */
    public PathWrite pszPath(@NativeType("char *") ByteBuffer value) { npszPath(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PathWrite set(
        long ulPath,
        int writeType,
        int eSetError,
        ByteBuffer pvBuffer,
        int unTag,
        int eError,
        ByteBuffer pszPath
    ) {
        ulPath(ulPath);
        writeType(writeType);
        eSetError(eSetError);
        pvBuffer(pvBuffer);
        unTag(unTag);
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
    public PathWrite set(PathWrite src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PathWrite} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PathWrite malloc() {
        return wrap(PathWrite.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code PathWrite} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PathWrite calloc() {
        return wrap(PathWrite.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code PathWrite} instance allocated with {@link BufferUtils}. */
    public static PathWrite create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(PathWrite.class, memAddress(container), container);
    }

    /** Returns a new {@code PathWrite} instance for the specified memory address. */
    public static PathWrite create(long address) {
        return wrap(PathWrite.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PathWrite createSafe(long address) {
        return address == NULL ? null : wrap(PathWrite.class, address);
    }

    /**
     * Returns a new {@link PathWrite.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PathWrite.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PathWrite.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link PathWrite.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static PathWrite.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code PathWrite} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PathWrite malloc(MemoryStack stack) {
        return wrap(PathWrite.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code PathWrite} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PathWrite calloc(MemoryStack stack) {
        return wrap(PathWrite.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link PathWrite.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PathWrite.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PathWrite.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulPath}. */
    public static long nulPath(long struct) { return UNSAFE.getLong(null, struct + PathWrite.ULPATH); }
    /** Unsafe version of {@link #writeType}. */
    public static int nwriteType(long struct) { return UNSAFE.getInt(null, struct + PathWrite.WRITETYPE); }
    /** Unsafe version of {@link #eSetError}. */
    public static int neSetError(long struct) { return UNSAFE.getInt(null, struct + PathWrite.ESETERROR); }
    /** Unsafe version of {@link #pvBuffer() pvBuffer}. */
    public static ByteBuffer npvBuffer(long struct) { return memByteBuffer(memGetAddress(struct + PathWrite.PVBUFFER), nunBufferSize(struct)); }
    /** Unsafe version of {@link #unBufferSize}. */
    public static int nunBufferSize(long struct) { return UNSAFE.getInt(null, struct + PathWrite.UNBUFFERSIZE); }
    /** Unsafe version of {@link #unTag}. */
    public static int nunTag(long struct) { return UNSAFE.getInt(null, struct + PathWrite.UNTAG); }
    /** Unsafe version of {@link #eError}. */
    public static int neError(long struct) { return UNSAFE.getInt(null, struct + PathWrite.EERROR); }
    /** Unsafe version of {@link #pszPath}. */
    public static ByteBuffer npszPath(long struct) { return memByteBufferNT1(memGetAddress(struct + PathWrite.PSZPATH)); }
    /** Unsafe version of {@link #pszPathString}. */
    public static String npszPathString(long struct) { return memASCII(memGetAddress(struct + PathWrite.PSZPATH)); }

    /** Unsafe version of {@link #ulPath(long) ulPath}. */
    public static void nulPath(long struct, long value) { UNSAFE.putLong(null, struct + PathWrite.ULPATH, value); }
    /** Unsafe version of {@link #writeType(int) writeType}. */
    public static void nwriteType(long struct, int value) { UNSAFE.putInt(null, struct + PathWrite.WRITETYPE, value); }
    /** Unsafe version of {@link #eSetError(int) eSetError}. */
    public static void neSetError(long struct, int value) { UNSAFE.putInt(null, struct + PathWrite.ESETERROR, value); }
    /** Unsafe version of {@link #pvBuffer(ByteBuffer) pvBuffer}. */
    public static void npvBuffer(long struct, ByteBuffer value) { memPutAddress(struct + PathWrite.PVBUFFER, memAddress(value)); nunBufferSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code unBufferSize} field of the specified {@code struct}. */
    public static void nunBufferSize(long struct, int value) { UNSAFE.putInt(null, struct + PathWrite.UNBUFFERSIZE, value); }
    /** Unsafe version of {@link #unTag(int) unTag}. */
    public static void nunTag(long struct, int value) { UNSAFE.putInt(null, struct + PathWrite.UNTAG, value); }
    /** Unsafe version of {@link #eError(int) eError}. */
    public static void neError(long struct, int value) { UNSAFE.putInt(null, struct + PathWrite.EERROR, value); }
    /** Unsafe version of {@link #pszPath(ByteBuffer) pszPath}. */
    public static void npszPath(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + PathWrite.PSZPATH, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + PathWrite.PVBUFFER));
        check(memGetAddress(struct + PathWrite.PSZPATH));
    }

    // -----------------------------------

    /** An array of {@link PathWrite} structs. */
    public static class Buffer extends StructBuffer<PathWrite, Buffer> implements NativeResource {

        private static final PathWrite ELEMENT_FACTORY = PathWrite.create(-1L);

        /**
         * Creates a new {@code PathWrite.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PathWrite#SIZEOF}, and its mark will be undefined.
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
        protected PathWrite getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ulPath} field. */
        @NativeType("PathHandle_t")
        public long ulPath() { return PathWrite.nulPath(address()); }
        /** @return the value of the {@link PathWrite#writeType} field. */
        @NativeType("EPropertyWriteType")
        public int writeType() { return PathWrite.nwriteType(address()); }
        /** @return the value of the {@link PathWrite#eSetError} field. */
        @NativeType("ETrackedPropertyError")
        public int eSetError() { return PathWrite.neSetError(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
        @NativeType("void *")
        public ByteBuffer pvBuffer() { return PathWrite.npvBuffer(address()); }
        /** @return the value of the {@code unBufferSize} field. */
        @NativeType("uint32_t")
        public int unBufferSize() { return PathWrite.nunBufferSize(address()); }
        /** @return the value of the {@code unTag} field. */
        @NativeType("PropertyTypeTag_t")
        public int unTag() { return PathWrite.nunTag(address()); }
        /** @return the value of the {@link PathWrite#eError} field. */
        @NativeType("ETrackedPropertyError")
        public int eError() { return PathWrite.neError(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pszPath} field. */
        @NativeType("char *")
        public ByteBuffer pszPath() { return PathWrite.npszPath(address()); }
        /** @return the null-terminated string pointed to by the {@code pszPath} field. */
        @NativeType("char *")
        public String pszPathString() { return PathWrite.npszPathString(address()); }

        /** Sets the specified value to the {@code ulPath} field. */
        public PathWrite.Buffer ulPath(@NativeType("PathHandle_t") long value) { PathWrite.nulPath(address(), value); return this; }
        /** Sets the specified value to the {@link PathWrite#writeType} field. */
        public PathWrite.Buffer writeType(@NativeType("EPropertyWriteType") int value) { PathWrite.nwriteType(address(), value); return this; }
        /** Sets the specified value to the {@link PathWrite#eSetError} field. */
        public PathWrite.Buffer eSetError(@NativeType("ETrackedPropertyError") int value) { PathWrite.neSetError(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
        public PathWrite.Buffer pvBuffer(@NativeType("void *") ByteBuffer value) { PathWrite.npvBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code unTag} field. */
        public PathWrite.Buffer unTag(@NativeType("PropertyTypeTag_t") int value) { PathWrite.nunTag(address(), value); return this; }
        /** Sets the specified value to the {@link PathWrite#eError} field. */
        public PathWrite.Buffer eError(@NativeType("ETrackedPropertyError") int value) { PathWrite.neError(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pszPath} field. */
        public PathWrite.Buffer pszPath(@NativeType("char *") ByteBuffer value) { PathWrite.npszPath(address(), value); return this; }

    }

}