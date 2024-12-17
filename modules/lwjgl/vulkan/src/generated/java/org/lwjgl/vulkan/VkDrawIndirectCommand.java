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
 * struct VkDrawIndirectCommand {
 *     uint32_t vertexCount;
 *     uint32_t instanceCount;
 *     uint32_t firstVertex;
 *     uint32_t firstInstance;
 * }}</pre>
 */
public class VkDrawIndirectCommand extends Struct<VkDrawIndirectCommand> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERTEXCOUNT,
        INSTANCECOUNT,
        FIRSTVERTEX,
        FIRSTINSTANCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERTEXCOUNT = layout.offsetof(0);
        INSTANCECOUNT = layout.offsetof(1);
        FIRSTVERTEX = layout.offsetof(2);
        FIRSTINSTANCE = layout.offsetof(3);
    }

    protected VkDrawIndirectCommand(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawIndirectCommand create(long address, @Nullable ByteBuffer container) {
        return new VkDrawIndirectCommand(address, container);
    }

    /**
     * Creates a {@code VkDrawIndirectCommand} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndirectCommand(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code vertexCount} field. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }
    /** @return the value of the {@code instanceCount} field. */
    @NativeType("uint32_t")
    public int instanceCount() { return ninstanceCount(address()); }
    /** @return the value of the {@code firstVertex} field. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** @return the value of the {@code firstInstance} field. */
    @NativeType("uint32_t")
    public int firstInstance() { return nfirstInstance(address()); }

    /** Sets the specified value to the {@code vertexCount} field. */
    public VkDrawIndirectCommand vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }
    /** Sets the specified value to the {@code instanceCount} field. */
    public VkDrawIndirectCommand instanceCount(@NativeType("uint32_t") int value) { ninstanceCount(address(), value); return this; }
    /** Sets the specified value to the {@code firstVertex} field. */
    public VkDrawIndirectCommand firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@code firstInstance} field. */
    public VkDrawIndirectCommand firstInstance(@NativeType("uint32_t") int value) { nfirstInstance(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndirectCommand set(
        int vertexCount,
        int instanceCount,
        int firstVertex,
        int firstInstance
    ) {
        vertexCount(vertexCount);
        instanceCount(instanceCount);
        firstVertex(firstVertex);
        firstInstance(firstInstance);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawIndirectCommand set(VkDrawIndirectCommand src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand malloc() {
        return new VkDrawIndirectCommand(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCommand calloc() {
        return new VkDrawIndirectCommand(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndirectCommand(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawIndirectCommand} instance for the specified memory address. */
    public static VkDrawIndirectCommand create(long address) {
        return new VkDrawIndirectCommand(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawIndirectCommand createSafe(long address) {
        return address == NULL ? null : new VkDrawIndirectCommand(address, null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawIndirectCommand.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawIndirectCommand.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawIndirectCommand.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand malloc(MemoryStack stack) {
        return new VkDrawIndirectCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawIndirectCommand} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCommand calloc(MemoryStack stack) {
        return new VkDrawIndirectCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCommand.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCommand.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.VERTEXCOUNT); }
    /** Unsafe version of {@link #instanceCount}. */
    public static int ninstanceCount(long struct) { return memGetInt(struct + VkDrawIndirectCommand.INSTANCECOUNT); }
    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTVERTEX); }
    /** Unsafe version of {@link #firstInstance}. */
    public static int nfirstInstance(long struct) { return memGetInt(struct + VkDrawIndirectCommand.FIRSTINSTANCE); }

    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.VERTEXCOUNT, value); }
    /** Unsafe version of {@link #instanceCount(int) instanceCount}. */
    public static void ninstanceCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.INSTANCECOUNT, value); }
    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #firstInstance(int) firstInstance}. */
    public static void nfirstInstance(long struct, int value) { memPutInt(struct + VkDrawIndirectCommand.FIRSTINSTANCE, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndirectCommand} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndirectCommand, Buffer> implements NativeResource {

        private static final VkDrawIndirectCommand ELEMENT_FACTORY = VkDrawIndirectCommand.create(-1L);

        /**
         * Creates a new {@code VkDrawIndirectCommand.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndirectCommand#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkDrawIndirectCommand.nvertexCount(address()); }
        /** @return the value of the {@code instanceCount} field. */
        @NativeType("uint32_t")
        public int instanceCount() { return VkDrawIndirectCommand.ninstanceCount(address()); }
        /** @return the value of the {@code firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkDrawIndirectCommand.nfirstVertex(address()); }
        /** @return the value of the {@code firstInstance} field. */
        @NativeType("uint32_t")
        public int firstInstance() { return VkDrawIndirectCommand.nfirstInstance(address()); }

        /** Sets the specified value to the {@code vertexCount} field. */
        public VkDrawIndirectCommand.Buffer vertexCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nvertexCount(address(), value); return this; }
        /** Sets the specified value to the {@code instanceCount} field. */
        public VkDrawIndirectCommand.Buffer instanceCount(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.ninstanceCount(address(), value); return this; }
        /** Sets the specified value to the {@code firstVertex} field. */
        public VkDrawIndirectCommand.Buffer firstVertex(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@code firstInstance} field. */
        public VkDrawIndirectCommand.Buffer firstInstance(@NativeType("uint32_t") int value) { VkDrawIndirectCommand.nfirstInstance(address(), value); return this; }

    }

}