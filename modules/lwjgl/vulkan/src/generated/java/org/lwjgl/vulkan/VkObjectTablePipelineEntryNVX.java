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
 * Parameters of an object table pipeline entry.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_TYPE_PIPELINE_NVX OBJECT_ENTRY_TYPE_PIPELINE_NVX}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code pipeline} <b>must</b> be a valid {@code VkPipeline} handle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pipeline} &ndash; specifies the {@code VkPipeline} that this resource entry references.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkObjectTablePipelineEntryNVX {
 *     VkObjectEntryTypeNVX type;
 *     VkObjectEntryUsageFlagsNVX flags;
 *     VkPipeline pipeline;
 * }</code></pre>
 */
public class VkObjectTablePipelineEntryNVX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        FLAGS,
        PIPELINE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        PIPELINE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkObjectTablePipelineEntryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkObjectTablePipelineEntryNVX(ByteBuffer container) {
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
    /** Returns the value of the {@code pipeline} field. */
    @NativeType("VkPipeline")
    public long pipeline() { return npipeline(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkObjectTablePipelineEntryNVX type(@NativeType("VkObjectEntryTypeNVX") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkObjectTablePipelineEntryNVX flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipeline} field. */
    public VkObjectTablePipelineEntryNVX pipeline(@NativeType("VkPipeline") long value) { npipeline(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkObjectTablePipelineEntryNVX set(
        int type,
        int flags,
        long pipeline
    ) {
        type(type);
        flags(flags);
        pipeline(pipeline);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkObjectTablePipelineEntryNVX set(VkObjectTablePipelineEntryNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkObjectTablePipelineEntryNVX malloc() {
        return wrap(VkObjectTablePipelineEntryNVX.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkObjectTablePipelineEntryNVX calloc() {
        return wrap(VkObjectTablePipelineEntryNVX.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated with {@link BufferUtils}. */
    public static VkObjectTablePipelineEntryNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkObjectTablePipelineEntryNVX.class, memAddress(container), container);
    }

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance for the specified memory address. */
    public static VkObjectTablePipelineEntryNVX create(long address) {
        return wrap(VkObjectTablePipelineEntryNVX.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTablePipelineEntryNVX createSafe(long address) {
        return address == NULL ? null : wrap(VkObjectTablePipelineEntryNVX.class, address);
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkObjectTablePipelineEntryNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkObjectTablePipelineEntryNVX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkObjectTablePipelineEntryNVX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkObjectTablePipelineEntryNVX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePipelineEntryNVX mallocStack(MemoryStack stack) {
        return wrap(VkObjectTablePipelineEntryNVX.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkObjectTablePipelineEntryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkObjectTablePipelineEntryNVX callocStack(MemoryStack stack) {
        return wrap(VkObjectTablePipelineEntryNVX.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkObjectTablePipelineEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkObjectTablePipelineEntryNVX.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + VkObjectTablePipelineEntryNVX.TYPE); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkObjectTablePipelineEntryNVX.FLAGS); }
    /** Unsafe version of {@link #pipeline}. */
    public static long npipeline(long struct) { return UNSAFE.getLong(null, struct + VkObjectTablePipelineEntryNVX.PIPELINE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + VkObjectTablePipelineEntryNVX.TYPE, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkObjectTablePipelineEntryNVX.FLAGS, value); }
    /** Unsafe version of {@link #pipeline(long) pipeline}. */
    public static void npipeline(long struct, long value) { UNSAFE.putLong(null, struct + VkObjectTablePipelineEntryNVX.PIPELINE, value); }

    // -----------------------------------

    /** An array of {@link VkObjectTablePipelineEntryNVX} structs. */
    public static class Buffer extends StructBuffer<VkObjectTablePipelineEntryNVX, Buffer> implements NativeResource {

        private static final VkObjectTablePipelineEntryNVX ELEMENT_FACTORY = VkObjectTablePipelineEntryNVX.create(-1L);

        /**
         * Creates a new {@code VkObjectTablePipelineEntryNVX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkObjectTablePipelineEntryNVX#SIZEOF}, and its mark will be undefined.
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
        protected VkObjectTablePipelineEntryNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        @NativeType("VkObjectEntryTypeNVX")
        public int type() { return VkObjectTablePipelineEntryNVX.ntype(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkObjectEntryUsageFlagsNVX")
        public int flags() { return VkObjectTablePipelineEntryNVX.nflags(address()); }
        /** Returns the value of the {@code pipeline} field. */
        @NativeType("VkPipeline")
        public long pipeline() { return VkObjectTablePipelineEntryNVX.npipeline(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkObjectTablePipelineEntryNVX.Buffer type(@NativeType("VkObjectEntryTypeNVX") int value) { VkObjectTablePipelineEntryNVX.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkObjectTablePipelineEntryNVX.Buffer flags(@NativeType("VkObjectEntryUsageFlagsNVX") int value) { VkObjectTablePipelineEntryNVX.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipeline} field. */
        public VkObjectTablePipelineEntryNVX.Buffer pipeline(@NativeType("VkPipeline") long value) { VkObjectTablePipelineEntryNVX.npipeline(address(), value); return this; }

    }

}