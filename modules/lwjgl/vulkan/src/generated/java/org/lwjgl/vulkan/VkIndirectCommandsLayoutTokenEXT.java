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
 * <pre><code>
 * struct VkIndirectCommandsLayoutTokenEXT {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkIndirectCommandsTokenTypeEXT type;
 *     {@link VkIndirectCommandsTokenDataEXT VkIndirectCommandsTokenDataEXT} data;
 *     uint32_t offset;
 * }</code></pre>
 */
public class VkIndirectCommandsLayoutTokenEXT extends Struct<VkIndirectCommandsLayoutTokenEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        TYPE,
        DATA,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(VkIndirectCommandsTokenDataEXT.SIZEOF, VkIndirectCommandsTokenDataEXT.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        DATA = layout.offsetof(3);
        OFFSET = layout.offsetof(4);
    }

    protected VkIndirectCommandsLayoutTokenEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsLayoutTokenEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsLayoutTokenEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsLayoutTokenEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsLayoutTokenEXT(ByteBuffer container) {
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
    @NativeType("VkIndirectCommandsTokenTypeEXT")
    public int type() { return ntype(address()); }
    /** @return a {@link VkIndirectCommandsTokenDataEXT} view of the {@code data} field. */
    public VkIndirectCommandsTokenDataEXT data() { return ndata(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkIndirectCommandsLayoutTokenEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT} value to the {@code sType} field. */
    public VkIndirectCommandsLayoutTokenEXT sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkIndirectCommandsLayoutTokenEXT pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
    public VkIndirectCommandsLayoutTokenEXT pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@code type} field. */
    public VkIndirectCommandsLayoutTokenEXT type(@NativeType("VkIndirectCommandsTokenTypeEXT") int value) { ntype(address(), value); return this; }
    /** Copies the specified {@link VkIndirectCommandsTokenDataEXT} to the {@code data} field. */
    public VkIndirectCommandsLayoutTokenEXT data(VkIndirectCommandsTokenDataEXT value) { ndata(address(), value); return this; }
    /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkIndirectCommandsLayoutTokenEXT data(java.util.function.Consumer<VkIndirectCommandsTokenDataEXT> consumer) { consumer.accept(data()); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public VkIndirectCommandsLayoutTokenEXT offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsLayoutTokenEXT set(
        int sType,
        long pNext,
        int type,
        VkIndirectCommandsTokenDataEXT data,
        int offset
    ) {
        sType(sType);
        pNext(pNext);
        type(type);
        data(data);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsLayoutTokenEXT set(VkIndirectCommandsLayoutTokenEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenEXT malloc() {
        return new VkIndirectCommandsLayoutTokenEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsLayoutTokenEXT calloc() {
        return new VkIndirectCommandsLayoutTokenEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsLayoutTokenEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsLayoutTokenEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance for the specified memory address. */
    public static VkIndirectCommandsLayoutTokenEXT create(long address) {
        return new VkIndirectCommandsLayoutTokenEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsLayoutTokenEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsLayoutTokenEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsLayoutTokenEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsLayoutTokenEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsLayoutTokenEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsLayoutTokenEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsLayoutTokenEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsLayoutTokenEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkIndirectCommandsLayoutTokenEXT.PNEXT); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenEXT.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static VkIndirectCommandsTokenDataEXT ndata(long struct) { return VkIndirectCommandsTokenDataEXT.create(struct + VkIndirectCommandsLayoutTokenEXT.DATA); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return memGetInt(struct + VkIndirectCommandsLayoutTokenEXT.OFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkIndirectCommandsLayoutTokenEXT.PNEXT, value); }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenEXT.TYPE, value); }
    /** Unsafe version of {@link #data(VkIndirectCommandsTokenDataEXT) data}. */
    public static void ndata(long struct, VkIndirectCommandsTokenDataEXT value) { memCopy(value.address(), struct + VkIndirectCommandsLayoutTokenEXT.DATA, VkIndirectCommandsTokenDataEXT.SIZEOF); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { memPutInt(struct + VkIndirectCommandsLayoutTokenEXT.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsLayoutTokenEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsLayoutTokenEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsLayoutTokenEXT ELEMENT_FACTORY = VkIndirectCommandsLayoutTokenEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsLayoutTokenEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsLayoutTokenEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsLayoutTokenEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkIndirectCommandsLayoutTokenEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkIndirectCommandsLayoutTokenEXT.npNext(address()); }
        /** @return the value of the {@code type} field. */
        @NativeType("VkIndirectCommandsTokenTypeEXT")
        public int type() { return VkIndirectCommandsLayoutTokenEXT.ntype(address()); }
        /** @return a {@link VkIndirectCommandsTokenDataEXT} view of the {@code data} field. */
        public VkIndirectCommandsTokenDataEXT data() { return VkIndirectCommandsLayoutTokenEXT.ndata(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("uint32_t")
        public int offset() { return VkIndirectCommandsLayoutTokenEXT.noffset(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkIndirectCommandsLayoutTokenEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTDeviceGeneratedCommands#VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT} value to the {@code sType} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer sType$Default() { return sType(EXTDeviceGeneratedCommands.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_TOKEN_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer pNext(@NativeType("void const *") long value) { VkIndirectCommandsLayoutTokenEXT.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPushConstantBankInfoNV} value to the {@code pNext} chain. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer pNext(VkPushConstantBankInfoNV value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@code type} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer type(@NativeType("VkIndirectCommandsTokenTypeEXT") int value) { VkIndirectCommandsLayoutTokenEXT.ntype(address(), value); return this; }
        /** Copies the specified {@link VkIndirectCommandsTokenDataEXT} to the {@code data} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer data(VkIndirectCommandsTokenDataEXT value) { VkIndirectCommandsLayoutTokenEXT.ndata(address(), value); return this; }
        /** Passes the {@code data} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer data(java.util.function.Consumer<VkIndirectCommandsTokenDataEXT> consumer) { consumer.accept(data()); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public VkIndirectCommandsLayoutTokenEXT.Buffer offset(@NativeType("uint32_t") int value) { VkIndirectCommandsLayoutTokenEXT.noffset(address(), value); return this; }

    }

}