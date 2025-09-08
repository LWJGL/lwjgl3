/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
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
public class VkComputePipelineCreateInfo extends Struct<VkComputePipelineCreateInfo> implements NativeResource {

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

    protected VkComputePipelineCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkComputePipelineCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkComputePipelineCreateInfo(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("VkPipelineCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
    public VkPipelineShaderStageCreateInfo stage() { return nstage(address()); }
    /** @return the value of the {@code layout} field. */
    @NativeType("VkPipelineLayout")
    public long layout() { return nlayout(address()); }
    /** @return the value of the {@code basePipelineHandle} field. */
    @NativeType("VkPipeline")
    public long basePipelineHandle() { return nbasePipelineHandle(address()); }
    /** @return the value of the {@code basePipelineIndex} field. */
    @NativeType("int32_t")
    public int basePipelineIndex() { return nbasePipelineIndex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkComputePipelineCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO} value to the {@code sType} field. */
    public VkComputePipelineCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkComputePipelineCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkComputePipelineIndirectBufferInfoNV} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkComputePipelineIndirectBufferInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkSubpassShadingPipelineCreateInfoHUAWEI} value to the {@code pNext} chain. */
    public VkComputePipelineCreateInfo pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
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
        return new VkComputePipelineCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkComputePipelineCreateInfo calloc() {
        return new VkComputePipelineCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkComputePipelineCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkComputePipelineCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkComputePipelineCreateInfo} instance for the specified memory address. */
    public static VkComputePipelineCreateInfo create(long address) {
        return new VkComputePipelineCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkComputePipelineCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkComputePipelineCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkComputePipelineCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkComputePipelineCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkComputePipelineCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo malloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkComputePipelineCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkComputePipelineCreateInfo calloc(MemoryStack stack) {
        return new VkComputePipelineCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkComputePipelineCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkComputePipelineCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkComputePipelineCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static VkPipelineShaderStageCreateInfo nstage(long struct) { return VkPipelineShaderStageCreateInfo.create(struct + VkComputePipelineCreateInfo.STAGE); }
    /** Unsafe version of {@link #layout}. */
    public static long nlayout(long struct) { return memGetLong(struct + VkComputePipelineCreateInfo.LAYOUT); }
    /** Unsafe version of {@link #basePipelineHandle}. */
    public static long nbasePipelineHandle(long struct) { return memGetLong(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE); }
    /** Unsafe version of {@link #basePipelineIndex}. */
    public static int nbasePipelineIndex(long struct) { return memGetInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkComputePipelineCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #stage(VkPipelineShaderStageCreateInfo) stage}. */
    public static void nstage(long struct, VkPipelineShaderStageCreateInfo value) { memCopy(value.address(), struct + VkComputePipelineCreateInfo.STAGE, VkPipelineShaderStageCreateInfo.SIZEOF); }
    /** Unsafe version of {@link #layout(long) layout}. */
    public static void nlayout(long struct, long value) { memPutLong(struct + VkComputePipelineCreateInfo.LAYOUT, value); }
    /** Unsafe version of {@link #basePipelineHandle(long) basePipelineHandle}. */
    public static void nbasePipelineHandle(long struct, long value) { memPutLong(struct + VkComputePipelineCreateInfo.BASEPIPELINEHANDLE, value); }
    /** Unsafe version of {@link #basePipelineIndex(int) basePipelineIndex}. */
    public static void nbasePipelineIndex(long struct, int value) { memPutInt(struct + VkComputePipelineCreateInfo.BASEPIPELINEINDEX, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        VkPipelineShaderStageCreateInfo.validate(struct + VkComputePipelineCreateInfo.STAGE);
    }

    // -----------------------------------

    /** An array of {@link VkComputePipelineCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkComputePipelineCreateInfo, Buffer> implements NativeResource {

        private static final VkComputePipelineCreateInfo ELEMENT_FACTORY = VkComputePipelineCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkComputePipelineCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkComputePipelineCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkComputePipelineCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkComputePipelineCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkComputePipelineCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineCreateFlags")
        public int flags() { return VkComputePipelineCreateInfo.nflags(address()); }
        /** @return a {@link VkPipelineShaderStageCreateInfo} view of the {@code stage} field. */
        public VkPipelineShaderStageCreateInfo stage() { return VkComputePipelineCreateInfo.nstage(address()); }
        /** @return the value of the {@code layout} field. */
        @NativeType("VkPipelineLayout")
        public long layout() { return VkComputePipelineCreateInfo.nlayout(address()); }
        /** @return the value of the {@code basePipelineHandle} field. */
        @NativeType("VkPipeline")
        public long basePipelineHandle() { return VkComputePipelineCreateInfo.nbasePipelineHandle(address()); }
        /** @return the value of the {@code basePipelineIndex} field. */
        @NativeType("int32_t")
        public int basePipelineIndex() { return VkComputePipelineCreateInfo.nbasePipelineIndex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkComputePipelineCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkComputePipelineCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO} value to the {@code sType} field. */
        public VkComputePipelineCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkComputePipelineCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkComputePipelineCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkComputePipelineIndirectBufferInfoNV} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkComputePipelineIndirectBufferInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineBinaryInfoKHR} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineBinaryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCompilerControlCreateInfoAMD} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCompilerControlCreateInfoAMD value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfo} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreateFlags2CreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreateFlags2CreateInfoKHR} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreateFlags2CreateInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfo} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineCreationFeedbackCreateInfoEXT} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineCreationFeedbackCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkSubpassShadingPipelineCreateInfoHUAWEI} value to the {@code pNext} chain. */
        public VkComputePipelineCreateInfo.Buffer pNext(VkSubpassShadingPipelineCreateInfoHUAWEI value) { return this.pNext(value.pNext(this.pNext()).address()); }
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