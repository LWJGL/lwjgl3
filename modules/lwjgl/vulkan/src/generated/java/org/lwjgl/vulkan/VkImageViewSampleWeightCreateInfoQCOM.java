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
 * Structure describing weight sampling parameters for image view.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code filterCenter} specifies the origin or center of the filter kernel, as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-weightimage-filteroperation">Weight Sampling Operation</a>. The {@code numPhases} describes the number of sub-pixel filter phases as described in <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-weightimage-filterphases">Weight Sampling Phases</a>.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code filterSize.width} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-weightfilter-maxdimension">{@link VkPhysicalDeviceImageProcessingPropertiesQCOM}{@code ::maxWeightFilterDimension.width}</a></li>
 * <li>{@code filterSize.height} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-weightfilter-maxdimension">{@link VkPhysicalDeviceImageProcessingPropertiesQCOM}{@code ::maxWeightFilterDimension.height}</a></li>
 * <li>{@code filterCenter.x} <b>must</b> be less than or equal to <code>(filterSize.width - 1)</code></li>
 * <li>{@code filterCenter.y} <b>must</b> be less than or equal to <code>(filterSize.height - 1)</code></li>
 * <li>{@code numPhases} <b>must</b> be a power of two squared value (i.e., 1, 4, 16, 64, 256, etc.)</li>
 * <li>{@code numPhases} <b>must</b> be less than or equal to <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-weightfilter-phases">{@link VkPhysicalDeviceImageProcessingPropertiesQCOM}{@code ::maxWeightFilterPhases}</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}, {@link VkOffset2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkImageViewSampleWeightCreateInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkOffset2D VkOffset2D} {@link #filterCenter};
 *     {@link VkExtent2D VkExtent2D} {@link #filterSize};
 *     uint32_t {@link #numPhases};
 * }</code></pre>
 */
public class VkImageViewSampleWeightCreateInfoQCOM extends Struct<VkImageViewSampleWeightCreateInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FILTERCENTER,
        FILTERSIZE,
        NUMPHASES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FILTERCENTER = layout.offsetof(2);
        FILTERSIZE = layout.offsetof(3);
        NUMPHASES = layout.offsetof(4);
    }

    protected VkImageViewSampleWeightCreateInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewSampleWeightCreateInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewSampleWeightCreateInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkImageViewSampleWeightCreateInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewSampleWeightCreateInfoQCOM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkStructureType} value identifying this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@link VkOffset2D} describing the location of the weight filter origin. */
    public VkOffset2D filterCenter() { return nfilterCenter(address()); }
    /** a {@link VkExtent2D} specifying weight filter dimensions. */
    public VkExtent2D filterSize() { return nfilterSize(address()); }
    /** number of sub-pixel filter phases. */
    @NativeType("uint32_t")
    public int numPhases() { return nnumPhases(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkImageViewSampleWeightCreateInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM} value to the {@link #sType} field. */
    public VkImageViewSampleWeightCreateInfoQCOM sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkImageViewSampleWeightCreateInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkOffset2D} to the {@link #filterCenter} field. */
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(VkOffset2D value) { nfilterCenter(address(), value); return this; }
    /** Passes the {@link #filterCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewSampleWeightCreateInfoQCOM filterCenter(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(filterCenter()); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #filterSize} field. */
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(VkExtent2D value) { nfilterSize(address(), value); return this; }
    /** Passes the {@link #filterSize} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageViewSampleWeightCreateInfoQCOM filterSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(filterSize()); return this; }
    /** Sets the specified value to the {@link #numPhases} field. */
    public VkImageViewSampleWeightCreateInfoQCOM numPhases(@NativeType("uint32_t") int value) { nnumPhases(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewSampleWeightCreateInfoQCOM set(
        int sType,
        long pNext,
        VkOffset2D filterCenter,
        VkExtent2D filterSize,
        int numPhases
    ) {
        sType(sType);
        pNext(pNext);
        filterCenter(filterCenter);
        filterSize(filterSize);
        numPhases(numPhases);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageViewSampleWeightCreateInfoQCOM set(VkImageViewSampleWeightCreateInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewSampleWeightCreateInfoQCOM malloc() {
        return new VkImageViewSampleWeightCreateInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewSampleWeightCreateInfoQCOM calloc() {
        return new VkImageViewSampleWeightCreateInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkImageViewSampleWeightCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewSampleWeightCreateInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance for the specified memory address. */
    public static VkImageViewSampleWeightCreateInfoQCOM create(long address) {
        return new VkImageViewSampleWeightCreateInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewSampleWeightCreateInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkImageViewSampleWeightCreateInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewSampleWeightCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkImageViewSampleWeightCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewSampleWeightCreateInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewSampleWeightCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkImageViewSampleWeightCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewSampleWeightCreateInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkImageViewSampleWeightCreateInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewSampleWeightCreateInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #filterCenter}. */
    public static VkOffset2D nfilterCenter(long struct) { return VkOffset2D.create(struct + VkImageViewSampleWeightCreateInfoQCOM.FILTERCENTER); }
    /** Unsafe version of {@link #filterSize}. */
    public static VkExtent2D nfilterSize(long struct) { return VkExtent2D.create(struct + VkImageViewSampleWeightCreateInfoQCOM.FILTERSIZE); }
    /** Unsafe version of {@link #numPhases}. */
    public static int nnumPhases(long struct) { return UNSAFE.getInt(null, struct + VkImageViewSampleWeightCreateInfoQCOM.NUMPHASES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewSampleWeightCreateInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewSampleWeightCreateInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #filterCenter(VkOffset2D) filterCenter}. */
    public static void nfilterCenter(long struct, VkOffset2D value) { memCopy(value.address(), struct + VkImageViewSampleWeightCreateInfoQCOM.FILTERCENTER, VkOffset2D.SIZEOF); }
    /** Unsafe version of {@link #filterSize(VkExtent2D) filterSize}. */
    public static void nfilterSize(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkImageViewSampleWeightCreateInfoQCOM.FILTERSIZE, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #numPhases(int) numPhases}. */
    public static void nnumPhases(long struct, int value) { UNSAFE.putInt(null, struct + VkImageViewSampleWeightCreateInfoQCOM.NUMPHASES, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewSampleWeightCreateInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkImageViewSampleWeightCreateInfoQCOM, Buffer> implements NativeResource {

        private static final VkImageViewSampleWeightCreateInfoQCOM ELEMENT_FACTORY = VkImageViewSampleWeightCreateInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkImageViewSampleWeightCreateInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewSampleWeightCreateInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewSampleWeightCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkImageViewSampleWeightCreateInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewSampleWeightCreateInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkImageViewSampleWeightCreateInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageViewSampleWeightCreateInfoQCOM.npNext(address()); }
        /** @return a {@link VkOffset2D} view of the {@link VkImageViewSampleWeightCreateInfoQCOM#filterCenter} field. */
        public VkOffset2D filterCenter() { return VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkImageViewSampleWeightCreateInfoQCOM#filterSize} field. */
        public VkExtent2D filterSize() { return VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(address()); }
        /** @return the value of the {@link VkImageViewSampleWeightCreateInfoQCOM#numPhases} field. */
        @NativeType("uint32_t")
        public int numPhases() { return VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(address()); }

        /** Sets the specified value to the {@link VkImageViewSampleWeightCreateInfoQCOM#sType} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewSampleWeightCreateInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing#VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM} value to the {@link VkImageViewSampleWeightCreateInfoQCOM#sType} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing.VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM); }
        /** Sets the specified value to the {@link VkImageViewSampleWeightCreateInfoQCOM#pNext} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkImageViewSampleWeightCreateInfoQCOM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkOffset2D} to the {@link VkImageViewSampleWeightCreateInfoQCOM#filterCenter} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer filterCenter(VkOffset2D value) { VkImageViewSampleWeightCreateInfoQCOM.nfilterCenter(address(), value); return this; }
        /** Passes the {@link VkImageViewSampleWeightCreateInfoQCOM#filterCenter} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer filterCenter(java.util.function.Consumer<VkOffset2D> consumer) { consumer.accept(filterCenter()); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkImageViewSampleWeightCreateInfoQCOM#filterSize} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer filterSize(VkExtent2D value) { VkImageViewSampleWeightCreateInfoQCOM.nfilterSize(address(), value); return this; }
        /** Passes the {@link VkImageViewSampleWeightCreateInfoQCOM#filterSize} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer filterSize(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(filterSize()); return this; }
        /** Sets the specified value to the {@link VkImageViewSampleWeightCreateInfoQCOM#numPhases} field. */
        public VkImageViewSampleWeightCreateInfoQCOM.Buffer numPhases(@NativeType("uint32_t") int value) { VkImageViewSampleWeightCreateInfoQCOM.nnumPhases(address(), value); return this; }

    }

}