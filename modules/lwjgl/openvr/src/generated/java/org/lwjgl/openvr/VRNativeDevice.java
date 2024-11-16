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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VRNativeDevice_t {
 *     void * handle;
 *     EDeviceType eType;
 * }</code></pre>
 */
@NativeType("struct VRNativeDevice_t")
public class VRNativeDevice extends Struct<VRNativeDevice> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
    }

    protected VRNativeDevice(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VRNativeDevice create(long address, @Nullable ByteBuffer container) {
        return new VRNativeDevice(address, container);
    }

    /**
     * Creates a {@code VRNativeDevice} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VRNativeDevice(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** @return the value of the {@code eType} field. */
    @NativeType("EDeviceType")
    public int eType() { return neType(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public VRNativeDevice handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code eType} field. */
    public VRNativeDevice eType(@NativeType("EDeviceType") int value) { neType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VRNativeDevice set(
        long handle,
        int eType
    ) {
        handle(handle);
        eType(eType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VRNativeDevice set(VRNativeDevice src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VRNativeDevice} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VRNativeDevice malloc() {
        return new VRNativeDevice(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VRNativeDevice} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VRNativeDevice calloc() {
        return new VRNativeDevice(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VRNativeDevice} instance allocated with {@link BufferUtils}. */
    public static VRNativeDevice create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VRNativeDevice(memAddress(container), container);
    }

    /** Returns a new {@code VRNativeDevice} instance for the specified memory address. */
    public static VRNativeDevice create(long address) {
        return new VRNativeDevice(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VRNativeDevice createSafe(long address) {
        return address == NULL ? null : new VRNativeDevice(address, null);
    }

    /**
     * Returns a new {@link VRNativeDevice.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VRNativeDevice.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRNativeDevice.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VRNativeDevice.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VRNativeDevice.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VRNativeDevice} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VRNativeDevice malloc(MemoryStack stack) {
        return new VRNativeDevice(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VRNativeDevice} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VRNativeDevice calloc(MemoryStack stack) {
        return new VRNativeDevice(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VRNativeDevice.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VRNativeDevice.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VRNativeDevice.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + VRNativeDevice.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return memGetInt(struct + VRNativeDevice.ETYPE); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + VRNativeDevice.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { memPutInt(struct + VRNativeDevice.ETYPE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VRNativeDevice.HANDLE));
    }

    // -----------------------------------

    /** An array of {@link VRNativeDevice} structs. */
    public static class Buffer extends StructBuffer<VRNativeDevice, Buffer> implements NativeResource {

        private static final VRNativeDevice ELEMENT_FACTORY = VRNativeDevice.create(-1L);

        /**
         * Creates a new {@code VRNativeDevice.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VRNativeDevice#SIZEOF}, and its mark will be undefined.</p>
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
        protected VRNativeDevice getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return VRNativeDevice.nhandle(address()); }
        /** @return the value of the {@code eType} field. */
        @NativeType("EDeviceType")
        public int eType() { return VRNativeDevice.neType(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public VRNativeDevice.Buffer handle(@NativeType("void *") long value) { VRNativeDevice.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code eType} field. */
        public VRNativeDevice.Buffer eType(@NativeType("EDeviceType") int value) { VRNativeDevice.neType(address(), value); return this; }

    }

}