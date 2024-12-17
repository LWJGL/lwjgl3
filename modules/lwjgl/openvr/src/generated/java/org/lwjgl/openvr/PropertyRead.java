/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct PropertyRead_t {
 *     ETrackedDeviceProperty prop;
 *     void * pvBuffer;
 *     uint32_t unBufferSize;
 *     PropertyTypeTag_t unTag;
 *     uint32_t unRequiredBufferSize;
 *     ETrackedPropertyError eError;
 * }}</pre>
 */
@NativeType("struct PropertyRead_t")
public class PropertyRead extends Struct<PropertyRead> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PROP,
        PVBUFFER,
        UNBUFFERSIZE,
        UNTAG,
        UNREQUIREDBUFFERSIZE,
        EERROR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PROP = layout.offsetof(0);
        PVBUFFER = layout.offsetof(1);
        UNBUFFERSIZE = layout.offsetof(2);
        UNTAG = layout.offsetof(3);
        UNREQUIREDBUFFERSIZE = layout.offsetof(4);
        EERROR = layout.offsetof(5);
    }

    protected PropertyRead(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected PropertyRead create(long address, @Nullable ByteBuffer container) {
        return new PropertyRead(address, container);
    }

    /**
     * Creates a {@code PropertyRead} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public PropertyRead(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code prop} field. */
    @NativeType("ETrackedDeviceProperty")
    public int prop() { return nprop(address()); }
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
    /** @return the value of the {@code eError} field. */
    @NativeType("ETrackedPropertyError")
    public int eError() { return neError(address()); }

    /** Sets the specified value to the {@code prop} field. */
    public PropertyRead prop(@NativeType("ETrackedDeviceProperty") int value) { nprop(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
    public PropertyRead pvBuffer(@NativeType("void *") ByteBuffer value) { npvBuffer(address(), value); return this; }
    /** Sets the specified value to the {@code unTag} field. */
    public PropertyRead unTag(@NativeType("PropertyTypeTag_t") int value) { nunTag(address(), value); return this; }
    /** Sets the specified value to the {@code unRequiredBufferSize} field. */
    public PropertyRead unRequiredBufferSize(@NativeType("uint32_t") int value) { nunRequiredBufferSize(address(), value); return this; }
    /** Sets the specified value to the {@code eError} field. */
    public PropertyRead eError(@NativeType("ETrackedPropertyError") int value) { neError(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public PropertyRead set(
        int prop,
        ByteBuffer pvBuffer,
        int unTag,
        int unRequiredBufferSize,
        int eError
    ) {
        prop(prop);
        pvBuffer(pvBuffer);
        unTag(unTag);
        unRequiredBufferSize(unRequiredBufferSize);
        eError(eError);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public PropertyRead set(PropertyRead src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code PropertyRead} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static PropertyRead malloc() {
        return new PropertyRead(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code PropertyRead} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static PropertyRead calloc() {
        return new PropertyRead(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code PropertyRead} instance allocated with {@link BufferUtils}. */
    public static PropertyRead create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new PropertyRead(memAddress(container), container);
    }

    /** Returns a new {@code PropertyRead} instance for the specified memory address. */
    public static PropertyRead create(long address) {
        return new PropertyRead(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable PropertyRead createSafe(long address) {
        return address == NULL ? null : new PropertyRead(address, null);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link PropertyRead.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static PropertyRead.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code PropertyRead} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyRead malloc(MemoryStack stack) {
        return new PropertyRead(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code PropertyRead} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static PropertyRead calloc(MemoryStack stack) {
        return new PropertyRead(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link PropertyRead.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static PropertyRead.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #prop}. */
    public static int nprop(long struct) { return memGetInt(struct + PropertyRead.PROP); }
    /** Unsafe version of {@link #pvBuffer() pvBuffer}. */
    public static ByteBuffer npvBuffer(long struct) { return memByteBuffer(memGetAddress(struct + PropertyRead.PVBUFFER), nunBufferSize(struct)); }
    /** Unsafe version of {@link #unBufferSize}. */
    public static int nunBufferSize(long struct) { return memGetInt(struct + PropertyRead.UNBUFFERSIZE); }
    /** Unsafe version of {@link #unTag}. */
    public static int nunTag(long struct) { return memGetInt(struct + PropertyRead.UNTAG); }
    /** Unsafe version of {@link #unRequiredBufferSize}. */
    public static int nunRequiredBufferSize(long struct) { return memGetInt(struct + PropertyRead.UNREQUIREDBUFFERSIZE); }
    /** Unsafe version of {@link #eError}. */
    public static int neError(long struct) { return memGetInt(struct + PropertyRead.EERROR); }

    /** Unsafe version of {@link #prop(int) prop}. */
    public static void nprop(long struct, int value) { memPutInt(struct + PropertyRead.PROP, value); }
    /** Unsafe version of {@link #pvBuffer(ByteBuffer) pvBuffer}. */
    public static void npvBuffer(long struct, ByteBuffer value) { memPutAddress(struct + PropertyRead.PVBUFFER, memAddress(value)); nunBufferSize(struct, value.remaining()); }
    /** Sets the specified value to the {@code unBufferSize} field of the specified {@code struct}. */
    public static void nunBufferSize(long struct, int value) { memPutInt(struct + PropertyRead.UNBUFFERSIZE, value); }
    /** Unsafe version of {@link #unTag(int) unTag}. */
    public static void nunTag(long struct, int value) { memPutInt(struct + PropertyRead.UNTAG, value); }
    /** Unsafe version of {@link #unRequiredBufferSize(int) unRequiredBufferSize}. */
    public static void nunRequiredBufferSize(long struct, int value) { memPutInt(struct + PropertyRead.UNREQUIREDBUFFERSIZE, value); }
    /** Unsafe version of {@link #eError(int) eError}. */
    public static void neError(long struct, int value) { memPutInt(struct + PropertyRead.EERROR, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + PropertyRead.PVBUFFER));
    }

    // -----------------------------------

    /** An array of {@link PropertyRead} structs. */
    public static class Buffer extends StructBuffer<PropertyRead, Buffer> implements NativeResource {

        private static final PropertyRead ELEMENT_FACTORY = PropertyRead.create(-1L);

        /**
         * Creates a new {@code PropertyRead.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link PropertyRead#SIZEOF}, and its mark will be undefined.</p>
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
        protected PropertyRead getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code prop} field. */
        @NativeType("ETrackedDeviceProperty")
        public int prop() { return PropertyRead.nprop(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pvBuffer} field. */
        @NativeType("void *")
        public ByteBuffer pvBuffer() { return PropertyRead.npvBuffer(address()); }
        /** @return the value of the {@code unBufferSize} field. */
        @NativeType("uint32_t")
        public int unBufferSize() { return PropertyRead.nunBufferSize(address()); }
        /** @return the value of the {@code unTag} field. */
        @NativeType("PropertyTypeTag_t")
        public int unTag() { return PropertyRead.nunTag(address()); }
        /** @return the value of the {@code unRequiredBufferSize} field. */
        @NativeType("uint32_t")
        public int unRequiredBufferSize() { return PropertyRead.nunRequiredBufferSize(address()); }
        /** @return the value of the {@code eError} field. */
        @NativeType("ETrackedPropertyError")
        public int eError() { return PropertyRead.neError(address()); }

        /** Sets the specified value to the {@code prop} field. */
        public PropertyRead.Buffer prop(@NativeType("ETrackedDeviceProperty") int value) { PropertyRead.nprop(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pvBuffer} field. */
        public PropertyRead.Buffer pvBuffer(@NativeType("void *") ByteBuffer value) { PropertyRead.npvBuffer(address(), value); return this; }
        /** Sets the specified value to the {@code unTag} field. */
        public PropertyRead.Buffer unTag(@NativeType("PropertyTypeTag_t") int value) { PropertyRead.nunTag(address(), value); return this; }
        /** Sets the specified value to the {@code unRequiredBufferSize} field. */
        public PropertyRead.Buffer unRequiredBufferSize(@NativeType("uint32_t") int value) { PropertyRead.nunRequiredBufferSize(address(), value); return this; }
        /** Sets the specified value to the {@code eError} field. */
        public PropertyRead.Buffer eError(@NativeType("ETrackedPropertyError") int value) { PropertyRead.neError(address(), value); return this; }

    }

}