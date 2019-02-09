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
 * Parameters of an object table push constant entry.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX OBJECT_ENTRY_TYPE_PUSH_CONSTANT_NVX}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code stageFlags} <b>must</b> be a valid combination of {@code VkShaderStageFlagBits} values</li>
 * <li>{@code stageFlags} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pipelineLayout} &ndash; specifies the {@code VkPipelineLayout} that the pushconstants are used with</li>
 * <li>{@code stageFlags} &ndash; specifies the {@code VkShaderStageFlags} that the pushconstants are used with</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkObjectTablePushConstantEntryNVX {
 *     VkObjectEntryTypeNVX type;
 *     VkObjectEntryUsageFlagsNVX flags;
 *     VkPipelineLayout pipelineLayout;
 *     VkShaderStageFlags stageFlags;
 * }</code></pre>
 */
public class VkObjectTablePushConstantEntryNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        PIPELINELAYOUT,
        STAGEFLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        PIPELINELAYOUT = layout.offsetof(2);
        STAGEFLAGS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkObjectTablePushConstantEntryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkObjectTablePushConstantEntryNVX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code type} field. */
    @NativeType("VkObjectEntryTypeNVX")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkObjectEntryUsageFlagsNVX")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code pipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** Returns the value of the {@code stageFlags} field. */
    @NativeType("VkShaderStageFlags")
    public int stageFlags() { return nstageFlags(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkObjectTablePushConstantEntryNVX type(@NativeType("VkObjectEntryTypeNVX") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkObjectTablePushConstantEntryNVX flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    public VkObjectTablePushConstantEntryNVX pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the specified value to the {@code stageFlags} field. */
    public VkObjectTablePushConstantEntryNVX stageFlags(@NativeType("VkShaderStageFlags") int value) { nstageFlags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkObjectTablePushConstantEntryNVX set(
        int type,
        int flags,
        long pipelineLayout,
        int stageFlags
    ) {
        type(type);
        flags(flags);
        pipelineLayout(pipelineLayout);
        stageFlags(stageFlags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkObjectTablePushConstantEntryNVX set(VkObjectTablePushConstantEntryNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkObjectTablePushConstantEntryNVX malloc() {
        return wrap(VkObjectTablePushConstantEntryNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkObjectTablePushConstantEntryNVX calloc() {
        return wrap(VkObjectTablePushConstantEntryNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated with {@link BufferUtils}. */
    public static VkObjectTablePushConstantEntryNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkObjectTablePushConstantEntryNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance for the specified memory address. */
    public static VkObjectTablePushConstantEntryNVX create(long address) {
        return wrap(VkObjectTablePushConstantEntryNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTablePushConstantEntryNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkObjectTablePushConstantEntryNVX.class, address);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkObjectTablePushConstantEntryNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTablePushConstantEntryNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkObjectTablePushConstantEntryNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkObjectTablePushConstantEntryNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePushConstantEntryNVX mallocStack(MemoryStack stack) {
        return wrap(VkObjectTablePushConstantEntryNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkObjectTablePushConstantEntryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePushConstantEntryNVX callocStack(MemoryStack stack) {
        return wrap(VkObjectTablePushConstantEntryNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePushConstantEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePushConstantEntryNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkObjectTablePushConstantEntryNVX.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkObjectTablePushConstantEntryNVX.FLAGS); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return UNSAFE.getLong(null, struct + VkObjectTablePushConstantEntryNVX.PIPELINELAYOUT); }
    /** Unsafe version of {@link #stageFlags}. */
    public static int nstageFlags(long struct) { return UNSAFE.getInt(null, struct + VkObjectTablePushConstantEntryNVX.STAGEFLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkObjectTablePushConstantEntryNVX.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkObjectTablePushConstantEntryNVX.FLAGS, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { UNSAFE.putLong(null, struct + VkObjectTablePushConstantEntryNVX.PIPELINELAYOUT, value); }
    /** Unsafe version of {@link #stageFlags(int) stageFlags}. */
    public static void nstageFlags(long struct, int value) { UNSAFE.putInt(null, struct + VkObjectTablePushConstantEntryNVX.STAGEFLAGS, value); }

    // -----------------------------------

    /** An array of {@link VkObjectTablePushConstantEntryNVX} structs. */
    public static class Buffer extends StructBuffer<VkObjectTablePushConstantEntryNVX, Buffer> implements NativeResource {

        private static final VkObjectTablePushConstantEntryNVX ELEMENT_FACTORY = VkObjectTablePushConstantEntryNVX.create(-1L);

        /**
         * Creates a new {@code VkObjectTablePushConstantEntryNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkObjectTablePushConstantEntryNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkObjectTablePushConstantEntryNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("VkObjectEntryTypeNVX")
        public int type() { return VkObjectTablePushConstantEntryNVX.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkObjectEntryUsageFlagsNVX")
        public int flags() { return VkObjectTablePushConstantEntryNVX.nflags(address()); }
        /** Returns the value of the {@code pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkObjectTablePushConstantEntryNVX.npipelineLayout(address()); }
        /** Returns the value of the {@code stageFlags} field. */
        @NativeType("VkShaderStageFlags")
        public int stageFlags() { return VkObjectTablePushConstantEntryNVX.nstageFlags(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer type(@NativeType("VkObjectEntryTypeNVX") int value) { VkObjectTablePushConstantEntryNVX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { VkObjectTablePushConstantEntryNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkObjectTablePushConstantEntryNVX.npipelineLayout(address(), value); return this; }
        /** Sets the specified value to the {@code stageFlags} field. */
        public VkObjectTablePushConstantEntryNVX.Buffer stageFlags(@NativeType("VkShaderStageFlags") int value) { VkObjectTablePushConstantEntryNVX.nstageFlags(address(), value); return this; }

    }

}