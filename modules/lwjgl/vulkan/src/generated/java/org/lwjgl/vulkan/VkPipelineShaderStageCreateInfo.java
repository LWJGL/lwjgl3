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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct VkPipelineShaderStageCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkPipelineShaderStageCreateFlags flags;
 *     VkShaderStageFlagBits stage;
 *     VkShaderModule module;
 *     char const * pName;
 *     {@link VkSpecializationInfo VkSpecializationInfo} const * pSpecializationInfo;
 * }</code></pre>
 */
public class VkPipelineShaderStageCreateInfo extends Struct<VkPipelineShaderStageCreateInfo> implements NativeResource {

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
        MODULE,
        PNAME,
        PSPECIALIZATIONINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        MODULE = layout.offsetof(4);
        PNAME = layout.offsetof(5);
        PSPECIALIZATIONINFO = layout.offsetof(6);
    }

    protected VkPipelineShaderStageCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineShaderStageCreateInfo create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineShaderStageCreateInfo(address, container);
    }

    /**
     * Creates a {@code VkPipelineShaderStageCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageCreateInfo(ByteBuffer container) {
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
    @NativeType("VkPipelineShaderStageCreateFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code stage} field. */
    @NativeType("VkShaderStageFlagBits")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code module} field. */
    @NativeType("VkShaderModule")
    public long module() { return nmodule(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public ByteBuffer pName() { return npName(address()); }
    /** @return the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public String pNameString() { return npNameString(address()); }
    /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
    @NativeType("VkSpecializationInfo const *")
    public @Nullable VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineShaderStageCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO} value to the {@code sType} field. */
    public VkPipelineShaderStageCreateInfo sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineShaderStageCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkDebugUtilsObjectNameInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkDebugUtilsObjectNameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageModuleIdentifierCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageNodeCreateInfoAMDX} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageNodeCreateInfoAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkPipelineShaderStageCreateInfo pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkPipelineShaderStageCreateInfo flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public VkPipelineShaderStageCreateInfo stage(@NativeType("VkShaderStageFlagBits") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code module} field. */
    public VkPipelineShaderStageCreateInfo module(@NativeType("VkShaderModule") long value) { nmodule(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pName} field. */
    public VkPipelineShaderStageCreateInfo pName(@NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
    public VkPipelineShaderStageCreateInfo pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageCreateInfo set(
        int sType,
        long pNext,
        int flags,
        int stage,
        long module,
        ByteBuffer pName,
        @Nullable VkSpecializationInfo pSpecializationInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        module(module);
        pName(pName);
        pSpecializationInfo(pSpecializationInfo);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineShaderStageCreateInfo set(VkPipelineShaderStageCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageCreateInfo malloc() {
        return new VkPipelineShaderStageCreateInfo(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageCreateInfo calloc() {
        return new VkPipelineShaderStageCreateInfo(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageCreateInfo(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageCreateInfo} instance for the specified memory address. */
    public static VkPipelineShaderStageCreateInfo create(long address) {
        return new VkPipelineShaderStageCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineShaderStageCreateInfo createSafe(long address) {
        return address == NULL ? null : new VkPipelineShaderStageCreateInfo(address, null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineShaderStageCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineShaderStageCreateInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPipelineShaderStageCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineShaderStageCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineShaderStageCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageCreateInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + VkPipelineShaderStageCreateInfo.STAGE); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return memGetLong(struct + VkPipelineShaderStageCreateInfo.MODULE); }
    /** Unsafe version of {@link #pName}. */
    public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME)); }
    /** Unsafe version of {@link #pSpecializationInfo}. */
    public static @Nullable VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.createSafe(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + VkPipelineShaderStageCreateInfo.STAGE, value); }
    /** Unsafe version of {@link #module(long) module}. */
    public static void nmodule(long struct, long value) { memPutLong(struct + VkPipelineShaderStageCreateInfo.MODULE, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkPipelineShaderStageCreateInfo.PNAME, memAddress(value));
    }
    /** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
    public static void npSpecializationInfo(long struct, @Nullable VkSpecializationInfo value) { memPutAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkPipelineShaderStageCreateInfo.PNAME));
        long pSpecializationInfo = memGetAddress(struct + VkPipelineShaderStageCreateInfo.PSPECIALIZATIONINFO);
        if (pSpecializationInfo != NULL) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageCreateInfo, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageCreateInfo ELEMENT_FACTORY = VkPipelineShaderStageCreateInfo.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageCreateInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageCreateInfo#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineShaderStageCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageCreateInfo.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineShaderStageCreateInfo.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkPipelineShaderStageCreateFlags")
        public int flags() { return VkPipelineShaderStageCreateInfo.nflags(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkShaderStageFlagBits")
        public int stage() { return VkPipelineShaderStageCreateInfo.nstage(address()); }
        /** @return the value of the {@code module} field. */
        @NativeType("VkShaderModule")
        public long module() { return VkPipelineShaderStageCreateInfo.nmodule(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public ByteBuffer pName() { return VkPipelineShaderStageCreateInfo.npName(address()); }
        /** @return the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public String pNameString() { return VkPipelineShaderStageCreateInfo.npNameString(address()); }
        /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
        @NativeType("VkSpecializationInfo const *")
        public @Nullable VkSpecializationInfo pSpecializationInfo() { return VkPipelineShaderStageCreateInfo.npSpecializationInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineShaderStageCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageCreateInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO} value to the {@code sType} field. */
        public VkPipelineShaderStageCreateInfo.Buffer sType$Default() { return sType(VK10.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkPipelineShaderStageCreateInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkDebugUtilsObjectNameInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkDebugUtilsObjectNameInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfo} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineRobustnessCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineRobustnessCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageModuleIdentifierCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageModuleIdentifierCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageNodeCreateInfoAMDX} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageNodeCreateInfoAMDX value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderModuleValidationCacheCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkShaderModuleValidationCacheCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkPipelineShaderStageCreateInfo.Buffer pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkPipelineShaderStageCreateInfo.Buffer flags(@NativeType("VkPipelineShaderStageCreateFlags") int value) { VkPipelineShaderStageCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public VkPipelineShaderStageCreateInfo.Buffer stage(@NativeType("VkShaderStageFlagBits") int value) { VkPipelineShaderStageCreateInfo.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code module} field. */
        public VkPipelineShaderStageCreateInfo.Buffer module(@NativeType("VkShaderModule") long value) { VkPipelineShaderStageCreateInfo.nmodule(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pName} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pName(@NativeType("char const *") ByteBuffer value) { VkPipelineShaderStageCreateInfo.npName(address(), value); return this; }
        /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
        public VkPipelineShaderStageCreateInfo.Buffer pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { VkPipelineShaderStageCreateInfo.npSpecializationInfo(address(), value); return this; }

    }

}