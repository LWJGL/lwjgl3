/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure describing the optical flow features supported by the implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceOpticalFlowFeaturesNV} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceOpticalFlowFeaturesNV} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceOpticalFlowFeaturesNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #opticalFlow};
 * }</code></pre>
 */
public class VkPhysicalDeviceOpticalFlowFeaturesNV extends Struct<VkPhysicalDeviceOpticalFlowFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPTICALFLOW;

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
        OPTICALFLOW = layout.offsetof(2);
    }

    protected VkPhysicalDeviceOpticalFlowFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceOpticalFlowFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceOpticalFlowFeaturesNV(ByteBuffer container) {
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
    /** indicates whether the implementation supports optical flow. */
    @NativeType("VkBool32")
    public boolean opticalFlow() { return nopticalFlow(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceOpticalFlowFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV} value to the {@link #sType} field. */
    public VkPhysicalDeviceOpticalFlowFeaturesNV sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceOpticalFlowFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #opticalFlow} field. */
    public VkPhysicalDeviceOpticalFlowFeaturesNV opticalFlow(@NativeType("VkBool32") boolean value) { nopticalFlow(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceOpticalFlowFeaturesNV set(
        int sType,
        long pNext,
        boolean opticalFlow
    ) {
        sType(sType);
        pNext(pNext);
        opticalFlow(opticalFlow);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceOpticalFlowFeaturesNV set(VkPhysicalDeviceOpticalFlowFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV malloc() {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV calloc() {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV create(long address) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpticalFlowFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceOpticalFlowFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpticalFlowFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceOpticalFlowFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #opticalFlow}. */
    public static int nopticalFlow(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceOpticalFlowFeaturesNV.OPTICALFLOW); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpticalFlowFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceOpticalFlowFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #opticalFlow(boolean) opticalFlow}. */
    public static void nopticalFlow(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceOpticalFlowFeaturesNV.OPTICALFLOW, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceOpticalFlowFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpticalFlowFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceOpticalFlowFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceOpticalFlowFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceOpticalFlowFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceOpticalFlowFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceOpticalFlowFeaturesNV.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceOpticalFlowFeaturesNV.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#opticalFlow} field. */
        @NativeType("VkBool32")
        public boolean opticalFlow() { return VkPhysicalDeviceOpticalFlowFeaturesNV.nopticalFlow(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#sType} field. */
        public VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceOpticalFlowFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVOpticalFlow#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV} value to the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#sType} field. */
        public VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer sType$Default() { return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_FEATURES_NV); }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#pNext} field. */
        public VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceOpticalFlowFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceOpticalFlowFeaturesNV#opticalFlow} field. */
        public VkPhysicalDeviceOpticalFlowFeaturesNV.Buffer opticalFlow(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceOpticalFlowFeaturesNV.nopticalFlow(address(), value ? 1 : 0); return this; }

    }

}