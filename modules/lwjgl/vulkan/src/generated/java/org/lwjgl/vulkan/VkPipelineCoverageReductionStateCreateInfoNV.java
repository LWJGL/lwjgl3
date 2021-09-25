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
 * Structure specifying parameters controlling coverage reduction.
 * 
 * <h5>Description</h5>
 * 
 * <p>If this structure is not included in the {@code pNext} chain, or if the extension is not enabled, the default coverage reduction mode is inferred as follows:</p>
 * 
 * <ul>
 * <li>If the {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} extension is enabled, then it is as if the {@code coverageReductionMode} is {@link NVCoverageReductionMode#VK_COVERAGE_REDUCTION_MODE_MERGE_NV COVERAGE_REDUCTION_MODE_MERGE_NV}.</li>
 * <li>If the {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} extension is enabled, then it is as if the {@code coverageReductionMode} is {@link NVCoverageReductionMode#VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV COVERAGE_REDUCTION_MODE_TRUNCATE_NV}.</li>
 * <li>If both {@link NVFramebufferMixedSamples VK_NV_framebuffer_mixed_samples} and {@link AMDMixedAttachmentSamples VK_AMD_mixed_attachment_samples} are enabled, then the default coverage reduction mode is implementation-dependent.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code coverageReductionMode} <b>must</b> be a valid {@code VkCoverageReductionModeNV} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCoverageReductionStateCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCoverageReductionStateCreateFlagsNV {@link #flags};
 *     VkCoverageReductionModeNV {@link #coverageReductionMode};
 * }</code></pre>
 */
public class VkPipelineCoverageReductionStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COVERAGEREDUCTIONMODE;

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
        FLAGS = layout.offsetof(2);
        COVERAGEREDUCTIONMODE = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPipelineCoverageReductionStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCoverageReductionStateCreateInfoNV(ByteBuffer container) {
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
    /** reserved for future use. */
    @NativeType("VkPipelineCoverageReductionStateCreateFlagsNV")
    public int flags() { return nflags(address()); }
    /** a {@code VkCoverageReductionModeNV} value controlling how color sample coverage is generated from pixel coverage. */
    @NativeType("VkCoverageReductionModeNV")
    public int coverageReductionMode() { return ncoverageReductionMode(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineCoverageReductionStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkPipelineCoverageReductionStateCreateInfoNV sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineCoverageReductionStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineCoverageReductionStateCreateInfoNV flags(@NativeType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #coverageReductionMode} field. */
    public VkPipelineCoverageReductionStateCreateInfoNV coverageReductionMode(@NativeType("VkCoverageReductionModeNV") int value) { ncoverageReductionMode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCoverageReductionStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        int coverageReductionMode
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageReductionMode(coverageReductionMode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCoverageReductionStateCreateInfoNV set(VkPipelineCoverageReductionStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageReductionStateCreateInfoNV malloc() {
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageReductionStateCreateInfoNV calloc() {
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCoverageReductionStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineCoverageReductionStateCreateInfoNV create(long address) {
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageReductionStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCoverageReductionStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkPipelineCoverageReductionStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageReductionStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCoverageReductionStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #coverageReductionMode}. */
    public static int ncoverageReductionMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.COVERAGEREDUCTIONMODE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCoverageReductionStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #coverageReductionMode(int) coverageReductionMode}. */
    public static void ncoverageReductionMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageReductionStateCreateInfoNV.COVERAGEREDUCTIONMODE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineCoverageReductionStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCoverageReductionStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineCoverageReductionStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageReductionStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineCoverageReductionStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCoverageReductionStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCoverageReductionStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCoverageReductionStateCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCoverageReductionStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkPipelineCoverageReductionStateCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCoverageReductionStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkPipelineCoverageReductionStateCreateInfoNV#flags} field. */
        @NativeType("VkPipelineCoverageReductionStateCreateFlagsNV")
        public int flags() { return VkPipelineCoverageReductionStateCreateInfoNV.nflags(address()); }
        /** @return the value of the {@link VkPipelineCoverageReductionStateCreateInfoNV#coverageReductionMode} field. */
        @NativeType("VkCoverageReductionModeNV")
        public int coverageReductionMode() { return VkPipelineCoverageReductionStateCreateInfoNV.ncoverageReductionMode(address()); }

        /** Sets the specified value to the {@link VkPipelineCoverageReductionStateCreateInfoNV#sType} field. */
        public VkPipelineCoverageReductionStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCoverageReductionStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCoverageReductionMode#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV} value to the {@link VkPipelineCoverageReductionStateCreateInfoNV#sType} field. */
        public VkPipelineCoverageReductionStateCreateInfoNV.Buffer sType$Default() { return sType(NVCoverageReductionMode.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkPipelineCoverageReductionStateCreateInfoNV#pNext} field. */
        public VkPipelineCoverageReductionStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCoverageReductionStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageReductionStateCreateInfoNV#flags} field. */
        public VkPipelineCoverageReductionStateCreateInfoNV.Buffer flags(@NativeType("VkPipelineCoverageReductionStateCreateFlagsNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageReductionStateCreateInfoNV#coverageReductionMode} field. */
        public VkPipelineCoverageReductionStateCreateInfoNV.Buffer coverageReductionMode(@NativeType("VkCoverageReductionModeNV") int value) { VkPipelineCoverageReductionStateCreateInfoNV.ncoverageReductionMode(address(), value); return this; }

    }

}