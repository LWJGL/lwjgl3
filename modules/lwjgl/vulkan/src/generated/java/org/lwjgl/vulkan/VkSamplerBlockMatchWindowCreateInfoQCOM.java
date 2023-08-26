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
 * Structure specifying the block match window parameters.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code WindowExtent} <b>must</b> not be larger than {@link VkPhysicalDeviceImageProcessing2PropertiesQCOM}{@code ::maxBlockMatchWindow}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM}</li>
 * <li>{@code windowCompareMode} <b>must</b> be a valid {@code VkBlockMatchWindowCompareModeQCOM} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkExtent2D}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerBlockMatchWindowCreateInfoQCOM {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     {@link VkExtent2D VkExtent2D} {@link #windowExtent};
 *     VkBlockMatchWindowCompareModeQCOM {@link #windowCompareMode};
 * }</code></pre>
 */
public class VkSamplerBlockMatchWindowCreateInfoQCOM extends Struct<VkSamplerBlockMatchWindowCreateInfoQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        WINDOWEXTENT,
        WINDOWCOMPAREMODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        WINDOWEXTENT = layout.offsetof(2);
        WINDOWCOMPAREMODE = layout.offsetof(3);
    }

    protected VkSamplerBlockMatchWindowCreateInfoQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkSamplerBlockMatchWindowCreateInfoQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(address, container);
    }

    /**
     * Creates a {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerBlockMatchWindowCreateInfoQCOM(ByteBuffer container) {
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
    /** a {@link VkExtent2D} specifying a the width and height of the block match window. */
    public VkExtent2D windowExtent() { return nwindowExtent(address()); }
    /** a {@code VkBlockMatchWindowCompareModeQCOM} specifying the compare mode. */
    @NativeType("VkBlockMatchWindowCompareModeQCOM")
    public int windowCompareMode() { return nwindowCompareMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM} value to the {@link #sType} field. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@link #windowExtent} field. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(VkExtent2D value) { nwindowExtent(address(), value); return this; }
    /** Passes the {@link #windowExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(windowExtent()); return this; }
    /** Sets the specified value to the {@link #windowCompareMode} field. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM windowCompareMode(@NativeType("VkBlockMatchWindowCompareModeQCOM") int value) { nwindowCompareMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerBlockMatchWindowCreateInfoQCOM set(
        int sType,
        long pNext,
        VkExtent2D windowExtent,
        int windowCompareMode
    ) {
        sType(sType);
        pNext(pNext);
        windowExtent(windowExtent);
        windowCompareMode(windowCompareMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerBlockMatchWindowCreateInfoQCOM set(VkSamplerBlockMatchWindowCreateInfoQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM malloc() {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM calloc() {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance allocated with {@link BufferUtils}. */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance for the specified memory address. */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM create(long address) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerBlockMatchWindowCreateInfoQCOM createSafe(long address) {
        return address == NULL ? null : new VkSamplerBlockMatchWindowCreateInfoQCOM(address, null);
    }

    /**
     * Returns a new {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM malloc(MemoryStack stack) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM calloc(MemoryStack stack) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerBlockMatchWindowCreateInfoQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerBlockMatchWindowCreateInfoQCOM.PNEXT); }
    /** Unsafe version of {@link #windowExtent}. */
    public static VkExtent2D nwindowExtent(long struct) { return VkExtent2D.create(struct + VkSamplerBlockMatchWindowCreateInfoQCOM.WINDOWEXTENT); }
    /** Unsafe version of {@link #windowCompareMode}. */
    public static int nwindowCompareMode(long struct) { return UNSAFE.getInt(null, struct + VkSamplerBlockMatchWindowCreateInfoQCOM.WINDOWCOMPAREMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerBlockMatchWindowCreateInfoQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerBlockMatchWindowCreateInfoQCOM.PNEXT, value); }
    /** Unsafe version of {@link #windowExtent(VkExtent2D) windowExtent}. */
    public static void nwindowExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSamplerBlockMatchWindowCreateInfoQCOM.WINDOWEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #windowCompareMode(int) windowCompareMode}. */
    public static void nwindowCompareMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerBlockMatchWindowCreateInfoQCOM.WINDOWCOMPAREMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerBlockMatchWindowCreateInfoQCOM} structs. */
    public static class Buffer extends StructBuffer<VkSamplerBlockMatchWindowCreateInfoQCOM, Buffer> implements NativeResource {

        private static final VkSamplerBlockMatchWindowCreateInfoQCOM ELEMENT_FACTORY = VkSamplerBlockMatchWindowCreateInfoQCOM.create(-1L);

        /**
         * Creates a new {@code VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerBlockMatchWindowCreateInfoQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkSamplerBlockMatchWindowCreateInfoQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerBlockMatchWindowCreateInfoQCOM.nsType(address()); }
        /** @return the value of the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerBlockMatchWindowCreateInfoQCOM.npNext(address()); }
        /** @return a {@link VkExtent2D} view of the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#windowExtent} field. */
        public VkExtent2D windowExtent() { return VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowExtent(address()); }
        /** @return the value of the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#windowCompareMode} field. */
        @NativeType("VkBlockMatchWindowCompareModeQCOM")
        public int windowCompareMode() { return VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowCompareMode(address()); }

        /** Sets the specified value to the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#sType} field. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMImageProcessing2#VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM} value to the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#sType} field. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer sType$Default() { return sType(QCOMImageProcessing2.VK_STRUCTURE_TYPE_SAMPLER_BLOCK_MATCH_WINDOW_CREATE_INFO_QCOM); }
        /** Sets the specified value to the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#pNext} field. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer pNext(@NativeType("void const *") long value) { VkSamplerBlockMatchWindowCreateInfoQCOM.npNext(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#windowExtent} field. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer windowExtent(VkExtent2D value) { VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowExtent(address(), value); return this; }
        /** Passes the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#windowExtent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer windowExtent(java.util.function.Consumer<VkExtent2D> consumer) { consumer.accept(windowExtent()); return this; }
        /** Sets the specified value to the {@link VkSamplerBlockMatchWindowCreateInfoQCOM#windowCompareMode} field. */
        public VkSamplerBlockMatchWindowCreateInfoQCOM.Buffer windowCompareMode(@NativeType("VkBlockMatchWindowCompareModeQCOM") int value) { VkSamplerBlockMatchWindowCreateInfoQCOM.nwindowCompareMode(address(), value); return this; }

    }

}