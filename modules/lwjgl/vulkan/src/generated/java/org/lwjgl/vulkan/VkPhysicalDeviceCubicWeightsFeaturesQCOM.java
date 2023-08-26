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
 * Structure describing cubic weight selection features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceCubicWeightsFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 {@link #selectableCubicWeights};
 * }</code></pre>
 */
public class VkPhysicalDeviceCubicWeightsFeaturesQCOM extends Struct<VkPhysicalDeviceCubicWeightsFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SELECTABLECUBICWEIGHTS;

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
        SELECTABLECUBICWEIGHTS = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCubicWeightsFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCubicWeightsFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM(ByteBuffer container) {
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
    /** indicates that the implementation supports the selection of filter cubic weights. */
    @NativeType("VkBool32")
    public boolean selectableCubicWeights() { return nselectableCubicWeights(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM sType$Default() { return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #selectableCubicWeights} field. */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM selectableCubicWeights(@NativeType("VkBool32") boolean value) { nselectableCubicWeights(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(
        int sType,
        long pNext,
        boolean selectableCubicWeights
    ) {
        sType(sType);
        pNext(pNext);
        selectableCubicWeights(selectableCubicWeights);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCubicWeightsFeaturesQCOM set(VkPhysicalDeviceCubicWeightsFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM malloc() {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM calloc() {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCubicWeightsFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicWeightsFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #selectableCubicWeights}. */
    public static int nselectableCubicWeights(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.SELECTABLECUBICWEIGHTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #selectableCubicWeights(boolean) selectableCubicWeights}. */
    public static void nselectableCubicWeights(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceCubicWeightsFeaturesQCOM.SELECTABLECUBICWEIGHTS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCubicWeightsFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCubicWeightsFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceCubicWeightsFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCubicWeightsFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCubicWeightsFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCubicWeightsFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM#selectableCubicWeights} field. */
        @NativeType("VkBool32")
        public boolean selectableCubicWeights() { return VkPhysicalDeviceCubicWeightsFeaturesQCOM.nselectableCubicWeights(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCubicWeightsFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer sType$Default() { return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_WEIGHTS_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCubicWeightsFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceCubicWeightsFeaturesQCOM#selectableCubicWeights} field. */
        public VkPhysicalDeviceCubicWeightsFeaturesQCOM.Buffer selectableCubicWeights(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCubicWeightsFeaturesQCOM.nselectableCubicWeights(address(), value ? 1 : 0); return this; }

    }

}