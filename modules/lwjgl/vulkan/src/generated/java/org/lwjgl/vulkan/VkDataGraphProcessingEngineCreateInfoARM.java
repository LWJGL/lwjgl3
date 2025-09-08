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
 * <pre><code>
 * struct VkDataGraphProcessingEngineCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t processingEngineCount;
 *     {@link VkPhysicalDeviceDataGraphProcessingEngineARM VkPhysicalDeviceDataGraphProcessingEngineARM} * pProcessingEngines;
 * }</code></pre>
 */
public class VkDataGraphProcessingEngineCreateInfoARM extends Struct<VkDataGraphProcessingEngineCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PROCESSINGENGINECOUNT,
        PPROCESSINGENGINES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROCESSINGENGINECOUNT = layout.offsetof(2);
        PPROCESSINGENGINES = layout.offsetof(3);
    }

    protected VkDataGraphProcessingEngineCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphProcessingEngineCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphProcessingEngineCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphProcessingEngineCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphProcessingEngineCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code processingEngineCount} field. */
    @NativeType("uint32_t")
    public int processingEngineCount() { return nprocessingEngineCount(address()); }
    /** @return a {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} view of the struct array pointed to by the {@code pProcessingEngines} field. */
    @NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *")
    public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines() { return npProcessingEngines(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphProcessingEngineCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphProcessingEngineCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphProcessingEngineCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} to the {@code pProcessingEngines} field. */
    public VkDataGraphProcessingEngineCreateInfoARM pProcessingEngines(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *") VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) { npProcessingEngines(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphProcessingEngineCreateInfoARM set(
        int sType,
        long pNext,
        VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines
    ) {
        sType(sType);
        pNext(pNext);
        pProcessingEngines(pProcessingEngines);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphProcessingEngineCreateInfoARM set(VkDataGraphProcessingEngineCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphProcessingEngineCreateInfoARM malloc() {
        return new VkDataGraphProcessingEngineCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphProcessingEngineCreateInfoARM calloc() {
        return new VkDataGraphProcessingEngineCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphProcessingEngineCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphProcessingEngineCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphProcessingEngineCreateInfoARM create(long address) {
        return new VkDataGraphProcessingEngineCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphProcessingEngineCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphProcessingEngineCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphProcessingEngineCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphProcessingEngineCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphProcessingEngineCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphProcessingEngineCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphProcessingEngineCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphProcessingEngineCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphProcessingEngineCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphProcessingEngineCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphProcessingEngineCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #processingEngineCount}. */
    public static int nprocessingEngineCount(long struct) { return memGetInt(struct + VkDataGraphProcessingEngineCreateInfoARM.PROCESSINGENGINECOUNT); }
    /** Unsafe version of {@link #pProcessingEngines}. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer npProcessingEngines(long struct) { return VkPhysicalDeviceDataGraphProcessingEngineARM.create(memGetAddress(struct + VkDataGraphProcessingEngineCreateInfoARM.PPROCESSINGENGINES), nprocessingEngineCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphProcessingEngineCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphProcessingEngineCreateInfoARM.PNEXT, value); }
    /** Sets the specified value to the {@code processingEngineCount} field of the specified {@code struct}. */
    public static void nprocessingEngineCount(long struct, int value) { memPutInt(struct + VkDataGraphProcessingEngineCreateInfoARM.PROCESSINGENGINECOUNT, value); }
    /** Unsafe version of {@link #pProcessingEngines(VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer) pProcessingEngines}. */
    public static void npProcessingEngines(long struct, VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) { memPutAddress(struct + VkDataGraphProcessingEngineCreateInfoARM.PPROCESSINGENGINES, value.address()); nprocessingEngineCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphProcessingEngineCreateInfoARM.PPROCESSINGENGINES));
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphProcessingEngineCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphProcessingEngineCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphProcessingEngineCreateInfoARM ELEMENT_FACTORY = VkDataGraphProcessingEngineCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphProcessingEngineCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphProcessingEngineCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphProcessingEngineCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphProcessingEngineCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphProcessingEngineCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code processingEngineCount} field. */
        @NativeType("uint32_t")
        public int processingEngineCount() { return VkDataGraphProcessingEngineCreateInfoARM.nprocessingEngineCount(address()); }
        /** @return a {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} view of the struct array pointed to by the {@code pProcessingEngines} field. */
        @NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *")
        public VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer pProcessingEngines() { return VkDataGraphProcessingEngineCreateInfoARM.npProcessingEngines(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphProcessingEngineCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphProcessingEngineCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphProcessingEngineCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PROCESSING_ENGINE_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphProcessingEngineCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphProcessingEngineCreateInfoARM.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer} to the {@code pProcessingEngines} field. */
        public VkDataGraphProcessingEngineCreateInfoARM.Buffer pProcessingEngines(@NativeType("VkPhysicalDeviceDataGraphProcessingEngineARM *") VkPhysicalDeviceDataGraphProcessingEngineARM.Buffer value) { VkDataGraphProcessingEngineCreateInfoARM.npProcessingEngines(address(), value); return this; }

    }

}