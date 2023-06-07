/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Visual structure; contains information about colormapping possible.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Visual {
 *     void * ext_data;
 *     VisualID visualid;
 *     int class;
 *     unsigned long red_mask;
 *     unsigned long green_mask;
 *     unsigned long blue_mask;
 *     int bits_per_rgb;
 *     int map_entries;
 * }</code></pre>
 */
public class Visual extends Struct<Visual> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        EXT_DATA,
        VISUALID,
        CLASS,
        RED_MASK,
        GREEN_MASK,
        BLUE_MASK,
        BITS_PER_RGB,
        MAP_ENTRIES;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        EXT_DATA = layout.offsetof(0);
        VISUALID = layout.offsetof(1);
        CLASS = layout.offsetof(2);
        RED_MASK = layout.offsetof(3);
        GREEN_MASK = layout.offsetof(4);
        BLUE_MASK = layout.offsetof(5);
        BITS_PER_RGB = layout.offsetof(6);
        MAP_ENTRIES = layout.offsetof(7);
    }

    protected Visual(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected Visual create(long address, @Nullable ByteBuffer container) {
        return new Visual(address, container);
    }

    /**
     * Creates a {@code Visual} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Visual(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code ext_data} field. */
    @NativeType("void *")
    public long ext_data() { return next_data(address()); }
    /** @return the value of the {@code visualid} field. */
    @NativeType("VisualID")
    public long visualid() { return nvisualid(address()); }
    /** @return the value of the {@code class} field. */
    public int class$() { return nclass$(address()); }
    /** @return the value of the {@code red_mask} field. */
    @NativeType("unsigned long")
    public long red_mask() { return nred_mask(address()); }
    /** @return the value of the {@code green_mask} field. */
    @NativeType("unsigned long")
    public long green_mask() { return ngreen_mask(address()); }
    /** @return the value of the {@code blue_mask} field. */
    @NativeType("unsigned long")
    public long blue_mask() { return nblue_mask(address()); }
    /** @return the value of the {@code bits_per_rgb} field. */
    public int bits_per_rgb() { return nbits_per_rgb(address()); }
    /** @return the value of the {@code map_entries} field. */
    public int map_entries() { return nmap_entries(address()); }

    /** Sets the specified value to the {@code ext_data} field. */
    public Visual ext_data(@NativeType("void *") long value) { next_data(address(), value); return this; }
    /** Sets the specified value to the {@code visualid} field. */
    public Visual visualid(@NativeType("VisualID") long value) { nvisualid(address(), value); return this; }
    /** Sets the specified value to the {@code class} field. */
    public Visual class$(int value) { nclass$(address(), value); return this; }
    /** Sets the specified value to the {@code red_mask} field. */
    public Visual red_mask(@NativeType("unsigned long") long value) { nred_mask(address(), value); return this; }
    /** Sets the specified value to the {@code green_mask} field. */
    public Visual green_mask(@NativeType("unsigned long") long value) { ngreen_mask(address(), value); return this; }
    /** Sets the specified value to the {@code blue_mask} field. */
    public Visual blue_mask(@NativeType("unsigned long") long value) { nblue_mask(address(), value); return this; }
    /** Sets the specified value to the {@code bits_per_rgb} field. */
    public Visual bits_per_rgb(int value) { nbits_per_rgb(address(), value); return this; }
    /** Sets the specified value to the {@code map_entries} field. */
    public Visual map_entries(int value) { nmap_entries(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Visual set(
        long ext_data,
        long visualid,
        int class$,
        long red_mask,
        long green_mask,
        long blue_mask,
        int bits_per_rgb,
        int map_entries
    ) {
        ext_data(ext_data);
        visualid(visualid);
        class$(class$);
        red_mask(red_mask);
        green_mask(green_mask);
        blue_mask(blue_mask);
        bits_per_rgb(bits_per_rgb);
        map_entries(map_entries);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Visual set(Visual src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Visual} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Visual malloc() {
        return new Visual(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code Visual} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Visual calloc() {
        return new Visual(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code Visual} instance allocated with {@link BufferUtils}. */
    public static Visual create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new Visual(memAddress(container), container);
    }

    /** Returns a new {@code Visual} instance for the specified memory address. */
    public static Visual create(long address) {
        return new Visual(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Visual createSafe(long address) {
        return address == NULL ? null : new Visual(address, null);
    }

    /**
     * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Visual.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Visual.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link Visual.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Visual.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static Visual mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static Visual callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static Visual mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static Visual callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Visual.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Visual.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Visual.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Visual.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code Visual} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Visual malloc(MemoryStack stack) {
        return new Visual(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code Visual} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Visual calloc(MemoryStack stack) {
        return new Visual(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link Visual.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Visual.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Visual.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ext_data}. */
    public static long next_data(long struct) { return memGetAddress(struct + Visual.EXT_DATA); }
    /** Unsafe version of {@link #visualid}. */
    public static long nvisualid(long struct) { return memGetCLong(struct + Visual.VISUALID); }
    /** Unsafe version of {@link #class$}. */
    public static int nclass$(long struct) { return UNSAFE.getInt(null, struct + Visual.CLASS); }
    /** Unsafe version of {@link #red_mask}. */
    public static long nred_mask(long struct) { return memGetCLong(struct + Visual.RED_MASK); }
    /** Unsafe version of {@link #green_mask}. */
    public static long ngreen_mask(long struct) { return memGetCLong(struct + Visual.GREEN_MASK); }
    /** Unsafe version of {@link #blue_mask}. */
    public static long nblue_mask(long struct) { return memGetCLong(struct + Visual.BLUE_MASK); }
    /** Unsafe version of {@link #bits_per_rgb}. */
    public static int nbits_per_rgb(long struct) { return UNSAFE.getInt(null, struct + Visual.BITS_PER_RGB); }
    /** Unsafe version of {@link #map_entries}. */
    public static int nmap_entries(long struct) { return UNSAFE.getInt(null, struct + Visual.MAP_ENTRIES); }

    /** Unsafe version of {@link #ext_data(long) ext_data}. */
    public static void next_data(long struct, long value) { memPutAddress(struct + Visual.EXT_DATA, value); }
    /** Unsafe version of {@link #visualid(long) visualid}. */
    public static void nvisualid(long struct, long value) { memPutCLong(struct + Visual.VISUALID, value); }
    /** Unsafe version of {@link #class$(int) class$}. */
    public static void nclass$(long struct, int value) { UNSAFE.putInt(null, struct + Visual.CLASS, value); }
    /** Unsafe version of {@link #red_mask(long) red_mask}. */
    public static void nred_mask(long struct, long value) { memPutCLong(struct + Visual.RED_MASK, value); }
    /** Unsafe version of {@link #green_mask(long) green_mask}. */
    public static void ngreen_mask(long struct, long value) { memPutCLong(struct + Visual.GREEN_MASK, value); }
    /** Unsafe version of {@link #blue_mask(long) blue_mask}. */
    public static void nblue_mask(long struct, long value) { memPutCLong(struct + Visual.BLUE_MASK, value); }
    /** Unsafe version of {@link #bits_per_rgb(int) bits_per_rgb}. */
    public static void nbits_per_rgb(long struct, int value) { UNSAFE.putInt(null, struct + Visual.BITS_PER_RGB, value); }
    /** Unsafe version of {@link #map_entries(int) map_entries}. */
    public static void nmap_entries(long struct, int value) { UNSAFE.putInt(null, struct + Visual.MAP_ENTRIES, value); }

    // -----------------------------------

    /** An array of {@link Visual} structs. */
    public static class Buffer extends StructBuffer<Visual, Buffer> implements NativeResource {

        private static final Visual ELEMENT_FACTORY = Visual.create(-1L);

        /**
         * Creates a new {@code Visual.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Visual#SIZEOF}, and its mark will be undefined.</p>
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
        protected Visual getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code ext_data} field. */
        @NativeType("void *")
        public long ext_data() { return Visual.next_data(address()); }
        /** @return the value of the {@code visualid} field. */
        @NativeType("VisualID")
        public long visualid() { return Visual.nvisualid(address()); }
        /** @return the value of the {@code class} field. */
        public int class$() { return Visual.nclass$(address()); }
        /** @return the value of the {@code red_mask} field. */
        @NativeType("unsigned long")
        public long red_mask() { return Visual.nred_mask(address()); }
        /** @return the value of the {@code green_mask} field. */
        @NativeType("unsigned long")
        public long green_mask() { return Visual.ngreen_mask(address()); }
        /** @return the value of the {@code blue_mask} field. */
        @NativeType("unsigned long")
        public long blue_mask() { return Visual.nblue_mask(address()); }
        /** @return the value of the {@code bits_per_rgb} field. */
        public int bits_per_rgb() { return Visual.nbits_per_rgb(address()); }
        /** @return the value of the {@code map_entries} field. */
        public int map_entries() { return Visual.nmap_entries(address()); }

        /** Sets the specified value to the {@code ext_data} field. */
        public Visual.Buffer ext_data(@NativeType("void *") long value) { Visual.next_data(address(), value); return this; }
        /** Sets the specified value to the {@code visualid} field. */
        public Visual.Buffer visualid(@NativeType("VisualID") long value) { Visual.nvisualid(address(), value); return this; }
        /** Sets the specified value to the {@code class} field. */
        public Visual.Buffer class$(int value) { Visual.nclass$(address(), value); return this; }
        /** Sets the specified value to the {@code red_mask} field. */
        public Visual.Buffer red_mask(@NativeType("unsigned long") long value) { Visual.nred_mask(address(), value); return this; }
        /** Sets the specified value to the {@code green_mask} field. */
        public Visual.Buffer green_mask(@NativeType("unsigned long") long value) { Visual.ngreen_mask(address(), value); return this; }
        /** Sets the specified value to the {@code blue_mask} field. */
        public Visual.Buffer blue_mask(@NativeType("unsigned long") long value) { Visual.nblue_mask(address(), value); return this; }
        /** Sets the specified value to the {@code bits_per_rgb} field. */
        public Visual.Buffer bits_per_rgb(int value) { Visual.nbits_per_rgb(address(), value); return this; }
        /** Sets the specified value to the {@code map_entries} field. */
        public Visual.Buffer map_entries(int value) { Visual.nmap_entries(address(), value); return this; }

    }

}