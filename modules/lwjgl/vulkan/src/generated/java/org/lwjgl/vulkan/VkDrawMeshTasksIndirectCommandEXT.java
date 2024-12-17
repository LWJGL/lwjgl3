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
 * struct VkDrawMeshTasksIndirectCommandEXT {
 *     uint32_t groupCountX;
 *     uint32_t groupCountY;
 *     uint32_t groupCountZ;
 * }}</pre>
 */
public class VkDrawMeshTasksIndirectCommandEXT extends Struct<VkDrawMeshTasksIndirectCommandEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        GROUPCOUNTX,
        GROUPCOUNTY,
        GROUPCOUNTZ;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        GROUPCOUNTX = layout.offsetof(0);
        GROUPCOUNTY = layout.offsetof(1);
        GROUPCOUNTZ = layout.offsetof(2);
    }

    protected VkDrawMeshTasksIndirectCommandEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawMeshTasksIndirectCommandEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, container);
    }

    /**
     * Creates a {@code VkDrawMeshTasksIndirectCommandEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawMeshTasksIndirectCommandEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code groupCountX} field. */
    @NativeType("uint32_t")
    public int groupCountX() { return ngroupCountX(address()); }
    /** @return the value of the {@code groupCountY} field. */
    @NativeType("uint32_t")
    public int groupCountY() { return ngroupCountY(address()); }
    /** @return the value of the {@code groupCountZ} field. */
    @NativeType("uint32_t")
    public int groupCountZ() { return ngroupCountZ(address()); }

    /** Sets the specified value to the {@code groupCountX} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountX(@NativeType("uint32_t") int value) { ngroupCountX(address(), value); return this; }
    /** Sets the specified value to the {@code groupCountY} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountY(@NativeType("uint32_t") int value) { ngroupCountY(address(), value); return this; }
    /** Sets the specified value to the {@code groupCountZ} field. */
    public VkDrawMeshTasksIndirectCommandEXT groupCountZ(@NativeType("uint32_t") int value) { ngroupCountZ(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawMeshTasksIndirectCommandEXT set(
        int groupCountX,
        int groupCountY,
        int groupCountZ
    ) {
        groupCountX(groupCountX);
        groupCountY(groupCountY);
        groupCountZ(groupCountZ);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawMeshTasksIndirectCommandEXT set(VkDrawMeshTasksIndirectCommandEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandEXT malloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandEXT calloc() {
        return new VkDrawMeshTasksIndirectCommandEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated with {@link BufferUtils}. */
    public static VkDrawMeshTasksIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawMeshTasksIndirectCommandEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance for the specified memory address. */
    public static VkDrawMeshTasksIndirectCommandEXT create(long address) {
        return new VkDrawMeshTasksIndirectCommandEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawMeshTasksIndirectCommandEXT createSafe(long address) {
        return address == NULL ? null : new VkDrawMeshTasksIndirectCommandEXT(address, null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawMeshTasksIndirectCommandEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #groupCountX}. */
    public static int ngroupCountX(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTX); }
    /** Unsafe version of {@link #groupCountY}. */
    public static int ngroupCountY(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTY); }
    /** Unsafe version of {@link #groupCountZ}. */
    public static int ngroupCountZ(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTZ); }

    /** Unsafe version of {@link #groupCountX(int) groupCountX}. */
    public static void ngroupCountX(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTX, value); }
    /** Unsafe version of {@link #groupCountY(int) groupCountY}. */
    public static void ngroupCountY(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTY, value); }
    /** Unsafe version of {@link #groupCountZ(int) groupCountZ}. */
    public static void ngroupCountZ(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandEXT.GROUPCOUNTZ, value); }

    // -----------------------------------

    /** An array of {@link VkDrawMeshTasksIndirectCommandEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandEXT, Buffer> implements NativeResource {

        private static final VkDrawMeshTasksIndirectCommandEXT ELEMENT_FACTORY = VkDrawMeshTasksIndirectCommandEXT.create(-1L);

        /**
         * Creates a new {@code VkDrawMeshTasksIndirectCommandEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawMeshTasksIndirectCommandEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawMeshTasksIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code groupCountX} field. */
        @NativeType("uint32_t")
        public int groupCountX() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address()); }
        /** @return the value of the {@code groupCountY} field. */
        @NativeType("uint32_t")
        public int groupCountY() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address()); }
        /** @return the value of the {@code groupCountZ} field. */
        @NativeType("uint32_t")
        public int groupCountZ() { return VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address()); }

        /** Sets the specified value to the {@code groupCountX} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountX(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountX(address(), value); return this; }
        /** Sets the specified value to the {@code groupCountY} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountY(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountY(address(), value); return this; }
        /** Sets the specified value to the {@code groupCountZ} field. */
        public VkDrawMeshTasksIndirectCommandEXT.Buffer groupCountZ(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandEXT.ngroupCountZ(address(), value); return this; }

    }

}