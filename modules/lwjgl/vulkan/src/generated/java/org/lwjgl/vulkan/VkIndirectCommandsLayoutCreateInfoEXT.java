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
 * struct VkIndirectCommandsLayoutCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectCommandsLayoutUsageFlagsEXT flags;
 *     VkShaderStageFlags shaderStages;
 *     uint32_t indirectStride;
 *     VkPipelineLayout pipelineLayout;
 *     uint32_t tokenCount;
 *     {@link VkIndirectCommandsLayoutTokenEXT VkIndirectCommandsLayoutTokenEXT} const * pTokens;
 * }}</pre>
 */
public class VkIndirectCommandsLayoutCreateInfoEXT extends Struct<VkIndirectCommandsLayoutCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SHADERSTAGES,
        INDIRECTSTRIDE,
        PIPELINELAYOUT,
        TOKENCOUNT,
        PTOKENS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(8),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SHADERSTAGES = layout.offsetof(3);
        INDIRECTSTRIDE = layout.offsetof(4);
        PIPELINELAYOUT = layout.offsetof(5);
        TOKENCOUNT = layout.offsetof(6);
        PTOKENS = layout.offsetof(7);
    }

    protected VkIndirectCommandsLayoutCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutCreateInfoEXT(ByteBuffer container) {
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
    @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code shaderStages} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderStages() { return nshaderStages(address()); }
    /** @return the value of the {@code indirectStride} field. */
    @NativeType("uint32_t")
    public int indirectStride() { return nindirectStride(address()); }
    /** @return the value of the {@code pipelineLayout} field. */
    @NativeType("VkPipelineLayout")
    public long pipelineLayout() { return npipelineLayout(address()); }
    /** @return the value of the {@code tokenCount} field. */
    @NativeType("uint32_t")
    public int tokenCount() { return ntokenCount(address()); }
    /** @return a {@link VkIndirectCommandsLayoutTokenEXT.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
    @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
    public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() { return npTokens(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
    public VkIndirectCommandsLayoutCreateInfoEXT pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code flags} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code shaderStages} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) { nshaderStages(address(), value); return this; }
    /** Sets the specified value to the {@code indirectStride} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT indirectStride(@NativeType("uint32_t") int value) { nindirectStride(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineLayout} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pipelineLayout(@NativeType("VkPipelineLayout") long value) { npipelineLayout(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenEXT.Buffer} to the {@code pTokens} field. */
    public VkIndirectCommandsLayoutCreateInfoEXT pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) { npTokens(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutCreateInfoEXT set(
        int sType,
        long pNext,
        int flags,
        int shaderStages,
        int indirectStride,
        long pipelineLayout,
        VkIndirectCommandsLayoutTokenEXT.Buffer pTokens
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        shaderStages(shaderStages);
        indirectStride(indirectStride);
        pipelineLayout(pipelineLayout);
        pTokens(pTokens);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutCreateInfoEXT set(VkIndirectCommandsLayoutCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoEXT malloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoEXT calloc() {
        return new VkIndirectCommandsLayoutCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutCreateInfoEXT create(long address) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.FLAGS); }
    /** Unsafe version of {@link #shaderStages}. */
    public static int nshaderStages(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.SHADERSTAGES); }
    /** Unsafe version of {@link #indirectStride}. */
    public static int nindirectStride(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.INDIRECTSTRIDE); }
    /** Unsafe version of {@link #pipelineLayout}. */
    public static long npipelineLayout(long struct) { return memGetLong(struct + VkIndirectCommandsLayoutCreateInfoEXT.PIPELINELAYOUT); }
    /** Unsafe version of {@link #tokenCount}. */
    public static int ntokenCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.TOKENCOUNT); }
    /** Unsafe version of {@link #pTokens}. */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer npTokens(long struct) { return VkIndirectCommandsLayoutTokenEXT.create(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS), ntokenCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.FLAGS, value); }
    /** Unsafe version of {@link #shaderStages(int) shaderStages}. */
    public static void nshaderStages(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.SHADERSTAGES, value); }
    /** Unsafe version of {@link #indirectStride(int) indirectStride}. */
    public static void nindirectStride(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.INDIRECTSTRIDE, value); }
    /** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
    public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkIndirectCommandsLayoutCreateInfoEXT.PIPELINELAYOUT, value); }
    /** Sets the specified value to the {@code tokenCount} field of the specified {@code struct}. */
    public static void ntokenCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoEXT.TOKENCOUNT, value); }
    /** Unsafe version of {@link #pTokens(VkIndirectCommandsLayoutTokenEXT.Buffer) pTokens}. */
    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenEXT.Buffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS, value.address()); ntokenCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoEXT.PTOKENS));
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutCreateInfoEXT ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkIndirectCommandsLayoutUsageFlagsEXT")
        public int flags() { return VkIndirectCommandsLayoutCreateInfoEXT.nflags(address()); }
        /** @return the value of the {@code shaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStages() { return VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address()); }
        /** @return the value of the {@code indirectStride} field. */
        @NativeType("uint32_t")
        public int indirectStride() { return VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address()); }
        /** @return the value of the {@code pipelineLayout} field. */
        @NativeType("VkPipelineLayout")
        public long pipelineLayout() { return VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address()); }
        /** @return the value of the {@code tokenCount} field. */
        @NativeType("uint32_t")
        public int tokenCount() { return VkIndirectCommandsLayoutCreateInfoEXT.ntokenCount(address()); }
        /** @return a {@link VkIndirectCommandsLayoutTokenEXT.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
        @NativeType("VkIndirectCommandsLayoutTokenEXT const *")
        public VkIndirectCommandsLayoutTokenEXT.Buffer pTokens() { return VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutCreateInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPipelineLayoutCreateInfo} value to the {@code pNext} chain. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pNext(VkPipelineLayoutCreateInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code flags} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsEXT") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code shaderStages} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nshaderStages(address(), value); return this; }
        /** Sets the specified value to the {@code indirectStride} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer indirectStride(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutCreateInfoEXT.nindirectStride(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineLayout} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pipelineLayout(@NativeType("VkPipelineLayout") long value) { VkIndirectCommandsLayoutCreateInfoEXT.npipelineLayout(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenEXT.Buffer} to the {@code pTokens} field. */
        public VkIndirectCommandsLayoutCreateInfoEXT.Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenEXT const *") VkIndirectCommandsLayoutTokenEXT.Buffer value) { VkIndirectCommandsLayoutCreateInfoEXT.npTokens(address(), value); return this; }

    }

}