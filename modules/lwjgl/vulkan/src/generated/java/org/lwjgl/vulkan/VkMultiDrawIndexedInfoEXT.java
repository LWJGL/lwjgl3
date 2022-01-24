/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a multi-draw command.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@code firstIndex}, {@code indexCount}, and {@code vertexOffset} members of {@link VkMultiDrawIndexedInfoEXT} have the same meaning as the {@code firstIndex}, {@code indexCount}, and {@code vertexOffset} parameters, respectively, of {@link VK10#vkCmdDrawIndexed CmdDrawIndexed}.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTMultiDraw#vkCmdDrawMultiIndexedEXT CmdDrawMultiIndexedEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMultiDrawIndexedInfoEXT {
 *     uint32_t {@link #firstIndex};
 *     uint32_t {@link #indexCount};
 *     int32_t {@link #vertexOffset};
 * }</code></pre>
 */
public class VkMultiDrawIndexedInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FIRSTINDEX,
        INDEXCOUNT,
        VERTEXOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FIRSTINDEX = layout.offsetof(0);
        INDEXCOUNT = layout.offsetof(1);
        VERTEXOFFSET = layout.offsetof(2);
    }

    /**
     * Creates a {@code VkMultiDrawIndexedInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultiDrawIndexedInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the first index to draw. */
    @NativeType("uint32_t")
    public int firstIndex() { return nfirstIndex(address()); }
    /** the number of vertices to draw. */
    @NativeType("uint32_t")
    public int indexCount() { return nindexCount(address()); }
    /** the value added to the vertex index before indexing into the vertex buffer for indexed multidraws. */
    @NativeType("int32_t")
    public int vertexOffset() { return nvertexOffset(address()); }

    /** Sets the specified value to the {@link #firstIndex} field. */
    public VkMultiDrawIndexedInfoEXT firstIndex(@NativeType("uint32_t") int value) { nfirstIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #indexCount} field. */
    public VkMultiDrawIndexedInfoEXT indexCount(@NativeType("uint32_t") int value) { nindexCount(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexOffset} field. */
    public VkMultiDrawIndexedInfoEXT vertexOffset(@NativeType("int32_t") int value) { nvertexOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultiDrawIndexedInfoEXT set(
        int firstIndex,
        int indexCount,
        int vertexOffset
    ) {
        firstIndex(firstIndex);
        indexCount(indexCount);
        vertexOffset(vertexOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultiDrawIndexedInfoEXT set(VkMultiDrawIndexedInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultiDrawIndexedInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultiDrawIndexedInfoEXT malloc() {
        return wrap(VkMultiDrawIndexedInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMultiDrawIndexedInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultiDrawIndexedInfoEXT calloc() {
        return wrap(VkMultiDrawIndexedInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMultiDrawIndexedInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMultiDrawIndexedInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMultiDrawIndexedInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMultiDrawIndexedInfoEXT} instance for the specified memory address. */
    public static VkMultiDrawIndexedInfoEXT create(long address) {
        return wrap(VkMultiDrawIndexedInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiDrawIndexedInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkMultiDrawIndexedInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkMultiDrawIndexedInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawIndexedInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawIndexedInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMultiDrawIndexedInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiDrawIndexedInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMultiDrawIndexedInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiDrawIndexedInfoEXT malloc(MemoryStack stack) {
        return wrap(VkMultiDrawIndexedInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMultiDrawIndexedInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiDrawIndexedInfoEXT calloc(MemoryStack stack) {
        return wrap(VkMultiDrawIndexedInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMultiDrawIndexedInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawIndexedInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawIndexedInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #firstIndex}. */
    public static int nfirstIndex(long struct) { return UNSAFE.getInt(null, struct + VkMultiDrawIndexedInfoEXT.FIRSTINDEX); }
    /** Unsafe version of {@link #indexCount}. */
    public static int nindexCount(long struct) { return UNSAFE.getInt(null, struct + VkMultiDrawIndexedInfoEXT.INDEXCOUNT); }
    /** Unsafe version of {@link #vertexOffset}. */
    public static int nvertexOffset(long struct) { return UNSAFE.getInt(null, struct + VkMultiDrawIndexedInfoEXT.VERTEXOFFSET); }

    /** Unsafe version of {@link #firstIndex(int) firstIndex}. */
    public static void nfirstIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiDrawIndexedInfoEXT.FIRSTINDEX, value); }
    /** Unsafe version of {@link #indexCount(int) indexCount}. */
    public static void nindexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiDrawIndexedInfoEXT.INDEXCOUNT, value); }
    /** Unsafe version of {@link #vertexOffset(int) vertexOffset}. */
    public static void nvertexOffset(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiDrawIndexedInfoEXT.VERTEXOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkMultiDrawIndexedInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMultiDrawIndexedInfoEXT, Buffer> implements NativeResource {

        private static final VkMultiDrawIndexedInfoEXT ELEMENT_FACTORY = VkMultiDrawIndexedInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMultiDrawIndexedInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultiDrawIndexedInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkMultiDrawIndexedInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMultiDrawIndexedInfoEXT#firstIndex} field. */
        @NativeType("uint32_t")
        public int firstIndex() { return VkMultiDrawIndexedInfoEXT.nfirstIndex(address()); }
        /** @return the value of the {@link VkMultiDrawIndexedInfoEXT#indexCount} field. */
        @NativeType("uint32_t")
        public int indexCount() { return VkMultiDrawIndexedInfoEXT.nindexCount(address()); }
        /** @return the value of the {@link VkMultiDrawIndexedInfoEXT#vertexOffset} field. */
        @NativeType("int32_t")
        public int vertexOffset() { return VkMultiDrawIndexedInfoEXT.nvertexOffset(address()); }

        /** Sets the specified value to the {@link VkMultiDrawIndexedInfoEXT#firstIndex} field. */
        public VkMultiDrawIndexedInfoEXT.Buffer firstIndex(@NativeType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.nfirstIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkMultiDrawIndexedInfoEXT#indexCount} field. */
        public VkMultiDrawIndexedInfoEXT.Buffer indexCount(@NativeType("uint32_t") int value) { VkMultiDrawIndexedInfoEXT.nindexCount(address(), value); return this; }
        /** Sets the specified value to the {@link VkMultiDrawIndexedInfoEXT#vertexOffset} field. */
        public VkMultiDrawIndexedInfoEXT.Buffer vertexOffset(@NativeType("int32_t") int value) { VkMultiDrawIndexedInfoEXT.nvertexOffset(address(), value); return this; }

    }

}