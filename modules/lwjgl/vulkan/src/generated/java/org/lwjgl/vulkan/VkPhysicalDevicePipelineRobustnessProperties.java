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
 * struct VkPhysicalDevicePipelineRobustnessProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
 *     VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
 *     VkPipelineRobustnessImageBehavior defaultRobustnessImages;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineRobustnessProperties extends Struct<VkPhysicalDevicePipelineRobustnessProperties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEFAULTROBUSTNESSSTORAGEBUFFERS,
        DEFAULTROBUSTNESSUNIFORMBUFFERS,
        DEFAULTROBUSTNESSVERTEXINPUTS,
        DEFAULTROBUSTNESSIMAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEFAULTROBUSTNESSSTORAGEBUFFERS = layout.offsetof(2);
        DEFAULTROBUSTNESSUNIFORMBUFFERS = layout.offsetof(3);
        DEFAULTROBUSTNESSVERTEXINPUTS = layout.offsetof(4);
        DEFAULTROBUSTNESSIMAGES = layout.offsetof(5);
    }

    protected VkPhysicalDevicePipelineRobustnessProperties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineRobustnessProperties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessProperties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineRobustnessProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineRobustnessProperties(ByteBuffer container) {
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
    /** @return the value of the {@code defaultRobustnessStorageBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessStorageBuffers() { return ndefaultRobustnessStorageBuffers(address()); }
    /** @return the value of the {@code defaultRobustnessUniformBuffers} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessUniformBuffers() { return ndefaultRobustnessUniformBuffers(address()); }
    /** @return the value of the {@code defaultRobustnessVertexInputs} field. */
    @NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessVertexInputs() { return ndefaultRobustnessVertexInputs(address()); }
    /** @return the value of the {@code defaultRobustnessImages} field. */
    @NativeType("VkPipelineRobustnessImageBehavior")
    public int defaultRobustnessImages() { return ndefaultRobustnessImages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineRobustnessProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineRobustnessProperties sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineRobustnessProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineRobustnessProperties set(
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
    public VkPhysicalDevicePipelineRobustnessProperties set(VkPhysicalDevicePipelineRobustnessProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessProperties malloc() {
        return new VkPhysicalDevicePipelineRobustnessProperties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessProperties calloc() {
        return new VkPhysicalDevicePipelineRobustnessProperties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineRobustnessProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessProperties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineRobustnessProperties create(long address) {
        return new VkPhysicalDevicePipelineRobustnessProperties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineRobustnessProperties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineRobustnessProperties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineRobustnessProperties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessProperties malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessProperties calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineRobustnessProperties.PNEXT); }
    /** Unsafe version of {@link #defaultRobustnessStorageBuffers}. */
    public static int ndefaultRobustnessStorageBuffers(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSSTORAGEBUFFERS); }
    /** Unsafe version of {@link #defaultRobustnessUniformBuffers}. */
    public static int ndefaultRobustnessUniformBuffers(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSUNIFORMBUFFERS); }
    /** Unsafe version of {@link #defaultRobustnessVertexInputs}. */
    public static int ndefaultRobustnessVertexInputs(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSVERTEXINPUTS); }
    /** Unsafe version of {@link #defaultRobustnessImages}. */
    public static int ndefaultRobustnessImages(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessProperties.DEFAULTROBUSTNESSIMAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineRobustnessProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineRobustnessProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineRobustnessProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineRobustnessProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineRobustnessProperties ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineRobustnessProperties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineRobustnessProperties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineRobustnessProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineRobustnessProperties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineRobustnessProperties.npNext(address()); }
        /** @return the value of the {@code defaultRobustnessStorageBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessStorageBuffers() { return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessStorageBuffers(address()); }
        /** @return the value of the {@code defaultRobustnessUniformBuffers} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessUniformBuffers() { return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessUniformBuffers(address()); }
        /** @return the value of the {@code defaultRobustnessVertexInputs} field. */
        @NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessVertexInputs() { return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessVertexInputs(address()); }
        /** @return the value of the {@code defaultRobustnessImages} field. */
        @NativeType("VkPipelineRobustnessImageBehavior")
        public int defaultRobustnessImages() { return VkPhysicalDevicePipelineRobustnessProperties.ndefaultRobustnessImages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineRobustnessProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineRobustnessProperties.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineRobustnessProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineRobustnessProperties.npNext(address(), value); return this; }

    }

}