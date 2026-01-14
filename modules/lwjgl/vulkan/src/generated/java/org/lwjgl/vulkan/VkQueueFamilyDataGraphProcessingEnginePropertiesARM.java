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
 * struct VkQueueFamilyDataGraphProcessingEnginePropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkExternalSemaphoreHandleTypeFlags foreignSemaphoreHandleTypes;
 *     VkExternalMemoryHandleTypeFlags foreignMemoryHandleTypes;
 * }}</pre>
 */
public class VkQueueFamilyDataGraphProcessingEnginePropertiesARM extends Struct<VkQueueFamilyDataGraphProcessingEnginePropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FOREIGNSEMAPHOREHANDLETYPES,
        FOREIGNMEMORYHANDLETYPES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FOREIGNSEMAPHOREHANDLETYPES = layout.offsetof(2);
        FOREIGNMEMORYHANDLETYPES = layout.offsetof(3);
    }

    protected VkQueueFamilyDataGraphProcessingEnginePropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyDataGraphProcessingEnginePropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code foreignSemaphoreHandleTypes} field. */
    @NativeType("VkExternalSemaphoreHandleTypeFlags")
    public int foreignSemaphoreHandleTypes() { return nforeignSemaphoreHandleTypes(address()); }
    /** @return the value of the {@code foreignMemoryHandleTypes} field. */
    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int foreignMemoryHandleTypes() { return nforeignMemoryHandleTypes(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyDataGraphProcessingEnginePropertiesARM set(VkQueueFamilyDataGraphProcessingEnginePropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM malloc() {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM calloc() {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance for the specified memory address. */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyDataGraphProcessingEnginePropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphProcessingEnginePropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.PNEXT); }
    /** Unsafe version of {@link #foreignSemaphoreHandleTypes}. */
    public static int nforeignSemaphoreHandleTypes(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.FOREIGNSEMAPHOREHANDLETYPES); }
    /** Unsafe version of {@link #foreignMemoryHandleTypes}. */
    public static int nforeignMemoryHandleTypes(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.FOREIGNMEMORYHANDLETYPES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyDataGraphProcessingEnginePropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphProcessingEnginePropertiesARM, Buffer> implements NativeResource {

        private static final VkQueueFamilyDataGraphProcessingEnginePropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphProcessingEnginePropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyDataGraphProcessingEnginePropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyDataGraphProcessingEnginePropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.npNext(address()); }
        /** @return the value of the {@code foreignSemaphoreHandleTypes} field. */
        @NativeType("VkExternalSemaphoreHandleTypeFlags")
        public int foreignSemaphoreHandleTypes() { return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nforeignSemaphoreHandleTypes(address()); }
        /** @return the value of the {@code foreignMemoryHandleTypes} field. */
        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int foreignMemoryHandleTypes() { return VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nforeignMemoryHandleTypes(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyDataGraphProcessingEnginePropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROCESSING_ENGINE_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyDataGraphProcessingEnginePropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkQueueFamilyDataGraphProcessingEnginePropertiesARM.npNext(address(), value); return this; }

    }

}