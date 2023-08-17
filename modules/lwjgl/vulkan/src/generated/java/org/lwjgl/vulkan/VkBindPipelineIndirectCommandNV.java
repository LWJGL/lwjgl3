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
 * Structure specifying input data for the compute pipeline dispatch token.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#features-deviceGeneratedComputePipelines">{@link VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV}{@code ::deviceGeneratedComputePipelines}</a> feature <b>must</b> be enabled</li>
 * <li>The referenced pipeline <b>must</b> have been created with {@link NVDeviceGeneratedCommands#VK_PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV PIPELINE_CREATE_INDIRECT_BINDABLE_BIT_NV}</li>
 * <li>The referenced pipeline <b>must</b> have been updated with {@link NVDeviceGeneratedCommandsCompute#vkCmdUpdatePipelineIndirectBufferNV CmdUpdatePipelineIndirectBufferNV}</li>
 * <li>The referenced pipeline’s address <b>must</b> have been queried with {@link NVDeviceGeneratedCommandsCompute#vkGetPipelineIndirectDeviceAddressNV GetPipelineIndirectDeviceAddressNV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindPipelineIndirectCommandNV {
 *     VkDeviceAddress {@link #pipelineAddress};
 * }</code></pre>
 */
public class VkBindPipelineIndirectCommandNV extends Struct<VkBindPipelineIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PIPELINEADDRESS;

    static {
        Layout layout = __struct(
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PIPELINEADDRESS = layout.offsetof(0);
    }

    protected VkBindPipelineIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBindPipelineIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkBindPipelineIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkBindPipelineIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindPipelineIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the pipeline address of the compute pipeline that will be used in device generated rendering. */
    @NativeType("VkDeviceAddress")
    public long pipelineAddress() { return npipelineAddress(address()); }

    /** Sets the specified value to the {@link #pipelineAddress} field. */
    public VkBindPipelineIndirectCommandNV pipelineAddress(@NativeType("VkDeviceAddress") long value) { npipelineAddress(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindPipelineIndirectCommandNV set(VkBindPipelineIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindPipelineIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindPipelineIndirectCommandNV malloc() {
        return new VkBindPipelineIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBindPipelineIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindPipelineIndirectCommandNV calloc() {
        return new VkBindPipelineIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBindPipelineIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkBindPipelineIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBindPipelineIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkBindPipelineIndirectCommandNV} instance for the specified memory address. */
    public static VkBindPipelineIndirectCommandNV create(long address) {
        return new VkBindPipelineIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindPipelineIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkBindPipelineIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkBindPipelineIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindPipelineIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindPipelineIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBindPipelineIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindPipelineIndirectCommandNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBindPipelineIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindPipelineIndirectCommandNV malloc(MemoryStack stack) {
        return new VkBindPipelineIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBindPipelineIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindPipelineIndirectCommandNV calloc(MemoryStack stack) {
        return new VkBindPipelineIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBindPipelineIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindPipelineIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindPipelineIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pipelineAddress}. */
    public static long npipelineAddress(long struct) { return UNSAFE.getLong(null, struct + VkBindPipelineIndirectCommandNV.PIPELINEADDRESS); }

    /** Unsafe version of {@link #pipelineAddress(long) pipelineAddress}. */
    public static void npipelineAddress(long struct, long value) { UNSAFE.putLong(null, struct + VkBindPipelineIndirectCommandNV.PIPELINEADDRESS, value); }

    // -----------------------------------

    /** An array of {@link VkBindPipelineIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkBindPipelineIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkBindPipelineIndirectCommandNV ELEMENT_FACTORY = VkBindPipelineIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkBindPipelineIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindPipelineIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBindPipelineIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindPipelineIndirectCommandNV#pipelineAddress} field. */
        @NativeType("VkDeviceAddress")
        public long pipelineAddress() { return VkBindPipelineIndirectCommandNV.npipelineAddress(address()); }

        /** Sets the specified value to the {@link VkBindPipelineIndirectCommandNV#pipelineAddress} field. */
        public VkBindPipelineIndirectCommandNV.Buffer pipelineAddress(@NativeType("VkDeviceAddress") long value) { VkBindPipelineIndirectCommandNV.npipelineAddress(address(), value); return this; }

    }

}