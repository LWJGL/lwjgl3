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
 * struct VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 multisampledRenderToSingleSampled;
 * }}</pre>
 */
public class VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT extends Struct<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MULTISAMPLEDRENDERTOSINGLESAMPLED;

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
        MULTISAMPLEDRENDERTOSINGLESAMPLED = layout.offsetof(2);
    }

    protected VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(ByteBuffer container) {
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
    /** @return the value of the {@code multisampledRenderToSingleSampled} field. */
    @NativeType("VkBool32")
    public boolean multisampledRenderToSingleSampled() { return nmultisampledRenderToSingleSampled(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code multisampledRenderToSingleSampled} field. */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT multisampledRenderToSingleSampled(@NativeType("VkBool32") boolean value) { nmultisampledRenderToSingleSampled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(
        int sType,
        long pNext,
        boolean multisampledRenderToSingleSampled
    ) {
        sType(sType);
        pNext(pNext);
        multisampledRenderToSingleSampled(multisampledRenderToSingleSampled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT set(VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT malloc() {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT calloc() {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.PNEXT); }
    /** Unsafe version of {@link #multisampledRenderToSingleSampled}. */
    public static int nmultisampledRenderToSingleSampled(long struct) { return memGetInt(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.MULTISAMPLEDRENDERTOSINGLESAMPLED); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.PNEXT, value); }
    /** Unsafe version of {@link #multisampledRenderToSingleSampled(boolean) multisampledRenderToSingleSampled}. */
    public static void nmultisampledRenderToSingleSampled(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.MULTISAMPLEDRENDERTOSINGLESAMPLED, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.npNext(address()); }
        /** @return the value of the {@code multisampledRenderToSingleSampled} field. */
        @NativeType("VkBool32")
        public boolean multisampledRenderToSingleSampled() { return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nmultisampledRenderToSingleSampled(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTMultisampledRenderToSingleSampled#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer sType$Default() { return sType(EXTMultisampledRenderToSingleSampled.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code multisampledRenderToSingleSampled} field. */
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.Buffer multisampledRenderToSingleSampled(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.nmultisampledRenderToSingleSampled(address(), value ? 1 : 0); return this; }

    }

}