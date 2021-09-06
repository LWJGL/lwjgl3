/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Provides information about the last error.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrErrorInfo {
 *     ovrResult {@link #Result};
 *     char {@link #ErrorString}[512];
 * }</code></pre>
 */
@NativeType("struct ovrErrorInfo")
public class OVRErrorInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESULT,
        ERRORSTRING;

    static {
        Layout layout = __struct(
            __member(4),
            __array(1, 512)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESULT = layout.offsetof(0);
        ERRORSTRING = layout.offsetof(1);
    }

    /**
     * Creates a {@code OVRErrorInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRErrorInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the result from the last API call that generated an error {@code ovrResult} */
    @NativeType("ovrResult")
    public int Result() { return nResult(address()); }
    /** a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions */
    @NativeType("char[512]")
    public ByteBuffer ErrorString() { return nErrorString(address()); }
    /** a UTF8-encoded null-terminated English string describing the problem. The format of this string is subject to change in future versions */
    @NativeType("char[512]")
    public String ErrorStringString() { return nErrorStringString(address()); }

    // -----------------------------------

    /** Returns a new {@code OVRErrorInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRErrorInfo malloc() {
        return wrap(OVRErrorInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRErrorInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRErrorInfo calloc() {
        return wrap(OVRErrorInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRErrorInfo} instance allocated with {@link BufferUtils}. */
    public static OVRErrorInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRErrorInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRErrorInfo} instance for the specified memory address. */
    public static OVRErrorInfo create(long address) {
        return wrap(OVRErrorInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRErrorInfo createSafe(long address) {
        return address == NULL ? null : wrap(OVRErrorInfo.class, address);
    }

    /**
     * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRErrorInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRErrorInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRErrorInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static OVRErrorInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code OVRErrorInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRErrorInfo malloc(MemoryStack stack) {
        return wrap(OVRErrorInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRErrorInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRErrorInfo calloc(MemoryStack stack) {
        return wrap(OVRErrorInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRErrorInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRErrorInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Result}. */
    public static int nResult(long struct) { return UNSAFE.getInt(null, struct + OVRErrorInfo.RESULT); }
    /** Unsafe version of {@link #ErrorString}. */
    public static ByteBuffer nErrorString(long struct) { return memByteBuffer(struct + OVRErrorInfo.ERRORSTRING, 512); }
    /** Unsafe version of {@link #ErrorStringString}. */
    public static String nErrorStringString(long struct) { return memUTF8(struct + OVRErrorInfo.ERRORSTRING); }

    // -----------------------------------

    /** An array of {@link OVRErrorInfo} structs. */
    public static class Buffer extends StructBuffer<OVRErrorInfo, Buffer> implements NativeResource {

        private static final OVRErrorInfo ELEMENT_FACTORY = OVRErrorInfo.create(-1L);

        /**
         * Creates a new {@code OVRErrorInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRErrorInfo#SIZEOF}, and its mark will be undefined.
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
        protected OVRErrorInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link OVRErrorInfo#Result} field. */
        @NativeType("ovrResult")
        public int Result() { return OVRErrorInfo.nResult(address()); }
        /** @return a {@link ByteBuffer} view of the {@link OVRErrorInfo#ErrorString} field. */
        @NativeType("char[512]")
        public ByteBuffer ErrorString() { return OVRErrorInfo.nErrorString(address()); }
        /** @return the null-terminated string stored in the {@link OVRErrorInfo#ErrorString} field. */
        @NativeType("char[512]")
        public String ErrorStringString() { return OVRErrorInfo.nErrorStringString(address()); }

    }

}