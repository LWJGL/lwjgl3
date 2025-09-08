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
 * <pre><code>
 * struct VkQueueFamilyDataGraphPropertiesARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkPhysicalDeviceDataGraphProcessingEngineARM VkPhysicalDeviceDataGraphProcessingEngineARM} engine;
 *     {@link VkPhysicalDeviceDataGraphOperationSupportARM VkPhysicalDeviceDataGraphOperationSupportARM} operation;
 * }</code></pre>
 */
public class VkQueueFamilyDataGraphPropertiesARM extends Struct<VkQueueFamilyDataGraphPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ENGINE,
        OPERATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkPhysicalDeviceDataGraphProcessingEngineARM.SIZEOF, VkPhysicalDeviceDataGraphProcessingEngineARM.ALIGNOF),
            __member(VkPhysicalDeviceDataGraphOperationSupportARM.SIZEOF, VkPhysicalDeviceDataGraphOperationSupportARM.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENGINE = layout.offsetof(2);
        OPERATION = layout.offsetof(3);
    }

    protected VkQueueFamilyDataGraphPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkQueueFamilyDataGraphPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkQueueFamilyDataGraphPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkQueueFamilyDataGraphPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkQueueFamilyDataGraphPropertiesARM(ByteBuffer container) {
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
    /** @return a {@link VkPhysicalDeviceDataGraphProcessingEngineARM} view of the {@code engine} field. */
    public VkPhysicalDeviceDataGraphProcessingEngineARM engine() { return nengine(address()); }
    /** @return a {@link VkPhysicalDeviceDataGraphOperationSupportARM} view of the {@code operation} field. */
    public VkPhysicalDeviceDataGraphOperationSupportARM operation() { return noperation(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkQueueFamilyDataGraphPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkQueueFamilyDataGraphPropertiesARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkQueueFamilyDataGraphPropertiesARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkPhysicalDeviceDataGraphProcessingEngineARM} to the {@code engine} field. */
    public VkQueueFamilyDataGraphPropertiesARM engine(VkPhysicalDeviceDataGraphProcessingEngineARM value) { nengine(address(), value); return this; }
    /** Passes the {@code engine} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkQueueFamilyDataGraphPropertiesARM engine(java.util.function.Consumer<VkPhysicalDeviceDataGraphProcessingEngineARM> consumer) { consumer.accept(engine()); return this; }
    /** Copies the specified {@link VkPhysicalDeviceDataGraphOperationSupportARM} to the {@code operation} field. */
    public VkQueueFamilyDataGraphPropertiesARM operation(VkPhysicalDeviceDataGraphOperationSupportARM value) { noperation(address(), value); return this; }
    /** Passes the {@code operation} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkQueueFamilyDataGraphPropertiesARM operation(java.util.function.Consumer<VkPhysicalDeviceDataGraphOperationSupportARM> consumer) { consumer.accept(operation()); return this; }

    /** Initializes this struct with the specified values. */
    public VkQueueFamilyDataGraphPropertiesARM set(
        int sType,
        long pNext,
        VkPhysicalDeviceDataGraphProcessingEngineARM engine,
        VkPhysicalDeviceDataGraphOperationSupportARM operation
    ) {
        sType(sType);
        pNext(pNext);
        engine(engine);
        operation(operation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkQueueFamilyDataGraphPropertiesARM set(VkQueueFamilyDataGraphPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphPropertiesARM malloc() {
        return new VkQueueFamilyDataGraphPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkQueueFamilyDataGraphPropertiesARM calloc() {
        return new VkQueueFamilyDataGraphPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkQueueFamilyDataGraphPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyDataGraphPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance for the specified memory address. */
    public static VkQueueFamilyDataGraphPropertiesARM create(long address) {
        return new VkQueueFamilyDataGraphPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkQueueFamilyDataGraphPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkQueueFamilyDataGraphPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkQueueFamilyDataGraphPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphPropertiesARM malloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkQueueFamilyDataGraphPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkQueueFamilyDataGraphPropertiesARM calloc(MemoryStack stack) {
        return new VkQueueFamilyDataGraphPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkQueueFamilyDataGraphPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkQueueFamilyDataGraphPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkQueueFamilyDataGraphPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkQueueFamilyDataGraphPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #engine}. */
    public static VkPhysicalDeviceDataGraphProcessingEngineARM nengine(long struct) { return VkPhysicalDeviceDataGraphProcessingEngineARM.create(struct + VkQueueFamilyDataGraphPropertiesARM.ENGINE); }
    /** Unsafe version of {@link #operation}. */
    public static VkPhysicalDeviceDataGraphOperationSupportARM noperation(long struct) { return VkPhysicalDeviceDataGraphOperationSupportARM.create(struct + VkQueueFamilyDataGraphPropertiesARM.OPERATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkQueueFamilyDataGraphPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkQueueFamilyDataGraphPropertiesARM.PNEXT, value); }
    /** Unsafe version of {@link #engine(VkPhysicalDeviceDataGraphProcessingEngineARM) engine}. */
    public static void nengine(long struct, VkPhysicalDeviceDataGraphProcessingEngineARM value) { memCopy(value.address(), struct + VkQueueFamilyDataGraphPropertiesARM.ENGINE, VkPhysicalDeviceDataGraphProcessingEngineARM.SIZEOF); }
    /** Unsafe version of {@link #operation(VkPhysicalDeviceDataGraphOperationSupportARM) operation}. */
    public static void noperation(long struct, VkPhysicalDeviceDataGraphOperationSupportARM value) { memCopy(value.address(), struct + VkQueueFamilyDataGraphPropertiesARM.OPERATION, VkPhysicalDeviceDataGraphOperationSupportARM.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkQueueFamilyDataGraphPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkQueueFamilyDataGraphPropertiesARM, Buffer> implements NativeResource {

        private static final VkQueueFamilyDataGraphPropertiesARM ELEMENT_FACTORY = VkQueueFamilyDataGraphPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkQueueFamilyDataGraphPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkQueueFamilyDataGraphPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkQueueFamilyDataGraphPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkQueueFamilyDataGraphPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkQueueFamilyDataGraphPropertiesARM.npNext(address()); }
        /** @return a {@link VkPhysicalDeviceDataGraphProcessingEngineARM} view of the {@code engine} field. */
        public VkPhysicalDeviceDataGraphProcessingEngineARM engine() { return VkQueueFamilyDataGraphPropertiesARM.nengine(address()); }
        /** @return a {@link VkPhysicalDeviceDataGraphOperationSupportARM} view of the {@code operation} field. */
        public VkPhysicalDeviceDataGraphOperationSupportARM operation() { return VkQueueFamilyDataGraphPropertiesARM.noperation(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkQueueFamilyDataGraphPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer pNext(@NativeType("void const *") long value) { VkQueueFamilyDataGraphPropertiesARM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkPhysicalDeviceDataGraphProcessingEngineARM} to the {@code engine} field. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer engine(VkPhysicalDeviceDataGraphProcessingEngineARM value) { VkQueueFamilyDataGraphPropertiesARM.nengine(address(), value); return this; }
        /** Passes the {@code engine} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer engine(java.util.function.Consumer<VkPhysicalDeviceDataGraphProcessingEngineARM> consumer) { consumer.accept(engine()); return this; }
        /** Copies the specified {@link VkPhysicalDeviceDataGraphOperationSupportARM} to the {@code operation} field. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer operation(VkPhysicalDeviceDataGraphOperationSupportARM value) { VkQueueFamilyDataGraphPropertiesARM.noperation(address(), value); return this; }
        /** Passes the {@code operation} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkQueueFamilyDataGraphPropertiesARM.Buffer operation(java.util.function.Consumer<VkPhysicalDeviceDataGraphOperationSupportARM> consumer) { consumer.accept(operation()); return this; }

    }

}