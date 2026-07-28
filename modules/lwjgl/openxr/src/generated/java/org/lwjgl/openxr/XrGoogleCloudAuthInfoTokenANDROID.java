/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrGoogleCloudAuthInfoTokenANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     char const * authToken;
 * }}</pre>
 */
public class XrGoogleCloudAuthInfoTokenANDROID extends Struct<XrGoogleCloudAuthInfoTokenANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        AUTHTOKEN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        AUTHTOKEN = layout.offsetof(2);
    }

    protected XrGoogleCloudAuthInfoTokenANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGoogleCloudAuthInfoTokenANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGoogleCloudAuthInfoTokenANDROID(address, container);
    }

    /**
     * Creates a {@code XrGoogleCloudAuthInfoTokenANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGoogleCloudAuthInfoTokenANDROID(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code authToken} field. */
    @NativeType("char const *")
    public ByteBuffer authToken() { return nauthToken(address()); }
    /** @return the null-terminated string pointed to by the {@code authToken} field. */
    @NativeType("char const *")
    public String authTokenString() { return nauthTokenString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGoogleCloudAuthInfoTokenANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID} value to the {@code type} field. */
    public XrGoogleCloudAuthInfoTokenANDROID type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGoogleCloudAuthInfoTokenANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code authToken} field. */
    public XrGoogleCloudAuthInfoTokenANDROID authToken(@NativeType("char const *") ByteBuffer value) { nauthToken(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGoogleCloudAuthInfoTokenANDROID set(
        int type,
        long next,
        ByteBuffer authToken
    ) {
        type(type);
        next(next);
        authToken(authToken);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGoogleCloudAuthInfoTokenANDROID set(XrGoogleCloudAuthInfoTokenANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoTokenANDROID malloc() {
        return new XrGoogleCloudAuthInfoTokenANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoTokenANDROID calloc() {
        return new XrGoogleCloudAuthInfoTokenANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGoogleCloudAuthInfoTokenANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGoogleCloudAuthInfoTokenANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance for the specified memory address. */
    public static XrGoogleCloudAuthInfoTokenANDROID create(long address) {
        return new XrGoogleCloudAuthInfoTokenANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGoogleCloudAuthInfoTokenANDROID createSafe(long address) {
        return address == NULL ? null : new XrGoogleCloudAuthInfoTokenANDROID(address, null);
    }

    /** Downcasts the specified {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance to {@code XrGoogleCloudAuthInfoTokenANDROID}. */
    public static XrGoogleCloudAuthInfoTokenANDROID create(XrGoogleCloudAuthInfoBaseHeaderANDROID value) {
        return new XrGoogleCloudAuthInfoTokenANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGoogleCloudAuthInfoTokenANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance to {@code XrGoogleCloudAuthInfoTokenANDROID.Buffer}. */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer create(XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer value) {
        return new XrGoogleCloudAuthInfoTokenANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoTokenANDROID malloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoTokenANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoTokenANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoTokenANDROID calloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoTokenANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoTokenANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGoogleCloudAuthInfoTokenANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.NEXT); }
    /** Unsafe version of {@link #authToken}. */
    public static ByteBuffer nauthToken(long struct) { return memByteBufferNT1(memGetAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.AUTHTOKEN)); }
    /** Unsafe version of {@link #authTokenString}. */
    public static String nauthTokenString(long struct) { return memUTF8(memGetAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.AUTHTOKEN)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGoogleCloudAuthInfoTokenANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.NEXT, value); }
    /** Unsafe version of {@link #authToken(ByteBuffer) authToken}. */
    public static void nauthToken(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.AUTHTOKEN, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGoogleCloudAuthInfoTokenANDROID.AUTHTOKEN));
    }

    // -----------------------------------

    /** An array of {@link XrGoogleCloudAuthInfoTokenANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGoogleCloudAuthInfoTokenANDROID, Buffer> implements NativeResource {

        private static final XrGoogleCloudAuthInfoTokenANDROID ELEMENT_FACTORY = XrGoogleCloudAuthInfoTokenANDROID.create(-1L);

        /**
         * Creates a new {@code XrGoogleCloudAuthInfoTokenANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGoogleCloudAuthInfoTokenANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrGoogleCloudAuthInfoTokenANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGoogleCloudAuthInfoTokenANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGoogleCloudAuthInfoTokenANDROID.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code authToken} field. */
        @NativeType("char const *")
        public ByteBuffer authToken() { return XrGoogleCloudAuthInfoTokenANDROID.nauthToken(address()); }
        /** @return the null-terminated string pointed to by the {@code authToken} field. */
        @NativeType("char const *")
        public String authTokenString() { return XrGoogleCloudAuthInfoTokenANDROID.nauthTokenString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGoogleCloudAuthInfoTokenANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGoogleCloudAuthInfoTokenANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID} value to the {@code type} field. */
        public XrGoogleCloudAuthInfoTokenANDROID.Buffer type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_TOKEN_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGoogleCloudAuthInfoTokenANDROID.Buffer next(@NativeType("void const *") long value) { XrGoogleCloudAuthInfoTokenANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code authToken} field. */
        public XrGoogleCloudAuthInfoTokenANDROID.Buffer authToken(@NativeType("char const *") ByteBuffer value) { XrGoogleCloudAuthInfoTokenANDROID.nauthToken(address(), value); return this; }

    }

}