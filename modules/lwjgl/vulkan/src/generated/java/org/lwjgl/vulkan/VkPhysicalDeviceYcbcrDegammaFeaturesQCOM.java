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
 * Structure describing Y′C<sub>B</sub>C<sub>R</sub> degamma features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceFeatures2} structure passed to {@link VK11#vkGetPhysicalDeviceFeatures2 GetPhysicalDeviceFeatures2}, it is filled in to indicate whether each corresponding feature is supported. {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} <b>can</b> also be used in the {@code pNext} chain of {@link VkDeviceCreateInfo} to selectively enable these features.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceYcbcrDegammaFeaturesQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #ycbcrDegamma};
 * }</code></pre>
 */
public class VkPhysicalDeviceYcbcrDegammaFeaturesQCOM extends Struct<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        YCBCRDEGAMMA;

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
        YCBCRDEGAMMA = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(ByteBuffer container) {
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
    /** indicates whether the implementation supports <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-ycbcr-degamma">Y′C<sub>B</sub>C<sub>R</sub> degamma</a>. */
    @NativeType("VkBool32")
    public boolean ycbcrDegamma() { return nycbcrDegamma(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM} value to the {@link #sType} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #ycbcrDegamma} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ycbcrDegamma(@NativeType("VkBool32") boolean value) { nycbcrDegamma(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(
        int sType,
        long pNext,
        boolean ycbcrDegamma
    ) {
        sType(sType);
        pNext(pNext);
        ycbcrDegamma(ycbcrDegamma);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #ycbcrDegamma}. */
    public static int nycbcrDegamma(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.YCBCRDEGAMMA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #ycbcrDegamma(boolean) ycbcrDegamma}. */
    public static void nycbcrDegamma(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.YCBCRDEGAMMA, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#ycbcrDegamma} field. */
        @NativeType("VkBool32")
        public boolean ycbcrDegamma() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM} value to the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#sType} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM); }
        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#pNext} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#ycbcrDegamma} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer ycbcrDegamma(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address(), value ? 1 : 0); return this; }

    }

}