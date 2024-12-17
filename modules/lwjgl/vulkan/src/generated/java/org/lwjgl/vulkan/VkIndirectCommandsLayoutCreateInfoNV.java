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
 * struct VkIndirectCommandsLayoutCreateInfoNV {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectCommandsLayoutUsageFlagsNV flags;
 *     VkPipelineBindPoint pipelineBindPoint;
 *     uint32_t tokenCount;
 *     {@link VkIndirectCommandsLayoutTokenNV VkIndirectCommandsLayoutTokenNV} const * pTokens;
 *     uint32_t streamCount;
 *     uint32_t const * pStreamStrides;
 * }}</pre>
 */
public class VkIndirectCommandsLayoutCreateInfoNV extends Struct<VkIndirectCommandsLayoutCreateInfoNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        PIPELINEBINDPOINT,
        TOKENCOUNT,
        PTOKENS,
        STREAMCOUNT,
        PSTREAMSTRIDES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PIPELINEBINDPOINT = layout.offsetof(3);
        TOKENCOUNT = layout.offsetof(4);
        PTOKENS = layout.offsetof(5);
        STREAMCOUNT = layout.offsetof(6);
        PSTREAMSTRIDES = layout.offsetof(7);
    }

    protected VkIndirectCommandsLayoutCreateInfoNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutCreateInfoNV create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutCreateInfoNV(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutCreateInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutCreateInfoNV(ByteBuffer container) {
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
    @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code pipelineBindPoint} field. */
    @NativeType("VkPipelineBindPoint")
    public int pipelineBindPoint() { return npipelineBindPoint(address()); }
    /** @return the value of the {@code tokenCount} field. */
    @NativeType("uint32_t")
    public int tokenCount() { return ntokenCount(address()); }
    /** @return a {@link VkIndirectCommandsLayoutTokenNV.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
    @NativeType("VkIndirectCommandsLayoutTokenNV const *")
    public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() { return npTokens(address()); }
    /** @return the value of the {@code streamCount} field. */
    @NativeType("uint32_t")
    public int streamCount() { return nstreamCount(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code pStreamStrides} field. */
    @NativeType("uint32_t const *")
    public IntBuffer pStreamStrides() { return npStreamStrides(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutCreateInfoNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV} value to the {@code sType} field. */
    public VkIndirectCommandsLayoutCreateInfoNV sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkIndirectCommandsLayoutCreateInfoNV flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code pipelineBindPoint} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { npipelineBindPoint(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNV.Buffer} to the {@code pTokens} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) { npTokens(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pStreamStrides} field. */
    public VkIndirectCommandsLayoutCreateInfoNV pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) { npStreamStrides(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutCreateInfoNV set(
        int sType,
        long pNext,
        int flags,
        int pipelineBindPoint,
        VkIndirectCommandsLayoutTokenNV.Buffer pTokens,
        IntBuffer pStreamStrides
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pipelineBindPoint(pipelineBindPoint);
        pTokens(pTokens);
        pStreamStrides(pStreamStrides);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutCreateInfoNV set(VkIndirectCommandsLayoutCreateInfoNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNV malloc() {
        return new VkIndirectCommandsLayoutCreateInfoNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutCreateInfoNV calloc() {
        return new VkIndirectCommandsLayoutCreateInfoNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutCreateInfoNV(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutCreateInfoNV create(long address) {
        return new VkIndirectCommandsLayoutCreateInfoNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutCreateInfoNV createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutCreateInfoNV(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutCreateInfoNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutCreateInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutCreateInfoNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutCreateInfoNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoNV.FLAGS); }
    /** Unsafe version of {@link #pipelineBindPoint}. */
    public static int npipelineBindPoint(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoNV.PIPELINEBINDPOINT); }
    /** Unsafe version of {@link #tokenCount}. */
    public static int ntokenCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoNV.TOKENCOUNT); }
    /** Unsafe version of {@link #pTokens}. */
    public static VkIndirectCommandsLayoutTokenNV.Buffer npTokens(long struct) { return VkIndirectCommandsLayoutTokenNV.create(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS), ntokenCount(struct)); }
    /** Unsafe version of {@link #streamCount}. */
    public static int nstreamCount(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutCreateInfoNV.STREAMCOUNT); }
    /** Unsafe version of {@link #pStreamStrides() pStreamStrides}. */
    public static IntBuffer npStreamStrides(long struct) { return memIntBuffer(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES), nstreamCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoNV.FLAGS, value); }
    /** Unsafe version of {@link #pipelineBindPoint(int) pipelineBindPoint}. */
    public static void npipelineBindPoint(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoNV.PIPELINEBINDPOINT, value); }
    /** Sets the specified value to the {@code tokenCount} field of the specified {@code struct}. */
    public static void ntokenCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoNV.TOKENCOUNT, value); }
    /** Unsafe version of {@link #pTokens(VkIndirectCommandsLayoutTokenNV.Buffer) pTokens}. */
    public static void npTokens(long struct, VkIndirectCommandsLayoutTokenNV.Buffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS, value.address()); ntokenCount(struct, value.remaining()); }
    /** Sets the specified value to the {@code streamCount} field of the specified {@code struct}. */
    public static void nstreamCount(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutCreateInfoNV.STREAMCOUNT, value); }
    /** Unsafe version of {@link #pStreamStrides(IntBuffer) pStreamStrides}. */
    public static void npStreamStrides(long struct, IntBuffer value) { memPutAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES, memAddress(value)); nstreamCount(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        int tokenCount = ntokenCount(struct);
        long pTokens = memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PTOKENS);
        check(pTokens);
        validate(pTokens, tokenCount, VkIndirectCommandsLayoutTokenNV.SIZEOF, VkIndirectCommandsLayoutTokenNV::validate);
        check(memGetAddress(struct + VkIndirectCommandsLayoutCreateInfoNV.PSTREAMSTRIDES));
    }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutCreateInfoNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutCreateInfoNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutCreateInfoNV ELEMENT_FACTORY = VkIndirectCommandsLayoutCreateInfoNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutCreateInfoNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutCreateInfoNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutCreateInfoNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutCreateInfoNV.npNext(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("VkIndirectCommandsLayoutUsageFlagsNV")
        public int flags() { return VkIndirectCommandsLayoutCreateInfoNV.nflags(address()); }
        /** @return the value of the {@code pipelineBindPoint} field. */
        @NativeType("VkPipelineBindPoint")
        public int pipelineBindPoint() { return VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address()); }
        /** @return the value of the {@code tokenCount} field. */
        @NativeType("uint32_t")
        public int tokenCount() { return VkIndirectCommandsLayoutCreateInfoNV.ntokenCount(address()); }
        /** @return a {@link VkIndirectCommandsLayoutTokenNV.Buffer} view of the struct array pointed to by the {@code pTokens} field. */
        @NativeType("VkIndirectCommandsLayoutTokenNV const *")
        public VkIndirectCommandsLayoutTokenNV.Buffer pTokens() { return VkIndirectCommandsLayoutCreateInfoNV.npTokens(address()); }
        /** @return the value of the {@code streamCount} field. */
        @NativeType("uint32_t")
        public int streamCount() { return VkIndirectCommandsLayoutCreateInfoNV.nstreamCount(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code pStreamStrides} field. */
        @NativeType("uint32_t const *")
        public IntBuffer pStreamStrides() { return VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutCreateInfoNV.nsType(address(), value); return this; }
        /** Sets the {@link NVDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV} value to the {@code sType} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer sType$Default() { return sType(NVDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutCreateInfoNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer flags(@NativeType("VkIndirectCommandsLayoutUsageFlagsNV") int value) { VkIndirectCommandsLayoutCreateInfoNV.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code pipelineBindPoint} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pipelineBindPoint(@NativeType("VkPipelineBindPoint") int value) { VkIndirectCommandsLayoutCreateInfoNV.npipelineBindPoint(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsLayoutTokenNV.Buffer} to the {@code pTokens} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pTokens(@NativeType("VkIndirectCommandsLayoutTokenNV const *") VkIndirectCommandsLayoutTokenNV.Buffer value) { VkIndirectCommandsLayoutCreateInfoNV.npTokens(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pStreamStrides} field. */
        public VkIndirectCommandsLayoutCreateInfoNV.Buffer pStreamStrides(@NativeType("uint32_t const *") IntBuffer value) { VkIndirectCommandsLayoutCreateInfoNV.npStreamStrides(address(), value); return this; }

    }

}