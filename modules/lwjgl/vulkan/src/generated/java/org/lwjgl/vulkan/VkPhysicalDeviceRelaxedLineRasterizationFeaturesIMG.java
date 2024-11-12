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
 * Structure describing relaxed line rasterization features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link IMGRelaxedLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #relaxedLineRasterization};
 * }</code></pre>
 */
public class VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG extends Struct<VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        RELAXEDLINERASTERIZATION;

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
        RELAXEDLINERASTERIZATION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** indicates that the implementation supports relaxed line rasterization control. */
    @NativeType("VkBool32")
    public boolean relaxedLineRasterization() { return nrelaxedLineRasterization(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link IMGRelaxedLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG} value to the {@link #sType} field. */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG sType$Default() { return sType(IMGRelaxedLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #relaxedLineRasterization} field. */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG relaxedLineRasterization(@NativeType("VkBool32") boolean value) { nrelaxedLineRasterization(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG set(
        int sType,
        long pNext,
        boolean relaxedLineRasterization
    ) {
        sType(sType);
        pNext(pNext);
        relaxedLineRasterization(relaxedLineRasterization);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG set(VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG malloc() {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG calloc() {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance for the specified memory address. */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG create(long address) {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG malloc(MemoryStack stack) {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG calloc(MemoryStack stack) {
        return new VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.PNEXT); }
    /** Unsafe version of {@link #relaxedLineRasterization}. */
    public static int nrelaxedLineRasterization(long struct) { return memGetInt(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.RELAXEDLINERASTERIZATION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.PNEXT, value); }
    /** Unsafe version of {@link #relaxedLineRasterization(boolean) relaxedLineRasterization}. */
    public static void nrelaxedLineRasterization(long struct, int value) { memPutInt(struct + VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.RELAXEDLINERASTERIZATION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG ELEMENT_FACTORY = VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#relaxedLineRasterization} field. */
        @NativeType("VkBool32")
        public boolean relaxedLineRasterization() { return VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.nrelaxedLineRasterization(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#sType} field. */
        public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.nsType(address(), value); return this; }
        /** Sets the {@link IMGRelaxedLineRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG} value to the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#sType} field. */
        public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer sType$Default() { return sType(IMGRelaxedLineRasterization.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RELAXED_LINE_RASTERIZATION_FEATURES_IMG); }
        /** Sets the specified value to the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#pNext} field. */
        public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG#relaxedLineRasterization} field. */
        public VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.Buffer relaxedLineRasterization(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceRelaxedLineRasterizationFeaturesIMG.nrelaxedLineRasterization(address(), value ? 1 : 0); return this; }

    }

}