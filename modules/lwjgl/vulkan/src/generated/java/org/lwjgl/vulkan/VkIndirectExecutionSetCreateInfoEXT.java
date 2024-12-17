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
 * struct VkIndirectExecutionSetCreateInfoEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectExecutionSetInfoTypeEXT type;
 *     {@link VkIndirectExecutionSetInfoEXT VkIndirectExecutionSetInfoEXT} info;
 * }}</pre>
 */
public class VkIndirectExecutionSetCreateInfoEXT extends Struct<VkIndirectExecutionSetCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        INFO;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkIndirectExecutionSetInfoEXT.SIZEOF, VkIndirectExecutionSetInfoEXT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        INFO = layout.offsetof(3);
    }

    protected VkIndirectExecutionSetCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectExecutionSetCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectExecutionSetCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectExecutionSetCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectExecutionSetCreateInfoEXT(ByteBuffer container) {
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
    /** @return the value of the {@code type} field. */
    @NativeType("VkIndirectExecutionSetInfoTypeEXT")
    public int type() { return ntype(address()); }
    /** @return a {@link VkIndirectExecutionSetInfoEXT} view of the {@code info} field. */
    public VkIndirectExecutionSetInfoEXT info() { return ninfo(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectExecutionSetCreateInfoEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT} value to the {@code sType} field. */
    public VkIndirectExecutionSetCreateInfoEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectExecutionSetCreateInfoEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public VkIndirectExecutionSetCreateInfoEXT type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link VkIndirectExecutionSetInfoEXT} to the {@code info} field. */
    public VkIndirectExecutionSetCreateInfoEXT info(VkIndirectExecutionSetInfoEXT value) { ninfo(address(), value); return this; }
    /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkIndirectExecutionSetCreateInfoEXT info(java.util.function.Consumer<VkIndirectExecutionSetInfoEXT> consumer) { consumer.accept(info()); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectExecutionSetCreateInfoEXT set(
        int sType,
        long pNext,
        int type,
        VkIndirectExecutionSetInfoEXT info
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        info(info);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectExecutionSetCreateInfoEXT set(VkIndirectExecutionSetCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetCreateInfoEXT malloc() {
        return new VkIndirectExecutionSetCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectExecutionSetCreateInfoEXT calloc() {
        return new VkIndirectExecutionSetCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectExecutionSetCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectExecutionSetCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance for the specified memory address. */
    public static VkIndirectExecutionSetCreateInfoEXT create(long address) {
        return new VkIndirectExecutionSetCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectExecutionSetCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectExecutionSetCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectExecutionSetCreateInfoEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetCreateInfoEXT malloc(MemoryStack stack) {
        return new VkIndirectExecutionSetCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectExecutionSetCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectExecutionSetCreateInfoEXT calloc(MemoryStack stack) {
        return new VkIndirectExecutionSetCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectExecutionSetCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectExecutionSetCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectExecutionSetCreateInfoEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectExecutionSetCreateInfoEXT.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkIndirectExecutionSetCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #info}. */
    public static VkIndirectExecutionSetInfoEXT ninfo(long struct) { return VkIndirectExecutionSetInfoEXT.create(struct + VkIndirectExecutionSetCreateInfoEXT.INFO); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetCreateInfoEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectExecutionSetCreateInfoEXT.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkIndirectExecutionSetCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #info(VkIndirectExecutionSetInfoEXT) info}. */
    public static void ninfo(long struct, VkIndirectExecutionSetInfoEXT value) { memCopy(value.address(), struct + VkIndirectExecutionSetCreateInfoEXT.INFO, VkIndirectExecutionSetInfoEXT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkIndirectExecutionSetCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectExecutionSetCreateInfoEXT, Buffer> implements NativeResource {

        private static final VkIndirectExecutionSetCreateInfoEXT ELEMENT_FACTORY = VkIndirectExecutionSetCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectExecutionSetCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectExecutionSetCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectExecutionSetCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectExecutionSetCreateInfoEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectExecutionSetCreateInfoEXT.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkIndirectExecutionSetInfoTypeEXT")
        public int type() { return VkIndirectExecutionSetCreateInfoEXT.ntype(address()); }
        /** @return a {@link VkIndirectExecutionSetInfoEXT} view of the {@code info} field. */
        public VkIndirectExecutionSetInfoEXT info() { return VkIndirectExecutionSetCreateInfoEXT.ninfo(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectExecutionSetCreateInfoEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT} value to the {@code sType} field. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_EXECUTION_SET_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectExecutionSetCreateInfoEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer type(@NativeType("VkIndirectExecutionSetInfoTypeEXT") int value) { VkIndirectExecutionSetCreateInfoEXT.ntype(address(), value); return this; }
        /** Copies the specified {@link VkIndirectExecutionSetInfoEXT} to the {@code info} field. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer info(VkIndirectExecutionSetInfoEXT value) { VkIndirectExecutionSetCreateInfoEXT.ninfo(address(), value); return this; }
        /** Passes the {@code info} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkIndirectExecutionSetCreateInfoEXT.Buffer info(java.util.function.Consumer<VkIndirectExecutionSetInfoEXT> consumer) { consumer.accept(info()); return this; }

    }

}