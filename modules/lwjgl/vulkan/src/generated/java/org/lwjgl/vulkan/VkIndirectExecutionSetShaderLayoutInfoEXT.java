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
 * <pre>{@code
 * struct VkIndirectExecutionSetShaderLayoutInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     uint32_t setLayoutCount;
 *     VkDescriptorSetLayout const * pSetLayouts;
 * }}</pre>
 */
public class VkIndirectExecutionSetShaderLayoutInfoEXT extends Struct<VkIndirectExecutionSetShaderLayoutInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SETLAYOUTCOUNT,
        PSETLAYOUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SETLAYOUTCOUNT = layout.offsetof(2);
        PSETLAYOUTS = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetShaderLayoutInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetShaderLayoutInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetShaderLayoutInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code setLayoutCount} field. */
    @NativeType("uint32_t")
    public int setLayoutCount() { return nsetLayoutCount(address()); }
    /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
    @NativeType("VkDescriptorSetLayout const *")
    public @Nullable LongBuffer pSetLayouts() { return npSetLayouts(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT} value to the {@code sType} field. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code setLayoutCount} field. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT setLayoutCount(@NativeType("uint32_t") int value) { nsetLayoutCount(address(), value); return this; }
    /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { npSetLayouts(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectExecutionSetShaderLayoutInfoEXT set(
        int sType,
        long pNext,
        int setLayoutCount,
        @Nullable LongBuffer pSetLayouts
    ) {
        sType(sType);
        pNext(pNext);
        setLayoutCount(setLayoutCount);
        pSetLayouts(pSetLayouts);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetShaderLayoutInfoEXT set(VkIndirectExecutionSetShaderLayoutInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT malloc() {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT calloc() {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT create(long address) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectExecutionSetShaderLayoutInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetShaderLayoutInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetShaderLayoutInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.PNEXT); }
    /** Unsafe version of {@link #setLayoutCount}. */
    public static int nsetLayoutCount(long struct) { return memGetInt(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.SETLAYOUTCOUNT); }
    /** Unsafe version of {@link #pSetLayouts() pSetLayouts}. */
    public static @Nullable LongBuffer npSetLayouts(long struct) { return memLongBufferSafe(memGetAddress(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.PSETLAYOUTS), nsetLayoutCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.PNEXT, value); }
    /** Sets the specified value to the {@code setLayoutCount} field of the specified {@code struct}. */
    public static void nsetLayoutCount(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.SETLAYOUTCOUNT, value); }
    /** Unsafe version of {@link #pSetLayouts(LongBuffer) pSetLayouts}. */
    public static void npSetLayouts(long struct, @Nullable LongBuffer value) { memPutAddress(struct + VkIndirectExecutionSetShaderLayoutInfoEXT.PSETLAYOUTS, memAddressSafe(value)); if (value != null) { nsetLayoutCount(struct, value.remaining()); } }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetShaderLayoutInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetShaderLayoutInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetShaderLayoutInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetShaderLayoutInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetShaderLayoutInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetShaderLayoutInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectExecutionSetShaderLayoutInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectExecutionSetShaderLayoutInfoEXT.npNext(address()); }
        /** @return the value of the {@code setLayoutCount} field. */
        @NativeType("uint32_t")
        public int setLayoutCount() { return VkIndirectExecutionSetShaderLayoutInfoEXT.nsetLayoutCount(address()); }
        /** @return a {@link LongBuffer} view of the data pointed to by the {@code pSetLayouts} field. */
        @NativeType("VkDescriptorSetLayout const *")
        public @Nullable LongBuffer pSetLayouts() { return VkIndirectExecutionSetShaderLayoutInfoEXT.npSetLayouts(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT} value to the {@code sType} field. */
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_SHADER_LAYOUT_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectExecutionSetShaderLayoutInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code setLayoutCount} field. */
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer setLayoutCount(@NativeType("uint32_t") int value) { VkIndirectExecutionSetShaderLayoutInfoEXT.nsetLayoutCount(address(), value); return this; }
        /** Sets the address of the specified {@link LongBuffer} to the {@code pSetLayouts} field. */
        public VkIndirectExecutionSetShaderLayoutInfoEXT.Buffer pSetLayouts(@Nullable @NativeType("VkDescriptorSetLayout const *") LongBuffer value) { VkIndirectExecutionSetShaderLayoutInfoEXT.npSetLayouts(address(), value); return this; }

    }

}