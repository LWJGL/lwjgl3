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
 * struct VkDrawMeshTasksIndirectCommandNV {
 *     uint32_t taskCount;
 *     uint32_t firstTask;
 * }}</pre>
 */
public class VkDrawMeshTasksIndirectCommandNV extends Struct<VkDrawMeshTasksIndirectCommandNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TASKCOUNT,
        FIRSTTASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TASKCOUNT = layout.offsetof(0);
        FIRSTTASK = layout.offsetof(1);
    }

    protected VkDrawMeshTasksIndirectCommandNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawMeshTasksIndirectCommandNV create(long address, @Nullable ByteBuffer container) {
        return new VkDrawMeshTasksIndirectCommandNV(address, container);
    }

    /**
     * Creates a {@code VkDrawMeshTasksIndirectCommandNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawMeshTasksIndirectCommandNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code taskCount} field. */
    @NativeType("uint32_t")
    public int taskCount() { return ntaskCount(address()); }
    /** @return the value of the {@code firstTask} field. */
    @NativeType("uint32_t")
    public int firstTask() { return nfirstTask(address()); }

    /** Sets the specified value to the {@code taskCount} field. */
    public VkDrawMeshTasksIndirectCommandNV taskCount(@NativeType("uint32_t") int value) { ntaskCount(address(), value); return this; }
    /** Sets the specified value to the {@code firstTask} field. */
    public VkDrawMeshTasksIndirectCommandNV firstTask(@NativeType("uint32_t") int value) { nfirstTask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawMeshTasksIndirectCommandNV set(
        int taskCount,
        int firstTask
    ) {
        taskCount(taskCount);
        firstTask(firstTask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawMeshTasksIndirectCommandNV set(VkDrawMeshTasksIndirectCommandNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandNV malloc() {
        return new VkDrawMeshTasksIndirectCommandNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawMeshTasksIndirectCommandNV calloc() {
        return new VkDrawMeshTasksIndirectCommandNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance allocated with {@link BufferUtils}. */
    public static VkDrawMeshTasksIndirectCommandNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawMeshTasksIndirectCommandNV(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance for the specified memory address. */
    public static VkDrawMeshTasksIndirectCommandNV create(long address) {
        return new VkDrawMeshTasksIndirectCommandNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawMeshTasksIndirectCommandNV createSafe(long address) {
        return address == NULL ? null : new VkDrawMeshTasksIndirectCommandNV(address, null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawMeshTasksIndirectCommandNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkDrawMeshTasksIndirectCommandNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandNV malloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawMeshTasksIndirectCommandNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawMeshTasksIndirectCommandNV calloc(MemoryStack stack) {
        return new VkDrawMeshTasksIndirectCommandNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawMeshTasksIndirectCommandNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawMeshTasksIndirectCommandNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #taskCount}. */
    public static int ntaskCount(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandNV.TASKCOUNT); }
    /** Unsafe version of {@link #firstTask}. */
    public static int nfirstTask(long struct) { return memGetInt(struct + VkDrawMeshTasksIndirectCommandNV.FIRSTTASK); }

    /** Unsafe version of {@link #taskCount(int) taskCount}. */
    public static void ntaskCount(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandNV.TASKCOUNT, value); }
    /** Unsafe version of {@link #firstTask(int) firstTask}. */
    public static void nfirstTask(long struct, int value) { memPutInt(struct + VkDrawMeshTasksIndirectCommandNV.FIRSTTASK, value); }

    // -----------------------------------

    /** An array of {@link VkDrawMeshTasksIndirectCommandNV} structs. */
    public static class Buffer extends StructBuffer<VkDrawMeshTasksIndirectCommandNV, Buffer> implements NativeResource {

        private static final VkDrawMeshTasksIndirectCommandNV ELEMENT_FACTORY = VkDrawMeshTasksIndirectCommandNV.create(-1L);

        /**
         * Creates a new {@code VkDrawMeshTasksIndirectCommandNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawMeshTasksIndirectCommandNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawMeshTasksIndirectCommandNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code taskCount} field. */
        @NativeType("uint32_t")
        public int taskCount() { return VkDrawMeshTasksIndirectCommandNV.ntaskCount(address()); }
        /** @return the value of the {@code firstTask} field. */
        @NativeType("uint32_t")
        public int firstTask() { return VkDrawMeshTasksIndirectCommandNV.nfirstTask(address()); }

        /** Sets the specified value to the {@code taskCount} field. */
        public VkDrawMeshTasksIndirectCommandNV.Buffer taskCount(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.ntaskCount(address(), value); return this; }
        /** Sets the specified value to the {@code firstTask} field. */
        public VkDrawMeshTasksIndirectCommandNV.Buffer firstTask(@NativeType("uint32_t") int value) { VkDrawMeshTasksIndirectCommandNV.nfirstTask(address(), value); return this; }

    }

}