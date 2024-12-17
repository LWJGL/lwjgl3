/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkAccelerationStructureMotionInstanceNV {
 *     VkAccelerationStructureMotionInstanceTypeNV type;
 *     VkAccelerationStructureMotionInstanceFlagsNV flags;
 *     {@link VkAccelerationStructureMotionInstanceDataNV VkAccelerationStructureMotionInstanceDataNV} data;
 * }}</pre>
 */
public class VkAccelerationStructureMotionInstanceNV extends Struct<VkAccelerationStructureMotionInstanceNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkAccelerationStructureMotionInstanceDataNV.SIZEOF, VkAccelerationStructureMotionInstanceDataNV.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        DATA = layout.offsetof(2);
    }

    protected VkAccelerationStructureMotionInstanceNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkAccelerationStructureMotionInstanceNV create(long address, @Nullable ByteBuffer container) {
        return new VkAccelerationStructureMotionInstanceNV(address, container);
    }

    /**
     * Creates a {@code VkAccelerationStructureMotionInstanceNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAccelerationStructureMotionInstanceNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("VkAccelerationStructureMotionInstanceTypeNV")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkAccelerationStructureMotionInstanceFlagsNV")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkAccelerationStructureMotionInstanceDataNV} view of the {@code data} field. */
    public VkAccelerationStructureMotionInstanceDataNV data() { return ndata(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkAccelerationStructureMotionInstanceNV type(@NativeType("VkAccelerationStructureMotionInstanceTypeNV") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkAccelerationStructureMotionInstanceNV flags(@NativeType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkAccelerationStructureMotionInstanceDataNV} to the {@code data} field. */
    public VkAccelerationStructureMotionInstanceNV data(VkAccelerationStructureMotionInstanceDataNV value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkAccelerationStructureMotionInstanceNV data(java.util.function.Consumer<VkAccelerationStructureMotionInstanceDataNV> consumer) { consumer.accept(data()); return this; }

    /** Initializes this struct with the specified values. */
    public VkAccelerationStructureMotionInstanceNV set(
        int type,
        int flags,
        VkAccelerationStructureMotionInstanceDataNV data
    ) {
        type(type);
        flags(flags);
        data(data);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAccelerationStructureMotionInstanceNV set(VkAccelerationStructureMotionInstanceNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInstanceNV malloc() {
        return new VkAccelerationStructureMotionInstanceNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAccelerationStructureMotionInstanceNV calloc() {
        return new VkAccelerationStructureMotionInstanceNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance allocated with {@link BufferUtils}. */
    public static VkAccelerationStructureMotionInstanceNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAccelerationStructureMotionInstanceNV(memAddress(container), container);
    }

    /** Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance for the specified memory address. */
    public static VkAccelerationStructureMotionInstanceNV create(long address) {
        return new VkAccelerationStructureMotionInstanceNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkAccelerationStructureMotionInstanceNV createSafe(long address) {
        return address == NULL ? null : new VkAccelerationStructureMotionInstanceNV(address, null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkAccelerationStructureMotionInstanceNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInstanceNV malloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkAccelerationStructureMotionInstanceNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAccelerationStructureMotionInstanceNV calloc(MemoryStack stack) {
        return new VkAccelerationStructureMotionInstanceNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAccelerationStructureMotionInstanceNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAccelerationStructureMotionInstanceNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkAccelerationStructureMotionInstanceNV.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkAccelerationStructureMotionInstanceNV.FLAGS); }
    /** Unsafe version of {@link #data}. */
    public static VkAccelerationStructureMotionInstanceDataNV ndata(long struct) { return VkAccelerationStructureMotionInstanceDataNV.create(struct + VkAccelerationStructureMotionInstanceNV.DATA); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkAccelerationStructureMotionInstanceNV.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkAccelerationStructureMotionInstanceNV.FLAGS, value); }
    /** Unsafe version of {@link #data(VkAccelerationStructureMotionInstanceDataNV) data}. */
    public static void ndata(long struct, VkAccelerationStructureMotionInstanceDataNV value) { memCopy(value.address(), struct + VkAccelerationStructureMotionInstanceNV.DATA, VkAccelerationStructureMotionInstanceDataNV.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkAccelerationStructureMotionInstanceNV} structs. */
    public static class Buffer extends StructBuffer<VkAccelerationStructureMotionInstanceNV, Buffer> implements NativeResource {

        private static final VkAccelerationStructureMotionInstanceNV ELEMENT_FACTORY = VkAccelerationStructureMotionInstanceNV.create(-1L);

        /**
         * Creates a new {@code VkAccelerationStructureMotionInstanceNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAccelerationStructureMotionInstanceNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkAccelerationStructureMotionInstanceNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("VkAccelerationStructureMotionInstanceTypeNV")
        public int type() { return VkAccelerationStructureMotionInstanceNV.ntype(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkAccelerationStructureMotionInstanceFlagsNV")
        public int flags() { return VkAccelerationStructureMotionInstanceNV.nflags(address()); }
        /** @return a {@link VkAccelerationStructureMotionInstanceDataNV} view of the {@code data} field. */
        public VkAccelerationStructureMotionInstanceDataNV data() { return VkAccelerationStructureMotionInstanceNV.ndata(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkAccelerationStructureMotionInstanceNV.Buffer type(@NativeType("VkAccelerationStructureMotionInstanceTypeNV") int value) { VkAccelerationStructureMotionInstanceNV.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkAccelerationStructureMotionInstanceNV.Buffer flags(@NativeType("VkAccelerationStructureMotionInstanceFlagsNV") int value) { VkAccelerationStructureMotionInstanceNV.nflags(address(), value); return this; }
        /** Copies the specified {@link VkAccelerationStructureMotionInstanceDataNV} to the {@code data} field. */
        public VkAccelerationStructureMotionInstanceNV.Buffer data(VkAccelerationStructureMotionInstanceDataNV value) { VkAccelerationStructureMotionInstanceNV.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkAccelerationStructureMotionInstanceNV.Buffer data(java.util.function.Consumer<VkAccelerationStructureMotionInstanceDataNV> consumer) { consumer.accept(data()); return this; }

    }

}