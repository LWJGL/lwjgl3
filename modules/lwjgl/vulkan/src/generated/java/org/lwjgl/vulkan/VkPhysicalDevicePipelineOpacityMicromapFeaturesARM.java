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
 * struct VkPhysicalDevicePipelineOpacityMicromapFeaturesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 pipelineOpacityMicromap;
 * }}</pre>
 */
public class VkPhysicalDevicePipelineOpacityMicromapFeaturesARM extends Struct<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PIPELINEOPACITYMICROMAP;

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
        PIPELINEOPACITYMICROMAP = layout.offsetof(2);
    }

    protected VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(ByteBuffer container) {
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
    /** @return the value of the {@code pipelineOpacityMicromap} field. */
    @NativeType("VkBool32")
    public boolean pipelineOpacityMicromap() { return npipelineOpacityMicromap(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMPipelineOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM} value to the {@code sType} field. */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM sType$Default() { return sType(ARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineOpacityMicromap} field. */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM pipelineOpacityMicromap(@NativeType("VkBool32") boolean value) { npipelineOpacityMicromap(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(
        int sType,
        long pNext,
        boolean pipelineOpacityMicromap
    ) {
        sType(sType);
        pNext(pNext);
        pipelineOpacityMicromap(pipelineOpacityMicromap);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM set(VkPhysicalDevicePipelineOpacityMicromapFeaturesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM malloc() {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM calloc() {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance for the specified memory address. */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM create(long address) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDevicePipelineOpacityMicromapFeaturesARM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM malloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM calloc(MemoryStack stack) {
        return new VkPhysicalDevicePipelineOpacityMicromapFeaturesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.PNEXT); }
    /** Unsafe version of {@link #pipelineOpacityMicromap}. */
    public static int npipelineOpacityMicromap(long struct) { return memGetInt(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.PIPELINEOPACITYMICROMAP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.PNEXT, value); }
    /** Unsafe version of {@link #pipelineOpacityMicromap(boolean) pipelineOpacityMicromap}. */
    public static void npipelineOpacityMicromap(long struct, int value) { memPutInt(struct + VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.PIPELINEOPACITYMICROMAP, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePipelineOpacityMicromapFeaturesARM, Buffer> implements NativeResource {

        private static final VkPhysicalDevicePipelineOpacityMicromapFeaturesARM ELEMENT_FACTORY = VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDevicePipelineOpacityMicromapFeaturesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDevicePipelineOpacityMicromapFeaturesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npNext(address()); }
        /** @return the value of the {@code pipelineOpacityMicromap} field. */
        @NativeType("VkBool32")
        public boolean pipelineOpacityMicromap() { return VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npipelineOpacityMicromap(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMPipelineOpacityMicromap#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM} value to the {@code sType} field. */
        public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer sType$Default() { return sType(ARMPipelineOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PIPELINE_OPACITY_MICROMAP_FEATURES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineOpacityMicromap} field. */
        public VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.Buffer pipelineOpacityMicromap(@NativeType("VkBool32") boolean value) { VkPhysicalDevicePipelineOpacityMicromapFeaturesARM.npipelineOpacityMicromap(address(), value ? 1 : 0); return this; }

    }

}