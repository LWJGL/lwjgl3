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
 * Structure specifying parameters controlling coverage modulation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code coverageModulationTableEnable} is {@link VK10#VK_FALSE FALSE}, then for each color sample the associated bits of the pixel coverage are counted and divided by the number of associated bits to produce a modulation factor <code>R</code> in the range <code>(0,1]</code> (a value of zero would have been killed due to a color coverage of 0). Specifically:</p>
 * 
 * <ul>
 * <li><code>N</code> = value of {@code rasterizationSamples}</li>
 * <li><code>M</code> = value of {@link VkAttachmentDescription}{@code ::samples} for any color attachments</li>
 * <li><code>R = popcount(associated coverage bits) / (N / M)</code></li>
 * </ul>
 * 
 * <p>If {@code coverageModulationTableEnable} is {@link VK10#VK_TRUE TRUE}, the value <code>R</code> is computed using a programmable lookup table. The lookup table has <code>N / M</code> elements, and the element of the table is selected by:</p>
 * 
 * <ul>
 * <li><code>R = pCoverageModulationTable[popcount(associated coverage bits)-1]</code></li>
 * </ul>
 * 
 * <p>Note that the table does not have an entry for <code>popcount(associated coverage bits) = 0</code>, because such samples would have been killed.</p>
 * 
 * <p>The values of {@code pCoverageModulationTable} <b>may</b> be rounded to an implementation-dependent precision, which is at least as fine as <code>1 / N</code>, and clamped to <code>[0,1]</code>.</p>
 * 
 * <p>For each color attachment with a floating point or normalized color format, each fragment output color value is replicated to <code>M</code> values which <b>can</b> each be modulated (multiplied) by that color sample’s associated value of <code>R</code>. Which components are modulated is controlled by {@code coverageModulationMode}.</p>
 * 
 * <p>If this structure is not included in the {@code pNext} chain, it is as if {@code coverageModulationMode} is {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}.</p>
 * 
 * <p>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fragops-coverage-reduction">coverage reduction mode</a> is {@link NVCoverageReductionMode#VK_COVERAGE_REDUCTION_MODE_TRUNCATE_NV COVERAGE_REDUCTION_MODE_TRUNCATE_NV}, each color sample is associated with only a single coverage sample. In this case, it is as if {@code coverageModulationMode} is {@link NVFramebufferMixedSamples#VK_COVERAGE_MODULATION_MODE_NONE_NV COVERAGE_MODULATION_MODE_NONE_NV}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code coverageModulationTableEnable} is {@link VK10#VK_TRUE TRUE}, {@code coverageModulationTableCount} <b>must</b> be equal to the number of rasterization samples divided by the number of color samples in the subpass</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVFramebufferMixedSamples#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code coverageModulationMode} <b>must</b> be a valid {@code VkCoverageModulationModeNV} value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineCoverageModulationStateCreateInfoNV {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkPipelineCoverageModulationStateCreateFlagsNV {@link #flags};
 *     VkCoverageModulationModeNV {@link #coverageModulationMode};
 *     VkBool32 {@link #coverageModulationTableEnable};
 *     uint32_t {@link #coverageModulationTableCount};
 *     float const * {@link #pCoverageModulationTable};
 * }</code></pre>
 */
public class VkPipelineCoverageModulationStateCreateInfoNV extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        COVERAGEMODULATIONMODE,
        COVERAGEMODULATIONTABLEENABLE,
        COVERAGEMODULATIONTABLECOUNT,
        PCOVERAGEMODULATIONTABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        COVERAGEMODULATIONMODE = layout.offsetof(3);
        COVERAGEMODULATIONTABLEENABLE = layout.offsetof(4);
        COVERAGEMODULATIONTABLECOUNT = layout.offsetof(5);
        PCOVERAGEMODULATIONTABLE = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkPipelineCoverageModulationStateCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineCoverageModulationStateCreateInfoNV(ByteBuffer container) {
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
    @NativeType("VkPipelineCoverageModulationStateCreateFlagsNV")
    public int flags() { return nflags(address()); }
    /** a {@code VkCoverageModulationModeNV} value controlling which color components are modulated. */
    @NativeType("VkCoverageModulationModeNV")
    public int coverageModulationMode() { return ncoverageModulationMode(address()); }
    /** controls whether the modulation factor is looked up from a table in {@code pCoverageModulationTable}. */
    @NativeType("VkBool32")
    public boolean coverageModulationTableEnable() { return ncoverageModulationTableEnable(address()) != 0; }
    /** the number of elements in {@code pCoverageModulationTable}. */
    @NativeType("uint32_t")
    public int coverageModulationTableCount() { return ncoverageModulationTableCount(address()); }
    /** a table of modulation factors containing a value for each number of covered samples. */
    @Nullable
    @NativeType("float const *")
    public FloatBuffer pCoverageModulationTable() { return npCoverageModulationTable(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVFramebufferMixedSamples#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV} value to the {@link #sType} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV sType$Default() { return sType(NVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV flags(@NativeType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #coverageModulationMode} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationMode(@NativeType("VkCoverageModulationModeNV") int value) { ncoverageModulationMode(address(), value); return this; }
    /** Sets the specified value to the {@link #coverageModulationTableEnable} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableEnable(@NativeType("VkBool32") boolean value) { ncoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #coverageModulationTableCount} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV coverageModulationTableCount(@NativeType("uint32_t") int value) { ncoverageModulationTableCount(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@link #pCoverageModulationTable} field. */
    public VkPipelineCoverageModulationStateCreateInfoNV pCoverageModulationTable(@Nullable @NativeType("float const *") FloatBuffer value) { npCoverageModulationTable(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineCoverageModulationStateCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        int coverageModulationMode,
        boolean coverageModulationTableEnable,
        int coverageModulationTableCount,
        @Nullable FloatBuffer pCoverageModulationTable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        coverageModulationMode(coverageModulationMode);
        coverageModulationTableEnable(coverageModulationTableEnable);
        coverageModulationTableCount(coverageModulationTableCount);
        pCoverageModulationTable(pCoverageModulationTable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineCoverageModulationStateCreateInfoNV set(VkPipelineCoverageModulationStateCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageModulationStateCreateInfoNV malloc() {
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineCoverageModulationStateCreateInfoNV calloc() {
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkPipelineCoverageModulationStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance for the specified memory address. */
    public static VkPipelineCoverageModulationStateCreateInfoNV create(long address) {
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageModulationStateCreateInfoNV createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, address);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV malloc(MemoryStack stack) {
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineCoverageModulationStateCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV calloc(MemoryStack stack) {
        return wrap(VkPipelineCoverageModulationStateCreateInfoNV.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineCoverageModulationStateCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #coverageModulationMode}. */
    public static int ncoverageModulationMode(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONMODE); }
    /** Unsafe version of {@link #coverageModulationTableEnable}. */
    public static int ncoverageModulationTableEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLEENABLE); }
    /** Unsafe version of {@link #coverageModulationTableCount}. */
    public static int ncoverageModulationTableCount(long struct) { return UNSAFE.getInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLECOUNT); }
    /** Unsafe version of {@link #pCoverageModulationTable() pCoverageModulationTable}. */
    @Nullable public static FloatBuffer npCoverageModulationTable(long struct) { return memFloatBufferSafe(memGetAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PCOVERAGEMODULATIONTABLE), ncoverageModulationTableCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #coverageModulationMode(int) coverageModulationMode}. */
    public static void ncoverageModulationMode(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONMODE, value); }
    /** Unsafe version of {@link #coverageModulationTableEnable(boolean) coverageModulationTableEnable}. */
    public static void ncoverageModulationTableEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLEENABLE, value); }
    /** Sets the specified value to the {@code coverageModulationTableCount} field of the specified {@code struct}. */
    public static void ncoverageModulationTableCount(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineCoverageModulationStateCreateInfoNV.COVERAGEMODULATIONTABLECOUNT, value); }
    /** Unsafe version of {@link #pCoverageModulationTable(FloatBuffer) pCoverageModulationTable}. */
    public static void npCoverageModulationTable(long struct, @Nullable FloatBuffer value) { memPutAddress(struct + VkPipelineCoverageModulationStateCreateInfoNV.PCOVERAGEMODULATIONTABLE, memAddressSafe(value)); if (value != null) { ncoverageModulationTableCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkPipelineCoverageModulationStateCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkPipelineCoverageModulationStateCreateInfoNV, Buffer> implements NativeResource {

        private static final VkPipelineCoverageModulationStateCreateInfoNV ELEMENT_FACTORY = VkPipelineCoverageModulationStateCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkPipelineCoverageModulationStateCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineCoverageModulationStateCreateInfoNV#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineCoverageModulationStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineCoverageModulationStateCreateInfoNV.nsType(address()); }
        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineCoverageModulationStateCreateInfoNV.npNext(address()); }
        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#flags} field. */
        @NativeType("VkPipelineCoverageModulationStateCreateFlagsNV")
        public int flags() { return VkPipelineCoverageModulationStateCreateInfoNV.nflags(address()); }
        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationMode} field. */
        @NativeType("VkCoverageModulationModeNV")
        public int coverageModulationMode() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address()); }
        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationTableEnable} field. */
        @NativeType("VkBool32")
        public boolean coverageModulationTableEnable() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address()) != 0; }
        /** @return the value of the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationTableCount} field. */
        @NativeType("uint32_t")
        public int coverageModulationTableCount() { return VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@link VkPipelineCoverageModulationStateCreateInfoNV#pCoverageModulationTable} field. */
        @Nullable
        @NativeType("float const *")
        public FloatBuffer pCoverageModulationTable() { return VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address()); }

        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#sType} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineCoverageModulationStateCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVFramebufferMixedSamples#VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV} value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#sType} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer sType$Default() { return sType(NVFramebufferMixedSamples.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_MODULATION_STATE_CREATE_INFO_NV); }
        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#pNext} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkPipelineCoverageModulationStateCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#flags} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer flags(@NativeType("VkPipelineCoverageModulationStateCreateFlagsNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationMode} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationMode(@NativeType("VkCoverageModulationModeNV") int value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationMode(address(), value); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationTableEnable} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationTableEnable(@NativeType("VkBool32") boolean value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link VkPipelineCoverageModulationStateCreateInfoNV#coverageModulationTableCount} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer coverageModulationTableCount(@NativeType("uint32_t") int value) { VkPipelineCoverageModulationStateCreateInfoNV.ncoverageModulationTableCount(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@link VkPipelineCoverageModulationStateCreateInfoNV#pCoverageModulationTable} field. */
        public VkPipelineCoverageModulationStateCreateInfoNV.Buffer pCoverageModulationTable(@Nullable @NativeType("float const *") FloatBuffer value) { VkPipelineCoverageModulationStateCreateInfoNV.npCoverageModulationTable(address(), value); return this; }

    }

}