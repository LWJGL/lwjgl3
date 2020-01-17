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
 * Structure specifying parameters of a newly created pipeline multisample state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-sampleRateShading">sample rate shading</a> feature is not enabled, {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#features-alphaToOne">alpha to one</a> feature is not enabled, {@code alphaToOneEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>{@code minSampleShading} <b>must</b> be in the range <code>[0,1]</code></li>
 * <li>If the {@code VK_NV_framebuffer_mixed_samples} extension is enabled, and if the subpass has any color attachments and {@code rasterizationSamples} is greater than the number of color samples, then {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkPipelineCoverageModulationStateCreateInfoNV}, {@link VkPipelineCoverageReductionStateCreateInfoNV}, {@link VkPipelineCoverageToColorStateCreateInfoNV}, or {@link VkPipelineSampleLocationsStateCreateInfoEXT}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If {@code pSampleMask} is not {@code NULL}, {@code pSampleMask} <b>must</b> be a valid pointer to an array of {@code ceil(rasterizationSamples / 32)} {@code VkSampleMask} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGraphicsPipelineCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; reserved for future use.</li>
 * <li>{@code rasterizationSamples} &ndash; a {@code VkSampleCountFlagBits} specifying the number of samples used in rasterization.</li>
 * <li>{@code sampleShadingEnable} &ndash; <b>can</b> be used to enable <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#primsrast-sampleshading">Sample Shading</a>.</li>
 * <li>{@code minSampleShading} &ndash; specifies a minimum fraction of sample shading if {@code sampleShadingEnable} is set to {@link VK10#VK_TRUE TRUE}.</li>
 * <li>{@code pSampleMask} &ndash; a bitmask of static coverage information that is ANDed with the coverage information generated during rasterization, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-samplemask">Sample Mask</a>.</li>
 * <li>{@code alphaToCoverageEnable} &ndash; controls whether a temporary coverage value is generated based on the alpha component of the fragment&#8217;s first color output as specified in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-covg">Multisample Coverage</a> section.</li>
 * <li>{@code alphaToOneEnable} &ndash; controls whether the alpha component of the fragment&#8217;s first color output is replaced with one as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#fragops-covg">Multisample Coverage</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPipelineMultisampleStateCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineMultisampleStateCreateFlags flags;
 *     VkSampleCountFlagBits rasterizationSamples;
 *     VkBool32 sampleShadingEnable;
 *     float minSampleShading;
 *     VkSampleMask const * pSampleMask;
 *     VkBool32 alphaToCoverageEnable;
 *     VkBool32 alphaToOneEnable;
 * }</code></pre>
 */
public class VkPipelineMultisampleStateCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        RASTERIZATIONSAMPLES,
        SAMPLESHADINGENABLE,
        MINSAMPLESHADING,
        PSAMPLEMASK,
        ALPHATOCOVERAGEENABLE,
        ALPHATOONEENABLE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
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
        RASTERIZATIONSAMPLES = layout.offsetof(3);
        SAMPLESHADINGENABLE = layout.offsetof(4);
        MINSAMPLESHADING = layout.offsetof(5);
        PSAMPLEMASK = layout.offsetof(6);
        ALPHATOCOVERAGEENABLE = layout.offsetof(7);
        ALPHATOONEENABLE = layout.offsetof(8);
    }

    /**
     * Creates a {@code VkPipelineMultisampleStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineMultisampleStateCreateInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkPipelineMultisampleStateCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code rasterizationSamples} field. */
    @NativeType("VkSampleCountFlagBits")
    public int rasterizationSamples() { return nrasterizationSamples(address()); }
    /** Returns the value of the {@code sampleShadingEnable} field. */
    @NativeType("VkBool32")
    public boolean sampleShadingEnable() { return nsampleShadingEnable(address()) != 0; }
    /** Returns the value of the {@code minSampleShading} field. */
    public float minSampleShading() { return nminSampleShading(address()); }
    /**
     * Returns a {@link IntBuffer} view of the data pointed to by the {@code pSampleMask} field.
     *
     * @param capacity the number of elements in the returned buffer
     */
    @Nullable
    @NativeType("VkSampleMask const *")
    public IntBuffer pSampleMask(int capacity) { return npSampleMask(address(), capacity); }
    /** Returns the value of the {@code alphaToCoverageEnable} field. */
    @NativeType("VkBool32")
    public boolean alphaToCoverageEnable() { return nalphaToCoverageEnable(address()) != 0; }
    /** Returns the value of the {@code alphaToOneEnable} field. */
    @NativeType("VkBool32")
    public boolean alphaToOneEnable() { return nalphaToOneEnable(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineMultisampleStateCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineMultisampleStateCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineMultisampleStateCreateInfo flags(@NativeType("VkPipelineMultisampleStateCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code rasterizationSamples} field. */
    public VkPipelineMultisampleStateCreateInfo rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { nrasterizationSamples(address(), value); return this; }
    /** Sets the specified value to the {@code sampleShadingEnable} field. */
    public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(@NativeType("VkBool32") boolean value) { nsampleShadingEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code minSampleShading} field. */
    public VkPipelineMultisampleStateCreateInfo minSampleShading(float value) { nminSampleShading(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pSampleMask} field. */
    public VkPipelineMultisampleStateCreateInfo pSampleMask(@Nullable @NativeType("VkSampleMask const *") IntBuffer value) { npSampleMask(address(), value); return this; }
    /** Sets the specified value to the {@code alphaToCoverageEnable} field. */
    public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(@NativeType("VkBool32") boolean value) { nalphaToCoverageEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code alphaToOneEnable} field. */
    public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(@NativeType("VkBool32") boolean value) { nalphaToOneEnable(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineMultisampleStateCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int rasterizationSamples,
        boolean sampleShadingEnable,
        float minSampleShading,
        @Nullable IntBuffer pSampleMask,
        boolean alphaToCoverageEnable,
        boolean alphaToOneEnable
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        rasterizationSamples(rasterizationSamples);
        sampleShadingEnable(sampleShadingEnable);
        minSampleShading(minSampleShading);
        pSampleMask(pSampleMask);
        alphaToCoverageEnable(alphaToCoverageEnable);
        alphaToOneEnable(alphaToOneEnable);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineMultisampleStateCreateInfo set(VkPipelineMultisampleStateCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineMultisampleStateCreateInfo malloc() {
        return wrap(VkPipelineMultisampleStateCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineMultisampleStateCreateInfo calloc() {
        return wrap(VkPipelineMultisampleStateCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineMultisampleStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPipelineMultisampleStateCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance for the specified memory address. */
    public static VkPipelineMultisampleStateCreateInfo create(long address) {
        return wrap(VkPipelineMultisampleStateCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineMultisampleStateCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkPipelineMultisampleStateCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPipelineMultisampleStateCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineMultisampleStateCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineMultisampleStateCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineMultisampleStateCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkPipelineMultisampleStateCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPipelineMultisampleStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineMultisampleStateCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkPipelineMultisampleStateCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineMultisampleStateCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineMultisampleStateCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.FLAGS); }
    /** Unsafe version of {@link #rasterizationSamples}. */
    public static int nrasterizationSamples(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES); }
    /** Unsafe version of {@link #sampleShadingEnable}. */
    public static int nsampleShadingEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE); }
    /** Unsafe version of {@link #minSampleShading}. */
    public static float nminSampleShading(long struct) { return UNSAFE.getFloat(null, struct + VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING); }
    /** Unsafe version of {@link #pSampleMask(int) pSampleMask}. */
    @Nullable public static IntBuffer npSampleMask(long struct, int capacity) { return memIntBufferSafe(memGetAddress(struct + VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK), capacity); }
    /** Unsafe version of {@link #alphaToCoverageEnable}. */
    public static int nalphaToCoverageEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE); }
    /** Unsafe version of {@link #alphaToOneEnable}. */
    public static int nalphaToOneEnable(long struct) { return UNSAFE.getInt(null, struct + VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineMultisampleStateCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
    public static void nrasterizationSamples(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES, value); }
    /** Unsafe version of {@link #sampleShadingEnable(boolean) sampleShadingEnable}. */
    public static void nsampleShadingEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE, value); }
    /** Unsafe version of {@link #minSampleShading(float) minSampleShading}. */
    public static void nminSampleShading(long struct, float value) { UNSAFE.putFloat(null, struct + VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING, value); }
    /** Unsafe version of {@link #pSampleMask(IntBuffer) pSampleMask}. */
    public static void npSampleMask(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK, memAddressSafe(value)); }
    /** Unsafe version of {@link #alphaToCoverageEnable(boolean) alphaToCoverageEnable}. */
    public static void nalphaToCoverageEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE, value); }
    /** Unsafe version of {@link #alphaToOneEnable(boolean) alphaToOneEnable}. */
    public static void nalphaToOneEnable(long struct, int value) { UNSAFE.putInt(null, struct + VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineMultisampleStateCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineMultisampleStateCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineMultisampleStateCreateInfo ELEMENT_FACTORY = VkPipelineMultisampleStateCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineMultisampleStateCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineMultisampleStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineMultisampleStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineMultisampleStateCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineMultisampleStateCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineMultisampleStateCreateFlags")
        public int flags() { return VkPipelineMultisampleStateCreateInfo.nflags(address()); }
        /** Returns the value of the {@code rasterizationSamples} field. */
        @NativeType("VkSampleCountFlagBits")
        public int rasterizationSamples() { return VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address()); }
        /** Returns the value of the {@code sampleShadingEnable} field. */
        @NativeType("VkBool32")
        public boolean sampleShadingEnable() { return VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address()) != 0; }
        /** Returns the value of the {@code minSampleShading} field. */
        public float minSampleShading() { return VkPipelineMultisampleStateCreateInfo.nminSampleShading(address()); }
        /**
         * Returns a {@link IntBuffer} view of the data pointed to by the {@code pSampleMask} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @Nullable
        @NativeType("VkSampleMask const *")
        public IntBuffer pSampleMask(int capacity) { return VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), capacity); }
        /** Returns the value of the {@code alphaToCoverageEnable} field. */
        @NativeType("VkBool32")
        public boolean alphaToCoverageEnable() { return VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address()) != 0; }
        /** Returns the value of the {@code alphaToOneEnable} field. */
        @NativeType("VkBool32")
        public boolean alphaToOneEnable() { return VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineMultisampleStateCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineMultisampleStateCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer flags(@NativeType("VkPipelineMultisampleStateCreateFlags") int value) { VkPipelineMultisampleStateCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code rasterizationSamples} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer rasterizationSamples(@NativeType("VkSampleCountFlagBits") int value) { VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address(), value); return this; }
        /** Sets the specified value to the {@code sampleShadingEnable} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer sampleShadingEnable(@NativeType("VkBool32") boolean value) { VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code minSampleShading} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer minSampleShading(float value) { VkPipelineMultisampleStateCreateInfo.nminSampleShading(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pSampleMask} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer pSampleMask(@Nullable @NativeType("VkSampleMask const *") IntBuffer value) { VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), value); return this; }
        /** Sets the specified value to the {@code alphaToCoverageEnable} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer alphaToCoverageEnable(@NativeType("VkBool32") boolean value) { VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code alphaToOneEnable} field. */
        public VkPipelineMultisampleStateCreateInfo.Buffer alphaToOneEnable(@NativeType("VkBool32") boolean value) { VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address(), value ? 1 : 0); return this; }

    }

}