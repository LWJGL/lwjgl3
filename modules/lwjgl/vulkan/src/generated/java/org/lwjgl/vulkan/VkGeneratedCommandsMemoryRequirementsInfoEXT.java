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
 * struct VkGeneratedCommandsMemoryRequirementsInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectExecutionSetEXT indirectExecutionSet;
 *     VkIndirectCommandsLayoutEXT indirectCommandsLayout;
 *     uint32_t maxSequenceCount;
 *     uint32_t maxDrawCount;
 * }}</pre>
 */
public class VkGeneratedCommandsMemoryRequirementsInfoEXT extends Struct<VkGeneratedCommandsMemoryRequirementsInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDIRECTEXECUTIONSET,
        INDIRECTCOMMANDSLAYOUT,
        MAXSEQUENCECOUNT,
        MAXDRAWCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        INDIRECTEXECUTIONSET = layout.offsetof(2);
        INDIRECTCOMMANDSLAYOUT = layout.offsetof(3);
        MAXSEQUENCECOUNT = layout.offsetof(4);
        MAXDRAWCOUNT = layout.offsetof(5);
    }

    protected VkGeneratedCommandsMemoryRequirementsInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkGeneratedCommandsMemoryRequirementsInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code indirectExecutionSet} field. */
    @NativeType("VkIndirectExecutionSetEXT")
    public long indirectExecutionSet() { return nindirectExecutionSet(address()); }
    /** @return the value of the {@code indirectCommandsLayout} field. */
    @NativeType("VkIndirectCommandsLayoutEXT")
    public long indirectCommandsLayout() { return nindirectCommandsLayout(address()); }
    /** @return the value of the {@code maxSequenceCount} field. */
    @NativeType("uint32_t")
    public int maxSequenceCount() { return nmaxSequenceCount(address()); }
    /** @return the value of the {@code maxDrawCount} field. */
    @NativeType("uint32_t")
    public int maxDrawCount() { return nmaxDrawCount(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT} value to the {@code sType} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code indirectExecutionSet} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { nindirectExecutionSet(address(), value); return this; }
    /** Sets the specified value to the {@code indirectCommandsLayout} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { nindirectCommandsLayout(address(), value); return this; }
    /** Sets the specified value to the {@code maxSequenceCount} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxSequenceCount(@NativeType("uint32_t") int value) { nmaxSequenceCount(address(), value); return this; }
    /** Sets the specified value to the {@code maxDrawCount} field. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT maxDrawCount(@NativeType("uint32_t") int value) { nmaxDrawCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(
        int sType,
        long pNext,
        long indirectExecutionSet,
        long indirectCommandsLayout,
        int maxSequenceCount,
        int maxDrawCount
    ) {
        sType(sType);
        pNext(pNext);
        indirectExecutionSet(indirectExecutionSet);
        indirectCommandsLayout(indirectCommandsLayout);
        maxSequenceCount(maxSequenceCount);
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
    public VkGeneratedCommandsMemoryRequirementsInfoEXT set(VkGeneratedCommandsMemoryRequirementsInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT malloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT calloc() {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance for the specified memory address. */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT create(long address) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkGeneratedCommandsMemoryRequirementsInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkGeneratedCommandsMemoryRequirementsInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT malloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT calloc(MemoryStack stack) {
        return new VkGeneratedCommandsMemoryRequirementsInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.PNEXT); }
    /** Unsafe version of {@link #indirectExecutionSet}. */
    public static long nindirectExecutionSet(long struct) { return memGetLong(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTEXECUTIONSET); }
    /** Unsafe version of {@link #indirectCommandsLayout}. */
    public static long nindirectCommandsLayout(long struct) { return memGetLong(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTCOMMANDSLAYOUT); }
    /** Unsafe version of {@link #maxSequenceCount}. */
    public static int nmaxSequenceCount(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXSEQUENCECOUNT); }
    /** Unsafe version of {@link #maxDrawCount}. */
    public static int nmaxDrawCount(long struct) { return memGetInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXDRAWCOUNT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #indirectExecutionSet(long) indirectExecutionSet}. */
    public static void nindirectExecutionSet(long struct, long value) { memPutLong(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTEXECUTIONSET, value); }
    /** Unsafe version of {@link #indirectCommandsLayout(long) indirectCommandsLayout}. */
    public static void nindirectCommandsLayout(long struct, long value) { memPutLong(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.INDIRECTCOMMANDSLAYOUT, value); }
    /** Unsafe version of {@link #maxSequenceCount(int) maxSequenceCount}. */
    public static void nmaxSequenceCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXSEQUENCECOUNT, value); }
    /** Unsafe version of {@link #maxDrawCount(int) maxDrawCount}. */
    public static void nmaxDrawCount(long struct, int value) { memPutInt(struct + VkGeneratedCommandsMemoryRequirementsInfoEXT.MAXDRAWCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkGeneratedCommandsMemoryRequirementsInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkGeneratedCommandsMemoryRequirementsInfoEXT, Buffer> implements NativeResource {

        private static final VkGeneratedCommandsMemoryRequirementsInfoEXT ELEMENT_FACTORY = VkGeneratedCommandsMemoryRequirementsInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkGeneratedCommandsMemoryRequirementsInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkGeneratedCommandsMemoryRequirementsInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(address()); }
        /** @return the value of the {@code indirectExecutionSet} field. */
        @NativeType("VkIndirectExecutionSetEXT")
        public long indirectExecutionSet() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(address()); }
        /** @return the value of the {@code indirectCommandsLayout} field. */
        @NativeType("VkIndirectCommandsLayoutEXT")
        public long indirectCommandsLayout() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(address()); }
        /** @return the value of the {@code maxSequenceCount} field. */
        @NativeType("uint32_t")
        public int maxSequenceCount() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(address()); }
        /** @return the value of the {@code maxDrawCount} field. */
        @NativeType("uint32_t")
        public int maxDrawCount() { return VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT} value to the {@code sType} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkGeneratedCommandsPipelineInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(VkGeneratedCommandsPipelineInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkGeneratedCommandsShaderInfoEXT} value to the {@code pNext} chain. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer pNext(VkGeneratedCommandsShaderInfoEXT value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code indirectExecutionSet} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer indirectExecutionSet(@NativeType("VkIndirectExecutionSetEXT") long value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectExecutionSet(address(), value); return this; }
        /** Sets the specified value to the {@code indirectCommandsLayout} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer indirectCommandsLayout(@NativeType("VkIndirectCommandsLayoutEXT") long value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.nindirectCommandsLayout(address(), value); return this; }
        /** Sets the specified value to the {@code maxSequenceCount} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer maxSequenceCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxSequenceCount(address(), value); return this; }
        /** Sets the specified value to the {@code maxDrawCount} field. */
        public VkGeneratedCommandsMemoryRequirementsInfoEXT.Buffer maxDrawCount(@NativeType("uint32_t") int value) { VkGeneratedCommandsMemoryRequirementsInfoEXT.nmaxDrawCount(address(), value); return this; }

    }

}