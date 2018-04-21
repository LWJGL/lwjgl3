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
 * <p>{@link VkPipelineLayoutCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code stageFlags} &ndash; a set of stage flags describing the shader stages that will access a range of push constants. If a particular stage is not included in the range, then accessing members of that range of push constants from the corresponding shader stage will result in undefined data being read.</li>
 * <li>{@code offset} &ndash; {@code offset} and {@code size} are the start offset and size, respectively, consumed by the range. Both {@code offset} and {@code size} are in units of bytes and <b>must</b> be a multiple of 4. The layout of the push constant variables is specified in the shader.</li>
 * <li>{@code size} &ndash; see {@code offset}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPushConstantRange {
 *     VkShaderStageFlags stageFlags;
 *     uint32_t offset;
 *     uint32_t size;
 * }</pre></code>
 */
public class VkPushConstantRange extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

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

    VkPushConstantRange(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPushConstantRange} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPushConstantRange(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }
    /** Returns the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }

    /** Sets the specified value to the {@code stageFlags} field. */
    public VkPushConstantRange stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkPushConstantRange offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
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

    /** Returns a new {@link VkPushConstantRange} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPushConstantRange malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkPushConstantRange} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPushConstantRange calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkPushConstantRange} instance allocated with {@link BufferUtils}. */
    public static VkPushConstantRange create() {
        return new VkPushConstantRange(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPushConstantRange} instance for the specified memory address. */
    public static VkPushConstantRange create(long address) {
        return new VkPushConstantRange(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPushConstantRange createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
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
    @Nullable
    public static VkPushConstantRange.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPushConstantRange} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPushConstantRange mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPushConstantRange} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPushConstantRange callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPushConstantRange} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantRange mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPushConstantRange} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPushConstantRange callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPushConstantRange.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPushConstantRange.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

        /**
         * Creates a new {@link VkPushConstantRange.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPushConstantRange#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkPushConstantRange newInstance(long address) {
            return new VkPushConstantRange(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkPushConstantRange.nstageFlags(address()); }
        /** Returns the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkPushConstantRange.noffset(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("uint32_t")
        public int size() { return VkPushConstantRange.nsize(address()); }

        /** Sets the specified value to the {@code stageFlags} field. */
        public VkPushConstantRange.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkPushConstantRange.nstageFlags(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkPushConstantRange.Buffer offset(@NativeType("uint32_t") int value) { VkPushConstantRange.noffset(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkPushConstantRange.Buffer size(@NativeType("uint32_t") int value) { VkPushConstantRange.nsize(address(), value); return this; }

    }

}