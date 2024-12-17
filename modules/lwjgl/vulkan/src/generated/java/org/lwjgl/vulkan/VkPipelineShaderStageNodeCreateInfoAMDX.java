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
 * struct VkPipelineShaderStageNodeCreateInfoAMDX {
 *     VkStructureType sType;
 *     void const * pNext;
 *     char const * pName;
 *     uint32_t index;
 * }}</pre>
 */
public class VkPipelineShaderStageNodeCreateInfoAMDX extends Struct<VkPipelineShaderStageNodeCreateInfoAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PNAME,
        INDEX;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PNAME = layout.offsetof(2);
        INDEX = layout.offsetof(3);
    }

    protected VkPipelineShaderStageNodeCreateInfoAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPipelineShaderStageNodeCreateInfoAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(address, container);
    }

    /**
     * Creates a {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineShaderStageNodeCreateInfoAMDX(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public @Nullable ByteBuffer pName() { return npName(address()); }
    /** @return the null-terminated string pointed to by the {@code pName} field. */
    @NativeType("char const *")
    public @Nullable String pNameString() { return npNameString(address()); }
    /** @return the value of the {@code index} field. */
    @NativeType("uint32_t")
    public int index() { return nindex(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPipelineShaderStageNodeCreateInfoAMDX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX} value to the {@code sType} field. */
    public VkPipelineShaderStageNodeCreateInfoAMDX sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPipelineShaderStageNodeCreateInfoAMDX pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pName} field. */
    public VkPipelineShaderStageNodeCreateInfoAMDX pName(@Nullable @NativeType("char const *") ByteBuffer value) { npName(address(), value); return this; }
    /** Sets the specified value to the {@code index} field. */
    public VkPipelineShaderStageNodeCreateInfoAMDX index(@NativeType("uint32_t") int value) { nindex(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineShaderStageNodeCreateInfoAMDX set(
        int sType,
        long pNext,
        @Nullable ByteBuffer pName,
        int index
    ) {
        sType(sType);
        pNext(pNext);
        pName(pName);
        index(index);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineShaderStageNodeCreateInfoAMDX set(VkPipelineShaderStageNodeCreateInfoAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageNodeCreateInfoAMDX malloc() {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineShaderStageNodeCreateInfoAMDX calloc() {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance allocated with {@link BufferUtils}. */
    public static VkPipelineShaderStageNodeCreateInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineShaderStageNodeCreateInfoAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance for the specified memory address. */
    public static VkPipelineShaderStageNodeCreateInfoAMDX create(long address) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPipelineShaderStageNodeCreateInfoAMDX createSafe(long address) {
        return address == NULL ? null : new VkPipelineShaderStageNodeCreateInfoAMDX(address, null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX malloc(MemoryStack stack) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPipelineShaderStageNodeCreateInfoAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX calloc(MemoryStack stack) {
        return new VkPipelineShaderStageNodeCreateInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPipelineShaderStageNodeCreateInfoAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPipelineShaderStageNodeCreateInfoAMDX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPipelineShaderStageNodeCreateInfoAMDX.PNEXT); }
    /** Unsafe version of {@link #pName}. */
    public static @Nullable ByteBuffer npName(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + VkPipelineShaderStageNodeCreateInfoAMDX.PNAME)); }
    /** Unsafe version of {@link #pNameString}. */
    public static @Nullable String npNameString(long struct) { return memUTF8Safe(memGetAddress(struct + VkPipelineShaderStageNodeCreateInfoAMDX.PNAME)); }
    /** Unsafe version of {@link #index}. */
    public static int nindex(long struct) { return memGetInt(struct + VkPipelineShaderStageNodeCreateInfoAMDX.INDEX); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineShaderStageNodeCreateInfoAMDX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineShaderStageNodeCreateInfoAMDX.PNEXT, value); }
    /** Unsafe version of {@link #pName(ByteBuffer) pName}. */
    public static void npName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + VkPipelineShaderStageNodeCreateInfoAMDX.PNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #index(int) index}. */
    public static void nindex(long struct, int value) { memPutInt(struct + VkPipelineShaderStageNodeCreateInfoAMDX.INDEX, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineShaderStageNodeCreateInfoAMDX} structs. */
    public static class Buffer extends StructBuffer<VkPipelineShaderStageNodeCreateInfoAMDX, Buffer> implements NativeResource {

        private static final VkPipelineShaderStageNodeCreateInfoAMDX ELEMENT_FACTORY = VkPipelineShaderStageNodeCreateInfoAMDX.create(-1L);

        /**
         * Creates a new {@code VkPipelineShaderStageNodeCreateInfoAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineShaderStageNodeCreateInfoAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPipelineShaderStageNodeCreateInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPipelineShaderStageNodeCreateInfoAMDX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkPipelineShaderStageNodeCreateInfoAMDX.npNext(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public @Nullable ByteBuffer pName() { return VkPipelineShaderStageNodeCreateInfoAMDX.npName(address()); }
        /** @return the null-terminated string pointed to by the {@code pName} field. */
        @NativeType("char const *")
        public @Nullable String pNameString() { return VkPipelineShaderStageNodeCreateInfoAMDX.npNameString(address()); }
        /** @return the value of the {@code index} field. */
        @NativeType("uint32_t")
        public int index() { return VkPipelineShaderStageNodeCreateInfoAMDX.nindex(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPipelineShaderStageNodeCreateInfoAMDX.Buffer sType(@NativeType("VkStructureType") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.nsType(address(), value); return this; }
        /** Sets the {@link AMDXShaderEnqueue#VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX} value to the {@code sType} field. */
        public VkPipelineShaderStageNodeCreateInfoAMDX.Buffer sType$Default() { return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_NODE_CREATE_INFO_AMDX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPipelineShaderStageNodeCreateInfoAMDX.Buffer pNext(@NativeType("void const *") long value) { VkPipelineShaderStageNodeCreateInfoAMDX.npNext(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pName} field. */
        public VkPipelineShaderStageNodeCreateInfoAMDX.Buffer pName(@Nullable @NativeType("char const *") ByteBuffer value) { VkPipelineShaderStageNodeCreateInfoAMDX.npName(address(), value); return this; }
        /** Sets the specified value to the {@code index} field. */
        public VkPipelineShaderStageNodeCreateInfoAMDX.Buffer index(@NativeType("uint32_t") int value) { VkPipelineShaderStageNodeCreateInfoAMDX.nindex(address(), value); return this; }

    }

}