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
 * union VkIndirectCommandsTokenDataEXT {
 *     {@link VkIndirectCommandsPushConstantTokenEXT VkIndirectCommandsPushConstantTokenEXT} const * pPushConstant;
 *     {@link VkIndirectCommandsVertexBufferTokenEXT VkIndirectCommandsVertexBufferTokenEXT} const * pVertexBuffer;
 *     {@link VkIndirectCommandsIndexBufferTokenEXT VkIndirectCommandsIndexBufferTokenEXT} const * pIndexBuffer;
 *     {@link VkIndirectCommandsExecutionSetTokenEXT VkIndirectCommandsExecutionSetTokenEXT} const * pExecutionSet;
 * }}</pre>
 */
public class VkIndirectCommandsTokenDataEXT extends Struct<VkIndirectCommandsTokenDataEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PPUSHCONSTANT,
        PVERTEXBUFFER,
        PINDEXBUFFER,
        PEXECUTIONSET;

    static {
        Layout layout = __union(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PPUSHCONSTANT = layout.offsetof(0);
        PVERTEXBUFFER = layout.offsetof(1);
        PINDEXBUFFER = layout.offsetof(2);
        PEXECUTIONSET = layout.offsetof(3);
    }

    protected VkIndirectCommandsTokenDataEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsTokenDataEXT create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsTokenDataEXT(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsTokenDataEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsTokenDataEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link VkIndirectCommandsPushConstantTokenEXT} view of the struct pointed to by the {@code pPushConstant} field. */
    @NativeType("VkIndirectCommandsPushConstantTokenEXT const *")
    public VkIndirectCommandsPushConstantTokenEXT pPushConstant() { return npPushConstant(address()); }
    /** @return a {@link VkIndirectCommandsVertexBufferTokenEXT} view of the struct pointed to by the {@code pVertexBuffer} field. */
    @NativeType("VkIndirectCommandsVertexBufferTokenEXT const *")
    public VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() { return npVertexBuffer(address()); }
    /** @return a {@link VkIndirectCommandsIndexBufferTokenEXT} view of the struct pointed to by the {@code pIndexBuffer} field. */
    @NativeType("VkIndirectCommandsIndexBufferTokenEXT const *")
    public VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() { return npIndexBuffer(address()); }
    /** @return a {@link VkIndirectCommandsExecutionSetTokenEXT} view of the struct pointed to by the {@code pExecutionSet} field. */
    @NativeType("VkIndirectCommandsExecutionSetTokenEXT const *")
    public VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() { return npExecutionSet(address()); }

    /** Sets the address of the specified {@link VkIndirectCommandsPushConstantTokenEXT} to the {@code pPushConstant} field. */
    public VkIndirectCommandsTokenDataEXT pPushConstant(@NativeType("VkIndirectCommandsPushConstantTokenEXT const *") VkIndirectCommandsPushConstantTokenEXT value) { npPushConstant(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsVertexBufferTokenEXT} to the {@code pVertexBuffer} field. */
    public VkIndirectCommandsTokenDataEXT pVertexBuffer(@NativeType("VkIndirectCommandsVertexBufferTokenEXT const *") VkIndirectCommandsVertexBufferTokenEXT value) { npVertexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsIndexBufferTokenEXT} to the {@code pIndexBuffer} field. */
    public VkIndirectCommandsTokenDataEXT pIndexBuffer(@NativeType("VkIndirectCommandsIndexBufferTokenEXT const *") VkIndirectCommandsIndexBufferTokenEXT value) { npIndexBuffer(address(), value); return this; }
    /** Sets the address of the specified {@link VkIndirectCommandsExecutionSetTokenEXT} to the {@code pExecutionSet} field. */
    public VkIndirectCommandsTokenDataEXT pExecutionSet(@NativeType("VkIndirectCommandsExecutionSetTokenEXT const *") VkIndirectCommandsExecutionSetTokenEXT value) { npExecutionSet(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsTokenDataEXT set(VkIndirectCommandsTokenDataEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsTokenDataEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenDataEXT malloc() {
        return new VkIndirectCommandsTokenDataEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsTokenDataEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsTokenDataEXT calloc() {
        return new VkIndirectCommandsTokenDataEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsTokenDataEXT} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsTokenDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsTokenDataEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsTokenDataEXT} instance for the specified memory address. */
    public static VkIndirectCommandsTokenDataEXT create(long address) {
        return new VkIndirectCommandsTokenDataEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsTokenDataEXT createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsTokenDataEXT(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenDataEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenDataEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenDataEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsTokenDataEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsTokenDataEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsTokenDataEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenDataEXT malloc(MemoryStack stack) {
        return new VkIndirectCommandsTokenDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsTokenDataEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsTokenDataEXT calloc(MemoryStack stack) {
        return new VkIndirectCommandsTokenDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenDataEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsTokenDataEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsTokenDataEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pPushConstant}. */
    public static VkIndirectCommandsPushConstantTokenEXT npPushConstant(long struct) { return VkIndirectCommandsPushConstantTokenEXT.create(memGetAddress(struct + VkIndirectCommandsTokenDataEXT.PPUSHCONSTANT)); }
    /** Unsafe version of {@link #pVertexBuffer}. */
    public static VkIndirectCommandsVertexBufferTokenEXT npVertexBuffer(long struct) { return VkIndirectCommandsVertexBufferTokenEXT.create(memGetAddress(struct + VkIndirectCommandsTokenDataEXT.PVERTEXBUFFER)); }
    /** Unsafe version of {@link #pIndexBuffer}. */
    public static VkIndirectCommandsIndexBufferTokenEXT npIndexBuffer(long struct) { return VkIndirectCommandsIndexBufferTokenEXT.create(memGetAddress(struct + VkIndirectCommandsTokenDataEXT.PINDEXBUFFER)); }
    /** Unsafe version of {@link #pExecutionSet}. */
    public static VkIndirectCommandsExecutionSetTokenEXT npExecutionSet(long struct) { return VkIndirectCommandsExecutionSetTokenEXT.create(memGetAddress(struct + VkIndirectCommandsTokenDataEXT.PEXECUTIONSET)); }

    /** Unsafe version of {@link #pPushConstant(VkIndirectCommandsPushConstantTokenEXT) pPushConstant}. */
    public static void npPushConstant(long struct, VkIndirectCommandsPushConstantTokenEXT value) { memPutAddress(struct + VkIndirectCommandsTokenDataEXT.PPUSHCONSTANT, value.address()); }
    /** Unsafe version of {@link #pVertexBuffer(VkIndirectCommandsVertexBufferTokenEXT) pVertexBuffer}. */
    public static void npVertexBuffer(long struct, VkIndirectCommandsVertexBufferTokenEXT value) { memPutAddress(struct + VkIndirectCommandsTokenDataEXT.PVERTEXBUFFER, value.address()); }
    /** Unsafe version of {@link #pIndexBuffer(VkIndirectCommandsIndexBufferTokenEXT) pIndexBuffer}. */
    public static void npIndexBuffer(long struct, VkIndirectCommandsIndexBufferTokenEXT value) { memPutAddress(struct + VkIndirectCommandsTokenDataEXT.PINDEXBUFFER, value.address()); }
    /** Unsafe version of {@link #pExecutionSet(VkIndirectCommandsExecutionSetTokenEXT) pExecutionSet}. */
    public static void npExecutionSet(long struct, VkIndirectCommandsExecutionSetTokenEXT value) { memPutAddress(struct + VkIndirectCommandsTokenDataEXT.PEXECUTIONSET, value.address()); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsTokenDataEXT} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsTokenDataEXT, Buffer> implements NativeResource {

        private static final VkIndirectCommandsTokenDataEXT ELEMENT_FACTORY = VkIndirectCommandsTokenDataEXT.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsTokenDataEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsTokenDataEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsTokenDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link VkIndirectCommandsPushConstantTokenEXT} view of the struct pointed to by the {@code pPushConstant} field. */
        @NativeType("VkIndirectCommandsPushConstantTokenEXT const *")
        public VkIndirectCommandsPushConstantTokenEXT pPushConstant() { return VkIndirectCommandsTokenDataEXT.npPushConstant(address()); }
        /** @return a {@link VkIndirectCommandsVertexBufferTokenEXT} view of the struct pointed to by the {@code pVertexBuffer} field. */
        @NativeType("VkIndirectCommandsVertexBufferTokenEXT const *")
        public VkIndirectCommandsVertexBufferTokenEXT pVertexBuffer() { return VkIndirectCommandsTokenDataEXT.npVertexBuffer(address()); }
        /** @return a {@link VkIndirectCommandsIndexBufferTokenEXT} view of the struct pointed to by the {@code pIndexBuffer} field. */
        @NativeType("VkIndirectCommandsIndexBufferTokenEXT const *")
        public VkIndirectCommandsIndexBufferTokenEXT pIndexBuffer() { return VkIndirectCommandsTokenDataEXT.npIndexBuffer(address()); }
        /** @return a {@link VkIndirectCommandsExecutionSetTokenEXT} view of the struct pointed to by the {@code pExecutionSet} field. */
        @NativeType("VkIndirectCommandsExecutionSetTokenEXT const *")
        public VkIndirectCommandsExecutionSetTokenEXT pExecutionSet() { return VkIndirectCommandsTokenDataEXT.npExecutionSet(address()); }

        /** Sets the address of the specified {@link VkIndirectCommandsPushConstantTokenEXT} to the {@code pPushConstant} field. */
        public VkIndirectCommandsTokenDataEXT.Buffer pPushConstant(@NativeType("VkIndirectCommandsPushConstantTokenEXT const *") VkIndirectCommandsPushConstantTokenEXT value) { VkIndirectCommandsTokenDataEXT.npPushConstant(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsVertexBufferTokenEXT} to the {@code pVertexBuffer} field. */
        public VkIndirectCommandsTokenDataEXT.Buffer pVertexBuffer(@NativeType("VkIndirectCommandsVertexBufferTokenEXT const *") VkIndirectCommandsVertexBufferTokenEXT value) { VkIndirectCommandsTokenDataEXT.npVertexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsIndexBufferTokenEXT} to the {@code pIndexBuffer} field. */
        public VkIndirectCommandsTokenDataEXT.Buffer pIndexBuffer(@NativeType("VkIndirectCommandsIndexBufferTokenEXT const *") VkIndirectCommandsIndexBufferTokenEXT value) { VkIndirectCommandsTokenDataEXT.npIndexBuffer(address(), value); return this; }
        /** Sets the address of the specified {@link VkIndirectCommandsExecutionSetTokenEXT} to the {@code pExecutionSet} field. */
        public VkIndirectCommandsTokenDataEXT.Buffer pExecutionSet(@NativeType("VkIndirectCommandsExecutionSetTokenEXT const *") VkIndirectCommandsExecutionSetTokenEXT value) { VkIndirectCommandsTokenDataEXT.npExecutionSet(address(), value); return this; }

    }

}