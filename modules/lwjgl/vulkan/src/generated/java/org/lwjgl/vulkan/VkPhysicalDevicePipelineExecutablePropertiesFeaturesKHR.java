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
 * struct VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineExecutableInfo;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR extends Struct<VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEEXECUTABLEINFO;

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
        PIPELINEEXECUTABLEINFO = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineExecutableInfo} field. */
    @NativeType("VkBool32")
    public boolean pipelineExecutableInfo() { return npipelineExecutableInfo(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineExecutableInfo} field. */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR pipelineExecutableInfo(@NativeType("VkBool32") boolean value) { npipelineExecutableInfo(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR set(
        int sType,
        long pNext,
        boolean pipelineExecutableInfo
    ) {
        sType(sType);
        pNext(pNext);
        pipelineExecutableInfo(pipelineExecutableInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR set(VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR malloc() {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR calloc() {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR create(long address) {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #pipelineExecutableInfo}. */
    public static int npipelineExecutableInfo(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.PIPELINEEXECUTABLEINFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #pipelineExecutableInfo(boolean) pipelineExecutableInfo}. */
    public static void npipelineExecutableInfo(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.PIPELINEEXECUTABLEINFO, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR ELEMENT_FACTORY = VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code pipelineExecutableInfo} field. */
        @NativeType("VkBool32")
        public boolean pipelineExecutableInfo() { return VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.npipelineExecutableInfo(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRPipelineExecutableProperties#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer sType$Default() { return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_EXECUTABLE_PROPERTIES_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineExecutableInfo} field. */
        public VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.Buffer pipelineExecutableInfo(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR.npipelineExecutableInfo(address(), value ? 1 : 0); return this; }

    }

}