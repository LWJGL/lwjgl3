/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct rmtVulkanBind {
 *     VkInstance instance;
 *     VkPhysicalDevice physical_device;
 *     VkDevice device;
 *     VkQueue queue;
 * }}</pre>
 */
@NativeType("struct rmtVulkanBind")
public class RMTVulkanBind extends Struct<RMTVulkanBind> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        INSTANCE,
        PHYSICAL_DEVICE,
        DEVICE,
        QUEUE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        INSTANCE = layout.offsetof(0);
        PHYSICAL_DEVICE = layout.offsetof(1);
        DEVICE = layout.offsetof(2);
        QUEUE = layout.offsetof(3);
    }

    protected RMTVulkanBind(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected RMTVulkanBind create(long address, @Nullable ByteBuffer container) {
        return new RMTVulkanBind(address, container);
    }

    /**
     * Creates a {@code RMTVulkanBind} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RMTVulkanBind(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code instance} field. */
    @NativeType("VkInstance")
    public long instance() { return ninstance(address()); }
    /** @return the value of the {@code physical_device} field. */
    @NativeType("VkPhysicalDevice")
    public long physical_device() { return nphysical_device(address()); }
    /** @return the value of the {@code device} field. */
    @NativeType("VkDevice")
    public long device() { return ndevice(address()); }
    /** @return the value of the {@code queue} field. */
    @NativeType("VkQueue")
    public long queue() { return nqueue(address()); }

    // -----------------------------------

    /** Returns a new {@code RMTVulkanBind} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RMTVulkanBind malloc() {
        return new RMTVulkanBind(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code RMTVulkanBind} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RMTVulkanBind calloc() {
        return new RMTVulkanBind(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code RMTVulkanBind} instance allocated with {@link BufferUtils}. */
    public static RMTVulkanBind create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new RMTVulkanBind(memAddress(container), container);
    }

    /** Returns a new {@code RMTVulkanBind} instance for the specified memory address. */
    public static RMTVulkanBind create(long address) {
        return new RMTVulkanBind(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable RMTVulkanBind createSafe(long address) {
        return address == NULL ? null : new RMTVulkanBind(address, null);
    }

    /**
     * Returns a new {@link RMTVulkanBind.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanBind.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanBind.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link RMTVulkanBind.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static RMTVulkanBind.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code RMTVulkanBind} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTVulkanBind malloc(MemoryStack stack) {
        return new RMTVulkanBind(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code RMTVulkanBind} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RMTVulkanBind calloc(MemoryStack stack) {
        return new RMTVulkanBind(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link RMTVulkanBind.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RMTVulkanBind.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RMTVulkanBind.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #instance}. */
    public static long ninstance(long struct) { return memGetAddress(struct + RMTVulkanBind.INSTANCE); }
    /** Unsafe version of {@link #physical_device}. */
    public static long nphysical_device(long struct) { return memGetAddress(struct + RMTVulkanBind.PHYSICAL_DEVICE); }
    /** Unsafe version of {@link #device}. */
    public static long ndevice(long struct) { return memGetAddress(struct + RMTVulkanBind.DEVICE); }
    /** Unsafe version of {@link #queue}. */
    public static long nqueue(long struct) { return memGetAddress(struct + RMTVulkanBind.QUEUE); }

    // -----------------------------------

    /** An array of {@link RMTVulkanBind} structs. */
    public static class Buffer extends StructBuffer<RMTVulkanBind, Buffer> implements NativeResource {

        private static final RMTVulkanBind ELEMENT_FACTORY = RMTVulkanBind.create(-1L);

        /**
         * Creates a new {@code RMTVulkanBind.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RMTVulkanBind#SIZEOF}, and its mark will be undefined.</p>
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
        protected RMTVulkanBind getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code instance} field. */
        @NativeType("VkInstance")
        public long instance() { return RMTVulkanBind.ninstance(address()); }
        /** @return the value of the {@code physical_device} field. */
        @NativeType("VkPhysicalDevice")
        public long physical_device() { return RMTVulkanBind.nphysical_device(address()); }
        /** @return the value of the {@code device} field. */
        @NativeType("VkDevice")
        public long device() { return RMTVulkanBind.ndevice(address()); }
        /** @return the value of the {@code queue} field. */
        @NativeType("VkQueue")
        public long queue() { return RMTVulkanBind.nqueue(address()); }

    }

}