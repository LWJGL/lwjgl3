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
 * Structure specifying a push constant range.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code offset} <b>must</b> be less than {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize}</li>
 * <li>{@code offset} <b>must</b> be a multiple of 4</li>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * <li>{@code size} <b>must</b> be a multiple of 4</li>
 * <li>{@code size} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPushConstantsSize} minus {@code offset}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkIndirectCommandsPushConstantTokenEXT}, {@link VkIndirectExecutionSetShaderInfoEXT}, {@link VkPipelineLayoutCreateInfo}, {@link VkShaderCreateInfoEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPushConstantRange {
 *     VkShaderStageFlags {@link #stageFlags};
 *     uint32_t {@link #offset};
 *     uint32_t {@link #size};
 * }</code></pre>
 */
public class VkPushConstantRange extends Struct<VkPushConstantRange> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STAGEFLAGS,
        OFFSET,
        SIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STAGEFLAGS = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
        SIZE = layout.offsetof(2);
    }

    protected VkPushConstantRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPushConstantRange create(long address, @Nullable ByteBuffer container) {
        return new VkPushConstantRange(address, container);
    }

    /**
     * Creates a {@code VkPushConstantRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantRange(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a set of stage flags describing the shader stages that will access a range of push constants. If a particular stage is not included in the range, then accessing members of that range of push constants from the corresponding shader stage will return undefined values. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** {@code offset} and {@code size} are the start offset and size, respectively, consumed by the range. Both {@code offset} and {@code size} are in units of bytes and <b>must</b> be a multiple of 4. The layout of the push constant variables is specified in the shader. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** see {@code offset} */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }

    /** Sets the specified value to the {@link #stageFlags} field. */
    public VkPushConstantRange stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkPushConstantRange offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #size} field. */
    public VkPushConstantRange size(@NativeType("uint32_t") int value) { nsize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPushConstantRange set(
        int stageFlags,
        int offset,
        int size
    ) {
        stageFlags(stageFlags);
        offset(offset);
        size(size);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPushConstantRange set(VkPushConstantRange src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPushConstantRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantRange malloc() {
        return new VkPushConstantRange(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantRange calloc() {
        return new VkPushConstantRange(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPushConstantRange} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantRange create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPushConstantRange(memAddress(container), container);
    }

    /** Returns a new {@code VkPushConstantRange} instance for the specified memory address. */
    public static VkPushConstantRange create(long address) {
        return new VkPushConstantRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPushConstantRange createSafe(long address) {
        return address == NULL ? null : new VkPushConstantRange(address, null);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPushConstantRange.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPushConstantRange.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPushConstantRange.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPushConstantRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantRange malloc(MemoryStack stack) {
        return new VkPushConstantRange(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPushConstantRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantRange calloc(MemoryStack stack) {
        return new VkPushConstantRange(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return memGetInt(struct + VkPushConstantRange.STAGEFLAGS); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkPushConstantRange.OFFSET); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + VkPushConstantRange.SIZE); }

    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { memPutInt(struct + VkPushConstantRange.STAGEFLAGS, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkPushConstantRange.OFFSET, value); }
    /** Unsafe version of {@link #size(int) size}. */
    public static void nsize(long struct, int value) { memPutInt(struct + VkPushConstantRange.SIZE, value); }

    // -----------------------------------

    /** An array of {@link VkPushConstantRange} structs. */
    public static class Buffer extends StructBuffer<VkPushConstantRange, Buffer> implements NativeResource {

        private static final VkPushConstantRange ELEMENT_FACTORY = VkPushConstantRange.create(-1L);

        /**
         * Creates a new {@code VkPushConstantRange.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantRange#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPushConstantRange getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPushConstantRange#stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushConstantRange.nstageFlags(address()); }
        /** @return the value of the {@link VkPushConstantRange#offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkPushConstantRange.noffset(address()); }
        /** @return the value of the {@link VkPushConstantRange#size} field. */
        @NativeType("uint32_t")
        public int size() { return VkPushConstantRange.nsize(address()); }

        /** Sets the specified value to the {@link VkPushConstantRange#stageFlags} field. */
        public VkPushConstantRange.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushConstantRange.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushConstantRange#offset} field. */
        public VkPushConstantRange.Buffer offset(@NativeType("uint32_t") int value) { VkPushConstantRange.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link VkPushConstantRange#size} field. */
        public VkPushConstantRange.Buffer size(@NativeType("uint32_t") int value) { VkPushConstantRange.nsize(address(), value); return this; }

    }

}