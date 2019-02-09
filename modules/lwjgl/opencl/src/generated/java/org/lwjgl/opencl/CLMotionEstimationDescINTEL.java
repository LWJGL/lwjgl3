/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the configuration of the motion estimation algorithm.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mb_block_type} &ndash; describes the size of the blocks described by the motion estimator</li>
 * <li>{@code subpixel_mode} &ndash; defines the search precision (and hence, the precision of the returned motion vectors)</li>
 * <li>{@code sad_adjust_mode} &ndash; specifies distortion measure adjustment used for the motion search SAD comparison</li>
 * <li>{@code search_path_type} &ndash; 
 * specifies the search path and search radius when matching blocks in the neighborhood of each pixel block (optionally offset by the predicted motion
 * vector). Currently, all search algorithms match the source block with pixel blocks in the reference area exhaustively within a {@code [Rx, Ry]}
 * radius from the current source pixel block location (optionally offset by the predicted motion vector)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct cl_motion_estimation_desc_intel {
 *     cl_uint mb_block_type;
 *     cl_uint subpixel_mode;
 *     cl_uint sad_adjust_mode;
 *     cl_uint search_path_type;
 * }</code></pre>
 */
@NativeType("struct cl_motion_estimation_desc_intel")
public class CLMotionEstimationDescINTEL extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MB_BLOCK_TYPE,
        SUBPIXEL_MODE,
        SAD_ADJUST_MODE,
        SEARCH_PATH_TYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MB_BLOCK_TYPE = layout.offsetof(0);
        SUBPIXEL_MODE = layout.offsetof(1);
        SAD_ADJUST_MODE = layout.offsetof(2);
        SEARCH_PATH_TYPE = layout.offsetof(3);
    }

    /**
     * Creates a {@code CLMotionEstimationDescINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CLMotionEstimationDescINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code mb_block_type} field. */
    @NativeType("cl_uint")
    public int mb_block_type() { return nmb_block_type(address()); }
    /** Returns the value of the {@code subpixel_mode} field. */
    @NativeType("cl_uint")
    public int subpixel_mode() { return nsubpixel_mode(address()); }
    /** Returns the value of the {@code sad_adjust_mode} field. */
    @NativeType("cl_uint")
    public int sad_adjust_mode() { return nsad_adjust_mode(address()); }
    /** Returns the value of the {@code search_path_type} field. */
    @NativeType("cl_uint")
    public int search_path_type() { return nsearch_path_type(address()); }

    /** Sets the specified value to the {@code mb_block_type} field. */
    public CLMotionEstimationDescINTEL mb_block_type(@NativeType("cl_uint") int value) { nmb_block_type(address(), value); return this; }
    /** Sets the specified value to the {@code subpixel_mode} field. */
    public CLMotionEstimationDescINTEL subpixel_mode(@NativeType("cl_uint") int value) { nsubpixel_mode(address(), value); return this; }
    /** Sets the specified value to the {@code sad_adjust_mode} field. */
    public CLMotionEstimationDescINTEL sad_adjust_mode(@NativeType("cl_uint") int value) { nsad_adjust_mode(address(), value); return this; }
    /** Sets the specified value to the {@code search_path_type} field. */
    public CLMotionEstimationDescINTEL search_path_type(@NativeType("cl_uint") int value) { nsearch_path_type(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CLMotionEstimationDescINTEL set(
        int mb_block_type,
        int subpixel_mode,
        int sad_adjust_mode,
        int search_path_type
    ) {
        mb_block_type(mb_block_type);
        subpixel_mode(subpixel_mode);
        sad_adjust_mode(sad_adjust_mode);
        search_path_type(search_path_type);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CLMotionEstimationDescINTEL set(CLMotionEstimationDescINTEL src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CLMotionEstimationDescINTEL malloc() {
        return wrap(CLMotionEstimationDescINTEL.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CLMotionEstimationDescINTEL calloc() {
        return wrap(CLMotionEstimationDescINTEL.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance allocated with {@link BufferUtils}. */
    public static CLMotionEstimationDescINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CLMotionEstimationDescINTEL.class, memAddress(container), container);
    }

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance for the specified memory address. */
    public static CLMotionEstimationDescINTEL create(long address) {
        return wrap(CLMotionEstimationDescINTEL.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLMotionEstimationDescINTEL createSafe(long address) {
        return address == NULL ? null : wrap(CLMotionEstimationDescINTEL.class, address);
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CLMotionEstimationDescINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CLMotionEstimationDescINTEL.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance allocated on the thread-local {@link MemoryStack}. */
    public static CLMotionEstimationDescINTEL mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code CLMotionEstimationDescINTEL} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static CLMotionEstimationDescINTEL callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code CLMotionEstimationDescINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMotionEstimationDescINTEL mallocStack(MemoryStack stack) {
        return wrap(CLMotionEstimationDescINTEL.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CLMotionEstimationDescINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CLMotionEstimationDescINTEL callocStack(MemoryStack stack) {
        return wrap(CLMotionEstimationDescINTEL.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CLMotionEstimationDescINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CLMotionEstimationDescINTEL.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mb_block_type}. */
    public static int nmb_block_type(long struct) { return UNSAFE.getInt(null, struct + CLMotionEstimationDescINTEL.MB_BLOCK_TYPE); }
    /** Unsafe version of {@link #subpixel_mode}. */
    public static int nsubpixel_mode(long struct) { return UNSAFE.getInt(null, struct + CLMotionEstimationDescINTEL.SUBPIXEL_MODE); }
    /** Unsafe version of {@link #sad_adjust_mode}. */
    public static int nsad_adjust_mode(long struct) { return UNSAFE.getInt(null, struct + CLMotionEstimationDescINTEL.SAD_ADJUST_MODE); }
    /** Unsafe version of {@link #search_path_type}. */
    public static int nsearch_path_type(long struct) { return UNSAFE.getInt(null, struct + CLMotionEstimationDescINTEL.SEARCH_PATH_TYPE); }

    /** Unsafe version of {@link #mb_block_type(int) mb_block_type}. */
    public static void nmb_block_type(long struct, int value) { UNSAFE.putInt(null, struct + CLMotionEstimationDescINTEL.MB_BLOCK_TYPE, value); }
    /** Unsafe version of {@link #subpixel_mode(int) subpixel_mode}. */
    public static void nsubpixel_mode(long struct, int value) { UNSAFE.putInt(null, struct + CLMotionEstimationDescINTEL.SUBPIXEL_MODE, value); }
    /** Unsafe version of {@link #sad_adjust_mode(int) sad_adjust_mode}. */
    public static void nsad_adjust_mode(long struct, int value) { UNSAFE.putInt(null, struct + CLMotionEstimationDescINTEL.SAD_ADJUST_MODE, value); }
    /** Unsafe version of {@link #search_path_type(int) search_path_type}. */
    public static void nsearch_path_type(long struct, int value) { UNSAFE.putInt(null, struct + CLMotionEstimationDescINTEL.SEARCH_PATH_TYPE, value); }

    // -----------------------------------

    /** An array of {@link CLMotionEstimationDescINTEL} structs. */
    public static class Buffer extends StructBuffer<CLMotionEstimationDescINTEL, Buffer> implements NativeResource {

        private static final CLMotionEstimationDescINTEL ELEMENT_FACTORY = CLMotionEstimationDescINTEL.create(-1L);

        /**
         * Creates a new {@code CLMotionEstimationDescINTEL.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CLMotionEstimationDescINTEL#SIZEOF}, and its mark will be undefined.
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
        protected CLMotionEstimationDescINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code mb_block_type} field. */
        @NativeType("cl_uint")
        public int mb_block_type() { return CLMotionEstimationDescINTEL.nmb_block_type(address()); }
        /** Returns the value of the {@code subpixel_mode} field. */
        @NativeType("cl_uint")
        public int subpixel_mode() { return CLMotionEstimationDescINTEL.nsubpixel_mode(address()); }
        /** Returns the value of the {@code sad_adjust_mode} field. */
        @NativeType("cl_uint")
        public int sad_adjust_mode() { return CLMotionEstimationDescINTEL.nsad_adjust_mode(address()); }
        /** Returns the value of the {@code search_path_type} field. */
        @NativeType("cl_uint")
        public int search_path_type() { return CLMotionEstimationDescINTEL.nsearch_path_type(address()); }

        /** Sets the specified value to the {@code mb_block_type} field. */
        public CLMotionEstimationDescINTEL.Buffer mb_block_type(@NativeType("cl_uint") int value) { CLMotionEstimationDescINTEL.nmb_block_type(address(), value); return this; }
        /** Sets the specified value to the {@code subpixel_mode} field. */
        public CLMotionEstimationDescINTEL.Buffer subpixel_mode(@NativeType("cl_uint") int value) { CLMotionEstimationDescINTEL.nsubpixel_mode(address(), value); return this; }
        /** Sets the specified value to the {@code sad_adjust_mode} field. */
        public CLMotionEstimationDescINTEL.Buffer sad_adjust_mode(@NativeType("cl_uint") int value) { CLMotionEstimationDescINTEL.nsad_adjust_mode(address(), value); return this; }
        /** Sets the specified value to the {@code search_path_type} field. */
        public CLMotionEstimationDescINTEL.Buffer search_path_type(@NativeType("cl_uint") int value) { CLMotionEstimationDescINTEL.nsearch_path_type(address(), value); return this; }

    }

}