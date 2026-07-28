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
 * struct VkShaderCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderCreateFlagsEXT flags;
 *     VkShaderStageFlagBits stage;
 *     VkShaderStageFlags nextStage;
 *     VkShaderCodeTypeEXT codeType;
 *     size_t codeSize;
 *     void const * pCode;
 *     char const * pName;
 *     uint32_t setLayoutCount;
 *     VkDescriptorSetLayout const * pSetLayouts;
 *     uint32_t pushConstantRangeCount;
 *     {@link VkPushConstantRange VkPushConstantRange} const * pPushConstantRanges;
 *     {@link VkSpecializationInfo VkSpecializationInfo} const * pSpecializationInfo;
 * }</code></pre>
 */
public class VkShaderCreateInfoEXT extends Struct<VkShaderCreateInfoEXT> implements NativeResource {

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
        NEXTSTAGE,
        CODETYPE,
        CODESIZE,
        PCODE,
        PNAME,
        SETLAYOUTCOUNT,
        PSETLAYOUTS,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES,
        PSPECIALIZATIONINFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        STAGE = layout.offsetof(3);
        NEXTSTAGE = layout.offsetof(4);
        CODETYPE = layout.offsetof(5);
        CODESIZE = layout.offsetof(6);
        PCODE = layout.offsetof(7);
        PNAME = layout.offsetof(8);
        SETLAYOUTCOUNT = layout.offsetof(9);
        PSETLAYOUTS = layout.offsetof(10);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(11);
        PPUSHCONSTANTRANGES = layout.offsetof(12);
        PSPECIALIZATIONINFO = layout.offsetof(13);
    }

    protected VkShaderCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkShaderCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkShaderCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkShaderCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkShaderCreateFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code stage} field. */
    @NativeType("VkShaderStageFlagBits")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code nextStage} field. */
    @NativeType("VkShaderStageFlags")
    public int nextStage() { return nnextStage(address()); }
    /** @return the value of the {@code codeType} field. */
    @NativeType("VkShaderCodeTypeEXT")
    public int codeType() { return ncodeType(address()); }
    /** @return the value of the {@code codeSize} field. */
    @NativeType("size_t")
    public long codeSize() { return ncodeSize(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
    @NativeType("void const *")
    public ByteBuffer pCode() { return npCode(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pName() { return npName(address()); }
    /** @return the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public @Nullable String pNameString() { return npNameString(address()); }
    /** @return the value of the {@code setLayoutCount} field. */
    @NativeType("uint32_t")
    public int setLayoutCount() { return nsetLayoutCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
    @NativeType("VkDescriptorSetLayout const *")
    public @Nullable LongBuffer pSetLayouts() { return npSetLayouts(address()); }
    /** @return the value of the {@code pushConstantRangeCount} field. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }
    /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
    @NativeType("VkSpecializationInfo const *")
    public @Nullable VkSpecializationInfo pSpecializationInfo() { return npSpecializationInfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkShaderCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkShaderCreateInfoEXT sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkShaderCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkCustomResolveCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkCustomResolveCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderDescriptorSetAndBindingMappingInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkShaderDescriptorSetAndBindingMappingInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
    public VkShaderCreateInfoEXT pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkShaderCreateInfoEXT flags(@NativeType("VkShaderCreateFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code stage} field. */
    public VkShaderCreateInfoEXT stage(@NativeType("VkShaderStageFlagBits") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code nextStage} field. */
    public VkShaderCreateInfoEXT nextStage(@NativeType("VkShaderStageFlags") int value) { nnextStage(address(), value); return this; }
    /** Sets the specified value to the {@code codeType} field. */
    public VkShaderCreateInfoEXT codeType(@NativeType("VkShaderCodeTypeEXT") int value) { ncodeType(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
    public VkShaderCreateInfoEXT pCode(@NativeType("void const *") ByteBuffer value) { npCode(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pName} field. */
    public VkShaderCreateInfoEXT pName(@Nullable @NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the specified value to the {@code setLayoutCount} field. */
    public VkShaderCreateInfoEXT setLayoutCount(@NativeType("uint32_t") int value) { nsetLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
    public VkShaderCreateInfoEXT pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }
    /** Sets the specified value to the {@code pushConstantRangeCount} field. */
    public VkShaderCreateInfoEXT pushConstantRangeCount(@NativeType("uint32_t") int value) { npushConstantRangeCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
    public VkShaderCreateInfoEXT pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { npPushConstantRanges(address(), value); return this; }
    /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
    public VkShaderCreateInfoEXT pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkShaderCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int stage,
        int nextStage,
        int codeType,
        ByteBuffer pCode,
        @Nullable ByteBuffer pName,
        int setLayoutCount,
        @Nullable LongBuffer pSetLayouts,
        int pushConstantRangeCount,
        VkPushConstantRange.@Nullable Buffer pPushConstantRanges,
        @Nullable VkSpecializationInfo pSpecializationInfo
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        stage(stage);
        nextStage(nextStage);
        codeType(codeType);
        pCode(pCode);
        pName(pName);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);
        pushConstantRangeCount(pushConstantRangeCount);
        pPushConstantRanges(pPushConstantRanges);
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
    public VkShaderCreateInfoEXT set(VkShaderCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkShaderCreateInfoEXT malloc() {
        return new VkShaderCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkShaderCreateInfoEXT calloc() {
        return new VkShaderCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkShaderCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkShaderCreateInfoEXT} instance for the specified memory address. */
    public static VkShaderCreateInfoEXT create(long address) {
        return new VkShaderCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkShaderCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkShaderCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkShaderCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkShaderCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkShaderCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderCreateInfoEXT malloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkShaderCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkShaderCreateInfoEXT calloc(MemoryStack stack) {
        return new VkShaderCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkShaderCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkShaderCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkShaderCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.STAGE); }
    /** Unsafe version of {@link #nextStage}. */
    public static int nnextStage(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.NEXTSTAGE); }
    /** Unsafe version of {@link #codeType}. */
    public static int ncodeType(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.CODETYPE); }
    /** Unsafe version of {@link #codeSize}. */
    public static long ncodeSize(long struct) { return memGetAddress(struct + VkShaderCreateInfoEXT.CODESIZE); }
    /** Unsafe version of {@link #pCode() pCode}. */
    public static ByteBuffer npCode(long struct) { return memByteBuffer(memGetAddress(struct + VkShaderCreateInfoEXT.PCODE), (int)ncodeSize(struct)); }
    /** Unsafe version of {@link #pName}. */
    public static @Nullable ByteBuffer npName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkShaderCreateInfoEXT.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static @Nullable String npNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkShaderCreateInfoEXT.PNAME)); }
    /** Unsafe version of {@link #setLayoutCount}. */
    public static int nsetLayoutCount(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.SETLAYOUTCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    public static @Nullable LongBuffer npSetLayouts(long struct) { return memLongBufferSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PSETLAYOUTS), nsetLayoutCount(struct)); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return memGetInt(struct + VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    public static VkPushConstantRange.@Nullable Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }
    /** Unsafe version of {@link #pSpecializationInfo}. */
    public static @Nullable VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.createSafe(memGetAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkShaderCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.STAGE, value); }
    /** Unsafe version of {@link #nextStage(int) nextStage}. */
    public static void nnextStage(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.NEXTSTAGE, value); }
    /** Unsafe version of {@link #codeType(int) codeType}. */
    public static void ncodeType(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.CODETYPE, value); }
    /** Sets the specified value to the {@code codeSize} field of the specified {@code struct}. */
    public static void ncodeSize(long struct, long value) { memPutAddress(struct + VkShaderCreateInfoEXT.CODESIZE, value); }
    /** Unsafe version of {@link #pCode(ByteBuffer) pCode}. */
    public static void npCode(long struct, ByteBuffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PCODE, memAddress(value)); ncodeSize(struct, value.remaining()); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkShaderCreateInfoEXT.PNAME, memAddressSafe(value));
    }
    /** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
    public static void nsetLayoutCount(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.SETLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PSETLAYOUTS, memAddressSafe(value)); if (value != null) { nsetLayoutCount(struct, value.remaining()); } }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { memPutInt(struct + VkShaderCreateInfoEXT.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, VkPushConstantRange.@Nullable Buffer value) { memPutAddress(struct + VkShaderCreateInfoEXT.PPUSHCONSTANTRANGES, memAddressSafe(value)); if (value != null) { npushConstantRangeCount(struct, value.remaining()); } }
    /** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
    public static void npSpecializationInfo(long struct, @Nullable VkSpecializationInfo value) { memPutAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkShaderCreateInfoEXT.PCODE));
        long pSpecializationInfo = memGetAddress(struct + VkShaderCreateInfoEXT.PSPECIALIZATIONINFO);
        if (pSpecializationInfo != NULL) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkShaderCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkShaderCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkShaderCreateInfoEXT ELEMENT_FACTORY = VkShaderCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkShaderCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkShaderCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkShaderCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkShaderCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkShaderCreateFlagsEXT")
        public int flags() { return VkShaderCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@code stage} field. */
        @NativeType("VkShaderStageFlagBits")
        public int stage() { return VkShaderCreateInfoEXT.nstage(address()); }
        /** @return the value of the {@code nextStage} field. */
        @NativeType("VkShaderStageFlags")
        public int nextStage() { return VkShaderCreateInfoEXT.nnextStage(address()); }
        /** @return the value of the {@code codeType} field. */
        @NativeType("VkShaderCodeTypeEXT")
        public int codeType() { return VkShaderCreateInfoEXT.ncodeType(address()); }
        /** @return the value of the {@code codeSize} field. */
        @NativeType("size_t")
        public long codeSize() { return VkShaderCreateInfoEXT.ncodeSize(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code pCode} field. */
        @NativeType("void const *")
        public ByteBuffer pCode() { return VkShaderCreateInfoEXT.npCode(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pName() { return VkShaderCreateInfoEXT.npName(address()); }
        /** @return the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public @Nullable String pNameString() { return VkShaderCreateInfoEXT.npNameString(address()); }
        /** @return the value of the {@code setLayoutCount} field. */
        @NativeType("uint32_t")
        public int setLayoutCount() { return VkShaderCreateInfoEXT.nsetLayoutCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
        @NativeType("VkDescriptorSetLayout const *")
        public @Nullable LongBuffer pSetLayouts() { return VkShaderCreateInfoEXT.npSetLayouts(address()); }
        /** @return the value of the {@code pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkShaderCreateInfoEXT.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return VkShaderCreateInfoEXT.npPushConstantRanges(address()); }
        /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
        @NativeType("VkSpecializationInfo const *")
        public @Nullable VkSpecializationInfo pSpecializationInfo() { return VkShaderCreateInfoEXT.npSpecializationInfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkShaderCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkShaderCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTShaderObject#VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkShaderCreateInfoEXT.Buffer sType$Default() { return sType(EXTShaderObject.VK_STRUCTURE_TYPE_SHADER_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkShaderCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkShaderCreateInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkCustomResolveCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkCustomResolveCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfo} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkPipelineShaderStageRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderDescriptorSetAndBindingMappingInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkShaderDescriptorSetAndBindingMappingInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkShaderRequiredSubgroupSizeCreateInfoEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkShaderRequiredSubgroupSizeCreateInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkValidationFeaturesEXT} value to the {@code pNext} chain. */
        public VkShaderCreateInfoEXT.Buffer pNext(VkValidationFeaturesEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkShaderCreateInfoEXT.Buffer flags(@NativeType("VkShaderCreateFlagsEXT") int value) { VkShaderCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code stage} field. */
        public VkShaderCreateInfoEXT.Buffer stage(@NativeType("VkShaderStageFlagBits") int value) { VkShaderCreateInfoEXT.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code nextStage} field. */
        public VkShaderCreateInfoEXT.Buffer nextStage(@NativeType("VkShaderStageFlags") int value) { VkShaderCreateInfoEXT.nnextStage(address(), value); return this; }
        /** Sets the specified value to the {@code codeType} field. */
        public VkShaderCreateInfoEXT.Buffer codeType(@NativeType("VkShaderCodeTypeEXT") int value) { VkShaderCreateInfoEXT.ncodeType(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code pCode} field. */
        public VkShaderCreateInfoEXT.Buffer pCode(@NativeType("void const *") ByteBuffer value) { VkShaderCreateInfoEXT.npCode(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pName} field. */
        public VkShaderCreateInfoEXT.Buffer pName(@Nullable @NativeType("char const *") ByteBuffer value) { VkShaderCreateInfoEXT.npName(address(), value); return this; }
        /** Sets the specified value to the {@code setLayoutCount} field. */
        public VkShaderCreateInfoEXT.Buffer setLayoutCount(@NativeType("uint32_t") int value) { VkShaderCreateInfoEXT.nsetLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
        public VkShaderCreateInfoEXT.Buffer pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkShaderCreateInfoEXT.npSetLayouts(address(), value); return this; }
        /** Sets the specified value to the {@code pushConstantRangeCount} field. */
        public VkShaderCreateInfoEXT.Buffer pushConstantRangeCount(@NativeType("uint32_t") int value) { VkShaderCreateInfoEXT.npushConstantRangeCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
        public VkShaderCreateInfoEXT.Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { VkShaderCreateInfoEXT.npPushConstantRanges(address(), value); return this; }
        /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
        public VkShaderCreateInfoEXT.Buffer pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { VkShaderCreateInfoEXT.npSpecializationInfo(address(), value); return this; }

    }

}