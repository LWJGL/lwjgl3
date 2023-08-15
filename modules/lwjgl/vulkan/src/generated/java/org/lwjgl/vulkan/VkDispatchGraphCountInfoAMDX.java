/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying count parameters for execution graph dispatch.
 * 
 * <h5>Description</h5>
 * 
 * <p>Whether {@code infos} is consumed as a device or host pointer is defined by the command this structure is used in.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstAMDX}, {@link AMDXShaderEnqueue#vkCmdDispatchGraphAMDX CmdDispatchGraphAMDX}, {@link AMDXShaderEnqueue#vkCmdDispatchGraphIndirectAMDX CmdDispatchGraphIndirectAMDX}, {@link AMDXShaderEnqueue#vkCmdDispatchGraphIndirectCountAMDX CmdDispatchGraphIndirectCountAMDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDispatchGraphCountInfoAMDX {
 *     uint32_t {@link #count};
 *     {@link VkDeviceOrHostAddressConstAMDX VkDeviceOrHostAddressConstAMDX} {@link #infos};
 *     uint64_t {@link #stride};
 * }</code></pre>
 */
public class VkDispatchGraphCountInfoAMDX extends Struct<VkDispatchGraphCountInfoAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        COUNT,
        INFOS,
        STRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkDeviceOrHostAddressConstAMDX.SIZEOF, VkDeviceOrHostAddressConstAMDX.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        COUNT = layout.offsetof(0);
        INFOS = layout.offsetof(1);
        STRIDE = layout.offsetof(2);
    }

    protected VkDispatchGraphCountInfoAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDispatchGraphCountInfoAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkDispatchGraphCountInfoAMDX(address, container);
    }

    /**
     * Creates a {@code VkDispatchGraphCountInfoAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDispatchGraphCountInfoAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the number of dispatches to perform. */
    @NativeType("uint32_t")
    public int count() { return ncount(address()); }
    /** the device or host address of a flat array of {@link VkDispatchGraphInfoAMDX} structures */
    public VkDeviceOrHostAddressConstAMDX infos() { return ninfos(address()); }
    /** the byte stride between successive {@link VkDispatchGraphInfoAMDX} structures in {@code infos} */
    @NativeType("uint64_t")
    public long stride() { return nstride(address()); }

    /** Sets the specified value to the {@link #count} field. */
    public VkDispatchGraphCountInfoAMDX count(@NativeType("uint32_t") int value) { ncount(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstAMDX} to the {@link #infos} field. */
    public VkDispatchGraphCountInfoAMDX infos(VkDeviceOrHostAddressConstAMDX value) { ninfos(address(), value); return this; }
    /** Passes the {@link #infos} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDispatchGraphCountInfoAMDX infos(java.util.function.Consumer<VkDeviceOrHostAddressConstAMDX> consumer) { consumer.accept(infos()); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public VkDispatchGraphCountInfoAMDX stride(@NativeType("uint64_t") long value) { nstride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDispatchGraphCountInfoAMDX set(
        int count,
        VkDeviceOrHostAddressConstAMDX infos,
        long stride
    ) {
        count(count);
        infos(infos);
        stride(stride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDispatchGraphCountInfoAMDX set(VkDispatchGraphCountInfoAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDispatchGraphCountInfoAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDispatchGraphCountInfoAMDX malloc() {
        return new VkDispatchGraphCountInfoAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchGraphCountInfoAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDispatchGraphCountInfoAMDX calloc() {
        return new VkDispatchGraphCountInfoAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchGraphCountInfoAMDX} instance allocated with {@link BufferUtils}. */
    public static VkDispatchGraphCountInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchGraphCountInfoAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkDispatchGraphCountInfoAMDX} instance for the specified memory address. */
    public static VkDispatchGraphCountInfoAMDX create(long address) {
        return new VkDispatchGraphCountInfoAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchGraphCountInfoAMDX createSafe(long address) {
        return address == NULL ? null : new VkDispatchGraphCountInfoAMDX(address, null);
    }

    /**
     * Returns a new {@link VkDispatchGraphCountInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphCountInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphCountInfoAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDispatchGraphCountInfoAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchGraphCountInfoAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDispatchGraphCountInfoAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchGraphCountInfoAMDX malloc(MemoryStack stack) {
        return new VkDispatchGraphCountInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDispatchGraphCountInfoAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchGraphCountInfoAMDX calloc(MemoryStack stack) {
        return new VkDispatchGraphCountInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDispatchGraphCountInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphCountInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphCountInfoAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + VkDispatchGraphCountInfoAMDX.COUNT); }
    /** Unsafe version of {@link #infos}. */
    public static VkDeviceOrHostAddressConstAMDX ninfos(long struct) { return VkDeviceOrHostAddressConstAMDX.create(struct + VkDispatchGraphCountInfoAMDX.INFOS); }
    /** Unsafe version of {@link #stride}. */
    public static long nstride(long struct) { return UNSAFE.getLong(null, struct + VkDispatchGraphCountInfoAMDX.STRIDE); }

    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchGraphCountInfoAMDX.COUNT, value); }
    /** Unsafe version of {@link #infos(VkDeviceOrHostAddressConstAMDX) infos}. */
    public static void ninfos(long struct, VkDeviceOrHostAddressConstAMDX value) { memCopy(value.address(), struct + VkDispatchGraphCountInfoAMDX.INFOS, VkDeviceOrHostAddressConstAMDX.SIZEOF); }
    /** Unsafe version of {@link #stride(long) stride}. */
    public static void nstride(long struct, long value) { UNSAFE.putLong(null, struct + VkDispatchGraphCountInfoAMDX.STRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDispatchGraphCountInfoAMDX} structs. */
    public static class Buffer extends StructBuffer<VkDispatchGraphCountInfoAMDX, Buffer> implements NativeResource {

        private static final VkDispatchGraphCountInfoAMDX ELEMENT_FACTORY = VkDispatchGraphCountInfoAMDX.create(-1L);

        /**
         * Creates a new {@code VkDispatchGraphCountInfoAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDispatchGraphCountInfoAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDispatchGraphCountInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDispatchGraphCountInfoAMDX#count} field. */
        @NativeType("uint32_t")
        public int count() { return VkDispatchGraphCountInfoAMDX.ncount(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstAMDX} view of the {@link VkDispatchGraphCountInfoAMDX#infos} field. */
        public VkDeviceOrHostAddressConstAMDX infos() { return VkDispatchGraphCountInfoAMDX.ninfos(address()); }
        /** @return the value of the {@link VkDispatchGraphCountInfoAMDX#stride} field. */
        @NativeType("uint64_t")
        public long stride() { return VkDispatchGraphCountInfoAMDX.nstride(address()); }

        /** Sets the specified value to the {@link VkDispatchGraphCountInfoAMDX#count} field. */
        public VkDispatchGraphCountInfoAMDX.Buffer count(@NativeType("uint32_t") int value) { VkDispatchGraphCountInfoAMDX.ncount(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstAMDX} to the {@link VkDispatchGraphCountInfoAMDX#infos} field. */
        public VkDispatchGraphCountInfoAMDX.Buffer infos(VkDeviceOrHostAddressConstAMDX value) { VkDispatchGraphCountInfoAMDX.ninfos(address(), value); return this; }
        /** Passes the {@link VkDispatchGraphCountInfoAMDX#infos} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDispatchGraphCountInfoAMDX.Buffer infos(java.util.function.Consumer<VkDeviceOrHostAddressConstAMDX> consumer) { consumer.accept(infos()); return this; }
        /** Sets the specified value to the {@link VkDispatchGraphCountInfoAMDX#stride} field. */
        public VkDispatchGraphCountInfoAMDX.Buffer stride(@NativeType("uint64_t") long value) { VkDispatchGraphCountInfoAMDX.nstride(address(), value); return this; }

    }

}