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
 * Structure specifying Y′C<sub>B</sub>C<sub>R</sub> degamma parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #enableYDegamma};
 *     VkBool32 {@link #enableCbCrDegamma};
 * }</code></pre>
 */
public class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM extends Struct<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        ENABLEYDEGAMMA,
        ENABLECBCRDEGAMMA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENABLEYDEGAMMA = layout.offsetof(2);
        ENABLECBCRDEGAMMA = layout.offsetof(3);
    }

    protected VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(ByteBuffer container) {
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
    /** indicates <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-ycbcr-degamma">sRGB to linear</a> conversion is enabled for the G component. */
    @NativeType("VkBool32")
    public boolean enableYDegamma() { return nenableYDegamma(address()) != 0; }
    /** indicates <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#textures-ycbcr-degamma">sRGB to linear</a> conversion is enabled for the R and B components. */
    @NativeType("VkBool32")
    public boolean enableCbCrDegamma() { return nenableCbCrDegamma(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM} value to the {@link #sType} field. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #enableYDegamma} field. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableYDegamma(@NativeType("VkBool32") boolean value) { nenableYDegamma(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #enableCbCrDegamma} field. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM enableCbCrDegamma(@NativeType("VkBool32") boolean value) { nenableCbCrDegamma(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(
        int sType,
        long pNext,
        boolean enableYDegamma,
        boolean enableCbCrDegamma
    ) {
        sType(sType);
        pNext(pNext);
        enableYDegamma(enableYDegamma);
        enableCbCrDegamma(enableCbCrDegamma);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM set(VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM malloc() {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM calloc() {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create(long address) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #enableYDegamma}. */
    public static int nenableYDegamma(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.ENABLEYDEGAMMA); }
    /** Unsafe version of {@link #enableCbCrDegamma}. */
    public static int nenableCbCrDegamma(long struct) { return UNSAFE.getInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.ENABLECBCRDEGAMMA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #enableYDegamma(boolean) enableYDegamma}. */
    public static void nenableYDegamma(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.ENABLEYDEGAMMA, value); }
    /** Unsafe version of {@link #enableCbCrDegamma(boolean) enableCbCrDegamma}. */
    public static void nenableCbCrDegamma(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.ENABLECBCRDEGAMMA, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM, Buffer> implements NativeResource {

        private static final VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM ELEMENT_FACTORY = VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#enableYDegamma} field. */
        @NativeType("VkBool32")
        public boolean enableYDegamma() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableYDegamma(address()) != 0; }
        /** @return the value of the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#enableCbCrDegamma} field. */
        @NativeType("VkBool32")
        public boolean enableCbCrDegamma() { return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableCbCrDegamma(address()) != 0; }

        /** Sets the specified value to the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#sType} field. */
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM} value to the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#sType} field. */
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM); }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#pNext} field. */
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer pNext(@NativeType("void *") long value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#enableYDegamma} field. */
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer enableYDegamma(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableYDegamma(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM#enableCbCrDegamma} field. */
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.Buffer enableCbCrDegamma(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.nenableCbCrDegamma(address(), value ? 1 : 0); return this; }

    }

}