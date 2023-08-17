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
 * Structure specifying input data for a single shader group command token.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The current bound graphics pipeline, as well as the pipelines it may reference, <b>must</b> have been created with {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>The {@code index} <b>must</b> be within range of the accessible shader groups of the current bound graphics pipeline. See {@link NVDeviceGeneratedCommands#vkCmdBindPipelineShaderGroupNV CmdBindPipelineShaderGroupNV} for further details</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindShaderGroupIndirectCommandNV {
 *     uint32_t {@link #groupIndex};
 * }</code></pre>
 */
public class VkBindShaderGroupIndirectCommandNV extends Struct<VkBindShaderGroupIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GROUPINDEX;

    static {
        Layout layout = __struct(
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GROUPINDEX = layout.offsetof(0);
    }

    protected VkBindShaderGroupIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindShaderGroupIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkBindShaderGroupIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkBindShaderGroupIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindShaderGroupIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies which shader group of the current bound graphics pipeline is used. */
    @NativeType("uint32_t")
    public int groupIndex() { return ngroupIndex(address()); }

    /** Sets the specified value to the {@link #groupIndex} field. */
    public VkBindShaderGroupIndirectCommandNV groupIndex(@NativeType("uint32_t") int value) { ngroupIndex(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindShaderGroupIndirectCommandNV set(VkBindShaderGroupIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindShaderGroupIndirectCommandNV malloc() {
        return new VkBindShaderGroupIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindShaderGroupIndirectCommandNV calloc() {
        return new VkBindShaderGroupIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkBindShaderGroupIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindShaderGroupIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance for the specified memory address. */
    public static VkBindShaderGroupIndirectCommandNV create(long address) {
        return new VkBindShaderGroupIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindShaderGroupIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkBindShaderGroupIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindShaderGroupIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindShaderGroupIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBindShaderGroupIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindShaderGroupIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindShaderGroupIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBindShaderGroupIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindShaderGroupIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindShaderGroupIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #groupIndex}. */
    public static int ngroupIndex(long struct) { return UNSAFE.getInt(null, struct + VkBindShaderGroupIndirectCommandNV.GROUPINDEX); }

    /** Unsafe version of {@link #groupIndex(int) groupIndex}. */
    public static void ngroupIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkBindShaderGroupIndirectCommandNV.GROUPINDEX, value); }

    // -----------------------------------

    /** An array of {@link VkBindShaderGroupIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkBindShaderGroupIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkBindShaderGroupIndirectCommandNV ELEMENT_FACTORY = VkBindShaderGroupIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkBindShaderGroupIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindShaderGroupIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindShaderGroupIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindShaderGroupIndirectCommandNV#groupIndex} field. */
        @NativeType("uint32_t")
        public int groupIndex() { return VkBindShaderGroupIndirectCommandNV.ngroupIndex(address()); }

        /** Sets the specified value to the {@link VkBindShaderGroupIndirectCommandNV#groupIndex} field. */
        public VkBindShaderGroupIndirectCommandNV.Buffer groupIndex(@NativeType("uint32_t") int value) { VkBindShaderGroupIndirectCommandNV.ngroupIndex(address(), value); return this; }

    }

}