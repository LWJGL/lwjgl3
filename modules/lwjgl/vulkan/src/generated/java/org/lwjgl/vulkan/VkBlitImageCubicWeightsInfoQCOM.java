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
 * Structure specifying image blit cubic weight info.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM}</li>
 * <li>{@code cubicWeights} <b>must</b> be a valid {@code VkCubicFilterWeightsQCOM} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBlitImageCubicWeightsInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkCubicFilterWeightsQCOM {@link #cubicWeights};
 * }</code></pre>
 */
public class VkBlitImageCubicWeightsInfoQCOM extends Struct<VkBlitImageCubicWeightsInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUBICWEIGHTS;

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
        CUBICWEIGHTS = layout.offsetof(2);
    }

    protected VkBlitImageCubicWeightsInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkBlitImageCubicWeightsInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkBlitImageCubicWeightsInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkBlitImageCubicWeightsInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBlitImageCubicWeightsInfoQCOM(ByteBuffer container) {
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
    /** a {@code VkCubicFilterWeightsQCOM} value controlling cubic filter weights for the blit. */
    @NativeType("VkCubicFilterWeightsQCOM")
    public int cubicWeights() { return ncubicWeights(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBlitImageCubicWeightsInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM} value to the {@link #sType} field. */
    public VkBlitImageCubicWeightsInfoQCOM sType$Default() { return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBlitImageCubicWeightsInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #cubicWeights} field. */
    public VkBlitImageCubicWeightsInfoQCOM cubicWeights(@NativeType("VkCubicFilterWeightsQCOM") int value) { ncubicWeights(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBlitImageCubicWeightsInfoQCOM set(
        int sType,
        long pNext,
        int cubicWeights
    ) {
        sType(sType);
        pNext(pNext);
        cubicWeights(cubicWeights);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBlitImageCubicWeightsInfoQCOM set(VkBlitImageCubicWeightsInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBlitImageCubicWeightsInfoQCOM malloc() {
        return new VkBlitImageCubicWeightsInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBlitImageCubicWeightsInfoQCOM calloc() {
        return new VkBlitImageCubicWeightsInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkBlitImageCubicWeightsInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkBlitImageCubicWeightsInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance for the specified memory address. */
    public static VkBlitImageCubicWeightsInfoQCOM create(long address) {
        return new VkBlitImageCubicWeightsInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageCubicWeightsInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkBlitImageCubicWeightsInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageCubicWeightsInfoQCOM malloc(MemoryStack stack) {
        return new VkBlitImageCubicWeightsInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkBlitImageCubicWeightsInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBlitImageCubicWeightsInfoQCOM calloc(MemoryStack stack) {
        return new VkBlitImageCubicWeightsInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBlitImageCubicWeightsInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBlitImageCubicWeightsInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageCubicWeightsInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBlitImageCubicWeightsInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #cubicWeights}. */
    public static int ncubicWeights(long struct) { return UNSAFE.getInt(null, struct + VkBlitImageCubicWeightsInfoQCOM.CUBICWEIGHTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageCubicWeightsInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBlitImageCubicWeightsInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #cubicWeights(int) cubicWeights}. */
    public static void ncubicWeights(long struct, int value) { UNSAFE.putInt(null, struct + VkBlitImageCubicWeightsInfoQCOM.CUBICWEIGHTS, value); }

    // -----------------------------------

    /** An array of {@link VkBlitImageCubicWeightsInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkBlitImageCubicWeightsInfoQCOM, Buffer> implements NativeResource {

        private static final VkBlitImageCubicWeightsInfoQCOM ELEMENT_FACTORY = VkBlitImageCubicWeightsInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkBlitImageCubicWeightsInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBlitImageCubicWeightsInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkBlitImageCubicWeightsInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBlitImageCubicWeightsInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBlitImageCubicWeightsInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkBlitImageCubicWeightsInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBlitImageCubicWeightsInfoQCOM.npNext(address()); }
        /** @return the value of the {@link VkBlitImageCubicWeightsInfoQCOM#cubicWeights} field. */
        @NativeType("VkCubicFilterWeightsQCOM")
        public int cubicWeights() { return VkBlitImageCubicWeightsInfoQCOM.ncubicWeights(address()); }

        /** Sets the specified value to the {@link VkBlitImageCubicWeightsInfoQCOM#sType} field. */
        public VkBlitImageCubicWeightsInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkBlitImageCubicWeightsInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFilterCubicWeights#VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM} value to the {@link VkBlitImageCubicWeightsInfoQCOM#sType} field. */
        public VkBlitImageCubicWeightsInfoQCOM.Buffer sType$Default() { return sType(QCOMFilterCubicWeights.VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM); }
        /** Sets the specified value to the {@link VkBlitImageCubicWeightsInfoQCOM#pNext} field. */
        public VkBlitImageCubicWeightsInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkBlitImageCubicWeightsInfoQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkBlitImageCubicWeightsInfoQCOM#cubicWeights} field. */
        public VkBlitImageCubicWeightsInfoQCOM.Buffer cubicWeights(@NativeType("VkCubicFilterWeightsQCOM") int value) { VkBlitImageCubicWeightsInfoQCOM.ncubicWeights(address(), value); return this; }

    }

}