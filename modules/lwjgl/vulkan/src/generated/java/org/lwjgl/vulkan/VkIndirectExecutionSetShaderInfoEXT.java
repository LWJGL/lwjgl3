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
 * struct VkIndirectExecutionSetShaderInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t shaderCount;
 *     VkShaderEXT const * pInitialShaders;
 *     {@link VkIndirectExecutionSetShaderLayoutInfoEXT VkIndirectExecutionSetShaderLayoutInfoEXT} const * pSetLayoutInfos;
 *     uint32_t maxShaderCount;
 *     uint32_t pushConstantRangeCount;
 *     {@link VkPushConstantRange VkPushConstantRange} const * pPushConstantRanges;
 * }}</pre>
 */
public class VkIndirectExecutionSetShaderInfoEXT extends Struct<VkIndirectExecutionSetShaderInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERCOUNT,
        PINITIALSHADERS,
        PSETLAYOUTINFOS,
        MAXSHADERCOUNT,
        PUSHCONSTANTRANGECOUNT,
        PPUSHCONSTANTRANGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERCOUNT = layout.offsetof(2);
        PINITIALSHADERS = layout.offsetof(3);
        PSETLAYOUTINFOS = layout.offsetof(4);
        MAXSHADERCOUNT = layout.offsetof(5);
        PUSHCONSTANTRANGECOUNT = layout.offsetof(6);
        PPUSHCONSTANTRANGES = layout.offsetof(7);
    }

    protected VkIndirectExecutionSetShaderInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetShaderInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetShaderInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetShaderInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderCount} field. */
    @NativeType("uint32_t")
    public int shaderCount() { return nshaderCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pInitialShaders} field. */
    @NativeType("VkShaderEXT const *")
    public LongBuffer pInitialShaders() { return npInitialShaders(address()); }
    /** @return a {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} view of the struct array pointed to by the {@code pSetLayoutInfos} field. */
    @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
    public VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer pSetLayoutInfos() { return npSetLayoutInfos(address()); }
    /** @return the value of the {@code maxShaderCount} field. */
    @NativeType("uint32_t")
    public int maxShaderCount() { return nmaxShaderCount(address()); }
    /** @return the value of the {@code pushConstantRangeCount} field. */
    @NativeType("uint32_t")
    public int pushConstantRangeCount() { return npushConstantRangeCount(address()); }
    /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
    @NativeType("VkPushConstantRange const *")
    public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return npPushConstantRanges(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectExecutionSetShaderInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT} value to the {@code sType} field. */
    public VkIndirectExecutionSetShaderInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectExecutionSetShaderInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code shaderCount} field. */
    public VkIndirectExecutionSetShaderInfoEXT shaderCount(@NativeType("uint32_t") int value) { nshaderCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pInitialShaders} field. */
    public VkIndirectExecutionSetShaderInfoEXT pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { npInitialShaders(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} to the {@code pSetLayoutInfos} field. */
    public VkIndirectExecutionSetShaderInfoEXT pSetLayoutInfos(@NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer value) { npSetLayoutInfos(address(), value); return this; }
    /** Sets the specified value to the {@code maxShaderCount} field. */
    public VkIndirectExecutionSetShaderInfoEXT maxShaderCount(@NativeType("uint32_t") int value) { nmaxShaderCount(address(), value); return this; }
    /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
    public VkIndirectExecutionSetShaderInfoEXT pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { npPushConstantRanges(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectExecutionSetShaderInfoEXT set(
        int sType,
        long pNext,
        int shaderCount,
        LongBuffer pInitialShaders,
        VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer pSetLayoutInfos,
        int maxShaderCount,
        VkPushConstantRange.@Nullable Buffer pPushConstantRanges
    ) {
        sType(sType);
        pNext(pNext);
        shaderCount(shaderCount);
        pInitialShaders(pInitialShaders);
        pSetLayoutInfos(pSetLayoutInfos);
        maxShaderCount(maxShaderCount);
        pPushConstantRanges(pPushConstantRanges);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetShaderInfoEXT set(VkIndirectExecutionSetShaderInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderInfoEXT malloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderInfoEXT calloc() {
        return new VkIndirectExecutionSetShaderInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetShaderInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetShaderInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetShaderInfoEXT create(long address) {
        return new VkIndirectExecutionSetShaderInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectExecutionSetShaderInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetShaderInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectExecutionSetShaderInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PNEXT); }
    /** Unsafe version of {@link #shaderCount}. */
    public static int nshaderCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.SHADERCOUNT); }
    /** Unsafe version of {@link #pInitialShaders() pInitialShaders}. */
    public static LongBuffer npInitialShaders(long struct) { return memLongBuffer(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS), nshaderCount(struct)); }
    /** Unsafe version of {@link #pSetLayoutInfos}. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer npSetLayoutInfos(long struct) { return VkIndirectExecutionSetShaderLayoutInfoEXT.createSafe(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PSETLAYOUTINFOS), nshaderCount(struct)); }
    /** Unsafe version of {@link #maxShaderCount}. */
    public static int nmaxShaderCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.MAXSHADERCOUNT); }
    /** Unsafe version of {@link #pushConstantRangeCount}. */
    public static int npushConstantRangeCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderInfoEXT.PUSHCONSTANTRANGECOUNT); }
    /** Unsafe version of {@link #pPushConstantRanges}. */
    public static VkPushConstantRange.@Nullable Buffer npPushConstantRanges(long struct) { return VkPushConstantRange.createSafe(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES), npushConstantRangeCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code shaderCount} field of the specified {@code struct}. */
    public static void nshaderCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.SHADERCOUNT, value); }
    /** Unsafe version of {@link #pInitialShaders(LongBuffer) pInitialShaders}. */
    public static void npInitialShaders(long struct, LongBuffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS, memAddress(value)); }
    /** Unsafe version of {@link #pSetLayoutInfos(VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer) pSetLayoutInfos}. */
    public static void npSetLayoutInfos(long struct, VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PSETLAYOUTINFOS, memAddressSafe(value)); }
    /** Unsafe version of {@link #maxShaderCount(int) maxShaderCount}. */
    public static void nmaxShaderCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.MAXSHADERCOUNT, value); }
    /** Sets the specified value to the {@code pushConstantRangeCount} field of the specified {@code struct}. */
    public static void npushConstantRangeCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderInfoEXT.PUSHCONSTANTRANGECOUNT, value); }
    /** Unsafe version of {@link #pPushConstantRanges(VkPushConstantRange.Buffer) pPushConstantRanges}. */
    public static void npPushConstantRanges(long struct, VkPushConstantRange.@Nullable Buffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES, memAddressSafe(value)); npushConstantRangeCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PINITIALSHADERS));
        if (npushConstantRangeCount(struct) != 0) {
            check(memGetAddress(struct + VkIndirectExecutionSetShaderInfoEXT.PPUSHCONSTANTRANGES));
        }
    }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetShaderInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetShaderInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetShaderInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetShaderInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetShaderInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetShaderInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetShaderInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectExecutionSetShaderInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectExecutionSetShaderInfoEXT.npNext(address()); }
        /** @return the value of the {@code shaderCount} field. */
        @NativeType("uint32_t")
        public int shaderCount() { return VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pInitialShaders} field. */
        @NativeType("VkShaderEXT const *")
        public LongBuffer pInitialShaders() { return VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address()); }
        /** @return a {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} view of the struct array pointed to by the {@code pSetLayoutInfos} field. */
        @NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *")
        public VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer pSetLayoutInfos() { return VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address()); }
        /** @return the value of the {@code maxShaderCount} field. */
        @NativeType("uint32_t")
        public int maxShaderCount() { return VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address()); }
        /** @return the value of the {@code pushConstantRangeCount} field. */
        @NativeType("uint32_t")
        public int pushConstantRangeCount() { return VkIndirectExecutionSetShaderInfoEXT.npushConstantRangeCount(address()); }
        /** @return a {@link VkPushConstantRange.Buffer} view of the struct array pointed to by the {@code pPushConstantRanges} field. */
        @NativeType("VkPushConstantRange const *")
        public VkPushConstantRange.@Nullable Buffer pPushConstantRanges() { return VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectExecutionSetShaderInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT} value to the {@code sType} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectExecutionSetShaderInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code shaderCount} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer shaderCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.nshaderCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pInitialShaders} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pInitialShaders(@NativeType("VkShaderEXT const *") LongBuffer value) { VkIndirectExecutionSetShaderInfoEXT.npInitialShaders(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} to the {@code pSetLayoutInfos} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pSetLayoutInfos(@NativeType("VkIndirectExecutionSetShaderLayoutInfoEXT const *") VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer value) { VkIndirectExecutionSetShaderInfoEXT.npSetLayoutInfos(address(), value); return this; }
        /** Sets the specified value to the {@code maxShaderCount} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer maxShaderCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetShaderInfoEXT.nmaxShaderCount(address(), value); return this; }
        /** Sets the address of the specified {@link VkPushConstantRange.Buffer} to the {@code pPushConstantRanges} field. */
        public VkIndirectExecutionSetShaderInfoEXT.Buffer pPushConstantRanges(@NativeType("VkPushConstantRange const *") VkPushConstantRange.@Nullable Buffer value) { VkIndirectExecutionSetShaderInfoEXT.npPushConstantRanges(address(), value); return this; }

    }

}