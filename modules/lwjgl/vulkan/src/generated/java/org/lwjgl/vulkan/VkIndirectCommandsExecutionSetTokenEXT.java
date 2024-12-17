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
 * struct VkIndirectCommandsExecutionSetTokenEXT {
 *     VkIndirectExecutionSetInfoTypeEXT type;
 *     VkShaderStageFlags shaderStages;
 * }}</pre>
 */
public class VkIndirectCommandsExecutionSetTokenEXT extends Struct<VkIndirectCommandsExecutionSetTokenEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SHADERSTAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SHADERSTAGES = layout.offsetof(1);
    }

    protected VkIndirectCommandsExecutionSetTokenEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsExecutionSetTokenEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsExecutionSetTokenEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsExecutionSetTokenEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsExecutionSetTokenEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("VkIndirectExecutionSetInfoTypeEXT")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code shaderStages} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderStages() { return nshaderStages(address()); }

    /** Sets the specified value to the {@code type} field. */
    public VkIndirectCommandsExecutionSetTokenEXT type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code shaderStages} field. */
    public VkIndirectCommandsExecutionSetTokenEXT shaderStages(@NativeType("VkShaderStageFlags") int value) { nshaderStages(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsExecutionSetTokenEXT set(
        int type,
        int shaderStages
    ) {
        type(type);
        shaderStages(shaderStages);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsExecutionSetTokenEXT set(VkIndirectCommandsExecutionSetTokenEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsExecutionSetTokenEXT malloc() {
        return new VkIndirectCommandsExecutionSetTokenEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsExecutionSetTokenEXT calloc() {
        return new VkIndirectCommandsExecutionSetTokenEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsExecutionSetTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsExecutionSetTokenEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance for the specified memory address. */
    public static VkIndirectCommandsExecutionSetTokenEXT create(long address) {
        return new VkIndirectCommandsExecutionSetTokenEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsExecutionSetTokenEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsExecutionSetTokenEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsExecutionSetTokenEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsExecutionSetTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsExecutionSetTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsExecutionSetTokenEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsExecutionSetTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsExecutionSetTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsExecutionSetTokenEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkIndirectCommandsExecutionSetTokenEXT.TYPE); }
    /** Unsafe version of {@link #shaderStages}. */
    public static int nshaderStages(long struct) { return memGetInt(struct + VkIndirectCommandsExecutionSetTokenEXT.SHADERSTAGES); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkIndirectCommandsExecutionSetTokenEXT.TYPE, value); }
    /** Unsafe version of {@link #shaderStages(int) shaderStages}. */
    public static void nshaderStages(long struct, int value) { memPutInt(struct + VkIndirectCommandsExecutionSetTokenEXT.SHADERSTAGES, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsExecutionSetTokenEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsExecutionSetTokenEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsExecutionSetTokenEXT ELEMENT_FACTORY = VkIndirectCommandsExecutionSetTokenEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsExecutionSetTokenEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsExecutionSetTokenEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsExecutionSetTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("VkIndirectExecutionSetInfoTypeEXT")
        public int type() { return VkIndirectCommandsExecutionSetTokenEXT.ntype(address()); }
        /** @return the value of the {@code shaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStages() { return VkIndirectCommandsExecutionSetTokenEXT.nshaderStages(address()); }

        /** Sets the specified value to the {@code type} field. */
        public VkIndirectCommandsExecutionSetTokenEXT.Buffer type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectCommandsExecutionSetTokenEXT.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code shaderStages} field. */
        public VkIndirectCommandsExecutionSetTokenEXT.Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) { VkIndirectCommandsExecutionSetTokenEXT.nshaderStages(address(), value); return this; }

    }

}