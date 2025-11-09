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
 * struct VkPhysicalDeviceDataGraphModelFeaturesQCOM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBool32 dataGraphModel;
 * }}</pre>
 */
public class VkPhysicalDeviceDataGraphModelFeaturesQCOM extends Struct<VkPhysicalDeviceDataGraphModelFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DATAGRAPHMODEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DATAGRAPHMODEL = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDataGraphModelFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDataGraphModelFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code dataGraphModel} field. */
    @NativeType("VkBool32")
    public boolean dataGraphModel() { return ndataGraphModel(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMDataGraphModel#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM sType$Default() { return sType(QCOMDataGraphModel.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code dataGraphModel} field. */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM dataGraphModel(@NativeType("VkBool32") boolean value) { ndataGraphModel(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM set(
        int sType,
        long pNext,
        boolean dataGraphModel
    ) {
        sType(sType);
        pNext(pNext);
        dataGraphModel(dataGraphModel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDataGraphModelFeaturesQCOM set(VkPhysicalDeviceDataGraphModelFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM malloc() {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM calloc() {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDataGraphModelFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDataGraphModelFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDataGraphModelFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #dataGraphModel}. */
    public static int ndataGraphModel(long struct) { return memGetInt(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.DATAGRAPHMODEL); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #dataGraphModel(boolean) dataGraphModel}. */
    public static void ndataGraphModel(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDataGraphModelFeaturesQCOM.DATAGRAPHMODEL, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDataGraphModelFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDataGraphModelFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceDataGraphModelFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDataGraphModelFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDataGraphModelFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDataGraphModelFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPhysicalDeviceDataGraphModelFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code dataGraphModel} field. */
        @NativeType("VkBool32")
        public boolean dataGraphModel() { return VkPhysicalDeviceDataGraphModelFeaturesQCOM.ndataGraphModel(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDataGraphModelFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMDataGraphModel#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer sType$Default() { return sType(QCOMDataGraphModel.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer pNext(@NativeType("void const *") long value) { VkPhysicalDeviceDataGraphModelFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code dataGraphModel} field. */
        public VkPhysicalDeviceDataGraphModelFeaturesQCOM.Buffer dataGraphModel(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDataGraphModelFeaturesQCOM.ndataGraphModel(address(), value ? 1 : 0); return this; }

    }

}