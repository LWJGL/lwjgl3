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
 * <p>The members of {@link VkMultiDrawInfoEXT} have the same meaning as the {@code firstVertex} and {@code vertexCount} parameters in {@link VK10#vkCmdDraw CmdDraw}.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTMultiDraw#vkCmdDrawMultiEXT CmdDrawMultiEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkMultiDrawInfoEXT {
 *     uint32_t {@link #firstVertex};
 *     uint32_t {@link #vertexCount};
 * }</code></pre>
 */
public class VkMultiDrawInfoEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FIRSTVERTEX,
        VERTEXCOUNT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FIRSTVERTEX = layout.offsetof(0);
        VERTEXCOUNT = layout.offsetof(1);
    }

    /**
     * Creates a {@code VkMultiDrawInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkMultiDrawInfoEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the first vertex to draw. */
    @NativeType("uint32_t")
    public int firstVertex() { return nfirstVertex(address()); }
    /** the number of vertices to draw. */
    @NativeType("uint32_t")
    public int vertexCount() { return nvertexCount(address()); }

    /** Sets the specified value to the {@link #firstVertex} field. */
    public VkMultiDrawInfoEXT firstVertex(@NativeType("uint32_t") int value) { nfirstVertex(address(), value); return this; }
    /** Sets the specified value to the {@link #vertexCount} field. */
    public VkMultiDrawInfoEXT vertexCount(@NativeType("uint32_t") int value) { nvertexCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkMultiDrawInfoEXT set(
        int firstVertex,
        int vertexCount
    ) {
        firstVertex(firstVertex);
        vertexCount(vertexCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkMultiDrawInfoEXT set(VkMultiDrawInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkMultiDrawInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkMultiDrawInfoEXT malloc() {
        return wrap(VkMultiDrawInfoEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkMultiDrawInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkMultiDrawInfoEXT calloc() {
        return wrap(VkMultiDrawInfoEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkMultiDrawInfoEXT} instance allocated with {@link BufferUtils}. */
    public static VkMultiDrawInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkMultiDrawInfoEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkMultiDrawInfoEXT} instance for the specified memory address. */
    public static VkMultiDrawInfoEXT create(long address) {
        return wrap(VkMultiDrawInfoEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiDrawInfoEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkMultiDrawInfoEXT.class, address);
    }

    /**
     * Returns a new {@link VkMultiDrawInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkMultiDrawInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkMultiDrawInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkMultiDrawInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiDrawInfoEXT malloc(MemoryStack stack) {
        return wrap(VkMultiDrawInfoEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkMultiDrawInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkMultiDrawInfoEXT calloc(MemoryStack stack) {
        return wrap(VkMultiDrawInfoEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkMultiDrawInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkMultiDrawInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkMultiDrawInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #firstVertex}. */
    public static int nfirstVertex(long struct) { return UNSAFE.getInt(null, struct + VkMultiDrawInfoEXT.FIRSTVERTEX); }
    /** Unsafe version of {@link #vertexCount}. */
    public static int nvertexCount(long struct) { return UNSAFE.getInt(null, struct + VkMultiDrawInfoEXT.VERTEXCOUNT); }

    /** Unsafe version of {@link #firstVertex(int) firstVertex}. */
    public static void nfirstVertex(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiDrawInfoEXT.FIRSTVERTEX, value); }
    /** Unsafe version of {@link #vertexCount(int) vertexCount}. */
    public static void nvertexCount(long struct, int value) { UNSAFE.putInt(null, struct + VkMultiDrawInfoEXT.VERTEXCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkMultiDrawInfoEXT} structs. */
    public static class Buffer extends StructBuffer<VkMultiDrawInfoEXT, Buffer> implements NativeResource {

        private static final VkMultiDrawInfoEXT ELEMENT_FACTORY = VkMultiDrawInfoEXT.create(-1L);

        /**
         * Creates a new {@code VkMultiDrawInfoEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkMultiDrawInfoEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkMultiDrawInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkMultiDrawInfoEXT#firstVertex} field. */
        @NativeType("uint32_t")
        public int firstVertex() { return VkMultiDrawInfoEXT.nfirstVertex(address()); }
        /** @return the value of the {@link VkMultiDrawInfoEXT#vertexCount} field. */
        @NativeType("uint32_t")
        public int vertexCount() { return VkMultiDrawInfoEXT.nvertexCount(address()); }

        /** Sets the specified value to the {@link VkMultiDrawInfoEXT#firstVertex} field. */
        public VkMultiDrawInfoEXT.Buffer firstVertex(@NativeType("uint32_t") int value) { VkMultiDrawInfoEXT.nfirstVertex(address(), value); return this; }
        /** Sets the specified value to the {@link VkMultiDrawInfoEXT#vertexCount} field. */
        public VkMultiDrawInfoEXT.Buffer vertexCount(@NativeType("uint32_t") int value) { VkMultiDrawInfoEXT.nvertexCount(address(), value); return this; }

    }

}