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
 * struct XrGoogleCloudAuthInfoApiKeyANDROID {
 *     XrStructureType type;
 *     void const * next;
 *     char const * apiKey;
 * }}</pre>
 */
public class XrGoogleCloudAuthInfoApiKeyANDROID extends Struct<XrGoogleCloudAuthInfoApiKeyANDROID> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        APIKEY;

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
        APIKEY = layout.offsetof(2);
    }

    protected XrGoogleCloudAuthInfoApiKeyANDROID(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrGoogleCloudAuthInfoApiKeyANDROID create(long address, @Nullable ByteBuffer container) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(address, container);
    }

    /**
     * Creates a {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrGoogleCloudAuthInfoApiKeyANDROID(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code apiKey} field. */
    @NativeType("char const *")
    public ByteBuffer apiKey() { return napiKey(address()); }
    /** @return the null-terminated string pointed to by the {@code apiKey} field. */
    @NativeType("char const *")
    public String apiKeyString() { return napiKeyString(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrGoogleCloudAuthInfoApiKeyANDROID type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID} value to the {@code type} field. */
    public XrGoogleCloudAuthInfoApiKeyANDROID type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID); }
    /** Sets the specified value to the {@code next} field. */
    public XrGoogleCloudAuthInfoApiKeyANDROID next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code apiKey} field. */
    public XrGoogleCloudAuthInfoApiKeyANDROID apiKey(@NativeType("char const *") ByteBuffer value) { napiKey(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrGoogleCloudAuthInfoApiKeyANDROID set(
        int type,
        long next,
        ByteBuffer apiKey
    ) {
        type(type);
        next(next);
        apiKey(apiKey);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrGoogleCloudAuthInfoApiKeyANDROID set(XrGoogleCloudAuthInfoApiKeyANDROID src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID malloc() {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID calloc() {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance allocated with {@link BufferUtils}. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrGoogleCloudAuthInfoApiKeyANDROID(memAddress(container), container);
    }

    /** Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance for the specified memory address. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID create(long address) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrGoogleCloudAuthInfoApiKeyANDROID createSafe(long address) {
        return address == NULL ? null : new XrGoogleCloudAuthInfoApiKeyANDROID(address, null);
    }

    /** Downcasts the specified {@code XrGoogleCloudAuthInfoBaseHeaderANDROID} instance to {@code XrGoogleCloudAuthInfoApiKeyANDROID}. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID create(XrGoogleCloudAuthInfoBaseHeaderANDROID value) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer} instance to {@code XrGoogleCloudAuthInfoApiKeyANDROID.Buffer}. */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer create(XrGoogleCloudAuthInfoBaseHeaderANDROID.Buffer value) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID malloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrGoogleCloudAuthInfoApiKeyANDROID} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID calloc(MemoryStack stack) {
        return new XrGoogleCloudAuthInfoApiKeyANDROID(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrGoogleCloudAuthInfoApiKeyANDROID.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrGoogleCloudAuthInfoApiKeyANDROID.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.NEXT); }
    /** Unsafe version of {@link #apiKey}. */
    public static ByteBuffer napiKey(long struct) { return memByteBufferNT1(memGetAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.APIKEY)); }
    /** Unsafe version of {@link #apiKeyString}. */
    public static String napiKeyString(long struct) { return memUTF8(memGetAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.APIKEY)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrGoogleCloudAuthInfoApiKeyANDROID.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.NEXT, value); }
    /** Unsafe version of {@link #apiKey(ByteBuffer) apiKey}. */
    public static void napiKey(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.APIKEY, memAddress(value));
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrGoogleCloudAuthInfoApiKeyANDROID.APIKEY));
    }

    // -----------------------------------

    /** An array of {@link XrGoogleCloudAuthInfoApiKeyANDROID} structs. */
    public static class Buffer extends StructBuffer<XrGoogleCloudAuthInfoApiKeyANDROID, Buffer> implements NativeResource {

        private static final XrGoogleCloudAuthInfoApiKeyANDROID ELEMENT_FACTORY = XrGoogleCloudAuthInfoApiKeyANDROID.create(-1L);

        /**
         * Creates a new {@code XrGoogleCloudAuthInfoApiKeyANDROID.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrGoogleCloudAuthInfoApiKeyANDROID#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrGoogleCloudAuthInfoApiKeyANDROID getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrGoogleCloudAuthInfoApiKeyANDROID.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrGoogleCloudAuthInfoApiKeyANDROID.nnext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code apiKey} field. */
        @NativeType("char const *")
        public ByteBuffer apiKey() { return XrGoogleCloudAuthInfoApiKeyANDROID.napiKey(address()); }
        /** @return the null-terminated string pointed to by the {@code apiKey} field. */
        @NativeType("char const *")
        public String apiKeyString() { return XrGoogleCloudAuthInfoApiKeyANDROID.napiKeyString(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrGoogleCloudAuthInfoApiKeyANDROID.Buffer type(@NativeType("XrStructureType") int value) { XrGoogleCloudAuthInfoApiKeyANDROID.ntype(address(), value); return this; }
        /** Sets the {@link ANDROIDGoogleCloudAuth#XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID} value to the {@code type} field. */
        public XrGoogleCloudAuthInfoApiKeyANDROID.Buffer type$Default() { return type(ANDROIDGoogleCloudAuth.XR_TYPE_GOOGLE_CLOUD_AUTH_INFO_API_KEY_ANDROID); }
        /** Sets the specified value to the {@code next} field. */
        public XrGoogleCloudAuthInfoApiKeyANDROID.Buffer next(@NativeType("void const *") long value) { XrGoogleCloudAuthInfoApiKeyANDROID.nnext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code apiKey} field. */
        public XrGoogleCloudAuthInfoApiKeyANDROID.Buffer apiKey(@NativeType("char const *") ByteBuffer value) { XrGoogleCloudAuthInfoApiKeyANDROID.napiKey(address(), value); return this; }

    }

}