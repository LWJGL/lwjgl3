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
 * struct VkGeneratedCommandsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkShaderStageFlags shaderStages;
 *     VkIndirectExecutionSetEXT indirectExecutionSet;
 *     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
 *     VkDeviceAddress indirectAddress;
 *     VkDeviceSize indirectAddressSize;
 *     VkDeviceAddress preprocessAddress;
 *     VkDeviceSize preprocessSize;
 *     uint32_t maxSequenceCount;
 *     VkDeviceAddress sequenceCountAddress;
 *     uint32_t maxDrawCount;
 * }}</pre>
 */
public class VkGeneratedCommandsInfoEXT extends Struct<VkGeneratedCommandsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SHADERSTAGES,
        INDIRECTEXECUTIONSET,
        INDIRECTCOMMANDSLAYOUT,
        INDIRECTADDRESS,
        INDIRECTADDRESSSIZE,
        PREPROCESSADDRESS,
        PREPROCESSSIZE,
        MAXSEQUENCECOUNT,
        SEQUENCECOUNTADDRESS,
        MAXDRAWCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(4),
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERSTAGES = layout.offsetof(2);
        INDIRECTEXECUTIONSET = layout.offsetof(3);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(4);
        INDIRECTADDRESS = layout.offsetof(5);
        INDIRECTADDRESSSIZE = layout.offsetof(6);
        PREPROCESSADDRESS = layout.offsetof(7);
        PREPROCESSSIZE = layout.offsetof(8);
        MAXSEQUENCECOUNT = layout.offsetof(9);
        SEQUENCECOUNTADDRESS = layout.offsetof(10);
        MAXDRAWCOUNT = layout.offsetof(11);
    }

    protected VkGeneratedCommandsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code shaderStages} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderStages() { return nshaderStages(address()); }
    /** @return the value of the {@code indirectExecutionSet} field. */
    @NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() { return nindirectExecutionSet(address()); }
    /** @return the value of the {@code indirectCommandsLayout} field. */
    @NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** @return the value of the {@code indirectAddress} field. */
    @NativeType("VkDeviceAddress")
    public long indirectAddress() { return nindirectAddress(address()); }
    /** @return the value of the {@code indirectAddressSize} field. */
    @NativeType("VkDeviceSize")
    public long indirectAddressSize() { return nindirectAddressSize(address()); }
    /** @return the value of the {@code preprocessAddress} field. */
    @NativeType("VkDeviceAddress")
    public long preprocessAddress() { return npreprocessAddress(address()); }
    /** @return the value of the {@code preprocessSize} field. */
    @NativeType("VkDeviceSize")
    public long preprocessSize() { return npreprocessSize(address()); }
    /** @return the value of the {@code maxSequenceCount} field. */
    @NativeType("uint32_t")
    public int maxSequenceCount() { return nmaxSequenceCount(address()); }
    /** @return the value of the {@code sequenceCountAddress} field. */
    @NativeType("VkDeviceAddress")
    public long sequenceCountAddress() { return nsequenceCountAddress(address()); }
    /** @return the value of the {@code maxDrawCount} field. */
    @NativeType("uint32_t")
    public int maxDrawCount() { return nmaxDrawCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeneratedCommandsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT} value to the {@code sType} field. */
    public VkGeneratedCommandsInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeneratedCommandsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsInfoEXT pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code shaderStages} field. */
    public VkGeneratedCommandsInfoEXT shaderStages(@NativeType("VkShaderStageFlags") int value) { nshaderStages(address(), value); return this; }
    /** Sets the specified value to the {@code indirectExecutionSet} field. */
    public VkGeneratedCommandsInfoEXT indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { nindirectExecutionSet(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCommandsLayout} field. */
    public VkGeneratedCommandsInfoEXT indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@code indirectAddress} field. */
    public VkGeneratedCommandsInfoEXT indirectAddress(@NativeType("VkDeviceAddress") long value) { nindirectAddress(address(), value); return this; }
    /** Sets the specified value to the {@code indirectAddressSize} field. */
    public VkGeneratedCommandsInfoEXT indirectAddressSize(@NativeType("VkDeviceSize") long value) { nindirectAddressSize(address(), value); return this; }
    /** Sets the specified value to the {@code preprocessAddress} field. */
    public VkGeneratedCommandsInfoEXT preprocessAddress(@NativeType("VkDeviceAddress") long value) { npreprocessAddress(address(), value); return this; }
    /** Sets the specified value to the {@code preprocessSize} field. */
    public VkGeneratedCommandsInfoEXT preprocessSize(@NativeType("VkDeviceSize") long value) { npreprocessSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxSequenceCount} field. */
    public VkGeneratedCommandsInfoEXT maxSequenceCount(@NativeType("uint32_t") int value) { nmaxSequenceCount(address(), value); return this; }
    /** Sets the specified value to the {@code sequenceCountAddress} field. */
    public VkGeneratedCommandsInfoEXT sequenceCountAddress(@NativeType("VkDeviceAddress") long value) { nsequenceCountAddress(address(), value); return this; }
    /** Sets the specified value to the {@code maxDrawCount} field. */
    public VkGeneratedCommandsInfoEXT maxDrawCount(@NativeType("uint32_t") int value) { nmaxDrawCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsInfoEXT set(
        int sType,
        long pNext,
        int shaderStages,
        long indirectExecutionSet,
        long indirectCommandsLayout,
        long indirectAddress,
        long indirectAddressSize,
        long preprocessAddress,
        long preprocessSize,
        int maxSequenceCount,
        long sequenceCountAddress,
        int maxDrawCount
    ) {
        sType(sType);
        pNext(pNext);
        shaderStages(shaderStages);
        indirectExecutionSet(indirectExecutionSet);
        indirectCommandsLayout(indirectCommandsLayout);
        indirectAddress(indirectAddress);
        indirectAddressSize(indirectAddressSize);
        preprocessAddress(preprocessAddress);
        preprocessSize(preprocessSize);
        maxSequenceCount(maxSequenceCount);
        sequenceCountAddress(sequenceCountAddress);
        maxDrawCount(maxDrawCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkGeneratedCommandsInfoEXT set(VkGeneratedCommandsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoEXT malloc() {
        return new VkGeneratedCommandsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsInfoEXT calloc() {
        return new VkGeneratedCommandsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsInfoEXT} instance for the specified memory address. */
    public static VkGeneratedCommandsInfoEXT create(long address) {
        return new VkGeneratedCommandsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #shaderStages}. */
    public static int nshaderStages(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoEXT.SHADERSTAGES); }
    /** Unsafe version of {@link #indirectExecutionSet}. */
    public static long nindirectExecutionSet(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #indirectAddress}. */
    public static long nindirectAddress(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESS); }
    /** Unsafe version of {@link #indirectAddressSize}. */
    public static long nindirectAddressSize(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE); }
    /** Unsafe version of {@link #preprocessAddress}. */
    public static long npreprocessAddress(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS); }
    /** Unsafe version of {@link #preprocessSize}. */
    public static long npreprocessSize(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.PREPROCESSSIZE); }
    /** Unsafe version of {@link #maxSequenceCount}. */
    public static int nmaxSequenceCount(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT); }
    /** Unsafe version of {@link #sequenceCountAddress}. */
    public static long nsequenceCountAddress(long struct) { return memGetLong(struct + VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS); }
    /** Unsafe version of {@link #maxDrawCount}. */
    public static int nmaxDrawCount(long struct) { return memGetInt(struct + VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #shaderStages(int) shaderStages}. */
    public static void nshaderStages(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoEXT.SHADERSTAGES, value); }
    /** Unsafe version of {@link #indirectExecutionSet(long) indirectExecutionSet}. */
    public static void nindirectExecutionSet(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTEXECUTIONSET, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #indirectAddress(long) indirectAddress}. */
    public static void nindirectAddress(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESS, value); }
    /** Unsafe version of {@link #indirectAddressSize(long) indirectAddressSize}. */
    public static void nindirectAddressSize(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.INDIRECTADDRESSSIZE, value); }
    /** Unsafe version of {@link #preprocessAddress(long) preprocessAddress}. */
    public static void npreprocessAddress(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.PREPROCESSADDRESS, value); }
    /** Unsafe version of {@link #preprocessSize(long) preprocessSize}. */
    public static void npreprocessSize(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.PREPROCESSSIZE, value); }
    /** Unsafe version of {@link #maxSequenceCount(int) maxSequenceCount}. */
    public static void nmaxSequenceCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoEXT.MAXSEQUENCECOUNT, value); }
    /** Unsafe version of {@link #sequenceCountAddress(long) sequenceCountAddress}. */
    public static void nsequenceCountAddress(long struct, long value) { memPutLong(struct + VkGeneratedCommandsInfoEXT.SEQUENCECOUNTADDRESS, value); }
    /** Unsafe version of {@link #maxDrawCount(int) maxDrawCount}. */
    public static void nmaxDrawCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsInfoEXT.MAXDRAWCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsInfoEXT, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsInfoEXT.npNext(address()); }
        /** @return the value of the {@code shaderStages} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStages() { return VkGeneratedCommandsInfoEXT.nshaderStages(address()); }
        /** @return the value of the {@code indirectExecutionSet} field. */
        @NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() { return VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address()); }
        /** @return the value of the {@code indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() { return VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address()); }
        /** @return the value of the {@code indirectAddress} field. */
        @NativeType("VkDeviceAddress")
        public long indirectAddress() { return VkGeneratedCommandsInfoEXT.nindirectAddress(address()); }
        /** @return the value of the {@code indirectAddressSize} field. */
        @NativeType("VkDeviceSize")
        public long indirectAddressSize() { return VkGeneratedCommandsInfoEXT.nindirectAddressSize(address()); }
        /** @return the value of the {@code preprocessAddress} field. */
        @NativeType("VkDeviceAddress")
        public long preprocessAddress() { return VkGeneratedCommandsInfoEXT.npreprocessAddress(address()); }
        /** @return the value of the {@code preprocessSize} field. */
        @NativeType("VkDeviceSize")
        public long preprocessSize() { return VkGeneratedCommandsInfoEXT.npreprocessSize(address()); }
        /** @return the value of the {@code maxSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxSequenceCount() { return VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address()); }
        /** @return the value of the {@code sequenceCountAddress} field. */
        @NativeType("VkDeviceAddress")
        public long sequenceCountAddress() { return VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address()); }
        /** @return the value of the {@code maxDrawCount} field. */
        @NativeType("uint32_t")
        public int maxDrawCount() { return VkGeneratedCommandsInfoEXT.nmaxDrawCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT} value to the {@code sType} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsInfoEXT.Buffer pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code shaderStages} field. */
        public VkGeneratedCommandsInfoEXT.Buffer shaderStages(@NativeType("VkShaderStageFlags") int value) { VkGeneratedCommandsInfoEXT.nshaderStages(address(), value); return this; }
        /** Sets the specified value to the {@code indirectExecutionSet} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { VkGeneratedCommandsInfoEXT.nindirectExecutionSet(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCommandsLayout} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { VkGeneratedCommandsInfoEXT.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@code indirectAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.nindirectAddress(address(), value); return this; }
        /** Sets the specified value to the {@code indirectAddressSize} field. */
        public VkGeneratedCommandsInfoEXT.Buffer indirectAddressSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.nindirectAddressSize(address(), value); return this; }
        /** Sets the specified value to the {@code preprocessAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer preprocessAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.npreprocessAddress(address(), value); return this; }
        /** Sets the specified value to the {@code preprocessSize} field. */
        public VkGeneratedCommandsInfoEXT.Buffer preprocessSize(@NativeType("VkDeviceSize") long value) { VkGeneratedCommandsInfoEXT.npreprocessSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxSequenceCount} field. */
        public VkGeneratedCommandsInfoEXT.Buffer maxSequenceCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.nmaxSequenceCount(address(), value); return this; }
        /** Sets the specified value to the {@code sequenceCountAddress} field. */
        public VkGeneratedCommandsInfoEXT.Buffer sequenceCountAddress(@NativeType("VkDeviceAddress") long value) { VkGeneratedCommandsInfoEXT.nsequenceCountAddress(address(), value); return this; }
        /** Sets the specified value to the {@code maxDrawCount} field. */
        public VkGeneratedCommandsInfoEXT.Buffer maxDrawCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsInfoEXT.nmaxDrawCount(address(), value); return this; }

    }

}