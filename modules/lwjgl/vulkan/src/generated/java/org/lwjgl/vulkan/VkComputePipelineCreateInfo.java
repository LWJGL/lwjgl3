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
 * Structure specifying parameters of a newly created compute pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>The parameters {@code basePipelineHandle} and {@code basePipelineIndex} are described in more detail in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#pipelines-pipeline-derivatives">Pipeline Derivatives</a>.</p>
 * 
 * <p>{@code stage} points to a structure of type {@link VkPipelineShaderStageCreateInfo}.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is -1, {@code basePipelineHandle} <b>must</b> be a valid handle to a compute {@code VkPipeline}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be a valid index into the calling command&#8217;s {@code pCreateInfos} parameter</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineIndex} is not -1, {@code basePipelineHandle} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If {@code flags} contains the {@link VK10#VK_PIPELINE_CREATE_DERIVATIVE_BIT PIPELINE_CREATE_DERIVATIVE_BIT} flag, and {@code basePipelineHandle} is not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, {@code basePipelineIndex} <b>must</b> be -1</li>
 * <li>The {@code stage} member of {@code stage} <b>must</b> be {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT}</li>
 * <li>The shader code for the entry point identified by {@code stage} and the rest of the state identified by this structure <b>must</b> adhere to the pipeline linking rules described in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#interfaces">Shader Interfaces</a> chapter</li>
 * <li>{@code layout} <b>must</b> be <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#descriptorsets-pipelinelayout-consistency">consistent</a> with the layout of the compute shader specified in {@code stage}</li>
 * <li>The number of resources in {@code layout} accessible to the compute shader stage <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxPerStageResources}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL} or a pointer to a valid instance of {@link VkPipelineCreationFeedbackCreateInfoEXT}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkPipelineCreateFlagBits} values</li>
 * <li>{@code stage} <b>must</b> be a valid {@link VkPipelineShaderStageCreateInfo} structure</li>
 * <li>{@code layout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>Both of {@code basePipelineHandle}, and {@code layout} that are valid handles <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineShaderStageCreateInfo}, {@link VK10#vkCreateComputePipelines CreateComputePipelines}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkPipelineCreateFlagBits} specifying how the pipeline will be generated.</li>
 * <li>{@code stage} &ndash; a {@link VkPipelineShaderStageCreateInfo} describing the compute shader.</li>
 * <li>{@code layout} &ndash; the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.</li>
 * <li>{@code basePipelineHandle} &ndash; a pipeline to derive from</li>
 * <li>{@code basePipelineIndex} &ndash; an index into the {@code pCreateInfos} parameter to use as a pipeline to derive from</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkComputePipelineCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineCreateFlags flags;
 *     {@link VkPipelineShaderStageCreateInfo VkPipelineShaderStageCreateInfo} stage;
 *     VkPipelineLayout layout;
 *     VkPipeline basePipelineHandle;
 *     int32_t basePipelineIndex;
 * }</code></pre>
 */
public class VkComputePipelineCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        STAGE,
        LAYOUT,
        BASEPIPELINEHANDLE,
        BASEPIPELINEINDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkPipelineShaderStageCreateInfo.SIZEOF, VkPipelineShaderStageCreateInfo.ALIGNOF),
            __member(8),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        LAYOUT = layout.offsetof(4);
        BASEPIPELINEHANDLE = layout.offsetof(5);
        BASEPIPELINEINDEX = layout.offsetof(6);
    }

    /**
     * Creates a {@code VkComputePipelineCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkComputePipelineCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
    public VkPipelineShaderStageCreateInfo stage() { return nstage(address()); }
    /** Returns the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** Returns the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** Returns the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkComputePipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkComputePipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkComputePipelineCreateInfo flags(@NativeType("VkPipelineCreateFlags") int value) { nflags(address(), value); return this; }
    /** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@code stage} field. */
    public VkComputePipelineCreateInfo stage(VkPipelineShaderStageCreateInfo value) { nstage(address(), value); return this; }
    /** Passes the {@code stage} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkComputePipelineCreateInfo stage(java.util.function.Consumer<VkPipelineShaderStageCreateInfo> consumer) { consumer.accept(stage()); return this; }
    /** Sets the specified value to the {@code layout} field. */
    public VkComputePipelineCreateInfo layout(@NativeType("VkPipelineLayout") long value) { nlayout(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineHandle} field. */
    public VkComputePipelineCreateInfo basePipelineHandle(@NativeType("VkPipeline") long value) { nbasePipelineHandle(address(), value); return this; }
    /** Sets the specified value to the {@code basePipelineIndex} field. */
    public VkComputePipelineCreateInfo basePipelineIndex(@NativeType("int32_t") int value) { nbasePipelineIndex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkComputePipelineCreateInfo set(
        int sType,
        long pNext,
        int flags,
        VkPipelineShaderStageCreateInfo stage,
        long layout,
        long basePipelineHandle,
        int basePipelineIndex
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        layout(layout);
        basePipelineHandle(basePipelineHandle);
        basePipelineIndex(basePipelineIndex);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkComputePipelineCreateInfo set(VkComputePipelineCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkComputePipelineCreateInfo malloc() {
        return wrap(VkComputePipelineCreateInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComputePipelineCreateInfo calloc() {
        return wrap(VkComputePipelineCreateInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkComputePipelineCreateInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance for the specified memory address. */
    public static VkComputePipelineCreateInfo create(long address) {
        return wrap(VkComputePipelineCreateInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComputePipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkComputePipelineCreateInfo.class, address);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkComputePipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkComputePipelineCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkComputePipelineCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkComputePipelineCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo mallocStack(MemoryStack stack) {
        return wrap(VkComputePipelineCreateInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo callocStack(MemoryStack stack) {
        return wrap(VkComputePipelineCreateInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkComputePipelineCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + VkComputePipelineCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static VkPipelineShaderStageCreateInfo nstage(long struct) { return VkPipelineShaderStageCreateInfo.create(struct + VkComputePipelineCreateInfo.STAGE); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return UNSAFE.getLong(null, struct + VkComputePipelineCreateInfo.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return UNSAFE.getLong(null, struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return UNSAFE.getInt(null, struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkComputePipelineCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + VkComputePipelineCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #stage(VkPipelineShaderStageCreateInfo) stage}. */
    public static void nstage(long struct, VkPipelineShaderStageCreateInfo value) { memCopy(value.address(), struct + VkComputePipelineCreateInfo.STAGE, VkPipelineShaderStageCreateInfo.SIZEOF); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { UNSAFE.putLong(null, struct + VkComputePipelineCreateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { UNSAFE.putLong(null, struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkPipelineShaderStageCreateInfo.validate(struct + VkComputePipelineCreateInfo.STAGE);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkComputePipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkComputePipelineCreateInfo, Buffer> implements NativeResource {

        private static final VkComputePipelineCreateInfo ELEMENT_FACTORY = VkComputePipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkComputePipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComputePipelineCreateInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkComputePipelineCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkComputePipelineCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkComputePipelineCreateInfo.nflags(address()); }
        /** Returns a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
        public VkPipelineShaderStageCreateInfo stage() { return VkComputePipelineCreateInfo.nstage(address()); }
        /** Returns the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkComputePipelineCreateInfo.nlayout(address()); }
        /** Returns the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkComputePipelineCreateInfo.nbasePipelineHandle(address()); }
        /** Returns the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkComputePipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkComputePipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkComputePipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkComputePipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkComputePipelineCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkComputePipelineCreateInfo.Buffer flags(@NativeType("VkPipelineCreateFlags") int value) { VkComputePipelineCreateInfo.nflags(address(), value); return this; }
        /** Copies the specified {@link VkPipelineShaderStageCreateInfo} to the {@code stage} field. */
        public VkComputePipelineCreateInfo.Buffer stage(VkPipelineShaderStageCreateInfo value) { VkComputePipelineCreateInfo.nstage(address(), value); return this; }
        /** Passes the {@code stage} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkComputePipelineCreateInfo.Buffer stage(java.util.function.Consumer<VkPipelineShaderStageCreateInfo> consumer) { consumer.accept(stage()); return this; }
        /** Sets the specified value to the {@code layout} field. */
        public VkComputePipelineCreateInfo.Buffer layout(@NativeType("VkPipelineLayout") long value) { VkComputePipelineCreateInfo.nlayout(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineHandle} field. */
        public VkComputePipelineCreateInfo.Buffer basePipelineHandle(@NativeType("VkPipeline") long value) { VkComputePipelineCreateInfo.nbasePipelineHandle(address(), value); return this; }
        /** Sets the specified value to the {@code basePipelineIndex} field. */
        public VkComputePipelineCreateInfo.Buffer basePipelineIndex(@NativeType("int32_t") int value) { VkComputePipelineCreateInfo.nbasePipelineIndex(address(), value); return this; }

    }

}