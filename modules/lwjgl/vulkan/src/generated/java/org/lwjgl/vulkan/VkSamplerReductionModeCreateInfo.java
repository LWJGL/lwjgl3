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
 * Structure specifying sampler reduction mode.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@code pNext} chain of {@link VkSamplerCreateInfo} includes a {@link VkSamplerReductionModeCreateInfo} structure, then that structure includes a mode controlling how texture filtering combines texel values.</p>
 * 
 * <p>If this structure is not present, {@code reductionMode} is considered to be {@link VK12#VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK12#VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO}</li>
 * <li>{@code reductionMode} <b>must</b> be a valid {@code VkSamplerReductionMode} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkSamplerReductionModeCreateInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkSamplerReductionMode {@link #reductionMode};
 * }</code></pre>
 */
public class VkSamplerReductionModeCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        REDUCTIONMODE;

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
        REDUCTIONMODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkSamplerReductionModeCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerReductionModeCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** a {@code VkSamplerReductionMode} value controlling how texture filtering combines texel values. */
    @NativeType("VkSamplerReductionMode")
    public int reductionMode() { return nreductionMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkSamplerReductionModeCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO} value to the {@link #sType} field. */
    public VkSamplerReductionModeCreateInfo sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkSamplerReductionModeCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #reductionMode} field. */
    public VkSamplerReductionModeCreateInfo reductionMode(@NativeType("VkSamplerReductionMode") int value) { nreductionMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerReductionModeCreateInfo set(
        int sType,
        long pNext,
        int reductionMode
    ) {
        sType(sType);
        pNext(pNext);
        reductionMode(reductionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerReductionModeCreateInfo set(VkSamplerReductionModeCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfo malloc() {
        return wrap(VkSamplerReductionModeCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerReductionModeCreateInfo calloc() {
        return wrap(VkSamplerReductionModeCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkSamplerReductionModeCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkSamplerReductionModeCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkSamplerReductionModeCreateInfo} instance for the specified memory address. */
    public static VkSamplerReductionModeCreateInfo create(long address) {
        return wrap(VkSamplerReductionModeCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerReductionModeCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkSamplerReductionModeCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkSamplerReductionModeCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerReductionModeCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfo malloc(MemoryStack stack) {
        return wrap(VkSamplerReductionModeCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkSamplerReductionModeCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerReductionModeCreateInfo calloc(MemoryStack stack) {
        return wrap(VkSamplerReductionModeCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerReductionModeCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerReductionModeCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkSamplerReductionModeCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerReductionModeCreateInfo.PNEXT); }
    /** Unsafe version of {@link #reductionMode}. */
    public static int nreductionMode(long struct) { return UNSAFE.getInt(null, struct + VkSamplerReductionModeCreateInfo.REDUCTIONMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerReductionModeCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerReductionModeCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #reductionMode(int) reductionMode}. */
    public static void nreductionMode(long struct, int value) { UNSAFE.putInt(null, struct + VkSamplerReductionModeCreateInfo.REDUCTIONMODE, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerReductionModeCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkSamplerReductionModeCreateInfo, Buffer> implements NativeResource {

        private static final VkSamplerReductionModeCreateInfo ELEMENT_FACTORY = VkSamplerReductionModeCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkSamplerReductionModeCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerReductionModeCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerReductionModeCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkSamplerReductionModeCreateInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerReductionModeCreateInfo.nsType(address()); }
        /** @return the value of the {@link VkSamplerReductionModeCreateInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkSamplerReductionModeCreateInfo.npNext(address()); }
        /** @return the value of the {@link VkSamplerReductionModeCreateInfo#reductionMode} field. */
        @NativeType("VkSamplerReductionMode")
        public int reductionMode() { return VkSamplerReductionModeCreateInfo.nreductionMode(address()); }

        /** Sets the specified value to the {@link VkSamplerReductionModeCreateInfo#sType} field. */
        public VkSamplerReductionModeCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerReductionModeCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO} value to the {@link VkSamplerReductionModeCreateInfo#sType} field. */
        public VkSamplerReductionModeCreateInfo.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_SAMPLER_REDUCTION_MODE_CREATE_INFO); }
        /** Sets the specified value to the {@link VkSamplerReductionModeCreateInfo#pNext} field. */
        public VkSamplerReductionModeCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkSamplerReductionModeCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkSamplerReductionModeCreateInfo#reductionMode} field. */
        public VkSamplerReductionModeCreateInfo.Buffer reductionMode(@NativeType("VkSamplerReductionMode") int value) { VkSamplerReductionModeCreateInfo.nreductionMode(address(), value); return this; }

    }

}