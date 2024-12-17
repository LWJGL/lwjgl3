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
 * struct VkPhysicalDevicePipelineRobustnessFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineRobustness;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineRobustnessFeatures extends Struct<VkPhysicalDevicePipelineRobustnessFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEROBUSTNESS;

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
        PIPELINEROBUSTNESS = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineRobustnessFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineRobustnessFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineRobustnessFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineRobustnessFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineRobustness} field. */
    @NativeType("VkBool32")
    public boolean pipelineRobustness() { return npipelineRobustness(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineRobustnessFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineRobustnessFeatures sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineRobustnessFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineRobustness} field. */
    public VkPhysicalDevicePipelineRobustnessFeatures pipelineRobustness(@NativeType("VkBool32") boolean value) { npipelineRobustness(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineRobustnessFeatures set(
        int sType,
        long pNext,
        boolean pipelineRobustness
    ) {
        sType(sType);
        pNext(pNext);
        pipelineRobustness(pipelineRobustness);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineRobustnessFeatures set(VkPhysicalDevicePipelineRobustnessFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeatures malloc() {
        return new VkPhysicalDevicePipelineRobustnessFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineRobustnessFeatures calloc() {
        return new VkPhysicalDevicePipelineRobustnessFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineRobustnessFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineRobustnessFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineRobustnessFeatures create(long address) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineRobustnessFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineRobustnessFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineRobustnessFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineRobustnessFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineRobustnessFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineRobustnessFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineRobustnessFeatures.PNEXT); }
    /** Unsafe version of {@link #pipelineRobustness}. */
    public static int npipelineRobustness(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineRobustnessFeatures.PIPELINEROBUSTNESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineRobustnessFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineRobustnessFeatures.PNEXT, value); }
    /** Unsafe version of {@link #pipelineRobustness(boolean) pipelineRobustness}. */
    public static void npipelineRobustness(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineRobustnessFeatures.PIPELINEROBUSTNESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineRobustnessFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineRobustnessFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineRobustnessFeatures ELEMENT_FACTORY = VkPhysicalDevicePipelineRobustnessFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineRobustnessFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineRobustnessFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineRobustnessFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineRobustnessFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineRobustnessFeatures.npNext(address()); }
        /** @return the value of the {@code pipelineRobustness} field. */
        @NativeType("VkBool32")
        public boolean pipelineRobustness() { return VkPhysicalDevicePipelineRobustnessFeatures.npipelineRobustness(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineRobustnessFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineRobustnessFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineRobustnessFeatures.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_ROBUSTNESS_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineRobustnessFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineRobustnessFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineRobustness} field. */
        public VkPhysicalDevicePipelineRobustnessFeatures.Buffer pipelineRobustness(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineRobustnessFeatures.npipelineRobustness(address(), value ? 1 : 0); return this; }

    }

}