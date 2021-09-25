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
 * Structure specifying a supported sample count combination.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link NVCoverageReductionMode#vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV GetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkFramebufferMixedSamplesCombinationNV {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkCoverageReductionModeNV {@link #coverageReductionMode};
 *     VkSampleCountFlagBits {@link #rasterizationSamples};
 *     VkSampleCountFlags {@link #depthStencilSamples};
 *     VkSampleCountFlags {@link #colorSamples};
 * }</code></pre>
 */
public class VkFramebufferMixedSamplesCombinationNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COVERAGEREDUCTIONMODE,
        RASTERIZATIONSAMPLES,
        DEPTHSTENCILSAMPLES,
        COLORSAMPLES;

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
        COVERAGEREDUCTIONMODE = layout.offsetof(2);
        RASTERIZATIONSAMPLES = layout.offsetof(3);
        DEPTHSTENCILSAMPLES = layout.offsetof(4);
        COLORSAMPLES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkFramebufferMixedSamplesCombinationNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkFramebufferMixedSamplesCombinationNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkCoverageReductionModeNV} value specifying the coverage reduction mode. */
    @NativeType("VkCoverageReductionModeNV")
    public int coverageReductionMode() { return ncoverageReductionMode(address()); }
    /** a {@code VkSampleCountFlagBits} specifying the number of rasterization samples in the supported combination. */
    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() { return nrasterizationSamples(address()); }
    /** specifies the number of samples in the depth stencil attachment in the supported combination. A value of 0 indicates the combination does not have a depth stencil attachment. */
    @NativeType("VkSampleCountFlags")
    public int depthStencilSamples() { return ndepthStencilSamples(address()); }
    /** specifies the number of color samples in a color attachment in the supported combination. A value of 0 indicates the combination does not have a color attachment. */
    @NativeType("VkSampleCountFlags")
    public int colorSamples() { return ncolorSamples(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkFramebufferMixedSamplesCombinationNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV} value to the {@link #sType} field. */
    public VkFramebufferMixedSamplesCombinationNV sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkFramebufferMixedSamplesCombinationNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkFramebufferMixedSamplesCombinationNV set(
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
    public VkFramebufferMixedSamplesCombinationNV set(VkFramebufferMixedSamplesCombinationNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkFramebufferMixedSamplesCombinationNV malloc() {
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkFramebufferMixedSamplesCombinationNV calloc() {
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance allocated with {@link BufferUtils}. */
    public static VkFramebufferMixedSamplesCombinationNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance for the specified memory address. */
    public static VkFramebufferMixedSamplesCombinationNV create(long address) {
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferMixedSamplesCombinationNV createSafe(long address) {
        return address == NULL ? null : wrap(VkFramebufferMixedSamplesCombinationNV.class, address);
    }

    /**
     * Returns a new {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkFramebufferMixedSamplesCombinationNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkFramebufferMixedSamplesCombinationNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferMixedSamplesCombinationNV malloc(MemoryStack stack) {
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkFramebufferMixedSamplesCombinationNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkFramebufferMixedSamplesCombinationNV calloc(MemoryStack stack) {
        return wrap(VkFramebufferMixedSamplesCombinationNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkFramebufferMixedSamplesCombinationNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkFramebufferMixedSamplesCombinationNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferMixedSamplesCombinationNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkFramebufferMixedSamplesCombinationNV.PNEXT); }
    /** Unsafe version of {@link #coverageReductionMode}. */
    public static int ncoverageReductionMode(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferMixedSamplesCombinationNV.COVERAGEREDUCTIONMODE); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferMixedSamplesCombinationNV.RASTERIZATIONSAMPLES); }
    /** Unsafe version of {@link #depthStencilSamples}. */
    public static int ndepthStencilSamples(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferMixedSamplesCombinationNV.DEPTHSTENCILSAMPLES); }
    /** Unsafe version of {@link #colorSamples}. */
    public static int ncolorSamples(long struct) { return UNSAFE.getInt(null, struct + VkFramebufferMixedSamplesCombinationNV.COLORSAMPLES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkFramebufferMixedSamplesCombinationNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkFramebufferMixedSamplesCombinationNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkFramebufferMixedSamplesCombinationNV} structs. */
    public static class Buffer extends StructBuffer<VkFramebufferMixedSamplesCombinationNV, Buffer> implements NativeResource {

        private static final VkFramebufferMixedSamplesCombinationNV ELEMENT_FACTORY = VkFramebufferMixedSamplesCombinationNV.create(-1L);

        /**
         * Creates a new {@code VkFramebufferMixedSamplesCombinationNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkFramebufferMixedSamplesCombinationNV#SIZEOF}, and its mark will be undefined.
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
        protected VkFramebufferMixedSamplesCombinationNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkFramebufferMixedSamplesCombinationNV.nsType(address()); }
        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkFramebufferMixedSamplesCombinationNV.npNext(address()); }
        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#coverageReductionMode} field. */
        @NativeType("VkCoverageReductionModeNV")
        public int coverageReductionMode() { return VkFramebufferMixedSamplesCombinationNV.ncoverageReductionMode(address()); }
        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkFramebufferMixedSamplesCombinationNV.nrasterizationSamples(address()); }
        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#depthStencilSamples} field. */
        @NativeType("VkSampleCountFlags")
        public int depthStencilSamples() { return VkFramebufferMixedSamplesCombinationNV.ndepthStencilSamples(address()); }
        /** @return the value of the {@link VkFramebufferMixedSamplesCombinationNV#colorSamples} field. */
        @NativeType("VkSampleCountFlags")
        public int colorSamples() { return VkFramebufferMixedSamplesCombinationNV.ncolorSamples(address()); }

        /** Sets the specified value to the {@link VkFramebufferMixedSamplesCombinationNV#sType} field. */
        public VkFramebufferMixedSamplesCombinationNV.Buffer sType(@NativeType("VkStructureType") int value) { VkFramebufferMixedSamplesCombinationNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV} value to the {@link VkFramebufferMixedSamplesCombinationNV#sType} field. */
        public VkFramebufferMixedSamplesCombinationNV.Buffer sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV); }
        /** Sets the specified value to the {@link VkFramebufferMixedSamplesCombinationNV#pNext} field. */
        public VkFramebufferMixedSamplesCombinationNV.Buffer pNext(@NativeType("void *") long value) { VkFramebufferMixedSamplesCombinationNV.npNext(address(), value); return this; }

    }

}