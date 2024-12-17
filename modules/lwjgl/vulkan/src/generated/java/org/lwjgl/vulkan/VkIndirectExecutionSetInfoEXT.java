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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * union VkIndirectExecutionSetInfoEXT {
 *     {@link VkIndirectExecutionSetPipelineInfoEXT VkIndirectExecutionSetPipelineInfoEXT} const * pPipelineInfo;
 *     {@link VkIndirectExecutionSetShaderInfoEXT VkIndirectExecutionSetShaderInfoEXT} const * pShaderInfo;
 * }}</pre>
 */
public class VkIndirectExecutionSetInfoEXT extends Struct<VkIndirectExecutionSetInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PPIPELINEINFO,
        PSHADERINFO;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PPIPELINEINFO = layout.offsetof(0);
        PSHADERINFO = layout.offsetof(1);
    }

    protected VkIndirectExecutionSetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkIndirectExecutionSetPipelineInfoEXT} view of the struct pointed to by the {@code pPipelineInfo} field. */
    @NativeType("VkIndirectExecutionSetPipelineInfoEXT const *")
    public VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() { return npPipelineInfo(address()); }
    /** @return a {@link VkIndirectExecutionSetShaderInfoEXT} view of the struct pointed to by the {@code pShaderInfo} field. */
    @NativeType("VkIndirectExecutionSetShaderInfoEXT const *")
    public VkIndirectExecutionSetShaderInfoEXT pShaderInfo() { return npShaderInfo(address()); }

    /** Sets the address of the specified {@link VkIndirectExecutionSetPipelineInfoEXT} to the {@code pPipelineInfo} field. */
    public VkIndirectExecutionSetInfoEXT pPipelineInfo(@NativeType("VkIndirectExecutionSetPipelineInfoEXT const *") VkIndirectExecutionSetPipelineInfoEXT value) { npPipelineInfo(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectExecutionSetShaderInfoEXT} to the {@code pShaderInfo} field. */
    public VkIndirectExecutionSetInfoEXT pShaderInfo(@NativeType("VkIndirectExecutionSetShaderInfoEXT const *") VkIndirectExecutionSetShaderInfoEXT value) { npShaderInfo(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetInfoEXT set(VkIndirectExecutionSetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetInfoEXT malloc() {
        return new VkIndirectExecutionSetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetInfoEXT calloc() {
        return new VkIndirectExecutionSetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetInfoEXT create(long address) {
        return new VkIndirectExecutionSetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectExecutionSetInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectExecutionSetInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pPipelineInfo}. */
    public static VkIndirectExecutionSetPipelineInfoEXT npPipelineInfo(long struct) { return VkIndirectExecutionSetPipelineInfoEXT.create(memGetAddress(struct + VkIndirectExecutionSetInfoEXT.PPIPELINEINFO)); }
    /** Unsafe version of {@link #pShaderInfo}. */
    public static VkIndirectExecutionSetShaderInfoEXT npShaderInfo(long struct) { return VkIndirectExecutionSetShaderInfoEXT.create(memGetAddress(struct + VkIndirectExecutionSetInfoEXT.PSHADERINFO)); }

    /** Unsafe version of {@link #pPipelineInfo(VkIndirectExecutionSetPipelineInfoEXT) pPipelineInfo}. */
    public static void npPipelineInfo(long struct, VkIndirectExecutionSetPipelineInfoEXT value) { memPutAddress(struct + VkIndirectExecutionSetInfoEXT.PPIPELINEINFO, value.address()); }
    /** Unsafe version of {@link #pShaderInfo(VkIndirectExecutionSetShaderInfoEXT) pShaderInfo}. */
    public static void npShaderInfo(long struct, VkIndirectExecutionSetShaderInfoEXT value) { memPutAddress(struct + VkIndirectExecutionSetInfoEXT.PSHADERINFO, value.address()); }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkIndirectExecutionSetPipelineInfoEXT} view of the struct pointed to by the {@code pPipelineInfo} field. */
        @NativeType("VkIndirectExecutionSetPipelineInfoEXT const *")
        public VkIndirectExecutionSetPipelineInfoEXT pPipelineInfo() { return VkIndirectExecutionSetInfoEXT.npPipelineInfo(address()); }
        /** @return a {@link VkIndirectExecutionSetShaderInfoEXT} view of the struct pointed to by the {@code pShaderInfo} field. */
        @NativeType("VkIndirectExecutionSetShaderInfoEXT const *")
        public VkIndirectExecutionSetShaderInfoEXT pShaderInfo() { return VkIndirectExecutionSetInfoEXT.npShaderInfo(address()); }

        /** Sets the address of the specified {@link VkIndirectExecutionSetPipelineInfoEXT} to the {@code pPipelineInfo} field. */
        public VkIndirectExecutionSetInfoEXT.Buffer pPipelineInfo(@NativeType("VkIndirectExecutionSetPipelineInfoEXT const *") VkIndirectExecutionSetPipelineInfoEXT value) { VkIndirectExecutionSetInfoEXT.npPipelineInfo(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectExecutionSetShaderInfoEXT} to the {@code pShaderInfo} field. */
        public VkIndirectExecutionSetInfoEXT.Buffer pShaderInfo(@NativeType("VkIndirectExecutionSetShaderInfoEXT const *") VkIndirectExecutionSetShaderInfoEXT value) { VkIndirectExecutionSetInfoEXT.npShaderInfo(address(), value); return this; }

    }

}