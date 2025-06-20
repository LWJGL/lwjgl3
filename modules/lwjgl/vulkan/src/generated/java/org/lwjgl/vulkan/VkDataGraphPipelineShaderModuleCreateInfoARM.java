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
 * <pre>{@code
 * struct VkDataGraphPipelineShaderModuleCreateInfoARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderModule module;
 *     char const * pName;
 *     {@link VkSpecializationInfo VkSpecializationInfo} const * pSpecializationInfo;
 *     uint32_t constantCount;
 *     {@link VkDataGraphPipelineConstantARM VkDataGraphPipelineConstantARM} const * pConstants;
 * }}</pre>
 */
public class VkDataGraphPipelineShaderModuleCreateInfoARM extends Struct<VkDataGraphPipelineShaderModuleCreateInfoARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MODULE,
        PNAME,
        PSPECIALIZATIONINFO,
        CONSTANTCOUNT,
        PCONSTANTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MODULE = layout.offsetof(2);
        PNAME = layout.offsetof(3);
        PSPECIALIZATIONINFO = layout.offsetof(4);
        CONSTANTCOUNT = layout.offsetof(5);
        PCONSTANTS = layout.offsetof(6);
    }

    protected VkDataGraphPipelineShaderModuleCreateInfoARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDataGraphPipelineShaderModuleCreateInfoARM create(long address, @Nullable ByteBuffer container) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(address, container);
    }

    /**
     * Creates a {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDataGraphPipelineShaderModuleCreateInfoARM(ByteBuffer container) {
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
    /** @return the value of the {@code constantCount} field. */
    @NativeType("uint32_t")
    public int constantCount() { return nconstantCount(address()); }
    /** @return a {@link VkDataGraphPipelineConstantARM.Buffer} view of the struct array pointed to by the {@code pConstants} field. */
    @NativeType("VkDataGraphPipelineConstantARM const *")
    public VkDataGraphPipelineConstantARM.@Nullable Buffer pConstants() { return npConstants(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM} value to the {@code sType} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code module} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM module(@NativeType("VkShaderModule") long value) { nmodule(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pName} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM pName(@NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { npSpecializationInfo(address(), value); return this; }
    /** Sets the specified value to the {@code constantCount} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM constantCount(@NativeType("uint32_t") int value) { nconstantCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkDataGraphPipelineConstantARM.Buffer} to the {@code pConstants} field. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM pConstants(@NativeType("VkDataGraphPipelineConstantARM const *") VkDataGraphPipelineConstantARM.@Nullable Buffer value) { npConstants(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDataGraphPipelineShaderModuleCreateInfoARM set(
        int sType,
        long pNext,
        long module,
        ByteBuffer pName,
        @Nullable VkSpecializationInfo pSpecializationInfo,
        int constantCount,
        VkDataGraphPipelineConstantARM.@Nullable Buffer pConstants
    ) {
        sType(sType);
        pNext(pNext);
        module(module);
        pName(pName);
        pSpecializationInfo(pSpecializationInfo);
        constantCount(constantCount);
        pConstants(pConstants);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDataGraphPipelineShaderModuleCreateInfoARM set(VkDataGraphPipelineShaderModuleCreateInfoARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM malloc() {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM calloc() {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance allocated with {@link BufferUtils}. */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(memAddress(container), container);
    }

    /** Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance for the specified memory address. */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM create(long address) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDataGraphPipelineShaderModuleCreateInfoARM createSafe(long address) {
        return address == NULL ? null : new VkDataGraphPipelineShaderModuleCreateInfoARM(address, null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM malloc(MemoryStack stack) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM calloc(MemoryStack stack) {
        return new VkDataGraphPipelineShaderModuleCreateInfoARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNEXT); }
    /** Unsafe version of {@link #module}. */
    public static long nmodule(long struct) { return memGetLong(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.MODULE); }
    /** Unsafe version of {@link #pName}. */
    public static ByteBuffer npName(long struct) { return memByteBufferNT1(memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static String npNameString(long struct) { return memUTF8(memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNAME)); }
    /** Unsafe version of {@link #pSpecializationInfo}. */
    public static @Nullable VkSpecializationInfo npSpecializationInfo(long struct) { return VkSpecializationInfo.createSafe(memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PSPECIALIZATIONINFO)); }
    /** Unsafe version of {@link #constantCount}. */
    public static int nconstantCount(long struct) { return memGetInt(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.CONSTANTCOUNT); }
    /** Unsafe version of {@link #pConstants}. */
    public static VkDataGraphPipelineConstantARM.@Nullable Buffer npConstants(long struct) { return VkDataGraphPipelineConstantARM.createSafe(memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PCONSTANTS), nconstantCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNEXT, value); }
    /** Unsafe version of {@link #module(long) module}. */
    public static void nmodule(long struct, long value) { memPutLong(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.MODULE, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNAME, memAddress(value));
    }
    /** Unsafe version of {@link #pSpecializationInfo(VkSpecializationInfo) pSpecializationInfo}. */
    public static void npSpecializationInfo(long struct, @Nullable VkSpecializationInfo value) { memPutAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PSPECIALIZATIONINFO, memAddressSafe(value)); }
    /** Sets the specified value to the {@code constantCount} field of the specified {@code struct}. */
    public static void nconstantCount(long struct, int value) { memPutInt(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.CONSTANTCOUNT, value); }
    /** Unsafe version of {@link #pConstants(VkDataGraphPipelineConstantARM.Buffer) pConstants}. */
    public static void npConstants(long struct, VkDataGraphPipelineConstantARM.@Nullable Buffer value) { memPutAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PCONSTANTS, memAddressSafe(value)); if (value != null) { nconstantCount(struct, value.remaining()); } }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PNAME));
        long pSpecializationInfo = memGetAddress(struct + VkDataGraphPipelineShaderModuleCreateInfoARM.PSPECIALIZATIONINFO);
        if (pSpecializationInfo != NULL) {
            VkSpecializationInfo.validate(pSpecializationInfo);
        }
    }

    // -----------------------------------

    /** An array of {@link VkDataGraphPipelineShaderModuleCreateInfoARM} structs. */
    public static class Buffer extends StructBuffer<VkDataGraphPipelineShaderModuleCreateInfoARM, Buffer> implements NativeResource {

        private static final VkDataGraphPipelineShaderModuleCreateInfoARM ELEMENT_FACTORY = VkDataGraphPipelineShaderModuleCreateInfoARM.create(-1L);

        /**
         * Creates a new {@code VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDataGraphPipelineShaderModuleCreateInfoARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDataGraphPipelineShaderModuleCreateInfoARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkDataGraphPipelineShaderModuleCreateInfoARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkDataGraphPipelineShaderModuleCreateInfoARM.npNext(address()); }
        /** @return the value of the {@code module} field. */
        @NativeType("VkShaderModule")
        public long module() { return VkDataGraphPipelineShaderModuleCreateInfoARM.nmodule(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public ByteBuffer pName() { return VkDataGraphPipelineShaderModuleCreateInfoARM.npName(address()); }
        /** @return the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public String pNameString() { return VkDataGraphPipelineShaderModuleCreateInfoARM.npNameString(address()); }
        /** @return a {@link VkSpecializationInfo} view of the struct pointed to by the {@code pSpecializationInfo} field. */
        @NativeType("VkSpecializationInfo const *")
        public @Nullable VkSpecializationInfo pSpecializationInfo() { return VkDataGraphPipelineShaderModuleCreateInfoARM.npSpecializationInfo(address()); }
        /** @return the value of the {@code constantCount} field. */
        @NativeType("uint32_t")
        public int constantCount() { return VkDataGraphPipelineShaderModuleCreateInfoARM.nconstantCount(address()); }
        /** @return a {@link VkDataGraphPipelineConstantARM.Buffer} view of the struct array pointed to by the {@code pConstants} field. */
        @NativeType("VkDataGraphPipelineConstantARM const *")
        public VkDataGraphPipelineConstantARM.@Nullable Buffer pConstants() { return VkDataGraphPipelineShaderModuleCreateInfoARM.npConstants(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer sType(@NativeType("VkStructureType") int value) { VkDataGraphPipelineShaderModuleCreateInfoARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMDataGraph#VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM} value to the {@code sType} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer sType$Default() { return sType(ARMDataGraph.VK_STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SHADER_MODULE_CREATE_INFO_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer pNext(@NativeType("void const *") long value) { VkDataGraphPipelineShaderModuleCreateInfoARM.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkShaderModuleCreateInfo} value to the {@code pNext} chain. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer pNext(VkShaderModuleCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code module} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer module(@NativeType("VkShaderModule") long value) { VkDataGraphPipelineShaderModuleCreateInfoARM.nmodule(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pName} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer pName(@NativeType("char const *") ByteBuffer value) { VkDataGraphPipelineShaderModuleCreateInfoARM.npName(address(), value); return this; }
        /** Sets the address of the specified {@link VkSpecializationInfo} to the {@code pSpecializationInfo} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer pSpecializationInfo(@Nullable @NativeType("VkSpecializationInfo const *") VkSpecializationInfo value) { VkDataGraphPipelineShaderModuleCreateInfoARM.npSpecializationInfo(address(), value); return this; }
        /** Sets the specified value to the {@code constantCount} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer constantCount(@NativeType("uint32_t") int value) { VkDataGraphPipelineShaderModuleCreateInfoARM.nconstantCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkDataGraphPipelineConstantARM.Buffer} to the {@code pConstants} field. */
        public VkDataGraphPipelineShaderModuleCreateInfoARM.Buffer pConstants(@NativeType("VkDataGraphPipelineConstantARM const *") VkDataGraphPipelineConstantARM.@Nullable Buffer value) { VkDataGraphPipelineShaderModuleCreateInfoARM.npConstants(address(), value); return this; }

    }

}