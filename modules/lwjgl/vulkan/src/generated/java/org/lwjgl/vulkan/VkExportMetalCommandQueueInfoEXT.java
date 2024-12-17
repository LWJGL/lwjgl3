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
 * struct VkExportMetalCommandQueueInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkQueue queue;
 *     MTLCommandQueue_id mtlCommandQueue;
 * }}</pre>
 */
public class VkExportMetalCommandQueueInfoEXT extends Struct<VkExportMetalCommandQueueInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        QUEUE,
        MTLCOMMANDQUEUE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUEUE = layout.offsetof(2);
        MTLCOMMANDQUEUE = layout.offsetof(3);
    }

    protected VkExportMetalCommandQueueInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkExportMetalCommandQueueInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkExportMetalCommandQueueInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkExportMetalCommandQueueInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkExportMetalCommandQueueInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code queue} field. */
    @NativeType("VkQueue")
    public long queue() { return nqueue(address()); }
    /** @return the value of the {@code mtlCommandQueue} field. */
    @NativeType("MTLCommandQueue_id")
    public long mtlCommandQueue() { return nmtlCommandQueue(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkExportMetalCommandQueueInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT} value to the {@code sType} field. */
    public VkExportMetalCommandQueueInfoEXT sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkExportMetalCommandQueueInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code queue} field. */
    public VkExportMetalCommandQueueInfoEXT queue(VkQueue value) { nqueue(address(), value); return this; }
    /** Sets the specified value to the {@code mtlCommandQueue} field. */
    public VkExportMetalCommandQueueInfoEXT mtlCommandQueue(@NativeType("MTLCommandQueue_id") long value) { nmtlCommandQueue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkExportMetalCommandQueueInfoEXT set(
        int sType,
        long pNext,
        VkQueue queue,
        long mtlCommandQueue
    ) {
        sType(sType);
        pNext(pNext);
        queue(queue);
        mtlCommandQueue(mtlCommandQueue);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkExportMetalCommandQueueInfoEXT set(VkExportMetalCommandQueueInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkExportMetalCommandQueueInfoEXT malloc() {
        return new VkExportMetalCommandQueueInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkExportMetalCommandQueueInfoEXT calloc() {
        return new VkExportMetalCommandQueueInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkExportMetalCommandQueueInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExportMetalCommandQueueInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance for the specified memory address. */
    public static VkExportMetalCommandQueueInfoEXT create(long address) {
        return new VkExportMetalCommandQueueInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkExportMetalCommandQueueInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkExportMetalCommandQueueInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkExportMetalCommandQueueInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalCommandQueueInfoEXT malloc(MemoryStack stack) {
        return new VkExportMetalCommandQueueInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkExportMetalCommandQueueInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkExportMetalCommandQueueInfoEXT calloc(MemoryStack stack) {
        return new VkExportMetalCommandQueueInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkExportMetalCommandQueueInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkExportMetalCommandQueueInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkExportMetalCommandQueueInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkExportMetalCommandQueueInfoEXT.PNEXT); }
    /** Unsafe version of {@link #queue}. */
    public static long nqueue(long struct) { return memGetAddress(struct + VkExportMetalCommandQueueInfoEXT.QUEUE); }
    /** Unsafe version of {@link #mtlCommandQueue}. */
    public static long nmtlCommandQueue(long struct) { return memGetAddress(struct + VkExportMetalCommandQueueInfoEXT.MTLCOMMANDQUEUE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkExportMetalCommandQueueInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkExportMetalCommandQueueInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #queue(VkQueue) queue}. */
    public static void nqueue(long struct, VkQueue value) { memPutAddress(struct + VkExportMetalCommandQueueInfoEXT.QUEUE, value.address()); }
    /** Unsafe version of {@link #mtlCommandQueue(long) mtlCommandQueue}. */
    public static void nmtlCommandQueue(long struct, long value) { memPutAddress(struct + VkExportMetalCommandQueueInfoEXT.MTLCOMMANDQUEUE, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkExportMetalCommandQueueInfoEXT.QUEUE));
        check(memGetAddress(struct + VkExportMetalCommandQueueInfoEXT.MTLCOMMANDQUEUE));
    }

    // -----------------------------------

    /** An array of {@link VkExportMetalCommandQueueInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkExportMetalCommandQueueInfoEXT, Buffer> implements NativeResource {

        private static final VkExportMetalCommandQueueInfoEXT ELEMENT_FACTORY = VkExportMetalCommandQueueInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkExportMetalCommandQueueInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkExportMetalCommandQueueInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkExportMetalCommandQueueInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkExportMetalCommandQueueInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkExportMetalCommandQueueInfoEXT.npNext(address()); }
        /** @return the value of the {@code queue} field. */
        @NativeType("VkQueue")
        public long queue() { return VkExportMetalCommandQueueInfoEXT.nqueue(address()); }
        /** @return the value of the {@code mtlCommandQueue} field. */
        @NativeType("MTLCommandQueue_id")
        public long mtlCommandQueue() { return VkExportMetalCommandQueueInfoEXT.nmtlCommandQueue(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkExportMetalCommandQueueInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkExportMetalCommandQueueInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMetalObjects#VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT} value to the {@code sType} field. */
        public VkExportMetalCommandQueueInfoEXT.Buffer sType$Default() { return sType(EXTMetalObjects.VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkExportMetalCommandQueueInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkExportMetalCommandQueueInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code queue} field. */
        public VkExportMetalCommandQueueInfoEXT.Buffer queue(VkQueue value) { VkExportMetalCommandQueueInfoEXT.nqueue(address(), value); return this; }
        /** Sets the specified value to the {@code mtlCommandQueue} field. */
        public VkExportMetalCommandQueueInfoEXT.Buffer mtlCommandQueue(@NativeType("MTLCommandQueue_id") long value) { VkExportMetalCommandQueueInfoEXT.nmtlCommandQueue(address(), value); return this; }

    }

}